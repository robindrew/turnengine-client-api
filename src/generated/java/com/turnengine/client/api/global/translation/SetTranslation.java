package com.turnengine.client.api.global.translation;

import com.robindrew.common.locale.LanguageCountry;
import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class SetTranslation implements ISetTranslation {

	/** The loginId field. */
	private long loginId = 0l;
	/** The id field. */
	private int id = 0;
	/** The language field. */
	private LanguageCountry language = null;
	/** The translation field. */
	private String translation = null;

	/**
	 * The empty constructor.
	 */
	public SetTranslation() {
	}

	/**
	 * The fields constructor.
	 */
	public SetTranslation(long loginId, int id, LanguageCountry language, String translation) {
		setLoginId(loginId);
		setId(id);
		setLanguage(language);
		setTranslation(translation);
	}

	/**
	 * The clone constructor.
	 */
	public SetTranslation(ISetTranslation clone) {
		setLoginId(clone.getLoginId());
		setId(clone.getId());
		setLanguage(clone.getLanguage());
		setTranslation(clone.getTranslation());
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
	 * Getter for the id field.
	 * @return the value of the id field.
	 */
	@Override
	public int getId() {
		return id;
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
	 * Getter for the translation field.
	 * @return the value of the translation field.
	 */
	@Override
	public String getTranslation() {
		return translation;
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
	 * Setter for the id field.
	 * @param id the id value to set.
	 */
	@Override
	public void setId(int id) {
		if (id < 0) {
			throw new IllegalArgumentException("id too small, minimum of 0, value: '" + id + "'");
		}
		this.id = id;
	}

	/**
	 * Setter for the language field.
	 * @param language the language value to set.
	 */
	@Override
	public void setLanguage(LanguageCountry language) {
		this.language = language;
	}

	/**
	 * Setter for the translation field.
	 * @param translation the translation value to set.
	 */
	@Override
	public void setTranslation(String translation) {
		if (translation == null) {
			throw new NullPointerException("translation");
		}
		if (translation.length() < 1) {
			throw new IllegalArgumentException("translation too short, minimum of 1 characters, value: '" + translation + "'");
		}
		this.translation = translation;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getLoginId());
		builder.append(getId());
		builder.append(getLanguage());
		builder.append(getTranslation());
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
		ISetTranslation that = (ISetTranslation) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getLoginId(), that.getLoginId());
		builder.append(this.getId(), that.getId());
		builder.append(this.getLanguage(), that.getLanguage());
		builder.append(this.getTranslation(), that.getTranslation());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getLoginId());
		builder.append(getId());
		builder.append(getLanguage());
		builder.append(getTranslation());
		return builder.toString();
	}

	@Override
	public int compareTo(ISetTranslation that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getLoginId(), that.getLoginId());
		builder.append(this.getId(), that.getId());
		builder.append(this.getLanguage(), that.getLanguage());
		builder.append(this.getTranslation(), that.getTranslation());
		return builder.toComparison();
	}
}
