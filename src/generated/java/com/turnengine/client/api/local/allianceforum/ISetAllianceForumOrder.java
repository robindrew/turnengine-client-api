package com.turnengine.client.api.local.allianceforum;

import com.robindrew.codegenerator.api.executable.bean.IExecutableBean;
import com.turnengine.client.api.common.command.ILocalLoggedInBean;

public interface ISetAllianceForumOrder extends IExecutableBean<Boolean>, ILocalLoggedInBean<Boolean>, Comparable<ISetAllianceForumOrder> {

	int SERIALIZATION_ID = 5204;

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
	 * Getter for the forumId field.
	 * @return the value of the forumId field.
	 */
	int getForumId();

	/**
	 * Getter for the order field.
	 * @return the value of the order field.
	 */
	int getOrder();

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
	 * Setter for the forumId field.
	 * @param forumId the forumId value to set.
	 */
	void setForumId(int forumId);

	/**
	 * Setter for the order field.
	 * @param order the order value to set.
	 */
	void setOrder(int order);
}
