package com.turnengine.client.api.global.admin;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class GetAdminHostAddress implements IGetAdminHostAddress {

	/** The code field. */
	private String code = null;

	/**
	 * The empty constructor.
	 */
	public GetAdminHostAddress() {
	}

	/**
	 * The fields constructor.
	 */
	public GetAdminHostAddress(String code) {
		setCode(code);
	}

	/**
	 * The clone constructor.
	 */
	public GetAdminHostAddress(IGetAdminHostAddress clone) {
		setCode(clone.getCode());
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
	 * Getter for the code field.
	 * @return the value of the code field.
	 */
	@Override
	public String getCode() {
		return code;
	}

	/**
	 * Setter for the code field.
	 * @param code the code value to set.
	 */
	@Override
	public void setCode(String code) {
		if (code == null) {
			throw new NullPointerException("code");
		}
		this.code = code;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getCode());
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
		IGetAdminHostAddress that = (IGetAdminHostAddress) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getCode(), that.getCode());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getCode());
		return builder.toString();
	}

	@Override
	public int compareTo(IGetAdminHostAddress that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getCode(), that.getCode());
		return builder.toComparison();
	}
}
