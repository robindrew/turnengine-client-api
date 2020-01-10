package com.turnengine.client.api.local.creation.calculator.condition;

import com.turnengine.client.api.local.calculator.Calculator;
import com.turnengine.client.api.local.creation.data.ICreationData;
import com.turnengine.client.api.local.staticcache.IStaticCacheSet;
import com.turnengine.client.api.local.storage.StorageType;
import com.turnengine.client.api.local.storage.calculator.IStorageCalculator;
import com.turnengine.client.api.local.storage.calculator.StorageCalculator;
import com.turnengine.client.api.local.unit.IUnit;
import com.turnengine.client.api.local.unit.UnitType;

public abstract class ConditionCalculator extends Calculator implements IConditionCalculator {

	private final IStorageCalculator storage;

	protected ConditionCalculator(IStaticCacheSet set) {
		super(set);
		this.storage = new StorageCalculator(set);
	}

	protected IUnit getUnit(int unitId) {
		return getCacheSet().getUnitCache().getById(unitId);
	}

	protected IStorageCalculator getStorage() {
		return storage;
	}

	protected StorageType getStorageType(ICreationData data) {
		UnitType type = data.getUnitListSet().getType();
		switch (type) {
			case LOCATION:
				return StorageType.LOCATION;
			case MOBILE:
				return StorageType.MOBILE;
			case PLAYER:
				return StorageType.PLAYER;
			default:
				throw new IllegalStateException("UnitType not supported: " + type);
		}
	}

}
