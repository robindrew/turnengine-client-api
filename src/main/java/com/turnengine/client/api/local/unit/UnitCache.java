package com.turnengine.client.api.local.unit;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.robindrew.common.collect.indexmap.ArrayIndexMap;
import com.robindrew.common.collect.indexmap.IIndexMap;
import com.turnengine.client.api.local.faction.IFaction;
import com.turnengine.client.api.local.group.IGroup;
import com.turnengine.client.api.local.identity.NamedIdentityCache;

public class UnitCache extends NamedIdentityCache<IUnit> implements IUnitCache {

	private final IIndexMap<IUnit> idToUnitMap = new ArrayIndexMap<IUnit>();

	public UnitCache() {
		super("Unit");
	}

	public UnitCache(Collection<IUnit> units) {
		super("Unit", units);
	}

	@Override
	public List<IUnit> getByFactionId(int factionId) {
		List<IUnit> set = new ArrayList<IUnit>();
		for (IUnit unit : idToUnitMap.values()) {
			if (unit.getFactionId() == factionId) {
				set.add(unit);
			}
		}
		return set;
	}

	@Override
	public List<IUnit> getByGroupId(int groupId) {
		List<IUnit> set = new ArrayList<IUnit>();
		for (IUnit unit : idToUnitMap.values()) {
			if (unit.getGroupId() == groupId) {
				set.add(unit);
			}
		}
		return set;
	}

	@Override
	public List<IUnit> getByType(UnitType type) {
		List<IUnit> set = new ArrayList<IUnit>();
		for (IUnit unit : idToUnitMap.values()) {
			if (unit.getType().equals(type)) {
				set.add(unit);
			}
		}
		return set;
	}

	@Override
	public List<IUnit> getByMove(UnitMove move) {
		List<IUnit> set = new ArrayList<IUnit>();
		for (IUnit unit : idToUnitMap.values()) {
			if (unit.getMove().equals(move)) {
				set.add(unit);
			}
		}
		return set;
	}

	@Override
	public List<IUnit> getByNode(UnitNode node) {
		List<IUnit> set = new ArrayList<IUnit>();
		for (IUnit unit : idToUnitMap.values()) {
			if (unit.getNode().equals(node)) {
				set.add(unit);
			}
		}
		return set;
	}

	@Override
	public List<IUnit> getByFaction(IFaction faction) {
		return getByFactionId(faction.getId());
	}

	@Override
	public List<IUnit> getByGroup(IGroup group) {
		return getByGroupId(group.getId());
	}

	@Override
	public String toString() {
		return getAll().toString();
	}

	@Override
	public boolean isEmpty() {
		return size() == 0;
	}

}
