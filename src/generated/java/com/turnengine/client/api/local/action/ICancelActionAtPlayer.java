package com.turnengine.client.api.local.action;

import com.robindrew.codegenerator.api.executable.bean.IExecutableBean;
import com.turnengine.client.api.common.command.ILocalLoggedInBean;

public interface ICancelActionAtPlayer extends IExecutableBean<Boolean>, ILocalLoggedInBean<Boolean>, Comparable<ICancelActionAtPlayer> {

	int SERIALIZATION_ID = 5024;

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
