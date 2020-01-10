package com.turnengine.client.api.local.unit;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class UnitCountRange implements IUnitCountRange {

	/** The id field. */
	private int id = 0;
	/** The minAmount field. */
	private long minAmount = 0l;
	/** The maxAmount field. */
	private long maxAmount = 0l;

	/**
	 * The empty constructor.
	 */
	public UnitCountRange() {
	}

	/**
	 * The fields constructor.
	 */
	public UnitCountRange(int id, long minAmount, long maxAmount) {
		setId(id);
		setMinAmount(minAmount);
		setMaxAmount(maxAmount);
	}

	/**
	 * The clone constructor.
	 */
	public UnitCountRange(IUnitCountRange clone) {
		setId(clone.getId());
		setMinAmount(clone.getMinAmount());
		setMaxAmount(clone.getMaxAmount());
	}

	/**
	 * Returns the serialization id.
	 * @return the serialization id.
	 */
	@Override
	public int getSerializationId() {
		return SERIALIZATION_ID;
	}

	/**
	 * Getter for the id field.
	 * @return the value of the id field.
	 */
	@Override
	public int getId() {
		return id;
	}

	/**
	 * Getter for the minAmount field.
	 * @return the value of the minAmount field.
	 */
	@Override
	public long getMinAmount() {
		return minAmount;
	}

	/**
	 * Getter for the maxAmount field.
	 * @return the value of the maxAmount field.
	 */
	@Override
	public long getMaxAmount() {
		return maxAmount;
	}

	/**
	 * Setter for the id field.
	 * @param id the id value to set.
	 */
	@Override
	public void setId(int id) {
		if (id < -1) {
			throw new IllegalArgumentException("id too small, minimum of -1, value: '" + id + "'");
		}
		this.id = id;
	}

	/**
	 * Setter for the minAmount field.
	 * @param minAmount the minAmount value to set.
	 */
	@Override
	public void setMinAmount(long minAmount) {
		this.minAmount = minAmount;
	}

	/**
	 * Setter for the maxAmount field.
	 * @param maxAmount the maxAmount value to set.
	 */
	@Override
	public void setMaxAmount(long maxAmount) {
		this.maxAmount = maxAmount;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getId());
		builder.append(getMinAmount());
		builder.append(getMaxAmount());
		return builder.toHashCode();
	}

	@Override
	public boolean equals(Object object) {
		// Identity check
		if (object == this) {
			return true;
		}

		// Null check
		if (object == null) {
			return false;
		}

		// Compare types
		if (!this.getClass().equals(object.getClass())) {
			return false;
		}

		// Compare fields
		IUnitCountRange that = (IUnitCountRange) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getId(), that.getId());
		builder.append(this.getMinAmount(), that.getMinAmount());
		builder.append(this.getMaxAmount(), that.getMaxAmount());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getId());
		builder.append(getMinAmount());
		builder.append(getMaxAmount());
		return builder.toString();
	}

	@Override
	public int compareTo(IUnitCountRange that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getId(), that.getId());
		builder.append(this.getMinAmount(), that.getMinAmount());
		builder.append(this.getMaxAmount(), that.getMaxAmount());
		return builder.toComparison();
	}
}
