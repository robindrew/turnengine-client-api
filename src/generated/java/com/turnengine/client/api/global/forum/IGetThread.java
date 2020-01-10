package com.turnengine.client.api.global.forum;

import com.robindrew.codegenerator.api.executable.bean.IExecutableBean;
import com.turnengine.client.api.common.command.IGlobalLoggedInBean;

public interface IGetThread extends IExecutableBean<IForumThread>, IGlobalLoggedInBean<IForumThread>, Comparable<IGetThread> {

	int SERIALIZATION_ID = 1407;

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
	 * Setter for the loginId field.
	 * @param loginId the loginId value to set.
	 */
	void setLoginId(long loginId);

	/**
	 * Setter for the threadId field.
	 * @param threadId the threadId value to set.
	 */
	void setThreadId(int threadId);
}
