package com.turnengine.client.api.global.common;

import com.robindrew.codegenerator.api.bean.IBean;

public interface IOpenIdParameter extends IBean, Comparable<IOpenIdParameter> {

	int SERIALIZATION_ID = 1222;

	/**
	 * Returns the serialization id.
	 * @return the serialization id.
	 */
	int getSerializationId();

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
