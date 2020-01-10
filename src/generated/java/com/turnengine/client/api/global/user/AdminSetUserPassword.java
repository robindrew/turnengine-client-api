package com.turnengine.client.api.global.user;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class AdminSetUserPassword implements IAdminSetUserPassword {

	/** The loginId field. */
	private long loginId = 0l;
	/** The name field. */
	private String name = null;
	/** The password field. */
	private String password = null;

	/**
	 * The empty constructor.
	 */
	public AdminSetUserPassword() {
	}

	/**
	 * The fields constructor.
	 */
	public AdminSetUserPassword(long loginId, String name, String password) {
		setLoginId(loginId);
		setName(name);
		setPassword(password);
	}

	/**
	 * The clone constructor.
	 */
	public AdminSetUserPassword(IAdminSetUserPassword clone) {
		setLoginId(clone.getLoginId());
		setName(clone.getName());
		setPassword(clone.getPassword());
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
	 * Getter for the name field.
	 * @return the value of the name field.
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * Getter for the password field.
	 * @return the value of the password field.
	 */
	@Override
	public String getPassword() {
		return password;
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
		if (name.length() > 40) {
			throw new IllegalArgumentException("name too long, maximum of 40 characters, value: '" + name + "'");
		}
		this.name = name;
	}

	/**
	 * Setter for the password field.
	 * @param password the password value to set.
	 */
	@Override
	public void setPassword(String password) {
		if (password == null) {
			throw new NullPointerException("password");
		}
		if (password.length() < 3) {
			throw new IllegalArgumentException("password too short, minimum of 3 characters, value: '" + password + "'");
		}
		if (password.length() > 120) {
			throw new IllegalArgumentException("password too long, maximum of 120 characters, value: '" + password + "'");
		}
		this.password = password;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getLoginId());
		builder.append(getName());
		builder.append(getPassword());
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
		IAdminSetUserPassword that = (IAdminSetUserPassword) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getLoginId(), that.getLoginId());
		builder.append(this.getName(), that.getName());
		builder.append(this.getPassword(), that.getPassword());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getLoginId());
		builder.append(getName());
		builder.append(getPassword());
		return builder.toString();
	}

	@Override
	public int compareTo(IAdminSetUserPassword that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getLoginId(), that.getLoginId());
		builder.append(this.getName(), that.getName());
		builder.append(this.getPassword(), that.getPassword());
		return builder.toComparison();
	}
}
