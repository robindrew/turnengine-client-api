package com.turnengine.client.api.global.forum;

import com.robindrew.codegenerator.api.executable.bean.IExecutableBean;
import com.turnengine.client.api.common.command.IGlobalLoggedInBean;
import java.util.List;

public interface IGetForumList extends IExecutableBean<List<IForum>>, IGlobalLoggedInBean<List<IForum>>, Comparable<IGetForumList> {

	int SERIALIZATION_ID = 1405;

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
