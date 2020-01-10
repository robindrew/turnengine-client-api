package com.turnengine.client.api.global.translation;

import com.robindrew.codegenerator.api.executable.bean.IExecutableBean;
import com.robindrew.common.locale.LanguageCountry;
import com.turnengine.client.api.common.command.IGlobalLoggedInBean;

public interface ISetTranslation extends IExecutableBean<Integer>, IGlobalLoggedInBean<Integer>, Comparable<ISetTranslation> {

	int SERIALIZATION_ID = 1602;

	/**
	 * Returns the serialization id.
	 * @return the serialization id.
	 */
	int getSerializationId();

	/**
	 * Getter for the loginId field.
	 * @return the value of the loginId field.
	 */
	long getLoginId();

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
	 * Getter for the translation field.
	 * @return the value of the translation field.
	 */
	String getTranslation();

	/**
	 * Setter for the loginId field.
	 * @param loginId the loginId value to set.
	 */
	void setLoginId(long loginId);

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

	/**
	 * Setter for the translation field.
	 * @param translation the translation value to set.
	 */
	void setTranslation(String translation);
}
