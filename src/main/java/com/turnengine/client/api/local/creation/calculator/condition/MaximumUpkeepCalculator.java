package com.turnengine.client.api.local.creation.calculator.condition;

import static com.robindrew.common.dependency.DependencyFactory.getDependency;

import com.turnengine.client.api.local.creation.ICreationCondition;
import com.turnengine.client.api.local.creation.data.ICreationData;
import com.turnengine.client.api.local.staticcache.IStaticCacheSet;
import com.turnengine.client.api.local.unit.list.count.IUnitCountList;
import com.turnengine.client.api.local.upkeep.calculator.IUpkeepCalculator;
import com.turnengine.client.api.local.upkeep.data.IUpkeepData;
import com.turnengine.client.api.local.upkeep.data.UpkeepData;

public class MaximumUpkeepCalculator extends ConditionCalculator {

	public MaximumUpkeepCalculator(IStaticCacheSet set) {
		super(set);
	}

	@Override
	public long apply(ICreationCondition condition, ICreationData action, boolean optional, long apply) {
		// Nothing to do ...
		return apply;
	}

	@Override
	public long count(ICreationCondition condition, ICreationData action, boolean optional) {
		if (optional) {
			return Long.MAX_VALUE;
		}

		// IUnitListSet listSet = action.getUnitListSet().getListSet();

		IUpkeepCalculator calculator = getDependency(IUpkeepCalculator.class);
		IUpkeepData upkeep = new UpkeepData(action.getPlayerId(), action.getData(), action.isTurnUpdating());
		IUnitCountList output = calculator.getOutput(upkeep);

		// Check current output
		long currentOutput = output.getAmount(condition.getConditionId1());
		long maximumOutput = condition.getConditionAmount1();
		if (currentOutput >= maximumOutput) {
			return 0;
		}

		// TODO: Check output of one unit and compare
		return Long.MAX_VALUE;
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
