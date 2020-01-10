package com.turnengine.client.api.local.player;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class PlayerSetupInfo implements IPlayerSetupInfo {

	/** The count field. */
	private int count = 0;
	/** The limit field. */
	private int limit = 0;
	/** The signupsEnabled field. */
	private boolean signupsEnabled = false;

	/**
	 * The empty constructor.
	 */
	public PlayerSetupInfo() {
	}

	/**
	 * The fields constructor.
	 */
	public PlayerSetupInfo(int count, int limit, boolean signupsEnabled) {
		setCount(count);
		setLimit(limit);
		setSignupsEnabled(signupsEnabled);
	}

	/**
	 * The clone constructor.
	 */
	public PlayerSetupInfo(IPlayerSetupInfo clone) {
		setCount(clone.getCount());
		setLimit(clone.getLimit());
		setSignupsEnabled(clone.getSignupsEnabled());
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
	 * Getter for the count field.
	 * @return the value of the count field.
	 */
	@Override
	public int getCount() {
		return count;
	}

	/**
	 * Getter for the limit field.
	 * @return the value of the limit field.
	 */
	@Override
	public int getLimit() {
		return limit;
	}

	/**
	 * Getter for the signupsEnabled field.
	 * @return the value of the signupsEnabled field.
	 */
	@Override
	public boolean getSignupsEnabled() {
		return signupsEnabled;
	}

	/**
	 * Setter for the count field.
	 * @param count the count value to set.
	 */
	@Override
	public void setCount(int count) {
		if (count < 0) {
			throw new IllegalArgumentException("count too small, minimum of 0, value: '" + count + "'");
		}
		this.count = count;
	}

	/**
	 * Setter for the limit field.
	 * @param limit the limit value to set.
	 */
	@Override
	public void setLimit(int limit) {
		if (limit < 0) {
			throw new IllegalArgumentException("limit too small, minimum of 0, value: '" + limit + "'");
		}
		this.limit = limit;
	}

	/**
	 * Setter for the signupsEnabled field.
	 * @param signupsEnabled the signupsEnabled value to set.
	 */
	@Override
	public void setSignupsEnabled(boolean signupsEnabled) {
		this.signupsEnabled = signupsEnabled;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getCount());
		builder.append(getLimit());
		builder.append(getSignupsEnabled());
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
		IPlayerSetupInfo that = (IPlayerSetupInfo) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getCount(), that.getCount());
		builder.append(this.getLimit(), that.getLimit());
		builder.append(this.getSignupsEnabled(), that.getSignupsEnabled());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getCount());
		builder.append(getLimit());
		builder.append(getSignupsEnabled());
		return builder.toString();
	}

	@Override
	public int compareTo(IPlayerSetupInfo that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getCount(), that.getCount());
		builder.append(this.getLimit(), that.getLimit());
		builder.append(this.getSignupsEnabled(), that.getSignupsEnabled());
		return builder.toComparison();
	}
}
