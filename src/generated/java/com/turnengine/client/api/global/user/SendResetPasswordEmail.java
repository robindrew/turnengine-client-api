package com.turnengine.client.api.global.user;

import java.util.regex.Pattern;
import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class SendResetPasswordEmail implements ISendResetPasswordEmail {

	/** The email field. */
	private String email = null;

	/**
	 * The empty constructor.
	 */
	public SendResetPasswordEmail() {
	}

	/**
	 * The fields constructor.
	 */
	public SendResetPasswordEmail(String email) {
		setEmail(email);
	}

	/**
	 * The clone constructor.
	 */
	public SendResetPasswordEmail(ISendResetPasswordEmail clone) {
		setEmail(clone.getEmail());
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

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getEmail());
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
		ISendResetPasswordEmail that = (ISendResetPasswordEmail) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getEmail(), that.getEmail());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getEmail());
		return builder.toString();
	}

	@Override
	public int compareTo(ISendResetPasswordEmail that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getEmail(), that.getEmail());
		return builder.toComparison();
	}
}
