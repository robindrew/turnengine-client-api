package com.turnengine.client.api.local.mobile;

import com.robindrew.codegenerator.api.bean.IBean;

public interface IMobileSetupInfo extends IBean, Comparable<IMobileSetupInfo> {

	int SERIALIZATION_ID = 5930;

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
	 * Setter for the count field.
	 * @param count the count value to set.
	 */
	void setCount(int count);

	/**
	 * Setter for the enabled field.
	 * @param enabled the enabled value to set.
	 */
	void setEnabled(boolean enabled);
}
