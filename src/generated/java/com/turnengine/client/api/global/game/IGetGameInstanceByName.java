package com.turnengine.client.api.global.game;

import com.robindrew.codegenerator.api.executable.bean.IExecutableBean;

public interface IGetGameInstanceByName extends IExecutableBean<IGameInstance>, Comparable<IGetGameInstanceByName> {

	int SERIALIZATION_ID = 1509;

	/**
	 * Returns the serialization id.
	 * @return the serialization id.
	 */
	int getSerializationId();

	/**
	 * Getter for the instanceName field.
	 * @return the value of the instanceName field.
	 */
	String getInstanceName();

	/**
	 * Getter for the versionId field.
	 * @return the value of the versionId field.
	 */
	int getVersionId();

	/**
	 * Setter for the instanceName field.
	 * @param instanceName the instanceName value to set.
	 */
	void setInstanceName(String instanceName);

	/**
	 * Setter for the versionId field.
	 * @param versionId the versionId value to set.
	 */
	void setVersionId(int versionId);
}
