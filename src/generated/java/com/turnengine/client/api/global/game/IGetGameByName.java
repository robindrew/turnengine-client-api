package com.turnengine.client.api.global.game;

import com.robindrew.codegenerator.api.executable.bean.IExecutableBean;

public interface IGetGameByName extends IExecutableBean<IGame>, Comparable<IGetGameByName> {

	int SERIALIZATION_ID = 1505;

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
	 * Setter for the gameName field.
	 * @param gameName the gameName value to set.
	 */
	void setGameName(String gameName);
}
