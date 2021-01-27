package com.turnengine.client.api.local.setup;

import com.robindrew.codegenerator.api.bean.IBean;
import com.turnengine.client.api.local.action.ActionTargetType;
import com.turnengine.client.api.local.unit.UnitRelation;
import com.turnengine.client.api.local.unit.UnitType;

public interface ISetupAddActionTarget extends IBean, Comparable<ISetupAddActionTarget> {

	int SERIALIZATION_ID = 3419;

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
