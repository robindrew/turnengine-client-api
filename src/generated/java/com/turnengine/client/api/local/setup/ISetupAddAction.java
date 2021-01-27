package com.turnengine.client.api.local.setup;

import com.robindrew.codegenerator.api.bean.IBean;

public interface ISetupAddAction extends IBean, Comparable<ISetupAddAction> {

	int SERIALIZATION_ID = 3418;

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
	 * Getter for the turns field.
	 * @return the value of the turns field.
	 */
	int getTurns();

	/**
	 * Getter for the limit field.
	 * @return the value of the limit field.
	 */
	int getLimit();

	/**
	 * Setter for the name field.
	 * @param name the name value to set.
	 */
	void setName(String name);

	/**
	 * Setter for the turns field.
	 * @param turns the turns value to set.
	 */
	void setTurns(int turns);

	/**
	 * Setter for the limit field.
	 * @param limit the limit value to set.
	 */
	void setLimit(int limit);
}
