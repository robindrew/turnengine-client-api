package com.turnengine.client.api.global.user;

import com.robindrew.codegenerator.api.executable.bean.IExecutableBean;
import com.robindrew.common.locale.LanguageCountry;
import com.turnengine.client.api.common.command.IGlobalLoggedInBean;

public interface ISetUserLanguage extends IExecutableBean<Boolean>, IGlobalLoggedInBean<Boolean>, Comparable<ISetUserLanguage> {

	int SERIALIZATION_ID = 1707;

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
	 * Getter for the language field.
	 * @return the value of the language field.
	 */
	LanguageCountry getLanguage();

	/**
	 * Setter for the loginId field.
	 * @param loginId the loginId value to set.
	 */
	void setLoginId(long loginId);

	/**
	 * Setter for the language field.
	 * @param language the language value to set.
	 */
	void setLanguage(LanguageCountry language);
}
