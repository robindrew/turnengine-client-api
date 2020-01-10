package com.turnengine.client.api.global.user;

import com.robindrew.codegenerator.api.executable.bean.IExecutableBean;
import com.turnengine.client.api.common.command.IGlobalExecutableBean;

public interface ILoginUser extends IExecutableBean<Long>, IGlobalExecutableBean<Long>, Comparable<ILoginUser> {

	int SERIALIZATION_ID = 1704;

	/**
	 * Returns the serialization id.
	 * @return the serialization id.
	 */
	int getSerializationId();

	/**
	 * Getter for the nameOrEmail field.
	 * @return the value of the nameOrEmail field.
	 */
	String getNameOrEmail();

	/**
	 * Getter for the password field.
	 * @return the value of the password field.
	 */
	String getPassword();

	/**
	 * Getter for the address field.
	 * @return the value of the address field.
	 */
	String getAddress();

	/**
	 * Setter for the nameOrEmail field.
	 * @param nameOrEmail the nameOrEmail value to set.
	 */
	void setNameOrEmail(String nameOrEmail);

	/**
	 * Setter for the password field.
	 * @param password the password value to set.
	 */
	void setPassword(String password);

	/**
	 * Setter for the address field.
	 * @param address the address value to set.
	 */
	void setAddress(String address);
}
