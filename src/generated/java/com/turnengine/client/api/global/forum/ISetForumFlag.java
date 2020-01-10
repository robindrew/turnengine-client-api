package com.turnengine.client.api.global.forum;

import com.robindrew.codegenerator.api.executable.bean.IExecutableBean;
import com.turnengine.client.api.common.command.IGlobalLoggedInBean;

public interface ISetForumFlag extends IExecutableBean<Boolean>, IGlobalLoggedInBean<Boolean>, Comparable<ISetForumFlag> {

	int SERIALIZATION_ID = 1409;

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
	 * Getter for the flag field.
	 * @return the value of the flag field.
	 */
	ForumFlag getFlag();

	/**
	 * Getter for the set field.
	 * @return the value of the set field.
	 */
	boolean getSet();

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
	 * Setter for the flag field.
	 * @param flag the flag value to set.
	 */
	void setFlag(ForumFlag flag);

	/**
	 * Setter for the set field.
	 * @param set the set value to set.
	 */
	void setSet(boolean set);
}
