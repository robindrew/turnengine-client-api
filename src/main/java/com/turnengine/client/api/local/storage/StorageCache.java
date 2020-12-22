package com.turnengine.client.api.local.storage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import com.robindrew.common.collect.indexmap.ArrayIndexMap;
import com.robindrew.common.collect.indexmap.IIndexMap;
import com.turnengine.client.api.local.unit.IUnit;

public class StorageCache implements IStorageCache {

	private final IIndexMap<IStorage> unitIdToStorageMap = new ArrayIndexMap<IStorage>();

	public StorageCache() {
	}

	public StorageCache(List<IStorageGroup> groups, List<IStorageItem> items) {
		addGroups(groups);
		addItems(items);
	}

	@Override
	public List<IStorageGroup> getGroups() {
		List<IStorageGroup> list = new ArrayList<IStorageGroup>();
		for (IStorage set : unitIdToStorageMap.values()) {
			list.addAll(set.getStorageGroups());
		}
		return list;
	}

	@Override
	public List<IStorageItem> getItems() {
		List<IStorageItem> list = new ArrayList<IStorageItem>();
		for (IStorage set : unitIdToStorageMap.values()) {
			list.addAll(set.getStorageItems());
		}
		return list;
	}

	@Override
	public void addGroup(IStorageGroup group) {
		int unitId = group.getParent();
		IStorage set = unitIdToStorageMap.get(unitId);
		if (set == null) {
			set = new Storage(unitId);
			unitIdToStorageMap.put(unitId, set);
		}
		set.addStorageGroup(group);
	}

	@Override
	public void addItem(IStorageItem item) {
		int unitId = item.getParent();
		IStorage set = unitIdToStorageMap.get(unitId);
		if (set == null) {
			throw new IllegalArgumentException("attempt to add item without first adding group, item=" + item);
		}
		set.addStorageItem(item);
	}

	@Override
	public void addGroups(Collection<IStorageGroup> groups) {
		for (IStorageGroup group : groups) {
			addGroup(group);
		}
	}

	@Override
	public void addItems(Collection<IStorageItem> items) {
		for (IStorageItem item : items) {
			addItem(item);
		}
	}

	@Override
	public IStorage getStorage(int unitId) {
		return unitIdToStorageMap.get(unitId);
	}

	@Override
	public IStorage getStorage(IUnit unit) {
		return getStorage(unit.getId());
	}

	@Override
	public int size() {
		return unitIdToStorageMap.size();
	}

	@Override
	public boolean isEmpty() {
		return size() == 0;
	}

	@Override
	public void clear() {
		unitIdToStorageMap.clear();
	}

	@Override
	public Iterator<IStorage> iterator() {
		return unitIdToStorageMap.values().iterator();
	}

	@Override
	public IStorageDefinition getStorageByItem(int parentUnitId, int childUnitId) {
		IStorage storage = getStorage(parentUnitId);
		if (storage == null) {
			return null;
		}
		return storage.getStorageByChild(childUnitId);
	}

	@Override
	public IStorageDefinition getStorageByItem(IUnit parentUnit, IUnit childUnit) {
		return getStorageByItem(parentUnit.getId(), childUnit.getId());
	}

	@Override
	public List<IStorage> getStorageList() {
		return new ArrayList<IStorage>(unitIdToStorageMap.values());
	}

	@Override
	public List<IStorage> getAll() {
		return unitIdToStorageMap.values();
	}

	@Override
	public List<IStorageDefinition> getDefinitions() {
		List<IStorageDefinition> definitions = new ArrayList<>();
		for (IStorage storage : unitIdToStorageMap.values()) {
			definitions.addAll(storage.getDefinitions());
		}
		return definitions;
	}
}
