package com.turnengine.client.api.global.error;

import com.robindrew.codegenerator.api.executable.bean.IExecutableBean;
import com.turnengine.client.api.common.command.IGlobalLoggedInBean;
import com.turnengine.client.api.local.error.ILocalTrace;
import java.util.List;

public interface IGetCommandStackTraceList extends IExecutableBean<List<ILocalTrace>>, IGlobalLoggedInBean<List<ILocalTrace>>, Comparable<IGetCommandStackTraceList> {

	int SERIALIZATION_ID = 1302;

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
	long getFrom();

	/**
	 * Getter for the to field.
	 * @return the value of the to field.
	 */
	long getTo();

	/**
	 * Setter for the loginId field.
	 * @param loginId the loginId value to set.
	 */
	void setLoginId(long loginId);

	/**
	 * Setter for the from field.
	 * @param from the from value to set.
	 */
	void setFrom(long from);

	/**
	 * Setter for the to field.
	 * @param to the to value to set.
	 */
	void setTo(long to);
}
