package com.turnengine.client.api.local.turn;

import com.robindrew.codegenerator.api.bean.IBean;

public interface ITurn extends IBean, Comparable<ITurn> {

	int SERIALIZATION_ID = 6715;

	/**
	 * Returns the serialization id.
	 * @return the serialization id.
	 */
	int getSerializationId();

	/**
	 * Getter for the number field.
	 * @return the value of the number field.
	 */
	int getNumber();

	/**
	 * Getter for the timestamp field.
	 * @return the value of the timestamp field.
	 */
	long getTimestamp();

	/**
	 * Getter for the duration field.
	 * @return the value of the duration field.
	 */
	long getDuration();

	/**
	 * Setter for the number field.
	 * @param number the number value to set.
	 */
	void setNumber(int number);

	/**
	 * Setter for the timestamp field.
	 * @param timestamp the timestamp value to set.
	 */
	void setTimestamp(long timestamp);

	/**
	 * Setter for the duration field.
	 * @param duration the duration value to set.
	 */
	void setDuration(long duration);
}
