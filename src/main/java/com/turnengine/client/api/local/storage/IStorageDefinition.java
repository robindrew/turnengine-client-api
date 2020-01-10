package com.turnengine.client.api.local.storage;

import java.util.List;
import java.util.Set;

import com.turnengine.client.api.local.group.IGroupIdContainer;
import com.turnengine.client.api.local.unit.IUnit;
import com.turnengine.client.api.local.unit.IUnitIdContainer;

public interface IStorageDefinition extends IUnitIdContainer, IGroupIdContainer {

	long getCapacity();

	IStorageGroup getStorageGroup();

	List<IStorageItem> getStorageItems();

	void addStorageItem(IStorageItem item);

	boolean canStore(int unitId);

	boolean canStore(IUnit unit);

	long getSize(int unitId);

	long getSize(IUnit unit);

	Set<Integer> getStoredUnitIds();

}
