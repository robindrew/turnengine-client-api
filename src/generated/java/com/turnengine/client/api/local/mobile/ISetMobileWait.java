package com.turnengine.client.api.local.mobile;

import com.robindrew.codegenerator.api.executable.bean.IExecutableBean;
import com.turnengine.client.api.common.command.ILocalLoggedInBean;

public interface ISetMobileWait extends IExecutableBean<Boolean>, ILocalLoggedInBean<Boolean>, Comparable<ISetMobileWait> {

	int SERIALIZATION_ID = 3025;

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
	 * Setter for the turns field.
	 * @param turns the turns value to set.
	 */
	void setTurns(int turns);
}
