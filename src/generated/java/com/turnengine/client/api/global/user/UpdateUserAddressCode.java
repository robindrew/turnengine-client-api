package com.turnengine.client.api.global.user;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class UpdateUserAddressCode implements IUpdateUserAddressCode {

	/** The loginId field. */
	private long loginId = 0l;
	/** The code field. */
	private String code = null;

	/**
	 * The empty constructor.
	 */
	public UpdateUserAddressCode() {
	}

	/**
	 * The fields constructor.
	 */
	public UpdateUserAddressCode(long loginId, String code) {
		setLoginId(loginId);
		setCode(code);
	}

	/**
	 * The clone constructor.
	 */
	public UpdateUserAddressCode(IUpdateUserAddressCode clone) {
		setLoginId(clone.getLoginId());
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
	 * Getter for the loginId field.
	 * @return the value of the loginId field.
	 */
	@Override
	public long getLoginId() {
		return loginId;
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
	 * Setter for the loginId field.
	 * @param loginId the loginId value to set.
	 */
	@Override
	public void setLoginId(long loginId) {
		this.loginId = loginId;
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
		builder.append(getLoginId());
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
		IUpdateUserAddressCode that = (IUpdateUserAddressCode) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getLoginId(), that.getLoginId());
		builder.append(this.getCode(), that.getCode());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getLoginId());
		builder.append(getCode());
		return builder.toString();
	}

	@Override
	public int compareTo(IUpdateUserAddressCode that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getLoginId(), that.getLoginId());
		builder.append(this.getCode(), that.getCode());
		return builder.toComparison();
	}
}
