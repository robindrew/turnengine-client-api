package com.turnengine.client.api.global.forum;

import com.robindrew.codegenerator.api.executable.bean.IExecutableBean;
import com.turnengine.client.api.common.command.IGlobalLoggedInBean;

public interface ISetForumOrder extends IExecutableBean<Boolean>, IGlobalLoggedInBean<Boolean>, Comparable<ISetForumOrder> {

	int SERIALIZATION_ID = 1404;

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
