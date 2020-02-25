package com.turnengine.client.api.local.location;

import com.robindrew.codegenerator.api.bean.IBean;

public interface ICoordinate extends IBean, Comparable<ICoordinate> {

	int SERIALIZATION_ID = 2804;

	/**
	 * Returns the serialization id.
	 * @return the serialization id.
	 */
	int getSerializationId();

	/**
	 * Getter for the locationId field.
	 * @return the value of the locationId field.
	 */
	int getLocationId();

	/**
	 * Getter for the coordinates field.
	 * @return the value of the coordinates field.
	 */
	int[] getCoordinates();

	/**
	 * Setter for the locationId field.
	 * @param locationId the locationId value to set.
	 */
	void setLocationId(int locationId);

	/**
	 * Setter for the coordinates field.
	 * @param coordinates the coordinates value to set.
	 */
	void setCoordinates(int[] coordinates);
}
