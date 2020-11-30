package com.turnengine.client.api.local.creation.calculator.condition;

import com.turnengine.client.api.local.creation.ICreationCondition;
import com.turnengine.client.api.local.creation.data.ICreationData;
import com.turnengine.client.api.local.creation.data.ICreationTargetData;
import com.turnengine.client.api.local.mobile.IMobileCreationData;
import com.turnengine.client.api.local.staticcache.IStaticCacheSet;
import com.turnengine.client.api.local.unit.list.count.IUnitCountList;

public class FinishMovementCalculator extends ConditionCalculator {

	public FinishMovementCalculator(IStaticCacheSet set) {
		super(set);
	}

	@Override
	public long apply(ICreationCondition condition, ICreationData data, boolean optional, long apply) {

		// Stop moving please!
		ICreationTargetData target = data.getData();
		IMobileCreationData mobile = target.getMobile();
		mobile.setMoveTurns(0);
		mobile.setOriginId(mobile.getDestinationId());
		return apply;
	}

	@Override
	public long count(ICreationCondition condition, ICreationData data, boolean optional) {
		// Nothing to do ...
		return Long.MAX_VALUE;
	}

	@Override
	public void getOutput(ICreationCondition condition, ICreationData data, long amountToApply, IUnitCountList output) {
		// Nothing to do ...
	}

	@Override
	public long undo(ICreationCondition condition, ICreationData data, boolean optional, long amountToUndo) {
		// Nothing to do ...
		return amountToUndo;
	}

}
