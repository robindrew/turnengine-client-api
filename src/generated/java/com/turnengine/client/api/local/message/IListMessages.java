package com.turnengine.client.api.local.message;

import com.robindrew.codegenerator.api.executable.bean.IExecutableBean;
import com.turnengine.client.api.common.command.ILocalLoggedInBean;

public interface IListMessages extends IExecutableBean<IMessageList>, ILocalLoggedInBean<IMessageList>, Comparable<IListMessages> {

	int SERIALIZATION_ID = 5804;

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
	 * Getter for the type field.
	 * @return the value of the type field.
	 */
	MessageType getType();

	/**
	 * Getter for the includeContent field.
	 * @return the value of the includeContent field.
	 */
	boolean getIncludeContent();

	/**
	 * Getter for the pageNumber field.
	 * @return the value of the pageNumber field.
	 */
	int getPageNumber();

	/**
	 * Getter for the pageSize field.
	 * @return the value of the pageSize field.
	 */
	int getPageSize();

	/**
	 * Getter for the mobileId field.
	 * @return the value of the mobileId field.
	 */
	int getMobileId();

	/**
	 * Getter for the locationId field.
	 * @return the value of the locationId field.
	 */
	int getLocationId();

	/**
	 * Getter for the format field.
	 * @return the value of the format field.
	 */
	String getFormat();

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
	 * Setter for the type field.
	 * @param type the type value to set.
	 */
	void setType(MessageType type);

	/**
	 * Setter for the includeContent field.
	 * @param includeContent the includeContent value to set.
	 */
	void setIncludeContent(boolean includeContent);

	/**
	 * Setter for the pageNumber field.
	 * @param pageNumber the pageNumber value to set.
	 */
	void setPageNumber(int pageNumber);

	/**
	 * Setter for the pageSize field.
	 * @param pageSize the pageSize value to set.
	 */
	void setPageSize(int pageSize);

	/**
	 * Setter for the mobileId field.
	 * @param mobileId the mobileId value to set.
	 */
	void setMobileId(int mobileId);

	/**
	 * Setter for the locationId field.
	 * @param locationId the locationId value to set.
	 */
	void setLocationId(int locationId);

	/**
	 * Setter for the format field.
	 * @param format the format value to set.
	 */
	void setFormat(String format);
}
