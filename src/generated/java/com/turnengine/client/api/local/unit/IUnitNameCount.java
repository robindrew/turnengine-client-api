package com.turnengine.client.api.local.unit;

import com.robindrew.codegenerator.api.bean.IBean;

public interface IUnitNameCount extends IBean, Comparable<IUnitNameCount> {

	int SERIALIZATION_ID = 3911;

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
	 * Getter for the amount field.
	 * @return the value of the amount field.
	 */
	long getAmount();

	/**
	 * Setter for the name field.
	 * @param name the name value to set.
	 */
	void setName(String name);

	/**
	 * Setter for the amount field.
	 * @param amount the amount value to set.
	 */
	void setAmount(long amount);
}
