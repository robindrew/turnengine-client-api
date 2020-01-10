package com.turnengine.client.api.global.admin;

import com.robindrew.codegenerator.api.executable.bean.IExecutableBean;

public interface IGetAdminHostAddress extends IExecutableBean<IAdminHostAddress>, Comparable<IGetAdminHostAddress> {

	int SERIALIZATION_ID = 1005;

	/**
	 * Returns the serialization id.
	 * @return the serialization id.
	 */
	int getSerializationId();

	/**
	 * Getter for the code field.
	 * @return the value of the code field.
	 */
	String getCode();

	/**
	 * Setter for the code field.
	 * @param code the code value to set.
	 */
	void setCode(String code);
}
