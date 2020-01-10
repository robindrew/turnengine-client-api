package com.turnengine.client.api.global.announcement;

import com.robindrew.codegenerator.api.executable.bean.IExecutableBean;
import com.turnengine.client.api.common.command.IGlobalLoggedInBean;

public interface IDeleteAnnouncement extends IExecutableBean<Boolean>, IGlobalLoggedInBean<Boolean>, Comparable<IDeleteAnnouncement> {

	int SERIALIZATION_ID = 1104;

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
	 * Getter for the id field.
	 * @return the value of the id field.
	 */
	int getId();

	/**
	 * Setter for the loginId field.
	 * @param loginId the loginId value to set.
	 */
	void setLoginId(long loginId);

	/**
	 * Setter for the id field.
	 * @param id the id value to set.
	 */
	void setId(int id);
}
