package com.turnengine.client.api.global.user;

import com.robindrew.codegenerator.api.executable.bean.IExecutableBean;
import com.turnengine.client.api.common.command.IGlobalLoggedInBean;

public interface IUpdateUserAddressCode extends IExecutableBean<Boolean>, IGlobalLoggedInBean<Boolean>, Comparable<IUpdateUserAddressCode> {

	int SERIALIZATION_ID = 1723;

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
	 * Getter for the code field.
	 * @return the value of the code field.
	 */
	String getCode();

	/**
	 * Setter for the loginId field.
	 * @param loginId the loginId value to set.
	 */
	void setLoginId(long loginId);

	/**
	 * Setter for the code field.
	 * @param code the code value to set.
	 */
	void setCode(String code);
}
