package com.turnengine.client.api.local.score;

import com.robindrew.codegenerator.api.bean.IBean;

public interface IUnitScore extends IBean, Comparable<IUnitScore> {

	int SERIALIZATION_ID = 6211;

	/**
	 * Returns the serialization id.
	 * @return the serialization id.
	 */
	int getSerializationId();

	/**
	 * Getter for the groupId field.
	 * @return the value of the groupId field.
	 */
	int getGroupId();

	/**
	 * Getter for the unitId field.
	 * @return the value of the unitId field.
	 */
	int getUnitId();

	/**
	 * Getter for the score field.
	 * @return the value of the score field.
	 */
	long getScore();

	/**
	 * Setter for the groupId field.
	 * @param groupId the groupId value to set.
	 */
	void setGroupId(int groupId);

	/**
	 * Setter for the unitId field.
	 * @param unitId the unitId value to set.
	 */
	void setUnitId(int unitId);

	/**
	 * Setter for the score field.
	 * @param score the score value to set.
	 */
	void setScore(long score);
}
