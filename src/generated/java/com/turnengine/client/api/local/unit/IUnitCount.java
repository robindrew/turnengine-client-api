package com.turnengine.client.api.local.unit;

import com.robindrew.codegenerator.api.bean.IBean;

public interface IUnitCount extends IBean, Comparable<IUnitCount> {

	int SERIALIZATION_ID = 3910;

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
	 * Getter for the amount field.
	 * @return the value of the amount field.
	 */
	long getAmount();

	/**
	 * Setter for the id field.
	 * @param id the id value to set.
	 */
	void setId(int id);

	/**
	 * Setter for the amount field.
	 * @param amount the amount value to set.
	 */
	void setAmount(long amount);
}
