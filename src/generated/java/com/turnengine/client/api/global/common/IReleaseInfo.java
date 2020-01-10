package com.turnengine.client.api.global.common;

import com.robindrew.codegenerator.api.bean.IBean;

public interface IReleaseInfo extends IBean, Comparable<IReleaseInfo> {

	int SERIALIZATION_ID = 1220;

	/**
	 * Returns the serialization id.
	 * @return the serialization id.
	 */
	int getSerializationId();

	/**
	 * Getter for the number field.
	 * @return the value of the number field.
	 */
	int getNumber();

	/**
	 * Getter for the project field.
	 * @return the value of the project field.
	 */
	IProjectInfo getProject();

	/**
	 * Setter for the number field.
	 * @param number the number value to set.
	 */
	void setNumber(int number);

	/**
	 * Setter for the project field.
	 * @param project the project value to set.
	 */
	void setProject(IProjectInfo project);
}
