package com.turnengine.client.api.global.user;

import com.robindrew.codegenerator.api.executable.bean.IExecutableBean;
import com.turnengine.client.api.common.command.IGlobalExecutableBean;

public interface ISetUserAddress extends IExecutableBean<Boolean>, IGlobalExecutableBean<Boolean>, Comparable<ISetUserAddress> {

	int SERIALIZATION_ID = 1703;

	/**
	 * Returns the serialization id.
	 * @return the serialization id.
	 */
	int getSerializationId();

	/**
	 * Getter for the id field.
	 * @return the value of the id field.
	 */
	int getId();

	/**
	 * Getter for the address field.
	 * @return the value of the address field.
	 */
	String getAddress();

	/**
	 * Setter for the id field.
	 * @param id the id value to set.
	 */
	void setId(int id);

	/**
	 * Setter for the address field.
	 * @param address the address value to set.
	 */
	void setAddress(String address);
}
