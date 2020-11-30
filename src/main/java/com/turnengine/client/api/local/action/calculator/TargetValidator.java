package com.turnengine.client.api.local.action.calculator;

import com.turnengine.client.api.local.action.ActionTargetType;
import com.turnengine.client.api.local.action.IActionDefinition;
import com.turnengine.client.api.local.action.IActionTarget;
import com.turnengine.client.api.local.action.data.IActionData;
import com.turnengine.client.api.local.creation.data.ICreationTargetData;
import com.turnengine.client.api.local.unit.UnitRelation;

public class TargetValidator {

	public boolean validateTargets(IActionData data) {
		IActionDefinition definition = data.getDefinition();

		// Validate source type
		if (!validateTarget(data, definition, ActionTargetType.SOURCE, definition.getSource(), data.getSource())) {
			return false;
		}

		// Check if target is required
		if (definition.hasTarget()) {

			// Validate target type
			if (!validateTarget(data, definition, ActionTargetType.SOURCE, definition.getTarget(), data.getTarget())) {
				return false;
			}
		}
		return true;
	}

	private boolean validateTarget(IActionData data, IActionDefinition definition, ActionTargetType type, IActionTarget target, ICreationTargetData listSet) {
		if (target == null) {
			throw new IllegalArgumentException("action requires " + type + ": " + definition);
		}
		if (!target.getType().equals(listSet.getType())) {
			throw new IllegalArgumentException("expected " + type + " type: " + target.getType() + ", actual: " + listSet.getType());
		}
		return validateRelation(data, target, listSet);
	}

	private boolean validateRelation(IActionData data, IActionTarget target, ICreationTargetData listSet) {
		UnitRelation relation = target.getRelation();
		switch (relation) {
			case ANY:
				return true;
			case NEUTRAL:
				return isNeutral(listSet);
			case OWNED:
				return isOwned(data, listSet);
			case NOT_OWNED:
				return !isOwned(data, listSet);
			case ALLIED:
				return isAllied(data, listSet);
			case NOT_ALLIED:
				return !isAllied(data, listSet);
			case HOSTILE:
				return isHostile(data, listSet);
			case NOT_HOSTILE:
				return !isHostile(data, listSet);
			case FACTION:
				return isFaction(data, listSet);
			case NOT_FACTION:
				return !isFaction(data, listSet);
			default:
				throw new IllegalArgumentException("relation not supported: " + relation);
		}
	}

	private boolean isNeutral(ICreationTargetData listSet) {
		return listSet.getPlayerId() == -1;
	}

	private boolean isOwned(IActionData data, ICreationTargetData listSet) {
		if (listSet.getPlayerId() == -1) {
			return false;
		}
		return data.getPlayerId() == listSet.getPlayerId();
	}

	private boolean isFaction(IActionData data, ICreationTargetData listSet) {
		return data.getFactionId() == listSet.getPlayer().getFactionId();
	}

	private boolean isAllied(IActionData data, ICreationTargetData listSet) {
		if (listSet.getPlayer().getAllianceId() == -1) {
			return false;
		}
		return data.getAllianceId() == listSet.getPlayer().getAllianceId();
	}

	private boolean isHostile(IActionData data, ICreationTargetData listSet) {
		return !isAllied(data, listSet) && !isNeutral(listSet);
	}

}
