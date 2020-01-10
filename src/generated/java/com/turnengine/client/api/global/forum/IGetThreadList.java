package com.turnengine.client.api.global.forum;

import com.robindrew.codegenerator.api.executable.bean.IExecutableBean;
import com.turnengine.client.api.common.command.IGlobalLoggedInBean;
import java.util.List;

public interface IGetThreadList extends IExecutableBean<List<IForumThread>>, IGlobalLoggedInBean<List<IForumThread>>, Comparable<IGetThreadList> {

	int SERIALIZATION_ID = 1406;

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
	 * Setter for the forumId field.
	 * @param forumId the forumId value to set.
	 */
	void setForumId(int forumId);

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
