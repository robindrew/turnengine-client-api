package com.turnengine.client.api.local.upkeep.data;

import static com.robindrew.common.dependency.DependencyFactory.getDependency;

import java.util.List;

import com.turnengine.client.api.local.creation.ICreationCondition;
import com.turnengine.client.api.local.creation.data.ICreationData;
import com.turnengine.client.api.local.creation.data.ICreationTargetData;
import com.turnengine.client.api.local.unit.IUnit;
import com.turnengine.client.api.local.unit.IUnitCache;
import com.turnengine.client.api.local.upkeep.IUpkeep;
import com.turnengine.client.api.local.upkeep.IUpkeepDefinition;

public class UpkeepCreationData implements ICreationData {

	private final int playerId;
	private final IUpkeepDefinition definition;
	private final ICreationTargetData targetData;
	private final long amount;
	private final boolean turnUpdating;

	public UpkeepCreationData(int playerId, IUpkeepDefinition definition, long amount, ICreationTargetData targetData, boolean turnUpdating) {
		if (playerId < 0) {
			throw new IllegalArgumentException("playerId=" + playerId);
		}
		if (amount < 1) {
			throw new IllegalArgumentException("amount=" + amount);
		}
		if (targetData == null) {
			throw new NullPointerException("targetData");
		}
		if (definition == null) {
			throw new NullPointerException("definition");
		}
		this.playerId = playerId;
		this.definition = definition;
		this.targetData = targetData;
		this.amount = amount;
		this.turnUpdating = turnUpdating;
	}

	@Override
	public int getTurns() {
		throw new IllegalStateException();
	}

	@Override
	public int getPlayerId() {
		return playerId;
	}

	@Override
	public long getAmount() {
		return amount;
	}

	@Override
	public int getId() {
		return definition.getUpkeep().getId();
	}

	@Override
	public IUnit getUnit() {
		IUnitCache cache = getDependency(IUnitCache.class);
		return cache.getById(getId());
	}

	public IUpkeepDefinition getDefinition() {
		return definition;
	}

	@Override
	public int getGroupId() {
		return getUnit().getGroupId();
	}

	public IUpkeep getUpkeep() {
		return getDefinition().getUpkeep();
	}

	@Override
	public ICreationTargetData getData() {
		return targetData;
	}

	@Override
	public String toString() {
		return getUnit().getName() + " x " + getAmount() + " @ " + targetData;
	}

	@Override
	public List<? extends ICreationCondition> getConditions() {
		return getDefinition().getConditions();
	}

	@Override
	public boolean isTurnUpdating() {
		return turnUpdating;
	}

	@Override
	public ICreationTargetData getSourceData() {
		// For upkeep source and target are the same
		return targetData;
	}

	@Override
	public ICreationTargetData getTargetData() {
		// For upkeep source and target are the same
		return targetData;
	}

}
