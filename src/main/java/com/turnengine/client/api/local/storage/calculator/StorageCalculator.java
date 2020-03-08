package com.turnengine.client.api.local.storage.calculator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.robindrew.common.collect.count.CountMap;
import com.robindrew.common.collect.count.ICountMap;
import com.turnengine.client.api.local.calculator.Calculator;
import com.turnengine.client.api.local.staticcache.IStaticCacheSet;
import com.turnengine.client.api.local.storage.IStorage;
import com.turnengine.client.api.local.storage.IStorageCache;
import com.turnengine.client.api.local.storage.IStorageDefinition;
import com.turnengine.client.api.local.storage.StorageType;
import com.turnengine.client.api.local.unit.IUnit;
import com.turnengine.client.api.local.unit.IUnitCache;
import com.turnengine.client.api.local.unit.IUnitCount;
import com.turnengine.client.api.local.unit.UnitNode;
import com.turnengine.client.api.local.unit.list.IChildUnit;
import com.turnengine.client.api.local.unit.list.IParentUnit;
import com.turnengine.client.api.local.unit.list.IUnitList;
import com.turnengine.client.api.local.unit.list.SingleParentUnit;
import com.turnengine.client.api.local.unit.list.count.IUnitCountListMerger;
import com.turnengine.client.api.local.unit.list.count.UnitCountListMerger;

public class StorageCalculator extends Calculator implements IStorageCalculator {

	public StorageCalculator(IStaticCacheSet set) {
		super(set);
	}

	private IStorageDefinition getStorage(IParentUnit parent, int childUnitId) {
		IStorageCache cache = getCacheSet().getStorageCache();
		return cache.getStorageByChild(parent.getUnitId(), childUnitId);
	}

	private IUnit getUnit(int unitId) {
		return getCacheSet().getUnitCache().getById(unitId);
	}

	private boolean isParent(IUnit unit) {
		return unit.getNode().equals(UnitNode.PARENT);
	}

	@Override
	public long getAmountCanAdd(IUnitList list, int unitId, StorageType type) {
		return getAmountCanAdd(list, getUnit(unitId), type);
	}

	@Override
	public long getAmountCanAdd(IUnitList list, IUnit unit, StorageType type) {
		if (isParent(unit)) {
			long existing = list.getParentAmount(unit.getId());
			return Integer.MAX_VALUE - existing;
		}
		if (list.isEmpty()) {
			return 0;
		}
		long amount = 0;
		for (IParentUnit parent : list) {
			long canAdd = getAmountCanAdd(parent, unit.getId(), type);
			if (amount > amount + canAdd) {
				return Long.MAX_VALUE;
			}
			amount += canAdd;
		}
		return amount;
	}

	public long getAmountCanAdd(IParentUnit parent, int unitId, StorageType type) {
		IStorageDefinition storage = getStorage(parent, unitId);
		if (storage == null) {
			return 0;
		}
		if (!checkType(storage, type)) {
			return 0;
		}
		long size = storage.getSize(unitId);
		if (size == 0) {
			return 0;
		}
		return getCapacityFree(parent, storage) / size;
	}

	@Override
	public long getCapacityUsed(IParentUnit parent, IStorageDefinition storage) {
		if (!parent.hasChildren()) {
			return 0;
		}
		long used = 0;
		for (IChildUnit child : parent.getChildren()) {
			used += child.getAmount() * storage.getSize(child.getUnitId());
		}
		return used;
	}

	@Override
	public long getCapacityFree(IParentUnit parent, IStorageDefinition storage) {
		if (!parent.canHaveChildren()) {
			return storage.getCapacity() * parent.getAmount();
		}
		return storage.getCapacity() - getCapacityUsed(parent, storage);
	}

	@Override
	public long getAmountCanRemove(IUnitList list, int unitId) {
		return getAmountCanRemove(list, getUnit(unitId));
	}

	@Override
	public long getAmountCanRemove(IUnitList list, IUnit unit) {
		if (isParent(unit)) {
			return getAmountCanRemoveByParent(list, unit.getId());
		} else {
			return list.getChildAmount(unit.getId());
		}
	}

	private long getAmountCanRemoveByParent(IUnitList list, int unitId) {
		long amount = 0;
		for (IParentUnit parent : list) {
			// Can only remove a parent WITH NO CHILDREN
			if (parent.getUnitId() == unitId && !parent.hasChildren()) {
				amount += parent.getAmount();
			}
		}
		return amount;
	}

	@Override
	public void removeAmount(IUnitList list, int unitId, long amount) {
		removeAmount(list, getUnit(unitId), amount);
	}

