package com.turnengine.client.api.local.creation.calculator.condition;

import com.turnengine.client.api.local.creation.ICreationCondition;
import com.turnengine.client.api.local.creation.data.ICreationData;
import com.turnengine.client.api.local.staticcache.IStaticCacheSet;
import com.turnengine.client.api.local.unit.list.count.IUnitCountList;

public class StartMovementCalculator extends ConditionCalculator {

	public StartMovementCalculator(IStaticCacheSet set) {
		super(set);
	}

	@Override
	public long apply(ICreationCondition condition, ICreationData action, boolean optional, long apply) {
		// Nothing to do ...
		return apply;
	}

	@Override
	public long count(ICreationCondition condition, ICreationData action, boolean optional) {
		// TODO: Check mobile is not already moving ....
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
