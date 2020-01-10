package com.turnengine.client.api.global.admin;

import com.robindrew.codegenerator.api.executable.bean.IExecutableBean;
import com.turnengine.client.api.common.command.IGlobalLoggedInBean;

public interface ISendEmail extends IExecutableBean<Boolean>, IGlobalLoggedInBean<Boolean>, Comparable<ISendEmail> {

	int SERIALIZATION_ID = 1002;

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
	 * Getter for the sender field.
	 * @return the value of the sender field.
	 */
	String getSender();

	/**
	 * Getter for the recipient field.
	 * @return the value of the recipient field.
	 */
	String getRecipient();

	/**
	 * Getter for the subject field.
	 * @return the value of the subject field.
	 */
	String getSubject();

	/**
	 * Getter for the body field.
	 * @return the value of the body field.
	 */
	String getBody();

	/**
	 * Setter for the loginId field.
	 * @param loginId the loginId value to set.
	 */
	void setLoginId(long loginId);

	/**
	 * Setter for the sender field.
	 * @param sender the sender value to set.
	 */
	void setSender(String sender);

	/**
	 * Setter for the recipient field.
	 * @param recipient the recipient value to set.
	 */
	void setRecipient(String recipient);

	/**
	 * Setter for the subject field.
	 * @param subject the subject value to set.
	 */
	void setSubject(String subject);

	/**
	 * Setter for the body field.
	 * @param body the body value to set.
	 */
	void setBody(String body);
}
