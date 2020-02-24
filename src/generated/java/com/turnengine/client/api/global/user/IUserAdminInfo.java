package com.turnengine.client.api.global.user;

import com.robindrew.codegenerator.api.bean.IBean;
import java.util.List;

public interface IUserAdminInfo extends IBean, Comparable<IUserAdminInfo> {

	int SERIALIZATION_ID = 1735;

	/**
	 * Returns the serialization id.
	 * @return the serialization id.
	 */
	int getSerializationId();

	/**
	 * Getter for the user field.
	 * @return the value of the user field.
	 */
	IUser getUser();

	/**
	 * Getter for the addresses field.
	 * @return the value of the addresses field.
	 */
	List<IUserAddressCode> getAddresses();

	/**
	 * Setter for the user field.
	 * @param user the user value to set.
	 */
	void setUser(IUser user);

	/**
	 * Setter for the addresses field.
	 * @param addresses the addresses value to set.
	 */
	void setAddresses(List<IUserAddressCode> addresses);
}
