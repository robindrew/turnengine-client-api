package com.turnengine.client.api.global.common;

import com.robindrew.codegenerator.api.executable.bean.IExecutableBean;

public interface IGetCommandAvailable extends IExecutableBean<Boolean>, Comparable<IGetCommandAvailable> {

	int SERIALIZATION_ID = 1204;

	/**
	 * Returns the serialization id.
	 * @return the serialization id.
	 */
	int getSerializationId();

	/**
	 * Getter for the name field.
	 * @return the value of the name field.
	 */
	String getName();

	/**
	 * Setter for the name field.
	 * @param name the name value to set.
	 */
	void setName(String name);
}
