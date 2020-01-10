package com.turnengine.client.api.local.message;

import com.robindrew.codegenerator.api.bean.IBean;
import com.turnengine.client.api.local.player.IPlayerInfo;

public interface IMessage extends IBean, Comparable<IMessage> {

	int SERIALIZATION_ID = 5808;

	/**
	 * Returns the serialization id.
	 * @return the serialization id.
	 */
	int getSerializationId();

	/**
	 * Getter for the id field.
	 * @return the value of the id field.
	 */
	int getId();

	/**
	 * Getter for the sender field.
	 * @return the value of the sender field.
	 */
	IPlayerInfo getSender();

	/**
	 * Getter for the recipient field.
	 * @return the value of the recipient field.
	 */
	IPlayerInfo getRecipient();

	/**
	 * Getter for the subject field.
	 * @return the value of the subject field.
	 */
	String getSubject();

	/**
	 * Getter for the threadId field.
	 * @return the value of the threadId field.
	 */
	int getThreadId();

	/**
	 * Getter for the format field.
	 * @return the value of the format field.
	 */
	String getFormat();

	/**
	 * Getter for the count field.
	 * @return the value of the count field.
	 */
	int getCount();

	/**
	 * Getter for the timestamp field.
	 * @return the value of the timestamp field.
	 */
	long getTimestamp();

	/**
	 * Getter for the status field.
	 * @return the value of the status field.
	 */
	MessageStatus getStatus();

	/**
	 * Getter for the type field.
	 * @return the value of the type field.
	 */
	MessageType getType();

	/**
	 * Getter for the locationId field.
	 * @return the value of the locationId field.
	 */
	int getLocationId();

	/**
	 * Getter for the mobileId field.
	 * @return the value of the mobileId field.
	 */
	int getMobileId();

	/**
	 * Getter for the content field.
	 * @return the value of the content field.
	 */
	String getContent();

	/**
	 * Setter for the id field.
	 * @param id the id value to set.
	 */
	void setId(int id);

	/**
	 * Setter for the sender field.
	 * @param sender the sender value to set.
	 */
	void setSender(IPlayerInfo sender);

	/**
	 * Setter for the recipient field.
	 * @param recipient the recipient value to set.
	 */
	void setRecipient(IPlayerInfo recipient);

	/**
	 * Setter for the subject field.
	 * @param subject the subject value to set.
	 */
	void setSubject(String subject);

	/**
	 * Setter for the threadId field.
	 * @param threadId the threadId value to set.
	 */
	void setThreadId(int threadId);

	/**
	 * Setter for the format field.
	 * @param format the format value to set.
	 */
	void setFormat(String format);

	/**
	 * Setter for the count field.
	 * @param count the count value to set.
	 */
	void setCount(int count);

	/**
	 * Setter for the timestamp field.
	 * @param timestamp the timestamp value to set.
	 */
	void setTimestamp(long timestamp);

	/**
	 * Setter for the status field.
	 * @param status the status value to set.
	 */
	void setStatus(MessageStatus status);

	/**
	 * Setter for the type field.
	 * @param type the type value to set.
	 */
	void setType(MessageType type);

	/**
	 * Setter for the locationId field.
	 * @param locationId the locationId value to set.
	 */
	void setLocationId(int locationId);

	/**
	 * Setter for the mobileId field.
	 * @param mobileId the mobileId value to set.
	 */
	void setMobileId(int mobileId);

	/**
	 * Setter for the content field.
	 * @param content the content value to set.
	 */
	void setContent(String content);
}
