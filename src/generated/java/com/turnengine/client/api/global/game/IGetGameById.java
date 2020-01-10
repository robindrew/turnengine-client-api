package com.turnengine.client.api.global.game;

import com.robindrew.codegenerator.api.executable.bean.IExecutableBean;

public interface IGetGameById extends IExecutableBean<IGame>, Comparable<IGetGameById> {

	int SERIALIZATION_ID = 1504;

	/**
	 * Returns the serialization id.
	 * @return the serialization id.
	 */
	int getSerializationId();

	/**
	 * Getter for the gameId field.
	 * @return the value of the gameId field.
	 */
	int getGameId();

	/**
	 * Setter for the gameId field.
	 * @param gameId the gameId value to set.
	 */
	void setGameId(int gameId);
}
