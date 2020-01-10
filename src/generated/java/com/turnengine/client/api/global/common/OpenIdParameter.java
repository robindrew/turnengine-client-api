package com.turnengine.client.api.global.common;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class OpenIdParameter implements IOpenIdParameter {

	/** The key field. */
	private String key = null;
	/** The value field. */
	private String value = null;

	/**
	 * The empty constructor.
	 */
	public OpenIdParameter() {
	}

	/**
	 * The fields constructor.
	 */
	public OpenIdParameter(String key, String value) {
		setKey(key);
		setValue(value);
	}

	/**
	 * The clone constructor.
	 */
	public OpenIdParameter(IOpenIdParameter clone) {
		setKey(clone.getKey());
		setValue(clone.getValue());
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
	 * Getter for the key field.
	 * @return the value of the key field.
	 */
	@Override
	public String getKey() {
		return key;
	}

	/**
	 * Getter for the value field.
	 * @return the value of the value field.
	 */
	@Override
	public String getValue() {
		return value;
	}

	/**
	 * Setter for the key field.
	 * @param key the key value to set.
	 */
	@Override
	public void setKey(String key) {
		this.key = key;
	}

	/**
	 * Setter for the value field.
	 * @param value the value value to set.
	 */
	@Override
	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getKey());
		builder.append(getValue());
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
		IOpenIdParameter that = (IOpenIdParameter) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getKey(), that.getKey());
		builder.append(this.getValue(), that.getValue());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getKey());
		builder.append(getValue());
		return builder.toString();
	}

	@Override
	public int compareTo(IOpenIdParameter that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getKey(), that.getKey());
		builder.append(this.getValue(), that.getValue());
		return builder.toComparison();
	}
}
