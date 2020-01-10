package com.turnengine.client.api.global.game;

import com.robindrew.codegenerator.api.executable.bean.IExecutableBean;

public interface IGetGameVersionByName extends IExecutableBean<IGameVersion>, Comparable<IGetGameVersionByName> {

	int SERIALIZATION_ID = 1507;

	/**
	 * Returns the serialization id.
	 * @return the serialization id.
	 */
	int getSerializationId();

	/**
	 * Getter for the versionName field.
	 * @return the value of the versionName field.
	 */
	String getVersionName();

	/**
	 * Getter for the gameId field.
	 * @return the value of the gameId field.
	 */
	int getGameId();

	/**
	 * Setter for the versionName field.
	 * @param versionName the versionName value to set.
	 */
	void setVersionName(String versionName);

	/**
	 * Setter for the gameId field.
	 * @param gameId the gameId value to set.
	 */
	void setGameId(int gameId);
}
