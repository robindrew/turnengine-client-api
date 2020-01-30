package com.turnengine.client.api.global.game;

import com.robindrew.codegenerator.api.bean.IBean;

public interface IGameInstance extends IBean, Comparable<IGameInstance> {

	int SERIALIZATION_ID = 1517;

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
	 * Getter for the gameId field.
	 * @return the value of the gameId field.
	 */
	int getGameId();

	/**
	 * Getter for the versionId field.
	 * @return the value of the versionId field.
	 */
	int getVersionId();

	/**
	 * Getter for the hostId field.
	 * @return the value of the hostId field.
	 */
	int getHostId();

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
	 * Setter for the gameId field.
	 * @param gameId the gameId value to set.
	 */
	void setGameId(int gameId);

	/**
	 * Setter for the versionId field.
	 * @param versionId the versionId value to set.
	 */
	void setVersionId(int versionId);

	/**
	 * Setter for the hostId field.
	 * @param hostId the hostId value to set.
	 */
	void setHostId(int hostId);
}
