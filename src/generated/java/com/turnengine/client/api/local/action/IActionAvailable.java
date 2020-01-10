package com.turnengine.client.api.local.action;

import com.robindrew.codegenerator.api.bean.IBean;

public interface IActionAvailable extends IBean, Comparable<IActionAvailable> {

	int SERIALIZATION_ID = 5031;

	/**
	 * Returns the serialization id.
	 * @return the serialization id.
	 */
	int getSerializationId();

	/**
	 * Getter for the actionId field.
	 * @return the value of the actionId field.
	 */
	int getActionId();

	/**
	 * Getter for the amount field.
	 * @return the value of the amount field.
	 */
	long getAmount();

	/**
	 * Setter for the actionId field.
	 * @param actionId the actionId value to set.
	 */
	void setActionId(int actionId);

	/**
	 * Setter for the amount field.
	 * @param amount the amount value to set.
	 */
	void setAmount(long amount);
}
