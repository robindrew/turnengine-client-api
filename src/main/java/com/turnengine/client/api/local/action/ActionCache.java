package com.turnengine.client.api.local.action;

import static com.turnengine.client.api.local.action.ActionTargetType.SOURCE;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import com.google.common.collect.ImmutableList;
import com.robindrew.common.collect.indexmap.ArrayIndexMap;
import com.robindrew.common.collect.indexmap.IIndexMap;
import com.turnengine.client.api.local.unit.IUnit;

public class ActionCache implements IActionCache {

	private final IIndexMap<IActionDefinition> idToDefinitionMap = new ArrayIndexMap<IActionDefinition>();

	public ActionCache() {
	}

	public ActionCache(Collection<IAction> actions, Collection<IActionTarget> targets, Collection<IActionCondition> conditions) {
		addActions(actions);
		addTargets(targets);
		addConditions(conditions);
	}

	@Override
	public void addActions(Collection<IAction> actions) {
		for (IAction action : actions) {
			addAction(action);
		}
	}

	@Override
	public void addTargets(Collection<IActionTarget> targets) {
		for (IActionTarget target : targets) {
			addTarget(target);
		}
	}

	@Override
	public void addConditions(Collection<IActionCondition> conditions) {
		for (IActionCondition condition : conditions) {
			addCondition(condition);
		}
	}

	@Override
	public void addAction(IAction action) {
		int actionId = action.getId();
		IActionDefinition definition = idToDefinitionMap.get(actionId);
		if (definition != null) {
			throw new IllegalArgumentException("action already defined for id=" + actionId);
		}
		definition = new ActionDefinition(action);
		idToDefinitionMap.put(actionId, definition);
	}

	@Override
	public void addTarget(IActionTarget target) {
		IActionDefinition definition = getDefinition(target.getId());
		if (target.getTargetType().equals(SOURCE)) {
			definition.setSource(target);
		} else {
			definition.setTarget(target);
		}
	}

	@Override
	public void addCondition(IActionCondition condition) {
		IActionDefinition definition = getDefinition(condition.getId());
		// TODO: Sanity checks
		definition.addCondition(condition);
	}

	@Override
	public List<IAction> getActions() {
		List<IAction> list = new ArrayList<IAction>();
		for (IActionDefinition definition : idToDefinitionMap.values()) {
			list.add(definition.getAction());
		}
		return list;
	}

	@Override
	public List<IActionTarget> getTargets() {
		List<IActionTarget> list = new ArrayList<IActionTarget>();
		for (IActionDefinition definition : idToDefinitionMap.values()) {
			if (definition.hasSource()) {
				list.add(definition.getSource());
			}
			if (definition.hasTarget()) {
				list.add(definition.getTarget());
			}
		}
		return list;
	}

	@Override
	public List<IActionCondition> getConditions() {
		List<IActionCondition> list = new ArrayList<IActionCondition>();
		for (IActionDefinition definition : idToDefinitionMap.values()) {
			list.addAll(definition.getConditions());
		}
		return list;
	}

	@Override
	public IActionDefinition getDefinition(int unitId) {
		IActionDefinition definition = idToDefinitionMap.get(unitId);
		if (definition == null) {
			throw new IllegalArgumentException("action not defined: " + unitId);
		}
		return definition;
	}

	@Override
	public IActionDefinition getDefinition(IUnit unit) {
		return getDefinition(unit.getId());
	}

	@Override
	public IActionDefinition getDefinition(IAction action) {
		return getDefinition(action.getId());
	}

	@Override
	public int size() {
		return idToDefinitionMap.size();
	}

	@Override
	public boolean isEmpty() {
		return size() == 0;
	}

	@Override
	public void clear() {
		idToDefinitionMap.clear();
	}

	@Override
	public List<IActionDefinition> getAll() {
		return idToDefinitionMap.values();
	}

	@Override
	public boolean hasDefinition(int unitId) {
		return idToDefinitionMap.containsKey(unitId);
	}

	@Override
	public boolean hasDefinition(IUnit unit) {
		return hasDefinition(unit.getId());
	}

	@Override
	public boolean hasDefinition(IAction action) {
		return hasDefinition(action.getId());
	}

	@Override
	public Iterator<IActionDefinition> iterator() {
		return getAll().iterator();
	}

	@Override
	public List<IActionDefinition> getDefinitions() {
		return ImmutableList.copyOf(idToDefinitionMap.values());
	}

}
