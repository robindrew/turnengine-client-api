package com.turnengine.client.api.global.translation;

import com.robindrew.codegenerator.api.executable.bean.IExecutableBean;
import com.robindrew.common.locale.LanguageCountry;

public interface IGetTranslationByText extends IExecutableBean<ITranslation>, Comparable<IGetTranslationByText> {

	int SERIALIZATION_ID = 1604;

	/**
	 * Returns the serialization id.
	 * @return the serialization id.
	 */
	int getSerializationId();

	/**
	 * Getter for the english field.
	 * @return the value of the english field.
	 */
	String getEnglish();

	/**
	 * Getter for the language field.
	 * @return the value of the language field.
	 */
	LanguageCountry getLanguage();

	/**
	 * Setter for the english field.
	 * @param english the english value to set.
	 */
	void setEnglish(String english);

	/**
	 * Setter for the language field.
	 * @param language the language value to set.
	 */
	void setLanguage(LanguageCountry language);
}
