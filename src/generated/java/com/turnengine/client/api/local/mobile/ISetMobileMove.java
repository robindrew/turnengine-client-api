package com.turnengine.client.api.local.mobile;

import com.robindrew.codegenerator.api.executable.bean.IExecutableBean;
import com.turnengine.client.api.common.command.ILocalLoggedInBean;

public interface ISetMobileMove extends IExecutableBean<Boolean>, ILocalLoggedInBean<Boolean>, Comparable<ISetMobileMove> {

	int SERIALIZATION_ID = 5926;

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
	 * Getter for the originId field.
	 * @return the value of the originId field.
	 */
	int getOriginId();

	/**
	 * Getter for the destinationId field.
	 * @return the value of the destinationId field.
	 */
	int getDestinationId();

	/**
	 * Getter for the turns field.
	 * @return the value of the turns field.
	 */
	int getTurns();

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
	 * Setter for the originId field.
	 * @param originId the originId value to set.
	 */
	void setOriginId(int originId);

	/**
	 * Setter for the destinationId field.
	 * @param destinationId the destinationId value to set.
	 */
	void setDestinationId(int destinationId);

	/**
	 * Setter for the turns field.
	 * @param turns the turns value to set.
	 */
	void setTurns(int turns);
}
