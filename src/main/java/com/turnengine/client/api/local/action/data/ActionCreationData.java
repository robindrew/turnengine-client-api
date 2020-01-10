package com.turnengine.client.api.local.action.data;

import static com.robindrew.common.dependency.DependencyFactory.getDependency;

import java.util.List;

import com.turnengine.client.api.local.action.IAction;
import com.turnengine.client.api.local.action.IActionDefinition;
import com.turnengine.client.api.local.creation.ICreationCondition;
import com.turnengine.client.api.local.creation.data.ICreationData;
import com.turnengine.client.api.local.creation.data.ICreationUnitListSet;
import com.turnengine.client.api.local.unit.IUnit;
import com.turnengine.client.api.local.unit.IUnitCache;

public class ActionCreationData implements ICreationData {

	private final int playerId;
	private final IActionDefinition definition;
	private final ICreationUnitListSet set;
	private final long amount;
	private final List<? extends ICreationCondition> conditions;
	private final boolean turnUpdating;

	public ActionCreationData(int playerId, IActionDefinition definition, long amount, ICreationUnitListSet set, List<? extends ICreationCondition> conditions, boolean turnUpdating) {
		if (amount < 1) {
			throw new IllegalArgumentException("amount=" + amount);
		}
		if (set == null) {
			throw new NullPointerException("set");
		}
		if (definition == null) {
			throw new NullPointerException("definition");
		}
		if (conditions == null) {
			throw new NullPointerException("conditions");
		}
		this.playerId = playerId;
		this.definition = definition;
		this.set = set;
		this.amount = amount;
		this.conditions = conditions;
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
		return definition.getAction().getId();
	}

	@Override
	public IUnit getUnit() {
		IUnitCache cache = getDependency(IUnitCache.class);
		return cache.getById(getId());
	}

	public IActionDefinition getDefinition() {
		return definition;
	}

	@Override
	public int getGroupId() {
		return getUnit().getGroupId();
	}

	public IAction getAction() {
		return getDefinition().getAction();
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
		return conditions;
	}

	@Override
	public boolean isTurnUpdating() {
		return turnUpdating;
	}

}
