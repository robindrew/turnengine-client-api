package com.turnengine.client.api.local.setup;

import com.robindrew.codegenerator.api.bean.IBean;

public interface ISetupSetScoreDivisor extends IBean, Comparable<ISetupSetScoreDivisor> {

	int SERIALIZATION_ID = 3414;

	/**
	 * Returns the serialization id.
	 * @return the serialization id.
	 */
	int getSerializationId();

	/**
	 * Getter for the loginId field.
	 * @return the value of the loginId field.
	 */
	long getLoginId();

	/**
	 * Getter for the instanceId field.
	 * @return the value of the instanceId field.
	 */
	int getInstanceId();

	/**
	 * Getter for the group field.
	 * @return the value of the group field.
	 */
	String getGroup();

	/**
	 * Getter for the divisor field.
	 * @return the value of the divisor field.
	 */
	long getDivisor();

	/**
	 * Setter for the loginId field.
	 * @param loginId the loginId value to set.
	 */
	void setLoginId(long loginId);

	/**
	 * Setter for the instanceId field.
	 * @param instanceId the instanceId value to set.
	 */
	void setInstanceId(int instanceId);

	/**
	 * Setter for the group field.
	 * @param group the group value to set.
	 */
	void setGroup(String group);

	/**
	 * Setter for the divisor field.
	 * @param divisor the divisor value to set.
	 */
	void setDivisor(long divisor);
}
