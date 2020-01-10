package com.turnengine.client.api.global.forum;

import com.robindrew.codegenerator.api.bean.IBean;
import java.util.List;

public interface IForumThread extends IBean, Comparable<IForumThread> {

	int SERIALIZATION_ID = 1412;

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
	 * Getter for the lastUpdated field.
	 * @return the value of the lastUpdated field.
	 */
	int getLastUpdated();

	/**
	 * Getter for the subject field.
	 * @return the value of the subject field.
	 */
	String getSubject();

	/**
	 * Getter for the poster field.
	 * @return the value of the poster field.
	 */
	IForumUser getPoster();

	/**
	 * Getter for the sticky field.
	 * @return the value of the sticky field.
	 */
	boolean getSticky();

	/**
	 * Getter for the locked field.
	 * @return the value of the locked field.
	 */
	boolean getLocked();

	/**
	 * Getter for the archived field.
	 * @return the value of the archived field.
	 */
	boolean getArchived();

	/**
	 * Getter for the deleted field.
	 * @return the value of the deleted field.
	 */
	boolean getDeleted();

	/**
	 * Getter for the postList field.
	 * @return the value of the postList field.
	 */
	List<IForumPost> getPostList();

	/**
	 * Setter for the id field.
	 * @param id the id value to set.
	 */
	void setId(int id);

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
	 * Setter for the lastUpdated field.
	 * @param lastUpdated the lastUpdated value to set.
	 */
	void setLastUpdated(int lastUpdated);

	/**
	 * Setter for the subject field.
	 * @param subject the subject value to set.
	 */
	void setSubject(String subject);

	/**
	 * Setter for the poster field.
	 * @param poster the poster value to set.
	 */
	void setPoster(IForumUser poster);

	/**
	 * Setter for the sticky field.
	 * @param sticky the sticky value to set.
	 */
	void setSticky(boolean sticky);

	/**
	 * Setter for the locked field.
	 * @param locked the locked value to set.
	 */
	void setLocked(boolean locked);

	/**
	 * Setter for the archived field.
	 * @param archived the archived value to set.
	 */
	void setArchived(boolean archived);

	/**
	 * Setter for the deleted field.
	 * @param deleted the deleted value to set.
	 */
	void setDeleted(boolean deleted);

	/**
	 * Setter for the postList field.
	 * @param postList the postList value to set.
	 */
	void setPostList(List<IForumPost> postList);
}
