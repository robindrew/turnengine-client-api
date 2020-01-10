package com.turnengine.client.api.local.upkeep;

import static java.util.Collections.unmodifiableList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import com.robindrew.common.collect.indexmap.ArrayIndexMap;
import com.robindrew.common.collect.indexmap.IIndexMap;
import com.turnengine.client.api.local.unit.IUnit;

public class UpkeepCache implements IUpkeepCache {

	private final List<IUpkeep> upkeepList = new CopyOnWriteArrayList<IUpkeep>();
	private final IIndexMap<IUpkeepDefinition> idToDefinitionMap = new ArrayIndexMap<IUpkeepDefinition>();

	public UpkeepCache() {
	}

	public UpkeepCache(List<IUpkeep> upkeeps, List<IUpkeepCondition> conditions) {
		addUpkeeps(upkeeps);
		addConditions(conditions);
	}

	@Override
	public void addUpkeeps(Collection<IUpkeep> upkeeps) {
		for (IUpkeep upkeep : upkeeps) {
			addUpkeep(upkeep);
		}
	}

	@Override
	public void addConditions(Collection<IUpkeepCondition> conditions) {
		for (IUpkeepCondition condition : conditions) {
			addCondition(condition);
		}
	}

	@Override
	public void addUpkeep(IUpkeep upkeep) {
		int upkeepId = upkeep.getId();
		IUpkeepDefinition definition = idToDefinitionMap.get(upkeepId);
		if (definition != null) {
			throw new IllegalArgumentException("upkeep already defined for id=" + upkeepId);
		}
		upkeepList.add(upkeep);
		definition = new UpkeepDefinition(upkeep);
		idToDefinitionMap.put(upkeepId, definition);
	}

	@Override
	public void addCondition(IUpkeepCondition condition) {
		IUpkeepDefinition definition = getDefinition(condition.getId());
		definition.addCondition(condition);
	}

	@Override
	public List<IUpkeep> getAll() {
		return unmodifiableList(upkeepList);
	}

	@Override
	public List<IUpkeepCondition> getConditions() {
		List<IUpkeepCondition> list = new ArrayList<IUpkeepCondition>();
		for (IUpkeepDefinition definition : idToDefinitionMap.values()) {
			list.addAll(definition.getConditions());
		}
		return list;
	}

	@Override
	public IUpkeepDefinition getDefinition(int unitId) {
		IUpkeepDefinition definition = idToDefinitionMap.get(unitId);
		if (definition == null) {
			throw new IllegalArgumentException("upkeep not defined: " + unitId);
		}
		return definition;
	}

	@Override
	public IUpkeepDefinition getDefinition(IUnit unit) {
		return getDefinition(unit.getId());
	}

	@Override
	public IUpkeepDefinition getDefinition(IUpkeep upkeep) {
		return getDefinition(upkeep.getId());
	}

	@Override
	public int size() {
		return upkeepList.size();
	}

	@Override
	public boolean isEmpty() {
		return size() == 0;
	}

	@Override
	public void clear() {
		upkeepList.clear();
		idToDefinitionMap.clear();
	}

	@Override
	public IUpkeep getUpkeep(IUnit unit) {
		return getUpkeep(unit.getId());
	}

	@Override
	public IUpkeep getUpkeep(int unitId) {
		IUpkeepDefinition definition = getDefinition(unitId);
		return definition.getUpkeep();
	}

	@Override
	public List<IUpkeepDefinition> getDefinitions() {
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
	public boolean hasDefinition(IUpkeep upkeep) {
		return hasDefinition(upkeep.getId());
	}

	@Override
	public Iterator<IUpkeep> iterator() {
		return getAll().iterator();
	}

}
