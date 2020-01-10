package com.turnengine.client.api.global.user;

import com.robindrew.codegenerator.api.executable.bean.IExecutableBean;
import com.robindrew.common.locale.LanguageCountry;
import com.turnengine.client.api.common.command.IGlobalExecutableBean;

public interface ISignupUser extends IExecutableBean<Integer>, IGlobalExecutableBean<Integer>, Comparable<ISignupUser> {

	int SERIALIZATION_ID = 1701;

	/**
	 * Returns the serialization id.
	 * @return the serialization id.
	 */
	int getSerializationId();

	/**
	 * Getter for the name field.
	 * @return the value of the name field.
	 */
	String getName();

	/**
	 * Getter for the password field.
	 * @return the value of the password field.
	 */
	String getPassword();

	/**
	 * Getter for the email field.
	 * @return the value of the email field.
	 */
	String getEmail();

	/**
	 * Getter for the address field.
	 * @return the value of the address field.
	 */
	String getAddress();

	/**
	 * Getter for the language field.
	 * @return the value of the language field.
	 */
	LanguageCountry getLanguage();

	/**
	 * Setter for the name field.
	 * @param name the name value to set.
	 */
	void setName(String name);

	/**
	 * Setter for the password field.
	 * @param password the password value to set.
	 */
	void setPassword(String password);

	/**
	 * Setter for the email field.
	 * @param email the email value to set.
	 */
	void setEmail(String email);

	/**
	 * Setter for the address field.
	 * @param address the address value to set.
	 */
	void setAddress(String address);

	/**
	 * Setter for the language field.
	 * @param language the language value to set.
	 */
	void setLanguage(LanguageCountry language);
}
