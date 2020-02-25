package com.turnengine.client.api.local.score;

import com.robindrew.codegenerator.api.bean.IBean;
import com.turnengine.client.api.local.player.IPlayerInfo;

public interface IPlayerRanking extends IBean, Comparable<IPlayerRanking> {

	int SERIALIZATION_ID = 3314;

	/**
	 * Returns the serialization id.
	 * @return the serialization id.
	 */
	int getSerializationId();

	/**
	 * Getter for the player field.
	 * @return the value of the player field.
	 */
	IPlayerInfo getPlayer();

	/**
	 * Getter for the rank field.
	 * @return the value of the rank field.
	 */
	int getRank();

	/**
	 * Getter for the score field.
	 * @return the value of the score field.
	 */
	long getScore();

	/**
	 * Setter for the player field.
	 * @param player the player value to set.
	 */
	void setPlayer(IPlayerInfo player);

	/**
	 * Setter for the rank field.
	 * @param rank the rank value to set.
	 */
	void setRank(int rank);

	/**
	 * Setter for the score field.
	 * @param score the score value to set.
	 */
	void setScore(long score);
}
