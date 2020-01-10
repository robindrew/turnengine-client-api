package com.turnengine.client.api.global.user;

import com.robindrew.codegenerator.api.executable.bean.IExecutableBean;
import com.turnengine.client.api.common.command.IGlobalLoggedInBean;

public interface IAdminSetUserPassword extends IExecutableBean<Boolean>, IGlobalLoggedInBean<Boolean>, Comparable<IAdminSetUserPassword> {

	int SERIALIZATION_ID = 1726;

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
	 * Setter for the loginId field.
	 * @param loginId the loginId value to set.
	 */
	void setLoginId(long loginId);

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
}
