package com.turnengine.client.api.global.user;

import com.robindrew.codegenerator.api.executable.bean.IExecutableBean;
import com.turnengine.client.api.common.command.IGlobalLoggedInBean;

public interface ISetSignupVerification extends IExecutableBean<Boolean>, IGlobalLoggedInBean<Boolean>, Comparable<ISetSignupVerification> {

	int SERIALIZATION_ID = 1716;

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
	 * Getter for the enabled field.
	 * @return the value of the enabled field.
	 */
	Boolean getEnabled();

	/**
	 * Setter for the loginId field.
	 * @param loginId the loginId value to set.
	 */
	void setLoginId(long loginId);

	/**
	 * Setter for the enabled field.
	 * @param enabled the enabled value to set.
	 */
	void setEnabled(Boolean enabled);
}
