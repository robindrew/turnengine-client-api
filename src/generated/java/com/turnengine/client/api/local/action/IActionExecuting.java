package com.turnengine.client.api.local.action;

import com.robindrew.codegenerator.api.bean.IBean;
import com.turnengine.client.api.local.unit.UnitType;

public interface IActionExecuting extends IBean, Comparable<IActionExecuting> {

	int SERIALIZATION_ID = 2030;

	/**
	 * Returns the serialization id.
	 * @return the serialization id.
	 */
	int getSerializationId();

	/**
	 * Getter for the sourceId field.
	 * @return the value of the sourceId field.
	 */
	int getSourceId();

	/**
	 * Getter for the sourceType field.
	 * @return the value of the sourceType field.
	 */
	UnitType getSourceType();

	/**
	 * Getter for the targetId field.
	 * @return the value of the targetId field.
	 */
	int getTargetId();

	/**
	 * Getter for the targetType field.
	 * @return the value of the targetType field.
	 */
	UnitType getTargetType();

	/**
	 * Getter for the actionId field.
	 * @return the value of the actionId field.
	 */
	int getActionId();

	/**
	 * Getter for the groupId field.
	 * @return the value of the groupId field.
	 */
	int getGroupId();

	/**
	 * Getter for the amount field.
	 * @return the value of the amount field.
	 */
	long getAmount();

	/**
	 * Getter for the turns field.
	 * @return the value of the turns field.
	 */
	int getTurns();

	/**
	 * Setter for the sourceId field.
	 * @param sourceId the sourceId value to set.
	 */
	void setSourceId(int sourceId);

	/**
	 * Setter for the sourceType field.
	 * @param sourceType the sourceType value to set.
	 */
	void setSourceType(UnitType sourceType);

	/**
	 * Setter for the targetId field.
	 * @param targetId the targetId value to set.
	 */
	void setTargetId(int targetId);

	/**
	 * Setter for the targetType field.
	 * @param targetType the targetType value to set.
	 */
	void setTargetType(UnitType targetType);

	/**
	 * Setter for the actionId field.
	 * @param actionId the actionId value to set.
	 */
	void setActionId(int actionId);

	/**
	 * Setter for the groupId field.
	 * @param groupId the groupId value to set.
	 */
	void setGroupId(int groupId);

	/**
	 * Setter for the amount field.
	 * @param amount the amount value to set.
	 */
	void setAmount(long amount);

	/**
	 * Setter for the turns field.
	 * @param turns the turns value to set.
	 */
	void setTurns(int turns);
}
