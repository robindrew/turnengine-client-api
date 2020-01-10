package com.turnengine.client.api.local.allianceforum;

import java.util.List;
import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class AllianceForumThread implements IAllianceForumThread {

	/** The id field. */
	private int id = 0;
	/** The forumId field. */
	private int forumId = 0;
	/** The date field. */
	private int date = 0;
	/** The lastUpdated field. */
	private int lastUpdated = 0;
	/** The subject field. */
	private String subject = null;
	/** The poster field. */
	private IAllianceForumUser poster = null;
	/** The sticky field. */
	private boolean sticky = false;
	/** The locked field. */
	private boolean locked = false;
	/** The archived field. */
	private boolean archived = false;
	/** The deleted field. */
	private boolean deleted = false;
	/** The postList field. */
	private List<IAllianceForumPost> postList = null;

	/**
	 * The empty constructor.
	 */
	public AllianceForumThread() {
	}

	/**
	 * The fields constructor.
	 */
	public AllianceForumThread(int id, int forumId, int date, int lastUpdated, String subject, IAllianceForumUser poster, boolean sticky, boolean locked, boolean archived, boolean deleted, List<IAllianceForumPost> postList) {
		setId(id);
		setForumId(forumId);
		setDate(date);
		setLastUpdated(lastUpdated);
		setSubject(subject);
		setPoster(poster);
		setSticky(sticky);
		setLocked(locked);
		setArchived(archived);
		setDeleted(deleted);
		setPostList(postList);
	}

	/**
	 * The clone constructor.
	 */
	public AllianceForumThread(IAllianceForumThread clone) {
		setId(clone.getId());
		setForumId(clone.getForumId());
		setDate(clone.getDate());
		setLastUpdated(clone.getLastUpdated());
		setSubject(clone.getSubject());
		setPoster(clone.getPoster());
		setSticky(clone.getSticky());
		setLocked(clone.getLocked());
		setArchived(clone.getArchived());
		setDeleted(clone.getDeleted());
		setPostList(clone.getPostList());
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
	 * Getter for the forumId field.
	 * @return the value of the forumId field.
	 */
	@Override
	public int getForumId() {
		return forumId;
	}

	/**
	 * Getter for the date field.
	 * @return the value of the date field.
	 */
	@Override
	public int getDate() {
		return date;
	}

	/**
	 * Getter for the lastUpdated field.
	 * @return the value of the lastUpdated field.
	 */
	@Override
	public int getLastUpdated() {
		return lastUpdated;
	}

	/**
	 * Getter for the subject field.
	 * @return the value of the subject field.
	 */
	@Override
	public String getSubject() {
		return subject;
	}

	/**
	 * Getter for the poster field.
	 * @return the value of the poster field.
	 */
	@Override
	public IAllianceForumUser getPoster() {
		return poster;
	}

	/**
	 * Getter for the sticky field.
	 * @return the value of the sticky field.
	 */
	@Override
	public boolean getSticky() {
		return sticky;
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
	 * Getter for the postList field.
	 * @return the value of the postList field.
	 */
	@Override
	public List<IAllianceForumPost> getPostList() {
		return postList;
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
	 * Setter for the forumId field.
	 * @param forumId the forumId value to set.
	 */
	@Override
	public void setForumId(int forumId) {
		if (forumId < -1) {
			throw new IllegalArgumentException("forumId too small, minimum of -1, value: '" + forumId + "'");
		}
		this.forumId = forumId;
	}

	/**
	 * Setter for the date field.
	 * @param date the date value to set.
	 */
	@Override
	public void setDate(int date) {
		if (date < -1) {
			throw new IllegalArgumentException("date too small, minimum of -1, value: '" + date + "'");
		}
		this.date = date;
	}

	/**
	 * Setter for the lastUpdated field.
	 * @param lastUpdated the lastUpdated value to set.
	 */
	@Override
	public void setLastUpdated(int lastUpdated) {
		if (lastUpdated < -1) {
			throw new IllegalArgumentException("lastUpdated too small, minimum of -1, value: '" + lastUpdated + "'");
		}
		this.lastUpdated = lastUpdated;
	}

	/**
	 * Setter for the subject field.
	 * @param subject the subject value to set.
	 */
	@Override
	public void setSubject(String subject) {
		if (subject == null) {
			throw new NullPointerException("subject");
		}
		if (subject.length() < 1) {
			throw new IllegalArgumentException("subject too short, minimum of 1 characters, value: '" + subject + "'");
		}
		if (subject.length() > 500) {
			throw new IllegalArgumentException("subject too long, maximum of 500 characters, value: '" + subject + "'");
		}
		this.subject = subject;
	}

	/**
	 * Setter for the poster field.
	 * @param poster the poster value to set.
	 */
	@Override
	public void setPoster(IAllianceForumUser poster) {
		this.poster = poster;
	}

	/**
	 * Setter for the sticky field.
	 * @param sticky the sticky value to set.
	 */
	@Override
	public void setSticky(boolean sticky) {
		this.sticky = sticky;
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
	 * Setter for the postList field.
	 * @param postList the postList value to set.
	 */
	@Override
	public void setPostList(List<IAllianceForumPost> postList) {
		this.postList = postList;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getId());
		builder.append(getForumId());
		builder.append(getDate());
		builder.append(getLastUpdated());
		builder.append(getSubject());
		builder.append(getPoster());
		builder.append(getSticky());
		builder.append(getLocked());
		builder.append(getArchived());
		builder.append(getDeleted());
		builder.append(getPostList());
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
		IAllianceForumThread that = (IAllianceForumThread) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getId(), that.getId());
		builder.append(this.getForumId(), that.getForumId());
		builder.append(this.getDate(), that.getDate());
		builder.append(this.getLastUpdated(), that.getLastUpdated());
		builder.append(this.getSubject(), that.getSubject());
		builder.append(this.getPoster(), that.getPoster());
		builder.append(this.getSticky(), that.getSticky());
		builder.append(this.getLocked(), that.getLocked());
		builder.append(this.getArchived(), that.getArchived());
		builder.append(this.getDeleted(), that.getDeleted());
		builder.append(this.getPostList(), that.getPostList());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getId());
		builder.append(getForumId());
		builder.append(getDate());
		builder.append(getLastUpdated());
		builder.append(getSubject());
		builder.append(getPoster());
		builder.append(getSticky());
		builder.append(getLocked());
		builder.append(getArchived());
		builder.append(getDeleted());
		builder.append(getPostList());
		return builder.toString();
	}

	@Override
	public int compareTo(IAllianceForumThread that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getId(), that.getId());
		builder.append(this.getForumId(), that.getForumId());
		builder.append(this.getDate(), that.getDate());
		builder.append(this.getLastUpdated(), that.getLastUpdated());
		builder.append(this.getSubject(), that.getSubject());
		builder.append(this.getPoster(), that.getPoster());
		builder.append(this.getSticky(), that.getSticky());
		builder.append(this.getLocked(), that.getLocked());
		builder.append(this.getArchived(), that.getArchived());
		builder.append(this.getDeleted(), that.getDeleted());
		builder.append(this.getPostList(), that.getPostList());
		return builder.toComparison();
	}
}
