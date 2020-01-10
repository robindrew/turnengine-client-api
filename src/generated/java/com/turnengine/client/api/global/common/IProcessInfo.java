package com.turnengine.client.api.global.common;

import com.robindrew.codegenerator.api.bean.IBean;

public interface IProcessInfo extends IBean, Comparable<IProcessInfo> {

	int SERIALIZATION_ID = 1217;

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
	 * Getter for the service field.
	 * @return the value of the service field.
	 */
	IServiceInfo getService();

	/**
	 * Getter for the release field.
	 * @return the value of the release field.
	 */
	IReleaseInfo getRelease();

	/**
	 * Getter for the port field.
	 * @return the value of the port field.
	 */
	int getPort();

	/**
	 * Setter for the id field.
	 * @param id the id value to set.
	 */
	void setId(int id);

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

	/**
	 * Setter for the service field.
	 * @param service the service value to set.
	 */
	void setService(IServiceInfo service);

	/**
	 * Setter for the release field.
	 * @param release the release value to set.
	 */
	void setRelease(IReleaseInfo release);

	/**
	 * Setter for the port field.
	 * @param port the port value to set.
	 */
	void setPort(int port);
}
