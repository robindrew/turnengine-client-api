package com.turnengine.client.api.global.game;

import com.robindrew.codegenerator.api.executable.bean.IExecutableBean;

public interface IGetGameHostById extends IExecutableBean<IGameHost>, Comparable<IGetGameHostById> {

	int SERIALIZATION_ID = 1521;

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
	 * Setter for the id field.
	 * @param id the id value to set.
	 */
	void setId(int id);
}
