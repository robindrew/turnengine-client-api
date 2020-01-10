package com.turnengine.client.api.global.user;

import com.robindrew.codegenerator.api.executable.bean.IExecutableBean;
import com.turnengine.client.api.common.command.IGlobalLoggedInBean;

public interface ISetUserPermission extends IExecutableBean<Boolean>, IGlobalLoggedInBean<Boolean>, Comparable<ISetUserPermission> {

	int SERIALIZATION_ID = 1714;

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
	int getId();

	/**
	 * Getter for the type field.
	 * @return the value of the type field.
	 */
	UserPermissionType getType();

	/**
	 * Setter for the loginId field.
	 * @param loginId the loginId value to set.
	 */
	void setLoginId(long loginId);

	/**
	 * Setter for the id field.
	 * @param id the id value to set.
	 */
	void setId(int id);

	/**
	 * Setter for the type field.
	 * @param type the type value to set.
	 */
	void setType(UserPermissionType type);
}
