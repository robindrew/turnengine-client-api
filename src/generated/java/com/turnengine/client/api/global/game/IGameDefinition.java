package com.turnengine.client.api.global.game;

import com.robindrew.codegenerator.api.bean.IBean;

public interface IGameDefinition extends IBean, Comparable<IGameDefinition> {

	int SERIALIZATION_ID = 1531;

	/**
	 * Returns the serialization id.
	 * @return the serialization id.
	 */
	int getSerializationId();

	/**
	 * Getter for the game field.
	 * @return the value of the game field.
	 */
	IGame getGame();

	/**
	 * Getter for the version field.
	 * @return the value of the version field.
	 */
	IGameVersion getVersion();

	/**
	 * Getter for the instance field.
	 * @return the value of the instance field.
	 */
	IGameInstance getInstance();

	/**
	 * Getter for the host field.
	 * @return the value of the host field.
	 */
	IGameHost getHost();

	/**
	 * Setter for the game field.
	 * @param game the game value to set.
	 */
	void setGame(IGame game);

	/**
	 * Setter for the version field.
	 * @param version the version value to set.
	 */
	void setVersion(IGameVersion version);

	/**
	 * Setter for the instance field.
	 * @param instance the instance value to set.
	 */
	void setInstance(IGameInstance instance);

	/**
	 * Setter for the host field.
	 * @param host the host value to set.
	 */
	void setHost(IGameHost host);
}
