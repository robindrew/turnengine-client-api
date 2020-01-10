package com.turnengine.client.api.global.user;

import com.robindrew.codegenerator.api.executable.bean.IExecutableBean;
import com.turnengine.client.api.common.command.IGlobalLoggedInBean;

public interface IGetUserAdminInfo extends IExecutableBean<IUserAdminInfo>, IGlobalLoggedInBean<IUserAdminInfo>, Comparable<IGetUserAdminInfo> {

	int SERIALIZATION_ID = 1722;

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
	 * Getter for the userId field.
	 * @return the value of the userId field.
	 */
	int getUserId();

	/**
	 * Setter for the loginId field.
	 * @param loginId the loginId value to set.
	 */
	void setLoginId(long loginId);

	/**
	 * Setter for the userId field.
	 * @param userId the userId value to set.
	 */
	void setUserId(int userId);
}
