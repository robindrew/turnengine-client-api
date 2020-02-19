package com.turnengine.client.api.local.turn;

import com.robindrew.codegenerator.api.bean.IBean;

public interface ITurnComponent extends IBean, Comparable<ITurnComponent> {

	int SERIALIZATION_ID = 6719;

	/**
	 * Returns the serialization id.
	 * @return the serialization id.
	 */
	int getSerializationId();

	/**
	 * Getter for the name field.
	 * @return the value of the name field.
	 */
	String getName();

	/**
	 * Getter for the duration field.
	 * @return the value of the duration field.
	 */
	long getDuration();

	/**
	 * Setter for the name field.
	 * @param name the name value to set.
	 */
	void setName(String name);

	/**
	 * Setter for the duration field.
	 * @param duration the duration value to set.
	 */
	void setDuration(long duration);
}
