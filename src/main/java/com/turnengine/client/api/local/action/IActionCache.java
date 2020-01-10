package com.turnengine.client.api.local.action;

import java.util.Collection;
import java.util.List;

import com.turnengine.client.api.local.staticcache.IStaticCache;
import com.turnengine.client.api.local.unit.IUnit;

public interface IActionCache extends IStaticCache<IActionDefinition> {

	void addActions(Collection<IAction> actions);

	void addAction(IAction action);

	void addTargets(Collection<IActionTarget> targets);

	void addTarget(IActionTarget target);

	void addConditions(Collection<IActionCondition> conditions);

	void addCondition(IActionCondition condition);

	List<IAction> getActions();

	List<IActionTarget> getTargets();

	List<IActionCondition> getConditions();

	List<IActionDefinition> getDefinitions();

	boolean hasDefinition(IUnit unit);

	boolean hasDefinition(int unitId);

	boolean hasDefinition(IAction upkeep);

	IActionDefinition getDefinition(IUnit unit);

	IActionDefinition getDefinition(int unitId);

	IActionDefinition getDefinition(IAction action);

}
