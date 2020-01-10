package com.turnengine.client.api.global.common;

import com.robindrew.codegenerator.api.bean.IBean;

public interface IServicePersistorProperties extends IBean, Comparable<IServicePersistorProperties> {

	int SERIALIZATION_ID = 1221;

	/**
	 * Returns the serialization id.
	 * @return the serialization id.
	 */
	int getSerializationId();

	/**
	 * Getter for the database field.
	 * @return the value of the database field.
	 */
	String getDatabase();

	/**
	 * Setter for the database field.
	 * @param database the database value to set.
	 */
	void setDatabase(String database);
}
