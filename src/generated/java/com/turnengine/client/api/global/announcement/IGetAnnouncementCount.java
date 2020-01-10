package com.turnengine.client.api.global.announcement;

import com.robindrew.codegenerator.api.executable.bean.IExecutableBean;

public interface IGetAnnouncementCount extends IExecutableBean<Integer>, Comparable<IGetAnnouncementCount> {

	int SERIALIZATION_ID = 1102;

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
