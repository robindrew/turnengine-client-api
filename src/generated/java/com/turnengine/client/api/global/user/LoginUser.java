package com.turnengine.client.api.global.user;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class LoginUser implements ILoginUser {

	/** The nameOrEmail field. */
	private String nameOrEmail = null;
	/** The password field. */
	private String password = null;
	/** The address field. */
	private String address = null;

	/**
	 * The empty constructor.
	 */
	public LoginUser() {
	}

	/**
	 * The fields constructor.
	 */
	public LoginUser(String nameOrEmail, String password, String address) {
		setNameOrEmail(nameOrEmail);
		setPassword(password);
		setAddress(address);
	}

	/**
	 * The clone constructor.
	 */
	public LoginUser(ILoginUser clone) {
		setNameOrEmail(clone.getNameOrEmail());
		setPassword(clone.getPassword());
		setAddress(clone.getAddress());
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
	 * Getter for the nameOrEmail field.
	 * @return the value of the nameOrEmail field.
	 */
	@Override
	public String getNameOrEmail() {
		return nameOrEmail;
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
	 * Getter for the address field.
	 * @return the value of the address field.
	 */
	@Override
	public String getAddress() {
		return address;
	}

	/**
	 * Setter for the nameOrEmail field.
	 * @param nameOrEmail the nameOrEmail value to set.
	 */
	@Override
	public void setNameOrEmail(String nameOrEmail) {
		if (nameOrEmail == null) {
			throw new NullPointerException("nameOrEmail");
		}
		if (nameOrEmail.length() < 4) {
			throw new IllegalArgumentException("nameOrEmail too short, minimum of 4 characters, value: '" + nameOrEmail + "'");
		}
		if (nameOrEmail.length() > 200) {
			throw new IllegalArgumentException("nameOrEmail too long, maximum of 200 characters, value: '" + nameOrEmail + "'");
		}
		this.nameOrEmail = nameOrEmail;
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

	/**
	 * Setter for the address field.
	 * @param address the address value to set.
	 */
	@Override
	public void setAddress(String address) {
		if (address == null) {
			throw new NullPointerException("address");
		}
		this.address = address;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getNameOrEmail());
		builder.append(getPassword());
		builder.append(getAddress());
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
		ILoginUser that = (ILoginUser) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getNameOrEmail(), that.getNameOrEmail());
		builder.append(this.getPassword(), that.getPassword());
		builder.append(this.getAddress(), that.getAddress());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getNameOrEmail());
		builder.append(getPassword());
		builder.append(getAddress());
		return builder.toString();
	}

	@Override
	public int compareTo(ILoginUser that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getNameOrEmail(), that.getNameOrEmail());
		builder.append(this.getPassword(), that.getPassword());
		builder.append(this.getAddress(), that.getAddress());
		return builder.toComparison();
	}
}
