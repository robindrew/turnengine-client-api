package com.turnengine.client.api.local.message;

import com.robindrew.codegenerator.api.executable.bean.IExecutableBean;
import com.turnengine.client.api.common.command.ILocalLoggedInBean;

public interface ISendMail extends IExecutableBean<Integer>, ILocalLoggedInBean<Integer>, Comparable<ISendMail> {

	int SERIALIZATION_ID = 2901;

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
	 * Getter for the content field.
	 * @return the value of the content field.
	 */
	String getContent();

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
	 * Setter for the content field.
	 * @param content the content value to set.
	 */
	void setContent(String content);
}
