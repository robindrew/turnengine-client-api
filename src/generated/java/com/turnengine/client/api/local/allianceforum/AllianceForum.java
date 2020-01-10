package com.turnengine.client.api.local.allianceforum;

import java.util.List;
import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class AllianceForum implements IAllianceForum {

	/** The id field. */
	private int id = 0;
	/** The name field. */
	private String name = null;
	/** The order field. */
	private int order = 0;
	/** The locked field. */
	private boolean locked = false;
	/** The archived field. */
	private boolean archived = false;
	/** The deleted field. */
	private boolean deleted = false;
	/** The threads field. */
	private int threads = 0;
	/** The posts field. */
	private int posts = 0;
	/** The forumList field. */
	private List<IAllianceForum> forumList = null;
	/** The threadList field. */
	private List<IAllianceForumThread> threadList = null;

	/**
	 * The empty constructor.
	 */
	public AllianceForum() {
	}

	/**
	 * The fields constructor.
	 */
	public AllianceForum(int id, String name, int order, boolean locked, boolean archived, boolean deleted, int threads, int posts, List<IAllianceForum> forumList, List<IAllianceForumThread> threadList) {
		setId(id);
		setName(name);
		setOrder(order);
		setLocked(locked);
		setArchived(archived);
		setDeleted(deleted);
		setThreads(threads);
		setPosts(posts);
		setForumList(forumList);
		setThreadList(threadList);
	}

	/**
	 * The clone constructor.
	 */
	public AllianceForum(IAllianceForum clone) {
		setId(clone.getId());
		setName(clone.getName());
		setOrder(clone.getOrder());
		setLocked(clone.getLocked());
		setArchived(clone.getArchived());
		setDeleted(clone.getDeleted());
		setThreads(clone.getThreads());
		setPosts(clone.getPosts());
		setForumList(clone.getForumList());
		setThreadList(clone.getThreadList());
	}

	/**
	 * Returns the serialization id.
	 * @return the serialization id.
	 */
	@Override
	public int getSerializationId() {
		return SERIALIZATION_ID;
	}

	/**
	 * Getter for the id field.
	 * @return the value of the id field.
	 */
	@Override
	public int getId() {
		return id;
	}

	/**
	 * Getter for the name field.
	 * @return the value of the name field.
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * Getter for the order field.
	 * @return the value of the order field.
	 */
	@Override
	public int getOrder() {
		return order;
	}

	/**
	 * Getter for the locked field.
	 * @return the value of the locked field.
	 */
	@Override
	public boolean getLocked() {
		return locked;
	}

	/**
	 * Getter for the archived field.
	 * @return the value of the archived field.
	 */
	@Override
	public boolean getArchived() {
		return archived;
	}

	/**
	 * Getter for the deleted field.
	 * @return the value of the deleted field.
	 */
	@Override
	public boolean getDeleted() {
		return deleted;
	}

	/**
	 * Getter for the threads field.
	 * @return the value of the threads field.
	 */
	@Override
	public int getThreads() {
		return threads;
	}

	/**
	 * Getter for the posts field.
	 * @return the value of the posts field.
	 */
	@Override
	public int getPosts() {
		return posts;
	}

	/**
	 * Getter for the forumList field.
	 * @return the value of the forumList field.
	 */
	@Override
	public List<IAllianceForum> getForumList() {
		return forumList;
	}

	/**
	 * Getter for the threadList field.
	 * @return the value of the threadList field.
	 */
	@Override
	public List<IAllianceForumThread> getThreadList() {
		return threadList;
	}

	/**
	 * Setter for the id field.
	 * @param id the id value to set.
	 */
	@Override
	public void setId(int id) {
		if (id < -1) {
			throw new IllegalArgumentException("id too small, minimum of -1, value: '" + id + "'");
		}
		this.id = id;
	}

	/**
	 * Setter for the name field.
	 * @param name the name value to set.
	 */
	@Override
	public void setName(String name) {
		if (name == null) {
			throw new NullPointerException("name");
		}
		if (name.length() < 1) {
			throw new IllegalArgumentException("name too short, minimum of 1 characters, value: '" + name + "'");
		}
		if (name.length() > 500) {
			throw new IllegalArgumentException("name too long, maximum of 500 characters, value: '" + name + "'");
		}
		this.name = name;
	}

	/**
	 * Setter for the order field.
	 * @param order the order value to set.
	 */
	@Override
	public void setOrder(int order) {
		if (order < 0) {
			throw new IllegalArgumentException("order too small, minimum of 0, value: '" + order + "'");
		}
		this.order = order;
	}

	/**
	 * Setter for the locked field.
	 * @param locked the locked value to set.
	 */
	@Override
	public void setLocked(boolean locked) {
		this.locked = locked;
	}

	/**
	 * Setter for the archived field.
	 * @param archived the archived value to set.
	 */
	@Override
	public void setArchived(boolean archived) {
		this.archived = archived;
	}

	/**
	 * Setter for the deleted field.
	 * @param deleted the deleted value to set.
	 */
	@Override
	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	/**
	 * Setter for the threads field.
	 * @param threads the threads value to set.
	 */
	@Override
	public void setThreads(int threads) {
		if (threads < 0) {
			throw new IllegalArgumentException("threads too small, minimum of 0, value: '" + threads + "'");
		}
		this.threads = threads;
	}

	/**
	 * Setter for the posts field.
	 * @param posts the posts value to set.
	 */
	@Override
	public void setPosts(int posts) {
		if (posts < 0) {
			throw new IllegalArgumentException("posts too small, minimum of 0, value: '" + posts + "'");
		}
		this.posts = posts;
	}

	/**
	 * Setter for the forumList field.
	 * @param forumList the forumList value to set.
	 */
	@Override
	public void setForumList(List<IAllianceForum> forumList) {
		this.forumList = forumList;
	}

	/**
	 * Setter for the threadList field.
	 * @param threadList the threadList value to set.
	 */
	@Override
	public void setThreadList(List<IAllianceForumThread> threadList) {
		this.threadList = threadList;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getId());
		builder.append(getName());
		builder.append(getOrder());
		builder.append(getLocked());
		builder.append(getArchived());
		builder.append(getDeleted());
		builder.append(getThreads());
		builder.append(getPosts());
		builder.append(getForumList());
		builder.append(getThreadList());
		return builder.toHashCode();
	}

	@Override
	public boolean equals(Object object) {
		// Identity check
		if (object == this) {
			return true;
		}

		// Null check
		if (object == null) {
			return false;
		}

		// Compare types
		if (!this.getClass().equals(object.getClass())) {
			return false;
		}

		// Compare fields
		IAllianceForum that = (IAllianceForum) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getId(), that.getId());
		builder.append(this.getName(), that.getName());
		builder.append(this.getOrder(), that.getOrder());
		builder.append(this.getLocked(), that.getLocked());
		builder.append(this.getArchived(), that.getArchived());
		builder.append(this.getDeleted(), that.getDeleted());
		builder.append(this.getThreads(), that.getThreads());
		builder.append(this.getPosts(), that.getPosts());
		builder.append(this.getForumList(), that.getForumList());
		builder.append(this.getThreadList(), that.getThreadList());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getId());
		builder.append(getName());
		builder.append(getOrder());
		builder.append(getLocked());
		builder.append(getArchived());
		builder.append(getDeleted());
		builder.append(getThreads());
		builder.append(getPosts());
		builder.append(getForumList());
		builder.append(getThreadList());
		return builder.toString();
	}

	@Override
	public int compareTo(IAllianceForum that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getId(), that.getId());
		builder.append(this.getName(), that.getName());
		builder.append(this.getOrder(), that.getOrder());
		builder.append(this.getLocked(), that.getLocked());
		builder.append(this.getArchived(), that.getArchived());
		builder.append(this.getDeleted(), that.getDeleted());
		builder.append(this.getThreads(), that.getThreads());
		builder.append(this.getPosts(), that.getPosts());
		builder.append(this.getForumList(), that.getForumList());
		builder.append(this.getThreadList(), that.getThreadList());
		return builder.toComparison();
	}
}
