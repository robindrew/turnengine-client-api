package com.turnengine.client.api.local.storage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.google.common.collect.Maps;
import com.robindrew.common.text.Strings;
import com.turnengine.client.api.local.unit.IUnit;

public class StorageDefinition implements IStorageDefinition {

	// private static boolean checkType(StorageType storageType, UnitType unitType) {
	// switch (storageType) {
	// case ANY:
	// return true;
	// case GAME:
	// return unitType.equals(UnitType.GAME);
	// case PLAYER:
	// return unitType.equals(UnitType.PLAYER);
	// case LOCATION:
	// return unitType.equals(UnitType.LOCATION) || unitType.equals(UnitType.MOBILE);
	// case MOBILE:
	// return unitType.equals(UnitType.MOBILE);
	// default:
	// throw new IllegalArgumentException("Storage type not supported: " + storageType);
	// }
	// }

	private final IStorageGroup group;
	private final Map<Integer, IStorageItem> unitToItemMap = Maps.newConcurrentMap();

	public StorageDefinition(IStorageGroup group) {
		this.group = group;
	}

	@Override
	public int getUnitId() {
		return group.getParent();
	}

	@Override
	public int getGroupId() {
		return group.getGroup();
	}

	@Override
	public long getCapacity() {
		return group.getCapacity();
	}

	@Override
	public IStorageGroup getStorageGroup() {
		return group;
	}

	@Override
	public List<IStorageItem> getStorageItems() {
		return new ArrayList<IStorageItem>(unitToItemMap.values());
	}

	@Override
	public void addStorageItem(IStorageItem item) {
		if (item.getParent() != getUnitId()) {
			throw new IllegalArgumentException("parents do not match, item=" + item + ", group=" + group);
		}
		if (item.getGroup() != getGroupId()) {
			throw new IllegalArgumentException("groups do not match, item=" + item + ", group=" + group);
		}
		if (unitToItemMap.containsKey(item.getChild())) {
			throw new IllegalArgumentException("item already exists, item=" + item + ", group=" + group);
		}

		// Special check for type equality (MOVE THIS TO A VALIDATE METHOD?)
		// IUnitCache cache = getDependency(IUnitCache.class);
		// IUnit child = cache.getById(item.getChild());
		// if (!checkType(group.getType(), child.getType())) {
		// throw new IllegalArgumentException("group type=" + group.getType() + ", item type=" + child.getType());
		// }

		unitToItemMap.put(item.getChild(), item);
	}

	@Override
	public long getSize(int unitId) {
		IStorageItem item = unitToItemMap.get(unitId);
		if (item == null) {
			return 0;
		}
		return item.getSize();
	}

	@Override
	public long getSize(IUnit unit) {
		return getSize(unit.getId());
	}

	@Override
	public boolean canStore(int unitId) {
		return getSize(unitId) > 0;
	}

	@Override
	public boolean canStore(IUnit unit) {
		return canStore(unit.getId());
	}

	@Override
	public Set<Integer> getStoredUnitIds() {
		return unitToItemMap.keySet();
	}

	@Override
	public String toString() {
		return Strings.toString(this);
	}

}
