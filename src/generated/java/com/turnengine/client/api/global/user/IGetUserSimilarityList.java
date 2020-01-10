package com.turnengine.client.api.global.user;

import com.robindrew.codegenerator.api.executable.bean.IExecutableBean;
import com.turnengine.client.api.common.command.IGlobalLoggedInBean;
import java.util.List;

public interface IGetUserSimilarityList extends IExecutableBean<List<IUserSimilarity>>, IGlobalLoggedInBean<List<IUserSimilarity>>, Comparable<IGetUserSimilarityList> {

	int SERIALIZATION_ID = 1724;

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
	 * Getter for the order field.
	 * @return the value of the order field.
	 */
	UserSimilarityOrder getOrder();

	/**
	 * Getter for the threshold field.
	 * @return the value of the threshold field.
	 */
	int getThreshold();

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
	 * Setter for the order field.
	 * @param order the order value to set.
	 */
	void setOrder(UserSimilarityOrder order);

	/**
	 * Setter for the threshold field.
	 * @param threshold the threshold value to set.
	 */
	void setThreshold(int threshold);

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
