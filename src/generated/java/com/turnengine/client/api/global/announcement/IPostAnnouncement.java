package com.turnengine.client.api.global.announcement;

import com.robindrew.codegenerator.api.executable.bean.IExecutableBean;
import com.turnengine.client.api.common.command.IGlobalLoggedInBean;
import com.turnengine.client.api.global.game.GameLevel;

public interface IPostAnnouncement extends IExecutableBean<Integer>, IGlobalLoggedInBean<Integer>, Comparable<IPostAnnouncement> {

	int SERIALIZATION_ID = 1101;

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
	 * Getter for the gameLevelId field.
	 * @return the value of the gameLevelId field.
	 */
	int getGameLevelId();

	/**
	 * Getter for the gameLevel field.
	 * @return the value of the gameLevel field.
	 */
	GameLevel getGameLevel();

	/**
	 * Getter for the subject field.
	 * @return the value of the subject field.
	 */
	String getSubject();

	/**
	 * Getter for the body field.
	 * @return the value of the body field.
	 */
	String getBody();

	/**
	 * Setter for the loginId field.
	 * @param loginId the loginId value to set.
	 */
	void setLoginId(long loginId);

	/**
	 * Setter for the gameLevelId field.
	 * @param gameLevelId the gameLevelId value to set.
	 */
	void setGameLevelId(int gameLevelId);

	/**
	 * Setter for the gameLevel field.
	 * @param gameLevel the gameLevel value to set.
	 */
	void setGameLevel(GameLevel gameLevel);

	/**
	 * Setter for the subject field.
	 * @param subject the subject value to set.
	 */
	void setSubject(String subject);

	/**
	 * Setter for the body field.
	 * @param body the body value to set.
	 */
	void setBody(String body);
}
