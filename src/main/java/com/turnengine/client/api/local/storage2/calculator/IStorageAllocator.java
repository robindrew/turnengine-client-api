package com.turnengine.client.api.local.storage2.calculator;

import com.turnengine.client.api.local.storage.StorageType;
import com.turnengine.client.api.local.storage2.unit.IStorageUnit;
import com.turnengine.client.api.local.unit.IUnit;

public interface IStorageAllocator {

	void addUnit(IStorageUnit storageUnit, StorageType type, IUnit unit, long amount);

	void addUnit(IStorageUnit storageUnit, StorageType type, IUnit unit, long amount, int index);

}
