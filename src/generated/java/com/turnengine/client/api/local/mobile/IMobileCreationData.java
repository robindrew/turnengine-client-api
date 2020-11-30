package com.turnengine.client.api.local.mobile;

import com.robindrew.codegenerator.api.bean.IBean;

public interface IMobileCreationData extends IBean, Comparable<IMobileCreationData> {

	int SERIALIZATION_ID = 3030;

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
	 * Getter for the name field.
	 * @return the value of the name field.
	 */
	String getName();

	/**
	 * Getter for the playerId field.
	 * @return the value of the playerId field.
	 */
	int getPlayerId();

	/**
	 * Getter for the originId field.
	 * @return the value of the originId field.
	 */
	int getOriginId();

	/**
	 * Getter for the destinationId field.
	 * @return the value of the destinationId field.
	 */
	int getDestinationId();

	/**
	 * Getter for the moveTurns field.
	 * @return the value of the moveTurns field.
	 */
	int getMoveTurns();

	/**
	 * Getter for the waitTurns field.
	 * @return the value of the waitTurns field.
	 */
	int getWaitTurns();

	/**
	 * Setter for the id field.
	 * @param id the id value to set.
	 */
	void setId(int id);

	/**
	 * Setter for the name field.
	 * @param name the name value to set.
	 */
	void setName(String name);

	/**
	 * Setter for the playerId field.
	 * @param playerId the playerId value to set.
	 */
	void setPlayerId(int playerId);

	/**
	 * Setter for the originId field.
	 * @param originId the originId value to set.
	 */
	void setOriginId(int originId);

	/**
	 * Setter for the destinationId field.
	 * @param destinationId the destinationId value to set.
	 */
	void setDestinationId(int destinationId);

	/**
	 * Setter for the moveTurns field.
	 * @param moveTurns the moveTurns value to set.
	 */
	void setMoveTurns(int moveTurns);

	/**
	 * Setter for the waitTurns field.
	 * @param waitTurns the waitTurns value to set.
	 */
	void setWaitTurns(int waitTurns);
}
