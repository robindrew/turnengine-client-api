package com.turnengine.client.api.local.score;

import com.robindrew.codegenerator.api.executable.bean.IExecutableBean;
import com.turnengine.client.api.common.command.ILocalLoggedInBean;

public interface IGetScoreDivisor extends IExecutableBean<Long>, ILocalLoggedInBean<Long>, Comparable<IGetScoreDivisor> {

	int SERIALIZATION_ID = 6210;

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
	 * Getter for the groupId field.
	 * @return the value of the groupId field.
	 */
	int getGroupId();

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
	 * Setter for the groupId field.
	 * @param groupId the groupId value to set.
	 */
	void setGroupId(int groupId);
}
