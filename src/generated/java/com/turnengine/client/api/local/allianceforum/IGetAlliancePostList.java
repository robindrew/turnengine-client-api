package com.turnengine.client.api.local.allianceforum;

import com.robindrew.codegenerator.api.executable.bean.IExecutableBean;
import com.turnengine.client.api.common.command.ILocalLoggedInBean;
import java.util.List;

public interface IGetAlliancePostList extends IExecutableBean<List<IAllianceForumPost>>, ILocalLoggedInBean<List<IAllianceForumPost>>, Comparable<IGetAlliancePostList> {

	int SERIALIZATION_ID = 2212;

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
	 * Setter for the instanceId field.
	 * @param instanceId the instanceId value to set.
	 */
	void setInstanceId(int instanceId);

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
