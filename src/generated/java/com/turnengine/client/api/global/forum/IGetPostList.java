package com.turnengine.client.api.global.forum;

import com.robindrew.codegenerator.api.executable.bean.IExecutableBean;
import com.turnengine.client.api.common.command.IGlobalLoggedInBean;
import java.util.List;

public interface IGetPostList extends IExecutableBean<List<IForumPost>>, IGlobalLoggedInBean<List<IForumPost>>, Comparable<IGetPostList> {

	int SERIALIZATION_ID = 4012;

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
	 * Getter for the pageNumber field.
	 * @return the value of the pageNumber field.
	 */
	int getPageNumber();

	/**
	 * Getter for the pageSize field.
	 * @return the value of the pageSize field.
	 */
	int getPageSize();

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
	 * Setter for the pageNumber field.
	 * @param pageNumber the pageNumber value to set.
	 */
	void setPageNumber(int pageNumber);

	/**
	 * Setter for the pageSize field.
	 * @param pageSize the pageSize value to set.
	 */
	void setPageSize(int pageSize);
}
