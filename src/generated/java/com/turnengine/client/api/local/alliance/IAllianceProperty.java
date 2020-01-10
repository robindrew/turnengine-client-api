package com.turnengine.client.api.local.alliance;

import com.robindrew.codegenerator.api.bean.IBean;

public interface IAllianceProperty extends IBean, Comparable<IAllianceProperty> {

	int SERIALIZATION_ID = 5133;

	/**
	 * Returns the serialization id.
	 * @return the serialization id.
	 */
	int getSerializationId();

	/**
	 * Getter for the allianceId field.
	 * @return the value of the allianceId field.
	 */
	int getAllianceId();

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
	 * Setter for the allianceId field.
	 * @param allianceId the allianceId value to set.
	 */
	void setAllianceId(int allianceId);

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
