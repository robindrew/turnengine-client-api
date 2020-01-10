package com.turnengine.client.api.global.user;

import com.robindrew.codegenerator.api.executable.bean.IExecutableBean;
import com.turnengine.client.api.common.command.IGlobalLoggedInBean;

public interface IRenameUser extends IExecutableBean<Boolean>, IGlobalLoggedInBean<Boolean>, Comparable<IRenameUser> {

	int SERIALIZATION_ID = 1705;

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
	 * Getter for the from field.
	 * @return the value of the from field.
	 */
	String getFrom();

	/**
	 * Getter for the to field.
	 * @return the value of the to field.
	 */
	String getTo();

	/**
	 * Setter for the loginId field.
	 * @param loginId the loginId value to set.
	 */
	void setLoginId(long loginId);

	/**
	 * Setter for the from field.
	 * @param from the from value to set.
	 */
	void setFrom(String from);

	/**
	 * Setter for the to field.
	 * @param to the to value to set.
	 */
	void setTo(String to);
}
