package com.turnengine.client.api.local.action.data;

import static com.robindrew.common.dependency.DependencyFactory.getDependency;

import java.util.List;

import com.turnengine.client.api.local.action.IAction;
import com.turnengine.client.api.local.action.IActionDefinition;
import com.turnengine.client.api.local.creation.ICreationCondition;
import com.turnengine.client.api.local.creation.data.ICreationData;
import com.turnengine.client.api.local.creation.data.ICreationTargetData;
import com.turnengine.client.api.local.unit.IUnit;
import com.turnengine.client.api.local.unit.IUnitCache;

public class ActionCreationData implements ICreationData {

	private final int playerId;
	private final IActionDefinition definition;
	private final ICreationTargetData data;
	private final ICreationTargetData sourceData;
	private final ICreationTargetData targetData;
	private final long amount;
	private final List<? extends ICreationCondition> conditions;
	private final boolean turnUpdating;

	public ActionCreationData(int playerId, IActionDefinition definition, long amount, ICreationTargetData data, ICreationTargetData sourceData, ICreationTargetData targetData, List<? extends ICreationCondition> conditions, boolean turnUpdating) {
		if (amount < 1) {
			throw new IllegalArgumentException("amount=" + amount);
		}
		if (data == null) {
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
		this.data = data;
		this.amount = amount;
		this.conditions = conditions;
		this.turnUpdating = turnUpdating;
		this.sourceData = sourceData;
		this.targetData = targetData;
	}

	@Override
	public boolean isGame() {
		return playerId == -1;
	}

	@Override
	public int getTurns() {
		return definition.getAction().getTurns();
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
	public ICreationTargetData getData() {
		return data;
	}

	@Override
	public String toString() {
		return getUnit().getName() + " x " + getAmount() + " @ " + data;
	}

	@Override
	public List<? extends ICreationCondition> getConditions() {
		return conditions;
	}

	@Override
	public boolean isTurnUpdating() {
		return turnUpdating;
	}

	@Override
	public ICreationTargetData getSourceData() {
		return sourceData;
	}

	@Override
	public ICreationTargetData getTargetData() {
		return targetData;
	}

	@Override
	public ActionCreationData copy() {
		ICreationTargetData data = (this.data == null) ? null : this.data.copy();
		ICreationTargetData sourceData = (this.sourceData == null) ? null : this.sourceData.copy();
		ICreationTargetData targetData = (this.targetData == null) ? null : this.targetData.copy();
		return new ActionCreationData(playerId, definition, amount, data, sourceData, targetData, conditions, turnUpdating);
	}

}
