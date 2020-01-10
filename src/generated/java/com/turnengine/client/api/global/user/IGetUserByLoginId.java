package com.turnengine.client.api.global.user;

import com.robindrew.codegenerator.api.executable.bean.IExecutableBean;
import com.turnengine.client.api.common.command.IGlobalLoggedInBean;

public interface IGetUserByLoginId extends IExecutableBean<IUser>, IGlobalLoggedInBean<IUser>, Comparable<IGetUserByLoginId> {

	int SERIALIZATION_ID = 1711;

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
	long getId();

	/**
	 * Setter for the loginId field.
	 * @param loginId the loginId value to set.
	 */
	void setLoginId(long loginId);

	/**
	 * Setter for the id field.
	 * @param id the id value to set.
	 */
	void setId(long id);
}
