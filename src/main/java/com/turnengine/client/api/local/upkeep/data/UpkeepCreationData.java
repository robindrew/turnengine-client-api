package com.turnengine.client.api.local.upkeep.data;

import static com.robindrew.common.dependency.DependencyFactory.getDependency;

import java.util.List;

import com.turnengine.client.api.local.creation.ICreationCondition;
import com.turnengine.client.api.local.creation.data.ICreationData;
import com.turnengine.client.api.local.creation.data.ICreationUnitListSet;
import com.turnengine.client.api.local.unit.IUnit;
import com.turnengine.client.api.local.unit.IUnitCache;
import com.turnengine.client.api.local.upkeep.IUpkeep;
import com.turnengine.client.api.local.upkeep.IUpkeepDefinition;

public class UpkeepCreationData implements ICreationData {

	private final int playerId;
	private final IUpkeepDefinition definition;
	private final ICreationUnitListSet set;
	private final long amount;
	private final boolean turnUpdating;

	public UpkeepCreationData(int playerId, IUpkeepDefinition definition, long amount, ICreationUnitListSet set, boolean turnUpdating) {
		if (amount < 1) {
			throw new IllegalArgumentException("amount=" + amount);
		}
		this.playerId = playerId;
		this.definition = definition;
		this.set = set;
		this.amount = amount;
		this.turnUpdating = turnUpdating;
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
	public ICreationUnitListSet getUnitListSet() {
		return set;
	}

	@Override
	public String toString() {
		return getUnit().getName() + " x " + getAmount() + " @ " + set;
	}

	@Override
	public List<? extends ICreationCondition> getConditions() {
		return getDefinition().getConditions();
	}

	@Override
	public boolean isTurnUpdating() {
		return turnUpdating;
	}

}
