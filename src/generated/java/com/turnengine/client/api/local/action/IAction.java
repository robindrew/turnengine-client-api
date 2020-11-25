package com.turnengine.client.api.local.action;

import com.robindrew.codegenerator.api.bean.IBean;

public interface IAction extends IBean, Comparable<IAction> {

	int SERIALIZATION_ID = 2029;

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
	 * Setter for the id field.
	 * @param id the id value to set.
	 */
	void setId(int id);

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
