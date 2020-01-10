package com.turnengine.client.api.local.score;

import com.robindrew.codegenerator.api.bean.IBean;

public interface ITurnScore extends IBean, Comparable<ITurnScore> {

	int SERIALIZATION_ID = 6216;

	/**
	 * Returns the serialization id.
	 * @return the serialization id.
	 */
	int getSerializationId();

	/**
	 * Getter for the turn field.
	 * @return the value of the turn field.
	 */
	int getTurn();

	/**
	 * Getter for the score field.
	 * @return the value of the score field.
	 */
	long getScore();

	/**
	 * Setter for the turn field.
	 * @param turn the turn value to set.
	 */
	void setTurn(int turn);

	/**
	 * Setter for the score field.
	 * @param score the score value to set.
	 */
	void setScore(long score);
}
