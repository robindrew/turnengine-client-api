package com.turnengine.client.api.local.unit;

import com.robindrew.codegenerator.api.bean.IBean;
import com.robindrew.codegenerator.api.identity.INamedIdentity;

public interface IUnit extends IBean, INamedIdentity, Comparable<IUnit> {

	int SERIALIZATION_ID = 3909;

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
	 * Getter for the node field.
	 * @return the value of the node field.
	 */
	UnitNode getNode();

	/**
	 * Getter for the type field.
	 * @return the value of the type field.
	 */
	UnitType getType();

	/**
	 * Getter for the move field.
	 * @return the value of the move field.
	 */
	UnitMove getMove();

	/**
	 * Getter for the groupId field.
	 * @return the value of the groupId field.
	 */
	int getGroupId();

	/**
	 * Getter for the factionId field.
	 * @return the value of the factionId field.
	 */
	int getFactionId();

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
	 * Setter for the node field.
	 * @param node the node value to set.
	 */
	void setNode(UnitNode node);

	/**
	 * Setter for the type field.
	 * @param type the type value to set.
	 */
	void setType(UnitType type);

	/**
	 * Setter for the move field.
	 * @param move the move value to set.
	 */
	void setMove(UnitMove move);

	/**
	 * Setter for the groupId field.
	 * @param groupId the groupId value to set.
	 */
	void setGroupId(int groupId);

	/**
	 * Setter for the factionId field.
	 * @param factionId the factionId value to set.
	 */
	void setFactionId(int factionId);
}
