package com.turnengine.client.api.global.common;

import com.robindrew.codegenerator.api.bean.IBean;

public interface IProjectInfo extends IBean, Comparable<IProjectInfo> {

	int SERIALIZATION_ID = 1218;

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
