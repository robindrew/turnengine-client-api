package com.turnengine.client.api.local.creation.calculator.condition;

import static com.robindrew.common.dependency.DependencyFactory.getDependency;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.turnengine.client.api.local.creation.ICreationCondition;
import com.turnengine.client.api.local.creation.ICreationHelper;
import com.turnengine.client.api.local.creation.data.ICreationData;
import com.turnengine.client.api.local.creation.data.ICreationTargetData;
import com.turnengine.client.api.local.staticcache.IStaticCacheSet;
import com.turnengine.client.api.local.unit.list.count.IUnitCountList;

public class OwnLocationCalculator extends ConditionCalculator {

	private static final Logger log = LoggerFactory.getLogger(OwnLocationCalculator.class);

	public OwnLocationCalculator(IStaticCacheSet set) {
		super(set);
	}

	@Override
	public long apply(ICreationCondition condition, ICreationData data, boolean optional, long apply) {
		ICreationTargetData set = data.getData();
		if (!set.isLocation()) {
			throw new IllegalArgumentException("Creation target must be a location");
		}

		// Own that location!
		ICreationHelper helper = getDependency(ICreationHelper.class);
		int playerId = data.getPlayerId();
		int locationId = set.getLocationId();
		helper.setLocationOwner(playerId, locationId);
		log.info("Player #{} now owns Location #{}", playerId, locationId);

		// Done
		return apply;
	}

	@Override
	public long count(ICreationCondition condition, ICreationData data, boolean optional) {
		if (optional) {
			return Long.MAX_VALUE;
		}

		ICreationTargetData set = data.getData();
		if (!set.isLocation()) {
			throw new IllegalArgumentException("Target must be a location");
		}

		// Can only work if the location has no player id (not owned!)
		if (set.getPlayerId() != -1) {
			return 0;
		}

		// Nothing to do ...
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
