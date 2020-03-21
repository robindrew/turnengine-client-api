package com.turnengine.client.api.local.storage;

import java.util.ArrayList;
import java.util.List;

import com.google.common.collect.ImmutableList;
import com.robindrew.common.collect.indexmap.ArrayIndexMap;
import com.robindrew.common.collect.indexmap.IIndexMap;
import com.turnengine.client.api.local.unit.IUnit;

public class Storage implements IStorage {

	private final int unitId;
	private final IIndexMap<IStorageDefinition> groupToItemSetMap = new ArrayIndexMap<IStorageDefinition>();
	private final IIndexMap<IStorageDefinition> childToItemSetMap = new ArrayIndexMap<IStorageDefinition>();

	public Storage(int unitId) {
		this.unitId = unitId;
	}

	@Override
	public int getUnitId() {
		return unitId;
	}

	@Override
	public void addStorageGroup(IStorageGroup group) {
		if (group.getParent() != getUnitId()) {
			throw new IllegalArgumentException("parents do not match, group=" + group + ", expected=" + getUnitId());
		}
		IStorageDefinition definition = new StorageDefinition(group);
		if (groupToItemSetMap.containsKey(group.getGroup())) {
			throw new IllegalArgumentException("group already exists, group=" + group);
		}
		groupToItemSetMap.put(group.getGroup(), definition);
	}

	@Override
	public void addStorageItem(IStorageItem item) {
		if (item.getParent() != getUnitId()) {
			throw new IllegalArgumentException("parents do not match, item=" + item + ", expected=" + getUnitId());
		}
		if (childToItemSetMap.containsKey(item.getChild())) {
			throw new IllegalArgumentException("child can only be added once, item=" + item);
		}
		IStorageDefinition definition = groupToItemSetMap.get(item.getGroup());
		if (definition == null) {
			throw new IllegalArgumentException("attempt to add item without first adding group, item=" + item);
		}
		definition.addStorageItem(item);
		childToItemSetMap.put(item.getChild(), definition);
	}

	@Override
	public long getSize(int unitId) {
		IStorageDefinition definition = getStorageByChild(unitId);
		if (definition == null) {
			return 0;
		}
		return definition.getSize(unitId);
	}

	@Override
	public long getSize(IUnit unit) {
		return getSize(unit.getId());
	}

	@Override
	public boolean canStore(int unitId) {
		return getSize(unitId) > 0;
	}

	@Override
	public boolean canStore(IUnit unit) {
		return canStore(unit.getId());
	}

	@Override
	public List<IStorageGroup> getStorageGroups() {
		List<IStorageGroup> list = new ArrayList<IStorageGroup>();
		for (IStorageDefinition set : groupToItemSetMap.values()) {
			list.add(set.getStorageGroup());
		}
		return list;
	}

	@Override
	public List<IStorageItem> getStorageItems() {
		List<IStorageItem> list = new ArrayList<IStorageItem>();
		for (IStorageDefinition set : groupToItemSetMap.values()) {
			list.addAll(set.getStorageItems());
		}
		return list;
	}

	@Override
	public IStorageDefinition getStorageByChild(int unitId) {
		return childToItemSetMap.get(unitId);
	}

	@Override
	public IStorageDefinition getStorageByChild(IUnit unit) {
		return getStorageByChild(unit.getId());
	}

	@Override
	public List<IStorageDefinition> getDefinitions() {
		return ImmutableList.copyOf(groupToItemSetMap.values());
	}

	@Override
	public String toString() {
		return "Storage[" + unitId + "," + getDefinitions() + "]";
	}

}
