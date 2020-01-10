package com.turnengine.client.api.global.game;

import com.robindrew.codegenerator.api.bean.IBean;

public interface IGameHost extends IBean, Comparable<IGameHost> {

	int SERIALIZATION_ID = 1532;

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
	 * Getter for the port field.
	 * @return the value of the port field.
	 */
	int getPort();

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
	 * Setter for the port field.
	 * @param port the port value to set.
	 */
	void setPort(int port);
}
