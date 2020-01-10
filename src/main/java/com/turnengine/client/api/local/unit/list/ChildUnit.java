package com.turnengine.client.api.local.unit.list;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class ChildUnit implements IChildUnit, Comparable<IChildUnit> {

	private final int unitId;
	private long amount = 0;

	public ChildUnit(int unitId) {
		if (unitId < 0) {
			throw new IllegalArgumentException("unitId=" + unitId);
		}
		this.unitId = unitId;
	}

	public ChildUnit(int unitId, long amount) {
		this(unitId);
		this.amount = amount;
	}

	public ChildUnit(IChildUnit unit) {
		this.unitId = unit.getUnitId();
		this.amount = unit.getAmount();
	}

	@Override
	public int getUnitId() {
		return unitId;
	}

	@Override
	public long getAmount() {
		return amount;
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
		if (object instanceof IChildUnit) {
			IChildUnit unit = (IChildUnit) object;
			EqualsBuilder equals = new EqualsBuilder();
			equals.append(getUnitId(), unit.getUnitId());
			equals.append(getAmount(), unit.getAmount());
			return equals.isEquals();
		}
		return false;
	}

	@Override
	public int compareTo(IChildUnit unit) {
		if (this.getUnitId() == unit.getUnitId()) {
			return 0;
		}
		return this.getUnitId() < unit.getUnitId() ? -1 : 1;
	}
}
