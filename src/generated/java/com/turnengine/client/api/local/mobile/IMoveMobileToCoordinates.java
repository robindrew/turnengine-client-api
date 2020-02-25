package com.turnengine.client.api.local.mobile;

import com.robindrew.codegenerator.api.executable.bean.IExecutableBean;
import com.turnengine.client.api.common.command.ILocalLoggedInBean;

public interface IMoveMobileToCoordinates extends IExecutableBean<Boolean>, ILocalLoggedInBean<Boolean>, Comparable<IMoveMobileToCoordinates> {

	int SERIALIZATION_ID = 3010;

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
	 * Getter for the mobileId field.
	 * @return the value of the mobileId field.
	 */
	int getMobileId();

	/**
	 * Getter for the coordinates field.
	 * @return the value of the coordinates field.
	 */
	int[] getCoordinates();

	/**
	 * Getter for the addToQueue field.
	 * @return the value of the addToQueue field.
	 */
	boolean getAddToQueue();

	/**
	 * Getter for the repeat field.
	 * @return the value of the repeat field.
	 */
	boolean getRepeat();

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
	 * Setter for the mobileId field.
	 * @param mobileId the mobileId value to set.
	 */
	void setMobileId(int mobileId);

	/**
	 * Setter for the coordinates field.
	 * @param coordinates the coordinates value to set.
	 */
	void setCoordinates(int[] coordinates);

	/**
	 * Setter for the addToQueue field.
	 * @param addToQueue the addToQueue value to set.
	 */
	void setAddToQueue(boolean addToQueue);

	/**
	 * Setter for the repeat field.
	 * @param repeat the repeat value to set.
	 */
	void setRepeat(boolean repeat);
}
