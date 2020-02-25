package com.turnengine.client.api.local.action;

import com.robindrew.codegenerator.api.executable.bean.IExecutableBean;
import com.turnengine.client.api.common.command.ILocalLoggedInBean;
import com.turnengine.client.api.local.setup.ISetupBean;
import com.turnengine.client.api.local.unit.UnitRelation;
import com.turnengine.client.api.local.unit.UnitType;

public interface IAddActionTarget extends IExecutableBean<IActionTarget>, ILocalLoggedInBean<IActionTarget>, ISetupBean<IActionTarget>, Comparable<IAddActionTarget> {

	int SERIALIZATION_ID = 2002;

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
	 * Getter for the target field.
	 * @return the value of the target field.
	 */
	ActionTargetType getTarget();

	/**
	 * Getter for the type field.
	 * @return the value of the type field.
	 */
	UnitType getType();

	/**
	 * Getter for the relation field.
	 * @return the value of the relation field.
	 */
	UnitRelation getRelation();

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
	 * Setter for the target field.
	 * @param target the target value to set.
	 */
	void setTarget(ActionTargetType target);

	/**
	 * Setter for the type field.
	 * @param type the type value to set.
	 */
	void setType(UnitType type);

	/**
	 * Setter for the relation field.
	 * @param relation the relation value to set.
	 */
	void setRelation(UnitRelation relation);
}
