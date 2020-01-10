package com.turnengine.client.api.local.upkeep;

import com.robindrew.codegenerator.api.bean.IBean;
import com.turnengine.client.api.local.creation.CreationConditionType;
import com.turnengine.client.api.local.creation.ICreationCondition;

public interface IUpkeepCondition extends IBean, ICreationCondition, Comparable<IUpkeepCondition> {

	int SERIALIZATION_ID = 6907;

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
	 * Getter for the conditionType field.
	 * @return the value of the conditionType field.
	 */
	CreationConditionType getConditionType();

	/**
	 * Getter for the conditionId1 field.
	 * @return the value of the conditionId1 field.
	 */
	int getConditionId1();

	/**
	 * Getter for the conditionAmount1 field.
	 * @return the value of the conditionAmount1 field.
	 */
	long getConditionAmount1();

	/**
	 * Getter for the conditionId2 field.
	 * @return the value of the conditionId2 field.
	 */
	int getConditionId2();

	/**
	 * Getter for the conditionAmount2 field.
	 * @return the value of the conditionAmount2 field.
	 */
	long getConditionAmount2();

	/**
	 * Getter for the conditionId3 field.
	 * @return the value of the conditionId3 field.
	 */
	int getConditionId3();

	/**
	 * Getter for the conditionAmount3 field.
	 * @return the value of the conditionAmount3 field.
	 */
	long getConditionAmount3();

	/**
	 * Getter for the optional field.
	 * @return the value of the optional field.
	 */
	boolean getOptional();

	/**
	 * Setter for the id field.
	 * @param id the id value to set.
	 */
	void setId(int id);

	/**
	 * Setter for the conditionType field.
	 * @param conditionType the conditionType value to set.
	 */
	void setConditionType(CreationConditionType conditionType);

	/**
	 * Setter for the conditionId1 field.
	 * @param conditionId1 the conditionId1 value to set.
	 */
	void setConditionId1(int conditionId1);

	/**
	 * Setter for the conditionAmount1 field.
	 * @param conditionAmount1 the conditionAmount1 value to set.
	 */
	void setConditionAmount1(long conditionAmount1);

	/**
	 * Setter for the conditionId2 field.
	 * @param conditionId2 the conditionId2 value to set.
	 */
	void setConditionId2(int conditionId2);

	/**
	 * Setter for the conditionAmount2 field.
	 * @param conditionAmount2 the conditionAmount2 value to set.
	 */
	void setConditionAmount2(long conditionAmount2);

	/**
	 * Setter for the conditionId3 field.
	 * @param conditionId3 the conditionId3 value to set.
	 */
	void setConditionId3(int conditionId3);

	/**
	 * Setter for the conditionAmount3 field.
	 * @param conditionAmount3 the conditionAmount3 value to set.
	 */
	void setConditionAmount3(long conditionAmount3);

	/**
	 * Setter for the optional field.
	 * @param optional the optional value to set.
	 */
	void setOptional(boolean optional);
}
