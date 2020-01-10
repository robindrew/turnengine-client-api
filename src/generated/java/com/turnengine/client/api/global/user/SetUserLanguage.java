package com.turnengine.client.api.global.user;

import com.robindrew.common.locale.LanguageCountry;
import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class SetUserLanguage implements ISetUserLanguage {

	/** The loginId field. */
	private long loginId = 0l;
	/** The language field. */
	private LanguageCountry language = null;

	/**
	 * The empty constructor.
	 */
	public SetUserLanguage() {
	}

	/**
	 * The fields constructor.
	 */
	public SetUserLanguage(long loginId, LanguageCountry language) {
		setLoginId(loginId);
		setLanguage(language);
	}

	/**
	 * The clone constructor.
	 */
	public SetUserLanguage(ISetUserLanguage clone) {
		setLoginId(clone.getLoginId());
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
	 * Getter for the loginId field.
	 * @return the value of the loginId field.
	 */
	@Override
	public long getLoginId() {
		return loginId;
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
	 * Setter for the loginId field.
	 * @param loginId the loginId value to set.
	 */
	@Override
	public void setLoginId(long loginId) {
		this.loginId = loginId;
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
		builder.append(getLoginId());
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
		ISetUserLanguage that = (ISetUserLanguage) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getLoginId(), that.getLoginId());
		builder.append(this.getLanguage(), that.getLanguage());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getLoginId());
		builder.append(getLanguage());
		return builder.toString();
	}

	@Override
	public int compareTo(ISetUserLanguage that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getLoginId(), that.getLoginId());
		builder.append(this.getLanguage(), that.getLanguage());
		return builder.toComparison();
	}
}
