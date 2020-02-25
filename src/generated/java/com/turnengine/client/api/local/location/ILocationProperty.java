package com.turnengine.client.api.local.location;

import com.robindrew.codegenerator.api.bean.IBean;

public interface ILocationProperty extends IBean, Comparable<ILocationProperty> {

	int SERIALIZATION_ID = 2830;

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
	 * Getter for the playerId field.
	 * @return the value of the playerId field.
	 */
	int getPlayerId();

	/**
	 * Getter for the key field.
	 * @return the value of the key field.
	 */
	String getKey();

	/**
	 * Getter for the value field.
	 * @return the value of the value field.
	 */
	String getValue();

	/**
	 * Setter for the locationId field.
	 * @param locationId the locationId value to set.
	 */
	void setLocationId(int locationId);

	/**
	 * Setter for the playerId field.
	 * @param playerId the playerId value to set.
	 */
	void setPlayerId(int playerId);

	/**
	 * Setter for the key field.
	 * @param key the key value to set.
	 */
	void setKey(String key);

	/**
	 * Setter for the value field.
	 * @param value the value value to set.
	 */
	void setValue(String value);
}
