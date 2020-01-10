package com.turnengine.client.api.global.common;

import com.robindrew.codegenerator.api.bean.IBean;

public interface IServiceInfo extends IBean, Comparable<IServiceInfo> {

	int SERIALIZATION_ID = 1219;

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
	 * Getter for the project field.
	 * @return the value of the project field.
	 */
	IProjectInfo getProject();

	/**
	 * Setter for the name field.
	 * @param name the name value to set.
	 */
	void setName(String name);

	/**
	 * Setter for the project field.
	 * @param project the project value to set.
	 */
	void setProject(IProjectInfo project);
}
