package com.turnengine.client.api.local.location;

import com.robindrew.codegenerator.api.executable.bean.IExecutableBean;
import com.turnengine.client.api.common.command.ILocalLoggedInBean;

public interface IGetGridInfoList extends IExecutableBean<IGridInfo>, ILocalLoggedInBean<IGridInfo>, Comparable<IGetGridInfoList> {

	int SERIALIZATION_ID = 5715;

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
	 * Getter for the coordinates field.
	 * @return the value of the coordinates field.
	 */
	int[] getCoordinates();

	/**
	 * Getter for the depth field.
	 * @return the value of the depth field.
	 */
	int getDepth();

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
	 * Setter for the coordinates field.
	 * @param coordinates the coordinates value to set.
	 */
	void setCoordinates(int[] coordinates);

	/**
	 * Setter for the depth field.
	 * @param depth the depth value to set.
	 */
	void setDepth(int depth);
}
