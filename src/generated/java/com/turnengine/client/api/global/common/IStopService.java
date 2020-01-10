package com.turnengine.client.api.global.common;

import com.robindrew.codegenerator.api.executable.bean.IExecutableBean;

public interface IStopService extends IExecutableBean<Boolean>, Comparable<IStopService> {

	int SERIALIZATION_ID = 1206;

	/**
	 * Returns the serialization id.
	 * @return the serialization id.
	 */
	int getSerializationId();

	/**
	 * Getter for the project field.
	 * @return the value of the project field.
	 */
	String getProject();

	/**
	 * Getter for the release field.
	 * @return the value of the release field.
	 */
	int getRelease();

	/**
	 * Getter for the service field.
	 * @return the value of the service field.
	 */
	String getService();

	/**
	 * Setter for the project field.
	 * @param project the project value to set.
	 */
	void setProject(String project);

	/**
	 * Setter for the release field.
	 * @param release the release value to set.
	 */
	void setRelease(int release);

	/**
	 * Setter for the service field.
	 * @param service the service value to set.
	 */
	void setService(String service);
}
