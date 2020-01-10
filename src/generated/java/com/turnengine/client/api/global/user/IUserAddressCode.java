package com.turnengine.client.api.global.user;

import com.robindrew.codegenerator.api.bean.IBean;
import com.turnengine.client.api.global.admin.IAdminHostAddress;

public interface IUserAddressCode extends IBean, Comparable<IUserAddressCode> {

	int SERIALIZATION_ID = 1733;

	/**
	 * Returns the serialization id.
	 * @return the serialization id.
	 */
	int getSerializationId();

	/**
	 * Getter for the userId field.
	 * @return the value of the userId field.
	 */
	int getUserId();

	/**
	 * Getter for the code field.
	 * @return the value of the code field.
	 */
	String getCode();

	/**
	 * Getter for the timestamp field.
	 * @return the value of the timestamp field.
	 */
	long getTimestamp();

	/**
	 * Getter for the detail field.
	 * @return the value of the detail field.
	 */
	IAdminHostAddress getDetail();

	/**
	 * Setter for the userId field.
	 * @param userId the userId value to set.
	 */
	void setUserId(int userId);

	/**
	 * Setter for the code field.
	 * @param code the code value to set.
	 */
	void setCode(String code);

	/**
	 * Setter for the timestamp field.
	 * @param timestamp the timestamp value to set.
	 */
	void setTimestamp(long timestamp);

	/**
	 * Setter for the detail field.
	 * @param detail the detail value to set.
	 */
	void setDetail(IAdminHostAddress detail);
}
