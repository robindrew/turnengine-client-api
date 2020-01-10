package com.turnengine.client.api.global.translation;

import com.robindrew.codegenerator.api.bean.IBean;
import com.robindrew.common.locale.LanguageCountry;

public interface ITranslation extends IBean, Comparable<ITranslation> {

	int SERIALIZATION_ID = 1605;

	/**
	 * Returns the serialization id.
	 * @return the serialization id.
	 */
	int getSerializationId();

	/**
	 * Getter for the id field.
	 * @return the value of the id field.
	 */
	int getId();

	/**
	 * Getter for the text field.
	 * @return the value of the text field.
	 */
	String getText();

	/**
	 * Getter for the language field.
	 * @return the value of the language field.
	 */
	LanguageCountry getLanguage();

	/**
	 * Setter for the id field.
	 * @param id the id value to set.
	 */
	void setId(int id);

	/**
	 * Setter for the text field.
	 * @param text the text value to set.
	 */
	void setText(String text);

	/**
	 * Setter for the language field.
	 * @param language the language value to set.
	 */
	void setLanguage(LanguageCountry language);
}
