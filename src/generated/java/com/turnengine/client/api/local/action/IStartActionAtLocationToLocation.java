package com.turnengine.client.api.local.action;

import com.robindrew.codegenerator.api.executable.bean.IExecutableBean;
import com.turnengine.client.api.common.command.ILocalLoggedInBean;

public interface IStartActionAtLocationToLocation extends IExecutableBean<IActionStatus>, ILocalLoggedInBean<IActionStatus>, Comparable<IStartActionAtLocationToLocation> {

	int SERIALIZATION_ID = 5022;

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
	 * Getter for the fromLocationId field.
	 * @return the value of the fromLocationId field.
	 */
	int getFromLocationId();

	/**
	 * Getter for the toLocationId field.
	 * @return the value of the toLocationId field.
	 */
	int getToLocationId();

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
	 * Getter for the addToQueue field.
	 * @return the value of the addToQueue field.
	 */
	boolean getAddToQueue();

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
	 * Setter for the fromLocationId field.
	 * @param fromLocationId the fromLocationId value to set.
	 */
	void setFromLocationId(int fromLocationId);

	/**
	 * Setter for the toLocationId field.
	 * @param toLocationId the toLocationId value to set.
	 */
	void setToLocationId(int toLocationId);

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

	/**
	 * Setter for the addToQueue field.
	 * @param addToQueue the addToQueue value to set.
	 */
	void setAddToQueue(boolean addToQueue);
}
