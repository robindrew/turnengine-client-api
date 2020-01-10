package com.turnengine.client.api.local.mobile;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class MobileSetupInfo implements IMobileSetupInfo {

	/** The count field. */
	private int count = 0;
	/** The enabled field. */
	private boolean enabled = false;

	/**
	 * The empty constructor.
	 */
	public MobileSetupInfo() {
	}

	/**
	 * The fields constructor.
	 */
	public MobileSetupInfo(int count, boolean enabled) {
		setCount(count);
		setEnabled(enabled);
	}

	/**
	 * The clone constructor.
	 */
	public MobileSetupInfo(IMobileSetupInfo clone) {
		setCount(clone.getCount());
		setEnabled(clone.getEnabled());
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
	 * Getter for the enabled field.
	 * @return the value of the enabled field.
	 */
	@Override
	public boolean getEnabled() {
		return enabled;
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
	 * Setter for the enabled field.
	 * @param enabled the enabled value to set.
	 */
	@Override
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getCount());
		builder.append(getEnabled());
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
		IMobileSetupInfo that = (IMobileSetupInfo) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getCount(), that.getCount());
		builder.append(this.getEnabled(), that.getEnabled());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getCount());
		builder.append(getEnabled());
		return builder.toString();
	}

	@Override
	public int compareTo(IMobileSetupInfo that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getCount(), that.getCount());
		builder.append(this.getEnabled(), that.getEnabled());
		return builder.toComparison();
	}
}
