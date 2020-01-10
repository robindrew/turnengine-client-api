package com.turnengine.client.api.local.group;

import com.robindrew.codegenerator.api.bean.IBean;
import com.robindrew.codegenerator.api.identity.INamedIdentity;

public interface IGroup extends IBean, INamedIdentity, Comparable<IGroup> {

	int SERIALIZATION_ID = 5607;

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
	 * Getter for the factionId field.
	 * @return the value of the factionId field.
	 */
	int getFactionId();

	/**
	 * Getter for the parentId field.
	 * @return the value of the parentId field.
	 */
	int getParentId();

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
	 * Setter for the factionId field.
	 * @param factionId the factionId value to set.
	 */
	void setFactionId(int factionId);

	/**
	 * Setter for the parentId field.
	 * @param parentId the parentId value to set.
	 */
	void setParentId(int parentId);
}
