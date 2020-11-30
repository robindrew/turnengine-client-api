package com.turnengine.client.api.local.creation.calculator.condition;

import static com.robindrew.common.dependency.DependencyFactory.getDependency;

import com.turnengine.client.api.local.creation.ICreationCondition;
import com.turnengine.client.api.local.creation.data.ICreationData;
import com.turnengine.client.api.local.creation.data.ICreationTargetData;
import com.turnengine.client.api.local.staticcache.IStaticCacheSet;
import com.turnengine.client.api.local.storage.calculator.IStorageCalculator;
import com.turnengine.client.api.local.unit.IUnit;
import com.turnengine.client.api.local.unit.list.IUnitList;
import com.turnengine.client.api.local.unit.list.count.IUnitCountList;
import com.turnengine.client.api.local.upkeep.calculator.IUpkeepCalculator;
import com.turnengine.client.api.local.upkeep.data.IUpkeepData;
import com.turnengine.client.api.local.upkeep.data.UpkeepData;

public class MinimumUpkeepRemoveCalculator extends ConditionCalculator {

	public MinimumUpkeepRemoveCalculator(IStaticCacheSet set) {
		super(set);
	}

	@Override
	public long apply(ICreationCondition condition, ICreationData action, boolean optional, long apply) {
		// Nothing to do ...
		return apply;
	}

	@Override
	public long count(ICreationCondition condition, ICreationData action, boolean optional) {
		ICreationTargetData set = action.getData().copy();

		// If there are no units to remove, fail
		IUnit unitToRemove = getUnit(condition.getConditionId2());
		IStorageCalculator storage = getDependency(IStorageCalculator.class);
		IUnitList list = set.getListSet().getUnitList(unitToRemove.getType());
		long amountCanRemove = storage.getAmountCanRemove(list, unitToRemove);
		if (amountCanRemove == 0) {
			return 0;
		}

		long amount = amountCanRemove;
		while (amountCanRemove > 0) {
			if (!removeUnit(unitToRemove, condition, action, storage, set)) {
				break;
			}
			amountCanRemove--;
		}
		return amount - amountCanRemove;
	}

	private boolean removeUnit(IUnit unit, ICreationCondition condition, ICreationData data, IStorageCalculator storage, ICreationTargetData set) {
		IUnitList list = set.getListSet().getUnitList(unit.getType());
		storage.removeAmount(list, unit, 1);

		IUpkeepCalculator calculator = getDependency(IUpkeepCalculator.class);
		IUpkeepData upkeep = new UpkeepData(data.getPlayerId(), set, data.isTurnUpdating());
		IUnitCountList output = calculator.getOutput(upkeep, true);

		// Check updated output
		long updatedOutput = output.getAmount(condition.getConditionId1());
		long minimumOutput = condition.getConditionAmount1();
		return minimumOutput <= updatedOutput;
	}

	@Override
	public void getOutput(ICreationCondition condition, ICreationData data, long amountToApply, IUnitCountList output) {
		// Nothing to do ...
	}

	@Override
	public long undo(ICreationCondition condition, ICreationData action, boolean optional, long amountToUndo) {
		return amountToUndo;
	}

}
