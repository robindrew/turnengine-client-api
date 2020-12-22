package com.turnengine.client.api.local.storage2.calculator;

import java.util.List;

import com.turnengine.client.api.local.calculator.Calculator;
import com.turnengine.client.api.local.staticcache.IStaticCacheSet;
import com.turnengine.client.api.local.storage.IStorageCache;
import com.turnengine.client.api.local.storage.IStorageDefinition;
import com.turnengine.client.api.local.storage.StorageType;
import com.turnengine.client.api.local.storage2.unit.IStorageUnit;
import com.turnengine.client.api.local.unit.IUnit;
import com.turnengine.client.api.local.unit.IUnitCount;

public class StorageCalculator2 extends Calculator implements IStorageCalculator2 {

	private static boolean checkType(IStorageDefinition storage, StorageType type) {
		StorageType storageType = storage.getStorageGroup().getType();
		if (storageType.equals(StorageType.ANY)) {
			return true;
		}
		switch (type) {
			case ANY:
				return true;
			case GAME:
				return storageType.equals(StorageType.GAME);
			case PLAYER:
				return storageType.equals(StorageType.PLAYER);
			case LOCATION:
				return storageType.equals(StorageType.LOCATION) || storageType.equals(StorageType.MOBILE);
			case MOBILE:
				return storageType.equals(StorageType.MOBILE);
			default:
				throw new IllegalStateException("UnitType not supported: " + type);
		}
	}

	public StorageCalculator2(IStaticCacheSet set) {
		super(set);
	}

	public IStorageDefinition getStorage(IStorageUnit unit, int storedUnitId) {
		IStorageCache cache = getCacheSet().getStorageCache();
		return cache.getStorageByItem(unit.getUnitId(), storedUnitId);
	}

	public long getCapacityFree(IStorageUnit unit, IStorageDefinition storage) {
		long free = storage.getCapacity() * unit.getAmount();
		if (unit.hasChildren()) {
			free = free - getCapacityUsed(unit, storage);
		}
		return free;
	}

	public long getCapacityUsed(IStorageUnit unit, IStorageDefinition storage) {
		long used = 0;
		for (IStorageUnit child : unit.getChildList()) {
			used += child.getAmount() * storage.getSize(child.getUnitId());
		}
		return used;
	}

	@Override
	public long getAmountCanStore(IStorageUnit storageUnit, StorageType type, int storedUnitId) {
		IStorageDefinition storage = getStorage(storageUnit, storedUnitId);

		// What is the size of the unit (if it can be stored)
		long size = getStorageSize(storageUnit, type, storedUnitId, storage);
		if (size == 0) {
			return 0;
		}

		// What is the free capacity in which the unit could be stored
		long free = getCapacityFree(storageUnit, storage);
		return free / size;
	}

	public long getStorageSize(IStorageUnit unit, StorageType type, int unitId, IStorageDefinition storage) {
		if (storage == null) {
			return 0;
		}
		if (!checkType(storage, type)) {
			return 0;
		}
		return storage.getSize(unitId);
	}

	@Override
	public boolean isValid(IStorageUnit storageUnit) {
		throw new UnsupportedOperationException();
	}

	@Override
	public long getAmount(IStorageUnit storageUnit, int unitId) {
		// Recursively lookup the units
		long amount = 0;
		for (IStorageUnit child : storageUnit) {
			if (child.getUnitId() == unitId) {
				amount += child.getAmount();
			}
			amount += getAmount(child, unitId);
		}
		return amount;
	}

	@Override
	public long getAmount(IStorageUnit storageUnit, IUnit unit) {
		return getAmount(storageUnit, unit.getId());
	}

	@Override
	public boolean contains(IStorageUnit storageUnit, int unitId) {
		// Recursively lookup the units
		for (IStorageUnit child : storageUnit) {
			if (child.getUnitId() == unitId) {
				return true;
			}
			if (contains(child, unitId)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean contains(IStorageUnit storageUnit, IUnit unit) {
		return contains(storageUnit, unit.getId());
	}

	@Override
	public boolean contains(IStorageUnit storageUnit, int unitId, long amount) {
		return getAmount(storageUnit, unitId) >= amount;
	}

	@Override
	public boolean contains(IStorageUnit storageUnit, IUnit unit, long amount) {
		return contains(storageUnit, unit.getId(), amount);
	}

	@Override
	public boolean contains(IStorageUnit storageUnit, IUnitCount count) {
		return contains(storageUnit, count.getId(), count.getAmount());
	}

	@Override
	public boolean contains(IStorageUnit storageUnit, List<IUnitCount> countList) {
		for (IUnitCount count : countList) {
			if (!contains(storageUnit, count.getId(), count.getAmount())) {
				return false;
			}
		}
		return true;
	}

}
