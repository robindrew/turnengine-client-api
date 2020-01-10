package com.turnengine.client.api.global.user;

import com.robindrew.codegenerator.api.executable.bean.IExecutableBean;
import com.turnengine.client.api.common.command.IGlobalLoggedInBean;

public interface ILogoutUser extends IExecutableBean<Boolean>, IGlobalLoggedInBean<Boolean>, Comparable<ILogoutUser> {

	int SERIALIZATION_ID = 1706;

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
	 * Setter for the loginId field.
	 * @param loginId the loginId value to set.
	 */
	void setLoginId(long loginId);
}
