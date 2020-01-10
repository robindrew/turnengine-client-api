package com.turnengine.client.api.global.game;

import com.robindrew.codegenerator.api.executable.bean.IExecutableBean;

public interface IGetGameInstanceByNames extends IExecutableBean<IGameInstance>, Comparable<IGetGameInstanceByNames> {

	int SERIALIZATION_ID = 1519;

	/**
	 * Returns the serialization id.
	 * @return the serialization id.
	 */
	int getSerializationId();

	/**
	 * Getter for the gameName field.
	 * @return the value of the gameName field.
	 */
	String getGameName();

	/**
	 * Getter for the versionName field.
	 * @return the value of the versionName field.
	 */
	String getVersionName();

	/**
	 * Getter for the instanceName field.
	 * @return the value of the instanceName field.
	 */
	String getInstanceName();

	/**
	 * Setter for the gameName field.
	 * @param gameName the gameName value to set.
	 */
	void setGameName(String gameName);

	/**
	 * Setter for the versionName field.
	 * @param versionName the versionName value to set.
	 */
	void setVersionName(String versionName);

	/**
	 * Setter for the instanceName field.
	 * @param instanceName the instanceName value to set.
	 */
	void setInstanceName(String instanceName);
}
