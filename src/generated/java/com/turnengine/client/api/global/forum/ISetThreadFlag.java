package com.turnengine.client.api.global.forum;

import com.robindrew.codegenerator.api.executable.bean.IExecutableBean;
import com.turnengine.client.api.common.command.IGlobalLoggedInBean;

public interface ISetThreadFlag extends IExecutableBean<Boolean>, IGlobalLoggedInBean<Boolean>, Comparable<ISetThreadFlag> {

	int SERIALIZATION_ID = 4010;

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
	 * Getter for the threadId field.
	 * @return the value of the threadId field.
	 */
	int getThreadId();

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
	 * Setter for the threadId field.
	 * @param threadId the threadId value to set.
	 */
	void setThreadId(int threadId);

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
