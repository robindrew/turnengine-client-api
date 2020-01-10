package com.turnengine.client.api.local.player;

import com.robindrew.codegenerator.api.executable.bean.IExecutableBean;
import com.turnengine.client.api.common.command.ILocalLoggedInBean;

public interface IRenamePlayer extends IExecutableBean<Boolean>, ILocalLoggedInBean<Boolean>, Comparable<IRenamePlayer> {

	int SERIALIZATION_ID = 6011;

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
	 * Setter for the instanceId field.
	 * @param instanceId the instanceId value to set.
	 */
	void setInstanceId(int instanceId);

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
