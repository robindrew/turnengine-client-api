package com.turnengine.client.api.local.setup;

import com.robindrew.codegenerator.api.bean.IBean;
import com.turnengine.client.api.local.creation.CreationConditionType;

public interface ISetupAddUpkeepCondition extends IBean, Comparable<ISetupAddUpkeepCondition> {

	int SERIALIZATION_ID = 3416;

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
	 * Getter for the condition field.
	 * @return the value of the condition field.
	 */
	CreationConditionType getCondition();

	/**
	 * Getter for the conditionName1 field.
	 * @return the value of the conditionName1 field.
	 */
	String getConditionName1();

	/**
	 * Getter for the conditionAmount1 field.
	 * @return the value of the conditionAmount1 field.
	 */
	long getConditionAmount1();

	/**
	 * Getter for the conditionName2 field.
	 * @return the value of the conditionName2 field.
	 */
	String getConditionName2();

	/**
	 * Getter for the conditionAmount2 field.
	 * @return the value of the conditionAmount2 field.
	 */
	long getConditionAmount2();

	/**
	 * Getter for the conditionName3 field.
	 * @return the value of the conditionName3 field.
	 */
	String getConditionName3();

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
	 * Setter for the name field.
	 * @param name the name value to set.
	 */
	void setName(String name);

	/**
	 * Setter for the condition field.
	 * @param condition the condition value to set.
	 */
	void setCondition(CreationConditionType condition);

	/**
	 * Setter for the conditionName1 field.
	 * @param conditionName1 the conditionName1 value to set.
	 */
	void setConditionName1(String conditionName1);

	/**
	 * Setter for the conditionAmount1 field.
	 * @param conditionAmount1 the conditionAmount1 value to set.
	 */
	void setConditionAmount1(long conditionAmount1);

	/**
	 * Setter for the conditionName2 field.
	 * @param conditionName2 the conditionName2 value to set.
	 */
	void setConditionName2(String conditionName2);

	/**
	 * Setter for the conditionAmount2 field.
	 * @param conditionAmount2 the conditionAmount2 value to set.
	 */
	void setConditionAmount2(long conditionAmount2);

	/**
	 * Setter for the conditionName3 field.
	 * @param conditionName3 the conditionName3 value to set.
	 */
	void setConditionName3(String conditionName3);

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
