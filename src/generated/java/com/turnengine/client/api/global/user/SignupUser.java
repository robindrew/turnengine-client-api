package com.turnengine.client.api.global.user;

import com.robindrew.common.locale.LanguageCountry;
import java.util.regex.Pattern;
import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class SignupUser implements ISignupUser {

	/** The name field. */
	private String name = null;
	/** The password field. */
	private String password = null;
	/** The email field. */
	private String email = null;
	/** The address field. */
	private String address = null;
	/** The language field. */
	private LanguageCountry language = null;

	/**
	 * The empty constructor.
	 */
	public SignupUser() {
	}

	/**
	 * The fields constructor.
	 */
	public SignupUser(String name, String password, String email, String address, LanguageCountry language) {
		setName(name);
		setPassword(password);
		setEmail(email);
		setAddress(address);
		setLanguage(language);
	}

	/**
	 * The clone constructor.
	 */
	public SignupUser(ISignupUser clone) {
		setName(clone.getName());
		setPassword(clone.getPassword());
		setEmail(clone.getEmail());
		setAddress(clone.getAddress());
		setLanguage(clone.getLanguage());
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
	 * Getter for the email field.
	 * @return the value of the email field.
	 */
	@Override
	public String getEmail() {
		return email;
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
	 * Getter for the language field.
	 * @return the value of the language field.
	 */
	@Override
	public LanguageCountry getLanguage() {
		return language;
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

	/**
	 * Setter for the language field.
	 * @param language the language value to set.
	 */
	@Override
	public void setLanguage(LanguageCountry language) {
		this.language = language;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getName());
		builder.append(getPassword());
		builder.append(getEmail());
		builder.append(getAddress());
		builder.append(getLanguage());
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
		ISignupUser that = (ISignupUser) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getName(), that.getName());
		builder.append(this.getPassword(), that.getPassword());
		builder.append(this.getEmail(), that.getEmail());
		builder.append(this.getAddress(), that.getAddress());
		builder.append(this.getLanguage(), that.getLanguage());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getName());
		builder.append(getPassword());
		builder.append(getEmail());
		builder.append(getAddress());
		builder.append(getLanguage());
		return builder.toString();
	}

	@Override
	public int compareTo(ISignupUser that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getName(), that.getName());
		builder.append(this.getPassword(), that.getPassword());
		builder.append(this.getEmail(), that.getEmail());
		builder.append(this.getAddress(), that.getAddress());
		builder.append(this.getLanguage(), that.getLanguage());
		return builder.toComparison();
	}
}
