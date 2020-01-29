package com.turnengine.client.api.local.setup;

import com.robindrew.codegenerator.api.bean.IBean;

public interface ISetupAddChildGroup extends IBean, Comparable<ISetupAddChildGroup> {

	int SERIALIZATION_ID = 6307;

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
	 * Getter for the parentName field.
	 * @return the value of the parentName field.
	 */
	String getParentName();

	/**
	 * Getter for the factionName field.
	 * @return the value of the factionName field.
	 */
	String getFactionName();

	/**
	 * Setter for the name field.
	 * @param name the name value to set.
	 */
	void setName(String name);

	/**
	 * Setter for the parentName field.
	 * @param parentName the parentName value to set.
	 */
	void setParentName(String parentName);

	/**
	 * Setter for the factionName field.
	 * @param factionName the factionName value to set.
	 */
	void setFactionName(String factionName);
}
