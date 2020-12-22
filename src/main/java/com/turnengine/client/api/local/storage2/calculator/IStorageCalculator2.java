package com.turnengine.client.api.local.storage2.calculator;

import java.util.List;

import com.turnengine.client.api.local.calculator.ICalculator;
import com.turnengine.client.api.local.storage.IStorageDefinition;
import com.turnengine.client.api.local.storage.StorageType;
import com.turnengine.client.api.local.storage2.unit.IStorageUnit;
import com.turnengine.client.api.local.unit.IUnit;
import com.turnengine.client.api.local.unit.IUnitCount;

/**
 * Calculates the amount of any unit that can be added/removed from a unit list.
 * <ul>
 * <li>Takes into account storage relationships.
 * </ul>
 */
public interface IStorageCalculator2 extends ICalculator {

	IStorageDefinition getStorage(IStorageUnit unit, int storedUnitId);

	long getAmountCanStore(IStorageUnit unit, StorageType type, int storedUnitId);

	long getStorageSize(IStorageUnit unit, StorageType type, int storedUnitId, IStorageDefinition storage);

	long getCapacityFree(IStorageUnit unit, IStorageDefinition storage);

	boolean isValid(IStorageUnit container);

	long getAmount(IStorageUnit container, int unitId);

	long getAmount(IStorageUnit container, IUnit unit);

	boolean contains(IStorageUnit container, int unitId);

	boolean contains(IStorageUnit container, IUnit unit);

	boolean contains(IStorageUnit container, IUnit unit, long amount);

	boolean contains(IStorageUnit container, int unitId, long amount);

	boolean contains(IStorageUnit container, IUnitCount count);

	boolean contains(IStorageUnit container, List<IUnitCount> countList);

}
