package com.turnengine.client.api.local.unit;

import com.robindrew.codegenerator.api.bean.IBean;

public interface IUnitCountRange extends IBean, Comparable<IUnitCountRange> {

	int SERIALIZATION_ID = 3912;

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
	 * Getter for the minAmount field.
	 * @return the value of the minAmount field.
	 */
	long getMinAmount();

	/**
	 * Getter for the maxAmount field.
	 * @return the value of the maxAmount field.
	 */
	long getMaxAmount();

	/**
	 * Setter for the id field.
	 * @param id the id value to set.
	 */
	void setId(int id);

	/**
	 * Setter for the minAmount field.
	 * @param minAmount the minAmount value to set.
	 */
	void setMinAmount(long minAmount);

	/**
	 * Setter for the maxAmount field.
	 * @param maxAmount the maxAmount value to set.
	 */
	void setMaxAmount(long maxAmount);
}
