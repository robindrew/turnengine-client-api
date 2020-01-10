package com.turnengine.client.api.common.plugin;

import com.robindrew.codegenerator.api.bean.IBean;

public interface IPluginDetails extends IBean, Comparable<IPluginDetails> {

	int SERIALIZATION_ID = 301;

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
	 * Getter for the xml field.
	 * @return the value of the xml field.
	 */
	String getXml();

	/**
	 * Setter for the name field.
	 * @param name the name value to set.
	 */
	void setName(String name);

	/**
	 * Setter for the xml field.
	 * @param xml the xml value to set.
	 */
	void setXml(String xml);
}
