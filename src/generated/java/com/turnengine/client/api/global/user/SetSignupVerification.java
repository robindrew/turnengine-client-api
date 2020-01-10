package com.turnengine.client.api.global.user;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class SetSignupVerification implements ISetSignupVerification {

	/** The loginId field. */
	private long loginId = 0l;
	/** The enabled field. */
	private Boolean enabled = null;

	/**
	 * The empty constructor.
	 */
	public SetSignupVerification() {
	}

	/**
	 * The fields constructor.
	 */
	public SetSignupVerification(long loginId, Boolean enabled) {
		setLoginId(loginId);
		setEnabled(enabled);
	}

	/**
	 * The clone constructor.
	 */
	public SetSignupVerification(ISetSignupVerification clone) {
		setLoginId(clone.getLoginId());
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
	 * Getter for the loginId field.
	 * @return the value of the loginId field.
	 */
	@Override
	public long getLoginId() {
		return loginId;
	}

	/**
	 * Getter for the enabled field.
	 * @return the value of the enabled field.
	 */
	@Override
	public Boolean getEnabled() {
		return enabled;
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
	 * Setter for the enabled field.
	 * @param enabled the enabled value to set.
	 */
	@Override
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getLoginId());
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
		ISetSignupVerification that = (ISetSignupVerification) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getLoginId(), that.getLoginId());
		builder.append(this.getEnabled(), that.getEnabled());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getLoginId());
		builder.append(getEnabled());
		return builder.toString();
	}

	@Override
	public int compareTo(ISetSignupVerification that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getLoginId(), that.getLoginId());
		builder.append(this.getEnabled(), that.getEnabled());
		return builder.toComparison();
	}
}
