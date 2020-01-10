package com.turnengine.client.api.global.user;

import com.robindrew.codegenerator.api.executable.bean.IExecutableBean;
import com.turnengine.client.api.common.command.IGlobalExecutableBean;

public interface IResetPassword extends IExecutableBean<Boolean>, IGlobalExecutableBean<Boolean>, Comparable<IResetPassword> {

	int SERIALIZATION_ID = 1730;

	/**
	 * Returns the serialization id.
	 * @return the serialization id.
	 */
	int getSerializationId();

	/**
	 * Getter for the email field.
	 * @return the value of the email field.
	 */
	String getEmail();

	/**
	 * Getter for the password field.
	 * @return the value of the password field.
	 */
	String getPassword();

	/**
	 * Getter for the code field.
	 * @return the value of the code field.
	 */
	long getCode();

	/**
	 * Setter for the email field.
	 * @param email the email value to set.
	 */
	void setEmail(String email);

	/**
	 * Setter for the password field.
	 * @param password the password value to set.
	 */
	void setPassword(String password);

	/**
	 * Setter for the code field.
	 * @param code the code value to set.
	 */
	void setCode(long code);
}
