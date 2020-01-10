package com.turnengine.client.api.local.score;

import com.robindrew.codegenerator.api.bean.IBean;
import com.turnengine.client.api.local.alliance.IAllianceInfo;

public interface IAllianceRanking extends IBean, Comparable<IAllianceRanking> {

	int SERIALIZATION_ID = 6215;

	/**
	 * Returns the serialization id.
	 * @return the serialization id.
	 */
	int getSerializationId();

	/**
	 * Getter for the alliance field.
	 * @return the value of the alliance field.
	 */
	IAllianceInfo getAlliance();

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
	 * Setter for the alliance field.
	 * @param alliance the alliance value to set.
	 */
	void setAlliance(IAllianceInfo alliance);

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
