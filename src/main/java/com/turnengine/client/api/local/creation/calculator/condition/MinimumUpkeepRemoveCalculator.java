package com.turnengine.client.api.local.creation.calculator.condition;

import static com.robindrew.common.dependency.DependencyFactory.getDependency;

import com.turnengine.client.api.local.creation.ICreationCondition;
import com.turnengine.client.api.local.creation.data.CreationUnitListSet;
import com.turnengine.client.api.local.creation.data.ICreationData;
import com.turnengine.client.api.local.creation.data.ICreationUnitListSet;
import com.turnengine.client.api.local.staticcache.IStaticCacheSet;
import com.turnengine.client.api.local.storage.calculator.IStorageCalculator;
import com.turnengine.client.api.local.unit.IUnit;
import com.turnengine.client.api.local.unit.UnitType;
import com.turnengine.client.api.local.unit.list.IUnitList;
import com.turnengine.client.api.local.unit.list.count.IUnitCountList;
import com.turnengine.client.api.local.unit.list.set.IUnitListSet;
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
		ICreationUnitListSet set = new CreationUnitListSet(action.getUnitListSet());

		// If there are no units to remove, fail
		IUnit unitToRemove = getUnit(condition.getConditionId2());
		IStorageCalculator storage = getDependency(IStorageCalculator.class);
		long amountCanRemove = storage.getAmountCanRemove(getUnitList(set, unitToRemove), unitToRemove);
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

	private boolean removeUnit(IUnit unit, ICreationCondition condition, ICreationData action, IStorageCalculator storage, ICreationUnitListSet set) {
		IUnitList list = getUnitList(set, unit);
		storage.removeAmount(list, unit, 1);

		IUpkeepCalculator calculator = getDependency(IUpkeepCalculator.class);
		IUpkeepData upkeep = new UpkeepData(action.getPlayerId(), set, action.isTurnUpdating());
		IUnitCountList output = calculator.getOutput(upkeep, true);

		// Check updated output
		long updatedOutput = output.getAmount(condition.getConditionId1());
		long minimumOutput = condition.getConditionAmount1();
		return minimumOutput <= updatedOutput;
	}

	private IUnitList getUnitList(ICreationUnitListSet set, IUnit unit) {
		IUnitListSet listSet = set.getListSet();
		UnitType type = unit.getType();
		switch (type) {
			case PLAYER:
				return listSet.getPlayerUnitList();
			case LOCATION:
				return listSet.getLocationUnitList();
			case MOBILE:
				return listSet.getMobileUnitList();
			default:
				throw new IllegalStateException("Unit type: " + type);
		}
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
