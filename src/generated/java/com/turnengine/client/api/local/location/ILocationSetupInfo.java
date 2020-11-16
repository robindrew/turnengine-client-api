package com.turnengine.client.api.local.location;

import com.robindrew.codegenerator.api.bean.IBean;

public interface ILocationSetupInfo extends IBean, Comparable<ILocationSetupInfo> {

	int SERIALIZATION_ID = 2830;

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
	 * Getter for the enabled field.
	 * @return the value of the enabled field.
	 */
	boolean getEnabled();

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
	 * Setter for the enabled field.
	 * @param enabled the enabled value to set.
	 */
	void setEnabled(boolean enabled);

	/**
	 * Setter for the signupsEnabled field.
	 * @param signupsEnabled the signupsEnabled value to set.
	 */
	void setSignupsEnabled(boolean signupsEnabled);
}
