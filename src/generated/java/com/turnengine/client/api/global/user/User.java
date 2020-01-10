package com.turnengine.client.api.global.user;

import com.robindrew.common.locale.LanguageCountry;
import java.util.regex.Pattern;
import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class User implements IUser {

	/** The id field. */
	private int id = 0;
	/** The name field. */
	private String name = null;
	/** The email field. */
	private String email = null;
	/** The language field. */
	private LanguageCountry language = null;

	/**
	 * The empty constructor.
	 */
	public User() {
	}

	/**
	 * The fields constructor.
	 */
	public User(int id, String name, String email, LanguageCountry language) {
		setId(id);
		setName(name);
		setEmail(email);
		setLanguage(language);
	}

	/**
	 * The clone constructor.
	 */
	public User(IUser clone) {
		setId(clone.getId());
		setName(clone.getName());
		setEmail(clone.getEmail());
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
	 * Getter for the id field.
	 * @return the value of the id field.
	 */
	@Override
	public int getId() {
		return id;
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
	 * Getter for the email field.
	 * @return the value of the email field.
	 */
	@Override
	public String getEmail() {
		return email;
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
	 * Setter for the id field.
	 * @param id the id value to set.
	 */
	@Override
	public void setId(int id) {
		if (id < -1) {
			throw new IllegalArgumentException("id too small, minimum of -1, value: '" + id + "'");
		}
		this.id = id;
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
		builder.append(getId());
		builder.append(getName());
		builder.append(getEmail());
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
		IUser that = (IUser) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getId(), that.getId());
		builder.append(this.getName(), that.getName());
		builder.append(this.getEmail(), that.getEmail());
		builder.append(this.getLanguage(), that.getLanguage());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getId());
		builder.append(getName());
		builder.append(getEmail());
		builder.append(getLanguage());
		return builder.toString();
	}

	@Override
	public int compareTo(IUser that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getId(), that.getId());
		builder.append(this.getName(), that.getName());
		builder.append(this.getEmail(), that.getEmail());
		builder.append(this.getLanguage(), that.getLanguage());
		return builder.toComparison();
	}
}
