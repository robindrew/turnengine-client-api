package com.turnengine.client.api.local.player;

import com.robindrew.codegenerator.api.bean.IBean;

public interface IPlayerSetupInfo extends IBean, Comparable<IPlayerSetupInfo> {

	int SERIALIZATION_ID = 3134;

	/**
	 * Returns the serialization id.
	 * @return the serialization id.
	 */
	int getSerializationId();

	/**
	 * Getter for the count field.
	 * @return the value of the count field.
	 */
	int getCount();

	/**
	 * Getter for the limit field.
	 * @return the value of the limit field.
	 */
	int getLimit();

	/**
	 * Getter for the signupsEnabled field.
	 * @return the value of the signupsEnabled field.
	 */
	boolean getSignupsEnabled();

	/**
	 * Setter for the count field.
	 * @param count the count value to set.
	 */
	void setCount(int count);

	/**
	 * Setter for the limit field.
	 * @param limit the limit value to set.
	 */
	void setLimit(int limit);

	/**
	 * Setter for the signupsEnabled field.
	 * @param signupsEnabled the signupsEnabled value to set.
	 */
	void setSignupsEnabled(boolean signupsEnabled);
}
