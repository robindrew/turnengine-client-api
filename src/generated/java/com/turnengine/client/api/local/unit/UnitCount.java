package com.turnengine.client.api.local.unit;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class UnitCount implements IUnitCount {

	/** The id field. */
	private int id = 0;
	/** The amount field. */
	private long amount = 0l;

	/**
	 * The empty constructor.
	 */
	public UnitCount() {
	}

	/**
	 * The fields constructor.
	 */
	public UnitCount(int id, long amount) {
		setId(id);
		setAmount(amount);
	}

	/**
	 * The clone constructor.
	 */
	public UnitCount(IUnitCount clone) {
		setId(clone.getId());
		setAmount(clone.getAmount());
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
	 * Getter for the amount field.
	 * @return the value of the amount field.
	 */
	@Override
	public long getAmount() {
		return amount;
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
	 * Setter for the amount field.
	 * @param amount the amount value to set.
	 */
	@Override
	public void setAmount(long amount) {
		this.amount = amount;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getId());
		builder.append(getAmount());
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
		IUnitCount that = (IUnitCount) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getId(), that.getId());
		builder.append(this.getAmount(), that.getAmount());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getId());
		builder.append(getAmount());
		return builder.toString();
	}

	@Override
	public int compareTo(IUnitCount that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getId(), that.getId());
		builder.append(this.getAmount(), that.getAmount());
		return builder.toComparison();
	}
}
