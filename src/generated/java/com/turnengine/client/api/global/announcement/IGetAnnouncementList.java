package com.turnengine.client.api.global.announcement;

import com.robindrew.codegenerator.api.executable.bean.IExecutableBean;
import com.turnengine.client.api.global.game.GameLevel;
import java.util.List;

public interface IGetAnnouncementList extends IExecutableBean<List<IAnnouncement>>, Comparable<IGetAnnouncementList> {

	int SERIALIZATION_ID = 1103;

	/**
	 * Returns the serialization id.
	 * @return the serialization id.
	 */
	int getSerializationId();

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
	 * Setter for the gameLevelId field.
	 * @param gameLevelId the gameLevelId value to set.
	 */
	void setGameLevelId(int gameLevelId);

	/**
	 * Setter for the gameLevel field.
	 * @param gameLevel the gameLevel value to set.
	 */
	void setGameLevel(GameLevel gameLevel);
}
