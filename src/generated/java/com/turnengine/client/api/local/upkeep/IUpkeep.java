package com.turnengine.client.api.local.upkeep;

import com.robindrew.codegenerator.api.bean.IBean;

public interface IUpkeep extends IBean, Comparable<IUpkeep> {

	int SERIALIZATION_ID = 4006;

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
	 * Getter for the limit field.
	 * @return the value of the limit field.
	 */
	long getLimit();

	/**
	 * Setter for the id field.
	 * @param id the id value to set.
	 */
	void setId(int id);

	/**
	 * Setter for the limit field.
	 * @param limit the limit value to set.
	 */
	void setLimit(long limit);
}
