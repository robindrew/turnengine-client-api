package com.turnengine.client.api.local.storage;

import java.util.Collection;
import java.util.List;

import com.turnengine.client.api.local.staticcache.IStaticCache;
import com.turnengine.client.api.local.unit.IUnit;

public interface IStorageCache extends IStaticCache<IStorage> {

	void addGroups(Collection<IStorageGroup> groups);

	void addGroup(IStorageGroup group);

	void addItems(Collection<IStorageItem> children);

	void addItem(IStorageItem child);

	List<IStorageGroup> getGroups();

	List<IStorageItem> getItems();

	List<IStorageDefinition> getDefinitions();

	List<IStorage> getStorageList();

	IStorage getStorage(IUnit unit);

	IStorage getStorage(int unitId);

	IStorageDefinition getStorageByChild(int parentUnitId, int childUnitId);

	IStorageDefinition getStorageByChild(IUnit parentUnit, IUnit childUnit);
}
