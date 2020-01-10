package com.turnengine.client.api.global.forum;

import com.robindrew.codegenerator.api.bean.IBean;

public interface IForumPost extends IBean, Comparable<IForumPost> {

	int SERIALIZATION_ID = 1413;

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
	 * Getter for the threadId field.
	 * @return the value of the threadId field.
	 */
	int getThreadId();

	/**
	 * Getter for the forumId field.
	 * @return the value of the forumId field.
	 */
	int getForumId();

	/**
	 * Getter for the date field.
	 * @return the value of the date field.
	 */
	int getDate();

	/**
	 * Getter for the lastEdited field.
	 * @return the value of the lastEdited field.
	 */
	int getLastEdited();

	/**
	 * Getter for the poster field.
	 * @return the value of the poster field.
	 */
	IForumUser getPoster();

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
	 * Getter for the deleted field.
	 * @return the value of the deleted field.
	 */
	boolean getDeleted();

	/**
	 * Setter for the id field.
	 * @param id the id value to set.
	 */
	void setId(int id);

	/**
	 * Setter for the threadId field.
	 * @param threadId the threadId value to set.
	 */
	void setThreadId(int threadId);

	/**
	 * Setter for the forumId field.
	 * @param forumId the forumId value to set.
	 */
	void setForumId(int forumId);

	/**
	 * Setter for the date field.
	 * @param date the date value to set.
	 */
	void setDate(int date);

	/**
	 * Setter for the lastEdited field.
	 * @param lastEdited the lastEdited value to set.
	 */
	void setLastEdited(int lastEdited);

	/**
	 * Setter for the poster field.
	 * @param poster the poster value to set.
	 */
	void setPoster(IForumUser poster);

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

	/**
	 * Setter for the deleted field.
	 * @param deleted the deleted value to set.
	 */
	void setDeleted(boolean deleted);
}
