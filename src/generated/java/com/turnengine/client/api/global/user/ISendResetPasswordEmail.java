package com.turnengine.client.api.global.user;

import com.robindrew.codegenerator.api.executable.bean.IExecutableBean;
import com.turnengine.client.api.common.command.IGlobalExecutableBean;

public interface ISendResetPasswordEmail extends IExecutableBean<Boolean>, IGlobalExecutableBean<Boolean>, Comparable<ISendResetPasswordEmail> {

	int SERIALIZATION_ID = 1729;

	/**
	 * Returns the serialization id.
	 * @return the serialization id.
	 */
	int getSerializationId();

	/**
	 * Getter for the email field.
	 * @return the value of the email field.
	 */
	String getEmail();

	/**
	 * Setter for the email field.
	 * @param email the email value to set.
	 */
	void setEmail(String email);
}
