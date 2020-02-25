package com.turnengine.client.api.local.score;

import com.robindrew.codegenerator.api.bean.IBean;

public interface IRanking extends IBean, Comparable<IRanking> {

	int SERIALIZATION_ID = 3313;

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
	 * Setter for the id field.
	 * @param id the id value to set.
	 */
	void setId(int id);

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
