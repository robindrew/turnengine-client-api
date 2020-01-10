package com.turnengine.client.api.global.error;

import com.robindrew.codegenerator.api.executable.bean.IExecutableBean;
import com.turnengine.client.api.common.command.IGlobalLoggedInBean;
import com.turnengine.client.api.local.error.ILocalTrace;

public interface IGetCommandStackTrace extends IExecutableBean<ILocalTrace>, IGlobalLoggedInBean<ILocalTrace>, Comparable<IGetCommandStackTrace> {

	int SERIALIZATION_ID = 1301;

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
	long getId();

	/**
	 * Setter for the loginId field.
	 * @param loginId the loginId value to set.
	 */
	void setLoginId(long loginId);

	/**
	 * Setter for the id field.
	 * @param id the id value to set.
	 */
	void setId(long id);
}
