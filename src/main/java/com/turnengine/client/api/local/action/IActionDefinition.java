package com.turnengine.client.api.local.action;

import java.util.List;

public interface IActionDefinition {

	IAction getAction();

	void setSource(IActionTarget source);

	void setTarget(IActionTarget target);

	IActionTarget getSource();

	boolean hasSource();

	IActionTarget getTarget();

	boolean hasTarget();

	List<IActionCondition> getConditions();

	List<IActionCondition> getConditions(ActionTargetType type);

	List<IActionCondition> getConditions(ActionTargetType type, ActionConditionExecute execute);

	void addCondition(IActionCondition condition);

	boolean isInstant();

}
