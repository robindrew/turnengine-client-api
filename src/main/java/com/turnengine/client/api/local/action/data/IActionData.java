package com.turnengine.client.api.local.action.data;

import com.turnengine.client.api.local.action.ActionConditionExecute;
import com.turnengine.client.api.local.action.ActionTargetType;
import com.turnengine.client.api.local.action.IAction;
import com.turnengine.client.api.local.action.IActionDefinition;
import com.turnengine.client.api.local.creation.data.ICreationData;
import com.turnengine.client.api.local.creation.data.ICreationUnitListSet;
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

	ICreationUnitListSet getSource();

	void setSource(ICreationUnitListSet source);

	ICreationUnitListSet getTarget();

	void setTarget(ICreationUnitListSet target);

	boolean hasSourceSet();

	boolean hasTargetSet();

	ICreationUnitListSet getTarget(ActionTargetType type);

	ICreationData toCreation(ActionTargetType type, ActionConditionExecute execute);

	boolean isTurnUpdating();

}
