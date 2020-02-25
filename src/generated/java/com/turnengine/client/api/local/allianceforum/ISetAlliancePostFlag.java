package com.turnengine.client.api.local.allianceforum;

import com.robindrew.codegenerator.api.executable.bean.IExecutableBean;
import com.turnengine.client.api.common.command.ILocalLoggedInBean;
import com.turnengine.client.api.global.forum.ForumFlag;

public interface ISetAlliancePostFlag extends IExecutableBean<Boolean>, ILocalLoggedInBean<Boolean>, Comparable<ISetAlliancePostFlag> {

	int SERIALIZATION_ID = 2211;

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
	 * Getter for the postId field.
	 * @return the value of the postId field.
	 */
	int getPostId();

	/**
	 * Getter for the flag field.
	 * @return the value of the flag field.
	 */
	ForumFlag getFlag();

	/**
	 * Getter for the set field.
	 * @return the value of the set field.
	 */
	boolean getSet();

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
	 * Setter for the postId field.
	 * @param postId the postId value to set.
	 */
	void setPostId(int postId);

	/**
	 * Setter for the flag field.
	 * @param flag the flag value to set.
	 */
	void setFlag(ForumFlag flag);

	/**
	 * Setter for the set field.
	 * @param set the set value to set.
	 */
	void setSet(boolean set);
}
