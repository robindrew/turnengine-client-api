package com.turnengine.client.api.global.translation;

import com.robindrew.common.locale.LanguageCountry;
import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Translation implements ITranslation {

	/** The id field. */
	private int id = 0;
	/** The text field. */
	private String text = null;
	/** The language field. */
	private LanguageCountry language = null;

	/**
	 * The empty constructor.
	 */
	public Translation() {
	}

	/**
	 * The fields constructor.
	 */
	public Translation(int id, String text, LanguageCountry language) {
		setId(id);
		setText(text);
		setLanguage(language);
	}

	/**
	 * The clone constructor.
	 */
	public Translation(ITranslation clone) {
		setId(clone.getId());
		setText(clone.getText());
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
	 * Getter for the text field.
	 * @return the value of the text field.
	 */
	@Override
	public String getText() {
		return text;
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
		if (id < 0) {
			throw new IllegalArgumentException("id too small, minimum of 0, value: '" + id + "'");
		}
		this.id = id;
	}

	/**
	 * Setter for the text field.
	 * @param text the text value to set.
	 */
	@Override
	public void setText(String text) {
		if (text == null) {
			throw new NullPointerException("text");
		}
		if (text.length() < 1) {
			throw new IllegalArgumentException("text too short, minimum of 1 characters, value: '" + text + "'");
		}
		this.text = text;
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
		builder.append(getText());
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
		ITranslation that = (ITranslation) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getId(), that.getId());
		builder.append(this.getText(), that.getText());
		builder.append(this.getLanguage(), that.getLanguage());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getId());
		builder.append(getText());
		builder.append(getLanguage());
		return builder.toString();
	}

	@Override
	public int compareTo(ITranslation that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getId(), that.getId());
		builder.append(this.getText(), that.getText());
		builder.append(this.getLanguage(), that.getLanguage());
		return builder.toComparison();
	}
}
