package com.turnengine.client.api.global.user;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class ChangeUserPassword implements IChangeUserPassword {

	/** The loginId field. */
	private long loginId = 0l;
	/** The oldPassword field. */
	private String oldPassword = null;
	/** The newPassword field. */
	private String newPassword = null;

	/**
	 * The empty constructor.
	 */
	public ChangeUserPassword() {
	}

	/**
	 * The fields constructor.
	 */
	public ChangeUserPassword(long loginId, String oldPassword, String newPassword) {
		setLoginId(loginId);
		setOldPassword(oldPassword);
		setNewPassword(newPassword);
	}

	/**
	 * The clone constructor.
	 */
	public ChangeUserPassword(IChangeUserPassword clone) {
		setLoginId(clone.getLoginId());
		setOldPassword(clone.getOldPassword());
		setNewPassword(clone.getNewPassword());
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
	 * Getter for the oldPassword field.
	 * @return the value of the oldPassword field.
	 */
	@Override
	public String getOldPassword() {
		return oldPassword;
	}

	/**
	 * Getter for the newPassword field.
	 * @return the value of the newPassword field.
	 */
	@Override
	public String getNewPassword() {
		return newPassword;
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
	 * Setter for the oldPassword field.
	 * @param oldPassword the oldPassword value to set.
	 */
	@Override
	public void setOldPassword(String oldPassword) {
		if (oldPassword == null) {
			throw new NullPointerException("oldPassword");
		}
		if (oldPassword.length() < 3) {
			throw new IllegalArgumentException("oldPassword too short, minimum of 3 characters, value: '" + oldPassword + "'");
		}
		if (oldPassword.length() > 120) {
			throw new IllegalArgumentException("oldPassword too long, maximum of 120 characters, value: '" + oldPassword + "'");
		}
		this.oldPassword = oldPassword;
	}

	/**
	 * Setter for the newPassword field.
	 * @param newPassword the newPassword value to set.
	 */
	@Override
	public void setNewPassword(String newPassword) {
		if (newPassword == null) {
			throw new NullPointerException("newPassword");
		}
		if (newPassword.length() < 3) {
			throw new IllegalArgumentException("newPassword too short, minimum of 3 characters, value: '" + newPassword + "'");
		}
		if (newPassword.length() > 120) {
			throw new IllegalArgumentException("newPassword too long, maximum of 120 characters, value: '" + newPassword + "'");
		}
		this.newPassword = newPassword;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getLoginId());
		builder.append(getOldPassword());
		builder.append(getNewPassword());
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
		IChangeUserPassword that = (IChangeUserPassword) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getLoginId(), that.getLoginId());
		builder.append(this.getOldPassword(), that.getOldPassword());
		builder.append(this.getNewPassword(), that.getNewPassword());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getLoginId());
		builder.append(getOldPassword());
		builder.append(getNewPassword());
		return builder.toString();
	}

	@Override
	public int compareTo(IChangeUserPassword that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getLoginId(), that.getLoginId());
		builder.append(this.getOldPassword(), that.getOldPassword());
		builder.append(this.getNewPassword(), that.getNewPassword());
		return builder.toComparison();
	}
}
