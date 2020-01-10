package com.turnengine.client.api.global.translation;

import com.robindrew.common.locale.LanguageCountry;
import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class GetTranslationByText implements IGetTranslationByText {

	/** The english field. */
	private String english = null;
	/** The language field. */
	private LanguageCountry language = null;

	/**
	 * The empty constructor.
	 */
	public GetTranslationByText() {
	}

	/**
	 * The fields constructor.
	 */
	public GetTranslationByText(String english, LanguageCountry language) {
		setEnglish(english);
		setLanguage(language);
	}

	/**
	 * The clone constructor.
	 */
	public GetTranslationByText(IGetTranslationByText clone) {
		setEnglish(clone.getEnglish());
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
	 * Getter for the english field.
	 * @return the value of the english field.
	 */
	@Override
	public String getEnglish() {
		return english;
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
	 * Setter for the english field.
	 * @param english the english value to set.
	 */
	@Override
	public void setEnglish(String english) {
		if (english == null) {
			throw new NullPointerException("english");
		}
		if (english.length() < 1) {
			throw new IllegalArgumentException("english too short, minimum of 1 characters, value: '" + english + "'");
		}
		this.english = english;
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
		builder.append(getEnglish());
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
		IGetTranslationByText that = (IGetTranslationByText) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getEnglish(), that.getEnglish());
		builder.append(this.getLanguage(), that.getLanguage());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getEnglish());
		builder.append(getLanguage());
		return builder.toString();
	}

	@Override
	public int compareTo(IGetTranslationByText that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getEnglish(), that.getEnglish());
		builder.append(this.getLanguage(), that.getLanguage());
		return builder.toComparison();
	}
}
