package com.turnengine.client.api.global.user;

import java.util.regex.Pattern;
import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class ResetPassword implements IResetPassword {

	/** The email field. */
	private String email = null;
	/** The password field. */
	private String password = null;
	/** The code field. */
	private long code = 0l;

	/**
	 * The empty constructor.
	 */
	public ResetPassword() {
	}

	/**
	 * The fields constructor.
	 */
	public ResetPassword(String email, String password, long code) {
		setEmail(email);
		setPassword(password);
		setCode(code);
	}

	/**
	 * The clone constructor.
	 */
	public ResetPassword(IResetPassword clone) {
		setEmail(clone.getEmail());
		setPassword(clone.getPassword());
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
	 * Getter for the email field.
	 * @return the value of the email field.
	 */
	@Override
	public String getEmail() {
		return email;
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
	 * Getter for the code field.
	 * @return the value of the code field.
	 */
	@Override
	public long getCode() {
		return code;
	}

	/**
	 * Setter for the email field.
	 * @param email the email value to set.
	 */
	@Override
	public void setEmail(String email) {
		if (email == null) {
			throw new NullPointerException("email");
		}
		if (email.length() < 8) {
			throw new IllegalArgumentException("email too short, minimum of 8 characters, value: '" + email + "'");
		}
		if (email.length() > 200) {
			throw new IllegalArgumentException("email too long, maximum of 200 characters, value: '" + email + "'");
		}
		if (!Pattern.compile("[a-zA-Z](\\w|-)+(\\.(\\w|-)+)*@([a-zA-Z]|-)+(\\.([a-zA-Z]|-)+)+").matcher(email).matches()) {
			throw new IllegalArgumentException("email does not match pattern: '[a-zA-Z](\\w|-)+(\\.(\\w|-)+)*@([a-zA-Z]|-)+(\\.([a-zA-Z]|-)+)+', value: '" + email + "'");
		}
		this.email = email;
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
	 * Setter for the code field.
	 * @param code the code value to set.
	 */
	@Override
	public void setCode(long code) {
		this.code = code;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getEmail());
		builder.append(getPassword());
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
		IResetPassword that = (IResetPassword) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getEmail(), that.getEmail());
		builder.append(this.getPassword(), that.getPassword());
		builder.append(this.getCode(), that.getCode());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getEmail());
		builder.append(getPassword());
		builder.append(getCode());
		return builder.toString();
	}

	@Override
	public int compareTo(IResetPassword that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getEmail(), that.getEmail());
		builder.append(this.getPassword(), that.getPassword());
		builder.append(this.getCode(), that.getCode());
		return builder.toComparison();
	}
}
