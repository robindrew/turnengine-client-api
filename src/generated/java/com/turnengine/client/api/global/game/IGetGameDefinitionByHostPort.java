package com.turnengine.client.api.global.game;

import com.robindrew.codegenerator.api.executable.bean.IExecutableBean;

public interface IGetGameDefinitionByHostPort extends IExecutableBean<IGameDefinition>, Comparable<IGetGameDefinitionByHostPort> {

	int SERIALIZATION_ID = 1528;

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
	 * Getter for the port field.
	 * @return the value of the port field.
	 */
	int getPort();

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
