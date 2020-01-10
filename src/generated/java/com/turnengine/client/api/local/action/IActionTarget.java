package com.turnengine.client.api.local.action;

import com.robindrew.codegenerator.api.bean.IBean;
import com.turnengine.client.api.local.unit.UnitRelation;
import com.turnengine.client.api.local.unit.UnitType;

public interface IActionTarget extends IBean, Comparable<IActionTarget> {

	int SERIALIZATION_ID = 5027;

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
	 * Getter for the targetType field.
	 * @return the value of the targetType field.
	 */
	ActionTargetType getTargetType();

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
	 * Setter for the id field.
	 * @param id the id value to set.
	 */
	void setId(int id);

	/**
	 * Setter for the targetType field.
	 * @param targetType the targetType value to set.
	 */
	void setTargetType(ActionTargetType targetType);

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
