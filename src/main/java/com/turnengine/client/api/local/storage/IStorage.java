package com.turnengine.client.api.local.storage;

import java.util.List;

import com.turnengine.client.api.local.unit.IUnit;
import com.turnengine.client.api.local.unit.IUnitIdContainer;

public interface IStorage extends IUnitIdContainer {

	void addStorageGroup(IStorageGroup group);

	void addStorageItem(IStorageItem item);

	boolean canStore(int unitId);

	boolean canStore(IUnit unit);

	long getSize(int unitId);

	long getSize(IUnit unit);

	IStorageDefinition getStorageByChild(int unitId);

	IStorageDefinition getStorageByChild(IUnit unit);

	List<IStorageGroup> getStorageGroups();

	List<IStorageItem> getStorageItems();

	List<IStorageDefinition> getDefinitions();

}
