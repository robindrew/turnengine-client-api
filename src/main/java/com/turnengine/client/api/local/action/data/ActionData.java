package com.turnengine.client.api.local.action.data;

import static com.robindrew.common.dependency.DependencyFactory.getDependency;

import java.util.List;

import com.turnengine.client.api.local.action.ActionConditionExecute;
import com.turnengine.client.api.local.action.ActionTargetType;
import com.turnengine.client.api.local.action.IAction;
import com.turnengine.client.api.local.action.IActionDefinition;
import com.turnengine.client.api.local.creation.ICreationCondition;
import com.turnengine.client.api.local.creation.data.ICreationData;
import com.turnengine.client.api.local.creation.data.ICreationUnitListSet;
import com.turnengine.client.api.local.player.IPlayerCreationData;
import com.turnengine.client.api.local.unit.IUnit;
import com.turnengine.client.api.local.unit.IUnitCache;

public class ActionData implements IActionData {

	private final int playerId;
	private final int allianceId;
	private final int factionId;
	private final IActionDefinition definition;
	private final boolean turnUpdating;

	private long amount;
	private ICreationUnitListSet source = null;
	private ICreationUnitListSet target = null;

	public ActionData(IPlayerCreationData player, IActionDefinition definition, long amount, boolean turnUpdating) {
		this.playerId = player.getId();
		this.allianceId = player.getAllianceId();
		this.factionId = player.getFactionId();
		this.definition = definition;
		this.turnUpdating = turnUpdating;
		setAmount(amount);
	}

	public ActionData(int playerId, int allianceId, int factionId, IActionDefinition definition, long amount, boolean turnUpdating) {
		this.playerId = playerId;
		this.allianceId = allianceId;
		this.factionId = factionId;
		this.definition = definition;
		this.turnUpdating = turnUpdating;
		setAmount(amount);
	}

	@Override
	public int getPlayerId() {
		return playerId;
	}

	@Override
	public int getAllianceId() {
		return allianceId;
	}

	@Override
	public int getFactionId() {
		return factionId;
	}

	@Override
	public long getAmount() {
		return amount;
	}

	@Override
	public void setAmount(long amount) {
		if (amount < 1) {
			throw new IllegalArgumentException("amount=" + amount);
		}
		this.amount = amount;
	}

	@Override
	public int getId() {
		return getDefinition().getAction().getId();
	}

	@Override
	public IUnit getUnit() {
		IUnitCache cache = getDependency(IUnitCache.class);
		return cache.getById(getId());
	}

	@Override
	public IActionDefinition getDefinition() {
		return definition;
	}

	@Override
	public int getGroupId() {
		return getUnit().getGroupId();
	}

	@Override
	public IAction getAction() {
		return getDefinition().getAction();
	}

	@Override
	public boolean hasTarget() {
		return getDefinition().hasTarget();
	}

	@Override
	public ICreationUnitListSet getSource() {
		if (source == null) {
			throw new IllegalArgumentException("source not set");
		}
		return source;
	}

	@Override
	public ICreationUnitListSet getTarget() {
		if (target == null && hasTarget()) {
			throw new IllegalArgumentException("target not set");
		}
		return target;
	}

	@Override
	public void setSource(ICreationUnitListSet source) {
		if (source == null) {
			throw new NullPointerException("source");
		}
		// Source is always the same player
		if (getPlayerId() != source.getPlayerId()) {
			throw new IllegalArgumentException("source player id does not match");
		}
		this.source = source;
	}

	@Override
	public void setTarget(ICreationUnitListSet target) {
		if (target == null) {
			throw new NullPointerException("target");
		}
		if (!hasTarget()) {
			throw new IllegalStateException("should not have a target");
		}
		this.target = target;
	}

	@Override
	public String toString() {
		if (getDefinition().hasTarget()) {
			return getUnit().getName() + " x " + getAmount() + " @ " + getSource() + " -> " + getTarget();
		} else {
			return getUnit().getName() + " x " + getAmount() + " @ " + getSource();
		}
	}

	@Override
	public boolean hasSourceSet() {
		return source != null;
	}

	@Override
	public boolean hasTargetSet() {
		return target != null;
	}

	@Override
	public ICreationUnitListSet getTarget(ActionTargetType type) {
		switch (type) {
			case SOURCE:
				return source;
			case TARGET:
				return target;
			default:
				throw new IllegalArgumentException("type not supported: " + type);
		}
	}

	@Override
	public ICreationData toCreation(ActionTargetType type, ActionConditionExecute execute) {
		ICreationUnitListSet set = getTarget(type);
		List<? extends ICreationCondition> conditions = getDefinition().getConditions(type, execute);
		return new ActionCreationData(getPlayerId(), getDefinition(), getAmount(), set, conditions, isTurnUpdating());
	}

	@Override
	public boolean isTurnUpdating() {
		return turnUpdating;
	}

}