	@Override
	public void removeAmount(IUnitList list, IUnit unit, long amount) {
		if (amount < 1) {
			throw new IllegalArgumentException("amount=" + amount);
		}
		if (isParent(unit)) {
			removeByParent(list, unit.getId(), amount);
		} else {
			removeByChild(list, unit.getId(), amount);
		}
	}

	private void removeByChild(IUnitList list, int unitId, long amount) {
		for (IParentUnit parent : list) {
			long childAmount = parent.getChildAmount(unitId);
			if (childAmount > 0) {
				if (childAmount > amount) {
					childAmount -= amount;
					amount = 0;
				} else {
					amount -= childAmount;
					childAmount = 0;
				}
				parent.setChildAmount(unitId, childAmount);
				if (amount == 0) {
					return;
				}
			}
		}

		// Failed?
		if (amount > 0) {
			throw new StorageException("unable to remove expected number of " + unitId + " from " + list);
		}
	}

	private void removeByParent(IUnitList list, int unitId, long amount) {
		long expectedAmount = amount;
		Iterator<IParentUnit> parents = list.iterator();
		while (parents.hasNext() && amount > 0) {
			IParentUnit parent = parents.next();

			// Can only remove a parent WITH NO CHILDREN
			if (parent.getUnitId() == unitId && !parent.hasChildren()) {
				long parentAmount = parent.getAmount();
				if (amount >= parentAmount) {
					amount -= parentAmount;
					parents.remove();
				} else {
					parentAmount -= amount;
					amount = 0;
					parent.setAmount(parentAmount);
				}
			}
			if (amount == 0) {
				return;
			}
		}
		if (amount > 0) {
			throw new StorageException("unable to remove " + amount + "/" + expectedAmount + " of unit " + unitId + " from " + list);
		}
	}

	@Override
	public void removeAll(IUnitList list, int unitId) {
		removeAll(list, getUnit(unitId));
	}

	@Override
	public void removeAll(IUnitList list, IUnit unit) {
		boolean child = !isParent(unit);
		Iterator<IParentUnit> parents = list.iterator();
		while (parents.hasNext()) {
			IParentUnit parent = parents.next();
			if (child) {
				parent.setChildAmount(unit.getId(), 0);
			} else {
				if (parent.getUnitId() == unit.getId()) {
					parents.remove();
				}
			}
		}
	}

	@Override
	public void addAmount(IUnitList list, int unitId, long amount, StorageType type) {
		addAmount(list, getUnit(unitId), amount, type);
	}

	@Override
	public void addAmount(IUnitList list, IUnit unit, long amount, StorageType type) {

		// Add parent units
		if (isParent(unit)) {
			addParentAmount(list, unit, amount);
		} else {
			addChildAmount(list, unit, amount, type);
		}
	}

	private void addParentAmount(IUnitList list, IUnit unit, long amount) {
		long existing = list.getParentAmount(unit.getId());
		if (amount + existing > Integer.MAX_VALUE) {
			throw new IllegalArgumentException("amount=" + amount);
		}
		list.addParentAmount(unit.getId(), amount);
	}

	private void addChildAmount(IUnitList list, IUnit unit, long amount, StorageType type) {
		long expectedAmount = amount;

		// Single parents first
		for (IParentUnit parent : list) {

			// Skip childless parents
			if (!parent.canHaveChildren()) {
				continue;
			}
			amount -= addChildAmount(parent, unit.getId(), amount, type);
			if (amount == 0) {
				return;
			}
		}

		// Childless parents next
		List<IParentUnit> newParents = new ArrayList<IParentUnit>();
		Iterator<IParentUnit> parents = list.iterator();
		while (parents.hasNext()) {
			IParentUnit parent = parents.next();

			// Skip single parents
			if (parent.canHaveChildren()) {
				continue;
			}
			if (!canStoreChild(parent, unit.getId(), type)) {
				continue;
			}

			long parentAmount = parent.getAmount();
			while (parentAmount > 0) {
				parentAmount--;
				IParentUnit newParent = new SingleParentUnit(parent.getUnitId());
				newParents.add(newParent);

				amount -= addChildAmount(newParent, unit.getId(), amount, type);
				if (amount == 0) {
					break;
				}
			}
			if (parentAmount == 0) {
				parents.remove();
			} else {
				parent.setAmount(parentAmount);
			}
		}
		list.addAll(newParents);

		// Failed?
		if (amount > 0) {
			throw new StorageException("unable to add expected number of " + unit + " to " + list + " " + amount + " remaining from " + expectedAmount);
		}
	}

