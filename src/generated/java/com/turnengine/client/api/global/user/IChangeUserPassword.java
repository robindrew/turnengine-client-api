package com.turnengine.client.api.global.user;

import com.robindrew.codegenerator.api.executable.bean.IExecutableBean;
import com.turnengine.client.api.common.command.IGlobalLoggedInBean;

public interface IChangeUserPassword extends IExecutableBean<Boolean>, IGlobalLoggedInBean<Boolean>, Comparable<IChangeUserPassword> {

	int SERIALIZATION_ID = 1719;

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
	 * Getter for the oldPassword field.
	 * @return the value of the oldPassword field.
	 */
	String getOldPassword();

	/**
	 * Getter for the newPassword field.
	 * @return the value of the newPassword field.
	 */
	String getNewPassword();

	/**
	 * Setter for the loginId field.
	 * @param loginId the loginId value to set.
	 */
	void setLoginId(long loginId);

	/**
	 * Setter for the oldPassword field.
	 * @param oldPassword the oldPassword value to set.
	 */
	void setOldPassword(String oldPassword);

	/**
	 * Setter for the newPassword field.
	 * @param newPassword the newPassword value to set.
	 */
	void setNewPassword(String newPassword);
}
