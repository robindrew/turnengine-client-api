package com.turnengine.client.api.local.action.data;

import com.turnengine.client.api.local.action.ActionTargetType;
import com.turnengine.client.api.local.action.IAction;
import com.turnengine.client.api.local.action.IActionDefinition;
import com.turnengine.client.api.local.creation.data.ICreationTargetData;
import com.turnengine.client.api.local.unit.IUnit;

public interface IActionData {

	IAction getAction();

	IActionDefinition getDefinition();

	int getPlayerId();

	int getAllianceId();

	int getFactionId();

	int getId();

	IUnit getUnit();

	int getGroupId();

	boolean hasTarget();

	long getAmount();

	void setAmount(long amount);

	ICreationTargetData getSource();

	void setSource(ICreationTargetData source);

	ICreationTargetData getTarget();

	void setTarget(ICreationTargetData target);

	boolean hasSourceSet();

	boolean hasTargetSet();

	ICreationTargetData getTargetData(ActionTargetType type);

	boolean isTurnUpdating();

}
