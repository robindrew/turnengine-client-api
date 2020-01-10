package com.turnengine.client.api.local.setup;

import com.robindrew.codegenerator.api.bean.IBean;
import com.turnengine.client.api.local.unit.UnitMove;
import com.turnengine.client.api.local.unit.UnitNode;
import com.turnengine.client.api.local.unit.UnitType;

public interface ISetupAddUnit extends IBean, Comparable<ISetupAddUnit> {

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
	 * Getter for the groupName field.
	 * @return the value of the groupName field.
	 */
	String getGroupName();

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
	 * Setter for the groupName field.
	 * @param groupName the groupName value to set.
	 */
	void setGroupName(String groupName);

	/**
	 * Setter for the factionName field.
	 * @param factionName the factionName value to set.
	 */
	void setFactionName(String factionName);
}
