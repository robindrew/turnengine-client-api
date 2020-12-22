package com.turnengine.client.api.local.storage2.unit;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import com.google.common.collect.ImmutableList;
import com.robindrew.common.dependency.DependencyFactory;
import com.turnengine.client.api.local.unit.IUnit;
import com.turnengine.client.api.local.unit.IUnitCache;

public class StorageUnit implements IStorageUnit {

	private static List<IStorageUnit> deepCopy(List<IStorageUnit> unitList) {
		if (unitList == null || unitList.isEmpty()) {
			return ImmutableList.of();
		}
		List<IStorageUnit> list = new LinkedList<>();
		for (IStorageUnit unit : unitList) {
			list.add(unit.copy());
		}
		return list;
	}

	private final int unitId;
	private long amount = 0;
	private List<IStorageUnit> childList = ImmutableList.of();

	private StorageUnit(int unitId, long amount, List<IStorageUnit> childList) {
		if (unitId < 0) {
			throw new IllegalArgumentException("unitId=" + unitId);
		}
		if (amount < 1) {
			throw new IllegalArgumentException("amount=" + amount);
		}
		this.unitId = unitId;
		this.amount = amount;
		this.childList = deepCopy(childList);
	}

	public StorageUnit(int unitId, long amount) {
		this(unitId, amount, null);
	}

	public StorageUnit(IUnit unit, long amount) {
		this(unit.getId(), amount);
	}

	protected StorageUnit(IStorageUnit copy) {
		this(copy.getUnitId(), copy.getAmount(), copy.getChildList());
	}

	@Override
	public int getUnitId() {
		return unitId;
	}

	@Override
	public Iterator<IStorageUnit> iterator() {
		return getChildList().iterator();
	}

	@Override
	public long getAmount() {
		return amount;
	}

	@Override
	public boolean hasChildren() {
		return !childList.isEmpty();
	}

	@Override
	public List<IStorageUnit> getChildList() {
		return childList;
	}

	@Override
	public void setAmount(long amount) {
		if (amount < 0) {
			throw new IllegalArgumentException("amount=" + amount);
		}
		if (amount > 1 && !childList.isEmpty()) {
			throw new IllegalArgumentException("can not set amount to greater than one when children are present");
		}
		this.amount = amount;
	}

	@Override
	public void addAmount(long amount) {
		if (amount < 1) {
			throw new IllegalArgumentException("amount=" + amount);
		}

		// Handle overflow
		long newAmount = this.amount + amount;
		if (newAmount < this.amount) {
			throw new IllegalArgumentException("unable to add amount=" + amount + " to " + this.amount + " (result=" + newAmount + ")");
		}
		setAmount(newAmount);
	}

	@Override
	public void removeAmount(int amount) {
		if (amount < 1) {
			throw new IllegalArgumentException("amount=" + amount);
		}

		// Handle overflow
		long newAmount = this.amount - amount;
		if (newAmount >= this.amount) {
			throw new IllegalArgumentException("unable to remove amount=" + amount + " from " + this.amount + " (result=" + newAmount + ")");
		}
		setAmount(newAmount);
	}

	@Override
	public void addChild(IStorageUnit child) {
		if (child == null) {
			throw new NullPointerException("child");
		}
		if (amount > 1) {
			throw new IllegalStateException("Unable to add a child unit, amount=" + amount);
		}
		if (childList.isEmpty()) {
			childList = new LinkedList<>();
		}
		childList.add(child);
	}

	@Override
	public void removeChild(IStorageUnit child) {
		if (child == null) {
			throw new NullPointerException("child");
		}
		Iterator<IStorageUnit> children = childList.iterator();
		while (children.hasNext()) {
			IStorageUnit unit = children.next();
			if (unit.equals(child)) {
				children.remove();
				return;
			}
		}
		throw new IllegalArgumentException("Unable to remove child unit: " + child + " from " + this);
	}

	@Override
	public IStorageUnit copy() {
		return new StorageUnit(this);
	}

	@Override
	public String toString() {
		IUnitCache units = DependencyFactory.getDependency(IUnitCache.class);
		IUnit unit = units.getById(unitId);

		StringBuilder text = new StringBuilder();
		text.append("StorageUnit[");
		text.append(amount).append("x");
		text.append(unit.getName());
		if (!childList.isEmpty()) {
			boolean comma = false;
			text.append(",[");
			for (IStorageUnit child : childList) {
				if (comma) {
					text.append(",");
				}
				comma = true;
				text.append(child);
			}
			text.append("]");
		}

		text.append("]");
		return text.toString();
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(unitId);
		builder.append(amount);
		builder.append(childList);
		return builder.toHashCode();
	}

	@Override
	public boolean equals(Object object) {
		if (object == this) {
			return true;
		}
		if (object instanceof StorageUnit) {
			StorageUnit unit = (StorageUnit) object;
			EqualsBuilder builder = new EqualsBuilder();
			builder.append(this.unitId, unit.unitId);
			builder.append(this.amount, unit.amount);
			builder.append(this.childList, unit.childList);
			return builder.isEquals();
		}
		return false;
	}

	@Override
	public int compareTo(IStorageUnit unit) {
		if (this.getUnitId() == unit.getUnitId()) {
			return 0;
		}
		return this.getUnitId() < unit.getUnitId() ? -1 : 1;
	}

}
