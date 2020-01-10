package com.turnengine.client.api.global.forum;

import com.robindrew.codegenerator.api.executable.bean.IExecutableBean;
import com.turnengine.client.api.common.command.IGlobalLoggedInBean;

public interface IEditPost extends IExecutableBean<IForumPost>, IGlobalLoggedInBean<IForumPost>, Comparable<IEditPost> {

	int SERIALIZATION_ID = 1408;

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
	 * Getter for the postId field.
	 * @return the value of the postId field.
	 */
	int getPostId();

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
	 * Setter for the postId field.
	 * @param postId the postId value to set.
	 */
	void setPostId(int postId);

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
