package com.turnengine.client.api.local.setup;

import com.robindrew.codegenerator.api.bean.IBean;

public interface ISetupSetUnitScore extends IBean, Comparable<ISetupSetUnitScore> {

	int SERIALIZATION_ID = 3412;

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
	 * Getter for the instanceId field.
	 * @return the value of the instanceId field.
	 */
	int getInstanceId();

	/**
	 * Getter for the group field.
	 * @return the value of the group field.
	 */
	String getGroup();

	/**
	 * Getter for the unit field.
	 * @return the value of the unit field.
	 */
	String getUnit();

	/**
	 * Getter for the score field.
	 * @return the value of the score field.
	 */
	long getScore();

	/**
	 * Setter for the loginId field.
	 * @param loginId the loginId value to set.
	 */
	void setLoginId(long loginId);

	/**
	 * Setter for the instanceId field.
	 * @param instanceId the instanceId value to set.
	 */
	void setInstanceId(int instanceId);

	/**
	 * Setter for the group field.
	 * @param group the group value to set.
	 */
	void setGroup(String group);

	/**
	 * Setter for the unit field.
	 * @param unit the unit value to set.
	 */
	void setUnit(String unit);

	/**
	 * Setter for the score field.
	 * @param score the score value to set.
	 */
	void setScore(long score);
}
