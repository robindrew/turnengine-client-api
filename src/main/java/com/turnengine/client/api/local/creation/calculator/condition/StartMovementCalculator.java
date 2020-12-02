package com.turnengine.client.api.local.creation.calculator.condition;

import com.turnengine.client.api.local.creation.ICreationCondition;
import com.turnengine.client.api.local.creation.data.ICreationData;
import com.turnengine.client.api.local.creation.data.ICreationTargetData;
import com.turnengine.client.api.local.mobile.IMobileCreationData;
import com.turnengine.client.api.local.staticcache.IStaticCacheSet;
import com.turnengine.client.api.local.unit.list.count.IUnitCountList;

public class StartMovementCalculator extends ConditionCalculator {

	public StartMovementCalculator(IStaticCacheSet set) {
		super(set);
	}

	@Override
	public long apply(ICreationCondition condition, ICreationData data, boolean optional, long apply) {
		checkData(data);

		// Is mobile moving?
		ICreationTargetData target = data.getData();
		IMobileCreationData mobile = target.getMobile();
		if (mobile.getMoveTurns() > 0) {
			return 0;
		}

		// Where is the mobile moving?
		int destinationId = data.getTargetData().getLocationId();

		// Now start moving!
		mobile.setMoveTurns(data.getTurns());
		mobile.setDestinationId(destinationId);
		return apply;
	}

	private void checkData(ICreationData data) {

		// Movement is only ever from a mobile to a location
		if (!data.getSourceData().isMobile()) {
			throw new IllegalStateException("Creation source must be a mobile");
		}
		if (!data.getTargetData().isLocation()) {
			throw new IllegalStateException("Creation target must be a location");
		}
	}

	@Override
	public long count(ICreationCondition condition, ICreationData data, boolean optional) {
		checkData(data);

		ICreationTargetData target = data.getData();
		IMobileCreationData mobile = target.getMobile();
		if (mobile.getMoveTurns() > 0) {
			return 0;
		}

		return Long.MAX_VALUE;
	}

	@Override
	public void getOutput(ICreationCondition condition, ICreationData data, long amountToApply, IUnitCountList output) {
		// Nothing to do ...
	}

	@Override
	public long undo(ICreationCondition condition, ICreationData data, boolean optional, long amountToUndo) {

		// Stop moving please!
		ICreationTargetData target = data.getData();
		IMobileCreationData mobile = target.getMobile();
		mobile.setMoveTurns(data.getTurns());

		return amountToUndo;
	}

}