	private long getStorageSize(IParentUnit parent, int unitId, StorageType type, IStorageDefinition storage) {
		if (storage == null) {
			return 0;
		}
		if (!checkType(storage, type)) {
			return 0;
		}
		return storage.getSize(unitId);
	}

	private boolean checkType(IStorageDefinition storage, StorageType type) {
		StorageType storageType = storage.getStorageGroup().getType();
		if (storageType.equals(StorageType.ANY)) {
			return true;
		}
		switch (type) {
			case ANY:
				return true;
			case PLAYER:
				return storageType.equals(StorageType.PLAYER);
			case LOCATION:
				return storageType.equals(StorageType.LOCATION);
			case MOBILE:
				return storageType.equals(StorageType.MOBILE);
			default:
				throw new IllegalStateException("UnitType not supported: " + type);
		}
	}

	private boolean canStoreChild(IParentUnit parent, int unitId, StorageType type) {
		IStorageDefinition storage = getStorage(parent, unitId);
		return getStorageSize(parent, unitId, type, storage) > 0;
	}

	private long addChildAmount(IParentUnit parent, int unitId, long amount, StorageType type) {
		IStorageDefinition storage = getStorage(parent, unitId);
		long size = getStorageSize(parent, unitId, type, storage);
		if (size == 0) {
			return 0;
		}
		long free = getCapacityFree(parent, storage);
		long amountToStore = free / size;
		if (amountToStore > amount) {
			amountToStore = amount;
		}
		if (amountToStore == 0) {
			return 0;
		}
		long children = parent.getChildAmount(unitId);
		children += amountToStore;
		parent.setChildAmount(unitId, children);
		return amountToStore;
	}

	@Override
	public long getAmount(IUnitList list, int unitId) {
		return list.getAmount(getUnit(unitId));
	}

	@Override
	public long getAmount(IUnitList list, IUnit unit) {
		return list.getAmount(unit);
	}

	@Override
	public boolean contains(IUnitList list, int unitId) {
		return contains(list, getUnit(unitId));
	}

	@Override
	public boolean contains(IUnitList list, IUnit unit) {
		return list.contains(unit);
	}

	@Override
	public boolean isValid(IUnitList list) {
		for (IParentUnit parent : list) {
			IUnit unit = getUnit(parent.getUnitId());
			if (!isParent(unit)) {
				return false;
			}
			if (!isValid(parent)) {
				return false;
			}
		}
		return true;
	}

	private boolean isValid(IParentUnit parent) {
		if (!parent.hasChildren()) {
			return true;
		}

		// Lookup storage
		IStorageCache storageCache = getCacheSet().getStorageCache();
		IStorage storage = storageCache.getStorage(parent.getUnitId());

		// Check children
		ICountMap<IStorageDefinition> definitionMap = new CountMap<IStorageDefinition>();
		for (IChildUnit child : parent.getChildren()) {
			if (child.getAmount() < 1) {
				return false;
			}
			IUnit unit = getUnit(child.getUnitId());
			if (isParent(unit)) {
				return false;
			}

			// Storage check
			IStorageDefinition definition = storage.getStorageByChild(unit);
			if (definition == null) {
				// Unit cannot be stored
				return false;
			}

			// Capacity check
			long capacityUsed = child.getAmount() * definition.getSize(unit);
			definitionMap.increment(definition, capacityUsed);
		}

		// Final capacity check
		for (IStorageDefinition definition : definitionMap) {
			long capacityUsed = definitionMap.get(definition);
			if (capacityUsed > definition.getCapacity()) {
				return false;
			}
		}

		// Success!
		return true;
	}

	@Override
	public boolean contains(IUnitList list, IUnit unit, long amount) {
		// TODO: Inefficient to get entire amount from list!
		return list.getAmount(unit) >= amount;
	}

	@Override
	public boolean contains(IUnitList list, int unitId, long amount) {
		IUnitCache cache = getCacheSet().getUnitCache();
		IUnit unit = cache.getById(unitId);
		return contains(list, unit, amount);
	}

	@Override
	public boolean contains(IUnitList list, IUnitCount count) {
		return contains(list, count.getId(), count.getAmount());
	}

	@Override
	public boolean contains(IUnitList list, List<IUnitCount> countList) {

		// Merge
		IUnitCountListMerger merger = new UnitCountListMerger();
		countList = merger.merge(countList, false);

		for (IUnitCount count : countList) {
			if (!contains(list, count)) {
				return false;
			}
		}
		return true;
	}

}
