package com.turnengine.client.api.local.unit.list;

import static java.util.Collections.emptyList;

import java.util.Collection;
import java.util.Iterator;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.turnengine.client.api.local.unit.IUnit;
import com.turnengine.client.api.local.unit.UnitNode;

public class ChildlessParentUnit implements IParentUnit, Comparable<IParentUnit> {

	private final int unitId;
	private long amount = 0;

	public ChildlessParentUnit(int unitId, long amount) {
		if (unitId < 0) {
			throw new IllegalArgumentException("unitId=" + unitId);
		}
		this.unitId = unitId;
		this.amount = amount;
	}

	public ChildlessParentUnit(IUnit unit, long amount) {
		this(unit.getId(), amount);
		if (!unit.getNode().equals(UnitNode.PARENT)) {
			throw new IllegalArgumentException("unit is not a parent: " + unit);
		}
	}

	protected ChildlessParentUnit(IParentUnit parent) {
		this.unitId = parent.getUnitId();
		this.amount = parent.getAmount();
	}

	@Override
	public int getUnitId() {
		return unitId;
	}

	@Override
	public void addAmount(long amount) {
		if (amount < 0) {
			throw new IllegalArgumentException("amount=" + amount);
		}
		if (amount > 0) {
			long newAmount = this.amount + amount;
			if (newAmount < this.amount) {
				throw new IllegalArgumentException("amount=" + amount + ", " + this);
			}
			this.amount = newAmount;
		}
	}

	@Override
	public void removeAmount(long amount) {
		if (amount < 0) {
			throw new IllegalArgumentException("amount=" + amount);
		}
		if (amount > 0) {
			long newAmount = this.amount - amount;
			if (newAmount < 0 || newAmount > this.amount) {
				throw new IllegalArgumentException("amount=" + amount + ", " + this);
			}
			this.amount = newAmount;
		}
	}

	@Override
	public void setAmount(long amount) {
		if (amount < 0) {
			throw new IllegalArgumentException("amount=" + amount);
		}
		this.amount = amount;
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(unitId);
		builder.append(amount);
		return builder.toString();
	}

	@Override
	public boolean equals(Object object) {
		if (object == this) {
			return true;
		}
		if (object instanceof ChildlessParentUnit) {
			ChildlessParentUnit unit = (ChildlessParentUnit) object;
			EqualsBuilder equals = new EqualsBuilder();
			equals.append(this.unitId, unit.unitId);
			equals.append(this.amount, unit.amount);
			return equals.isEquals();
		}
		return false;
	}

	@Override
	public int compareTo(IParentUnit unit) {
		if (this.getUnitId() == unit.getUnitId()) {
			return 0;
		}
		return this.getUnitId() < unit.getUnitId() ? -1 : 1;
	}

	@Override
	public Iterator<IChildUnit> iterator() {
		return getChildren().iterator();
	}

	@Override
	public long getAmount() {
		return amount;
	}

	@Override
	public int children() {
		return 0;
	}

	@Override
	public boolean hasChildren() {
		return false;
	}

	@Override
	public long getChildAmount(int unitId) {
		return 0;
	}

	@Override
	public long getChildAmount(IUnit unit) {
		return 0;
	}

	@Override
	public boolean containsChild(int unitId) {
		return false;
	}

	@Override
	public boolean containsChild(IUnit unit) {
		return false;
	}

	@Override
	public Collection<IChildUnit> getChildren() {
		return emptyList();
	}

	@Override
	public IChildUnit getChild(int unitId) {
		throw new UnsupportedOperationException("parent unit is childless");
	}

	@Override
	public IChildUnit getChild(IUnit unit) {
		throw new UnsupportedOperationException("parent unit is childless");
	}

	@Override
	public void setChildAmount(int unitId, long amount) {
		if (amount > 0) {
			throw new UnsupportedOperationException("parent unit is childless");
		}
	}

	@Override
	public void setChildAmount(IUnit unit, long amount) {
		if (amount > 0) {
			throw new UnsupportedOperationException("parent unit is childless");
		}
	}

	@Override
	public void addChild(IChildUnit child) {
		throw new UnsupportedOperationException("parent unit is childless");
	}

	@Override
	public boolean canHaveChildren() {
		return false;
	}

}
