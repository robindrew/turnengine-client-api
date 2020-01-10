package com.turnengine.client.api.global.user;

import com.robindrew.codegenerator.api.executable.bean.IExecutableBean;
import com.turnengine.client.api.common.command.IGlobalLoggedInBean;
import java.util.List;

public interface IGetUserAddressCodeList extends IExecutableBean<List<IUserAddressCode>>, IGlobalLoggedInBean<List<IUserAddressCode>>, Comparable<IGetUserAddressCodeList> {

	int SERIALIZATION_ID = 1720;

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
	 * Setter for the userId field.
	 * @param userId the userId value to set.
	 */
	void setUserId(int userId);

	/**
	 * Setter for the code field.
	 * @param code the code value to set.
	 */
	void setCode(String code);
}
