package com.turnengine.client.api.local.storage2.calculator;

import static com.turnengine.client.api.local.unit.UnitNode.PARENT;

import java.util.List;

import com.turnengine.client.api.local.storage.StorageType;
import com.turnengine.client.api.local.storage2.unit.IStorageUnit;
import com.turnengine.client.api.local.storage2.unit.StorageUnit;
import com.turnengine.client.api.local.unit.IUnit;

public class StorageAllocator implements IStorageAllocator {

	private final IStorageCalculator2 calculator;

	public StorageAllocator(IStorageCalculator2 calculator) {
		if (calculator == null) {
			throw new NullPointerException("calculator");
		}
		this.calculator = calculator;
	}

	@Override
	public void addUnit(IStorageUnit storageUnit, StorageType type, IUnit unit, long amount) {
		addUnit(storageUnit, type, unit, amount, -1);
	}

	@Override
	public void addUnit(IStorageUnit storageUnit, StorageType type, IUnit unit, long amount, int index) {
		if (storageUnit.getAmount() != 1) {
			throw new IllegalArgumentException("Storage unit must be a singleton");
		}
		IUnit parentUnit = calculator.getUnit(storageUnit.getUnitId());
		if (!parentUnit.getNode().equals(PARENT)) {
			throw new IllegalStateException("Cannot add to a child unit: " + parentUnit);
		}

		// A parent unit can ONLY exist at the top level, no need to check storage
		if (unit.getNode().equals(PARENT)) {
			throw new IllegalStateException("Cannot add a parent unit as a child: " + unit);
		}

		if (index >= 0) {
			List<IStorageUnit> childList = storageUnit.getChildList();
			IStorageUnit child = childList.get(index);
			addAllUnits(childList, child, type, unit, amount);
			return;
		}

		// Add the units
		if (addAllUnits(null, storageUnit, type, unit, amount)) {
			return;
		}

		// TODO: Distributed storage
		throw new StorageException("Insufficient capacity to store " + unit + "x" + amount + " in " + storageUnit);
	}

	private boolean addAllUnits(List<IStorageUnit> list, IStorageUnit storageUnit, StorageType type, IUnit unitToStore, long amountToStore) {

		// Does this parent have capacity?
		long capacityToStore = calculator.getAmountCanStore(storageUnit, type, unitToStore.getId());
		if (capacityToStore >= amountToStore) {

			// Add to existing child?
			for (IStorageUnit child : storageUnit) {
				if (child.getUnitId() == unitToStore.getId() && !child.hasChildren()) {
					child.addAmount(amountToStore);
					return true;
				}
			}

			// Add new child
			if (storageUnit.getAmount() == 1) {
				storageUnit.addChild(new StorageUnit(unitToStore.getId(), amountToStore));
			} else {
				list.remove(storageUnit);

				IStorageUnit newUnit = new StorageUnit(storageUnit.getUnitId(), 1);
				newUnit.addChild(new StorageUnit(unitToStore.getId(), amountToStore));
				list.add(newUnit);

				storageUnit.removeAmount(1);
				list.add(storageUnit);
			}
			return true;
		}

		// Recursively attempt to add to children
		List<IStorageUnit> childList = storageUnit.getChildList();
		for (IStorageUnit child : storageUnit) {
			if (addAllUnits(childList, child, type, unitToStore, amountToStore)) {
				return true;
			}
		}

		return false;
	}
}
