package com.turnengine.client.api.global.user;

import com.robindrew.codegenerator.api.executable.bean.IExecutableBean;
import com.turnengine.client.api.common.command.IGlobalLoggedInBean;

public interface ISetUserAvatar extends IExecutableBean<Boolean>, IGlobalLoggedInBean<Boolean>, Comparable<ISetUserAvatar> {

	int SERIALIZATION_ID = 1727;

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
	 * Getter for the image field.
	 * @return the value of the image field.
	 */
	byte[] getImage();

	/**
	 * Setter for the loginId field.
	 * @param loginId the loginId value to set.
	 */
	void setLoginId(long loginId);

	/**
	 * Setter for the image field.
	 * @param image the image value to set.
	 */
	void setImage(byte[] image);
}
