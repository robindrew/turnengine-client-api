package com.turnengine.client.api.local.allianceforum;

import com.robindrew.codegenerator.api.bean.IBean;
import java.util.List;

public interface IAllianceForum extends IBean, Comparable<IAllianceForum> {

	int SERIALIZATION_ID = 5214;

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
	 * Getter for the name field.
	 * @return the value of the name field.
	 */
	String getName();

	/**
	 * Getter for the order field.
	 * @return the value of the order field.
	 */
	int getOrder();

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
	 * Getter for the threads field.
	 * @return the value of the threads field.
	 */
	int getThreads();

	/**
	 * Getter for the posts field.
	 * @return the value of the posts field.
	 */
	int getPosts();

	/**
	 * Getter for the forumList field.
	 * @return the value of the forumList field.
	 */
	List<IAllianceForum> getForumList();

	/**
	 * Getter for the threadList field.
	 * @return the value of the threadList field.
	 */
	List<IAllianceForumThread> getThreadList();

	/**
	 * Setter for the id field.
	 * @param id the id value to set.
	 */
	void setId(int id);

	/**
	 * Setter for the name field.
	 * @param name the name value to set.
	 */
	void setName(String name);

	/**
	 * Setter for the order field.
	 * @param order the order value to set.
	 */
	void setOrder(int order);

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
	 * Setter for the threads field.
	 * @param threads the threads value to set.
	 */
	void setThreads(int threads);

	/**
	 * Setter for the posts field.
	 * @param posts the posts value to set.
	 */
	void setPosts(int posts);

	/**
	 * Setter for the forumList field.
	 * @param forumList the forumList value to set.
	 */
	void setForumList(List<IAllianceForum> forumList);

	/**
	 * Setter for the threadList field.
	 * @param threadList the threadList value to set.
	 */
	void setThreadList(List<IAllianceForumThread> threadList);
}
