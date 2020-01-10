package com.turnengine.client.api.global.translation;

import com.robindrew.codegenerator.api.executable.bean.IExecutableBean;
import com.robindrew.common.locale.LanguageCountry;

public interface IGetTranslationById extends IExecutableBean<ITranslation>, Comparable<IGetTranslationById> {

	int SERIALIZATION_ID = 1603;

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
	 * Setter for the language field.
	 * @param language the language value to set.
	 */
	void setLanguage(LanguageCountry language);
}
