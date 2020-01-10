package com.turnengine.client.api.global.game;

import com.robindrew.codegenerator.api.executable.bean.IExecutableBean;
import com.turnengine.client.api.common.command.IGlobalLoggedInBean;

public interface INewGameInstance extends IExecutableBean<IGameInstance>, IGlobalLoggedInBean<IGameInstance>, Comparable<INewGameInstance> {

	int SERIALIZATION_ID = 1503;

	/**
	 * Returns the serialization id.
	 * @return the serialization id.
	 */
	int getSerializationId();

	/**
	 * Getter for the loginId field.
	 * @return the value of the loginId field.
	 */
	long getLoginId();

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
	 * Getter for the hostId field.
	 * @return the value of the hostId field.
	 */
	int getHostId();

	/**
	 * Setter for the loginId field.
	 * @param loginId the loginId value to set.
	 */
	void setLoginId(long loginId);

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

	/**
	 * Setter for the hostId field.
	 * @param hostId the hostId value to set.
	 */
	void setHostId(int hostId);
}
