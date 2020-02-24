package com.turnengine.client.api.global.user;

import com.robindrew.codegenerator.api.executable.bean.IExecutableBean;
import com.turnengine.client.api.common.command.IGlobalLoggedInBean;
import java.util.List;

public interface IGetUserList extends IExecutableBean<List<IUser>>, IGlobalLoggedInBean<List<IUser>>, Comparable<IGetUserList> {

	int SERIALIZATION_ID = 1733;

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
	 * Setter for the loginId field.
	 * @param loginId the loginId value to set.
	 */
	void setLoginId(long loginId);
}
