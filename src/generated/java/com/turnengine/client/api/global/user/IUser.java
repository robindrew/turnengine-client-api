package com.turnengine.client.api.global.user;

import com.robindrew.codegenerator.api.bean.IBean;
import com.robindrew.common.locale.LanguageCountry;

public interface IUser extends IBean, Comparable<IUser> {

	int SERIALIZATION_ID = 1725;

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
	 * Getter for the name field.
	 * @return the value of the name field.
	 */
	String getName();

	/**
	 * Getter for the email field.
	 * @return the value of the email field.
	 */
	String getEmail();

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
	 * Setter for the name field.
	 * @param name the name value to set.
	 */
	void setName(String name);

	/**
	 * Setter for the email field.
	 * @param email the email value to set.
	 */
	void setEmail(String email);

	/**
	 * Setter for the language field.
	 * @param language the language value to set.
	 */
	void setLanguage(LanguageCountry language);
}
