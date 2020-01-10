package com.turnengine.client.api.global.user;

import com.robindrew.codegenerator.api.executable.bean.IExecutableBean;
import com.turnengine.client.api.common.command.IGlobalLoggedInBean;

public interface IGetUserByEmail extends IExecutableBean<IUser>, IGlobalLoggedInBean<IUser>, Comparable<IGetUserByEmail> {

	int SERIALIZATION_ID = 1710;

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
	 * Getter for the email field.
	 * @return the value of the email field.
	 */
	String getEmail();

	/**
	 * Setter for the loginId field.
	 * @param loginId the loginId value to set.
	 */
	void setLoginId(long loginId);

	/**
	 * Setter for the email field.
	 * @param email the email value to set.
	 */
	void setEmail(String email);
}
