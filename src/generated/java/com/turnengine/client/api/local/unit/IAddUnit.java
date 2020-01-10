package com.turnengine.client.api.local.unit;

import com.robindrew.codegenerator.api.executable.bean.IExecutableBean;
import com.turnengine.client.api.common.command.ILocalLoggedInBean;
import com.turnengine.client.api.local.setup.ISetupBean;

public interface IAddUnit extends IExecutableBean<IUnit>, ILocalLoggedInBean<IUnit>, ISetupBean<IUnit>, Comparable<IAddUnit> {

	int SERIALIZATION_ID = 6801;

	/**
	 * Returns the serialization id.
	 * @return the serialization id.
	 */
	int getSerializationId();

	/**
	 * Getter for the loginId field.
	 * @return the value of the loginId field.
	 */
	long getLoginId();

	/**
	 * Getter for the instanceId field.
	 * @return the value of the instanceId field.
	 */
	int getInstanceId();

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
	 * Setter for the loginId field.
	 * @param loginId the loginId value to set.
	 */
	void setLoginId(long loginId);

	/**
	 * Setter for the instanceId field.
	 * @param instanceId the instanceId value to set.
	 */
	void setInstanceId(int instanceId);

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
