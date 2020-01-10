package com.turnengine.client.api.local.unit;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class UnitNameCount implements IUnitNameCount {

	/** The name field. */
	private String name = null;
	/** The amount field. */
	private long amount = 0l;

	/**
	 * The empty constructor.
	 */
	public UnitNameCount() {
	}

	/**
	 * The fields constructor.
	 */
	public UnitNameCount(String name, long amount) {
		setName(name);
		setAmount(amount);
	}

	/**
	 * The clone constructor.
	 */
	public UnitNameCount(IUnitNameCount clone) {
		setName(clone.getName());
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
	 * Getter for the name field.
	 * @return the value of the name field.
	 */
	@Override
	public String getName() {
		return name;
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
	 * Setter for the name field.
	 * @param name the name value to set.
	 */
	@Override
	public void setName(String name) {
		if (name == null) {
			throw new NullPointerException("name");
		}
		if (name.length() < 1) {
			throw new IllegalArgumentException("name too short, minimum of 1 characters, value: '" + name + "'");
		}
		if (name.length() > 200) {
			throw new IllegalArgumentException("name too long, maximum of 200 characters, value: '" + name + "'");
		}
		this.name = name;
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
		builder.append(getName());
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
		IUnitNameCount that = (IUnitNameCount) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getName(), that.getName());
		builder.append(this.getAmount(), that.getAmount());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getName());
		builder.append(getAmount());
		return builder.toString();
	}

	@Override
	public int compareTo(IUnitNameCount that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getName(), that.getName());
		builder.append(this.getAmount(), that.getAmount());
		return builder.toComparison();
	}
}
