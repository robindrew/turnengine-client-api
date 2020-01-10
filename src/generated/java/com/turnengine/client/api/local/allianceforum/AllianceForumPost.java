package com.turnengine.client.api.local.allianceforum;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class AllianceForumPost implements IAllianceForumPost {

	/** The id field. */
	private int id = 0;
	/** The threadId field. */
	private int threadId = 0;
	/** The forumId field. */
	private int forumId = 0;
	/** The date field. */
	private int date = 0;
	/** The lastEdited field. */
	private int lastEdited = 0;
	/** The poster field. */
	private IAllianceForumUser poster = null;
	/** The subject field. */
	private String subject = null;
	/** The content field. */
	private String content = null;
	/** The deleted field. */
	private boolean deleted = false;

	/**
	 * The empty constructor.
	 */
	public AllianceForumPost() {
	}

	/**
	 * The fields constructor.
	 */
	public AllianceForumPost(int id, int threadId, int forumId, int date, int lastEdited, IAllianceForumUser poster, String subject, String content, boolean deleted) {
		setId(id);
		setThreadId(threadId);
		setForumId(forumId);
		setDate(date);
		setLastEdited(lastEdited);
		setPoster(poster);
		setSubject(subject);
		setContent(content);
		setDeleted(deleted);
	}

	/**
	 * The clone constructor.
	 */
	public AllianceForumPost(IAllianceForumPost clone) {
		setId(clone.getId());
		setThreadId(clone.getThreadId());
		setForumId(clone.getForumId());
		setDate(clone.getDate());
		setLastEdited(clone.getLastEdited());
		setPoster(clone.getPoster());
		setSubject(clone.getSubject());
		setContent(clone.getContent());
		setDeleted(clone.getDeleted());
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
	 * Getter for the threadId field.
	 * @return the value of the threadId field.
	 */
	@Override
	public int getThreadId() {
		return threadId;
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
	 * Getter for the lastEdited field.
	 * @return the value of the lastEdited field.
	 */
	@Override
	public int getLastEdited() {
		return lastEdited;
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
	 * Getter for the subject field.
	 * @return the value of the subject field.
	 */
	@Override
	public String getSubject() {
		return subject;
	}

	/**
	 * Getter for the content field.
	 * @return the value of the content field.
	 */
	@Override
	public String getContent() {
		return content;
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
	 * Setter for the threadId field.
	 * @param threadId the threadId value to set.
	 */
	@Override
	public void setThreadId(int threadId) {
		if (threadId < -1) {
			throw new IllegalArgumentException("threadId too small, minimum of -1, value: '" + threadId + "'");
		}
		this.threadId = threadId;
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
	 * Setter for the lastEdited field.
	 * @param lastEdited the lastEdited value to set.
	 */
	@Override
	public void setLastEdited(int lastEdited) {
		if (lastEdited < -1) {
			throw new IllegalArgumentException("lastEdited too small, minimum of -1, value: '" + lastEdited + "'");
		}
		this.lastEdited = lastEdited;
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
	 * Setter for the content field.
	 * @param content the content value to set.
	 */
	@Override
	public void setContent(String content) {
		if (content == null) {
			throw new NullPointerException("content");
		}
		if (content.length() < 1) {
			throw new IllegalArgumentException("content too short, minimum of 1 characters, value: '" + content + "'");
		}
		if (content.length() > 5000) {
			throw new IllegalArgumentException("content too long, maximum of 5000 characters, value: '" + content + "'");
		}
		this.content = content;
	}

	/**
	 * Setter for the deleted field.
	 * @param deleted the deleted value to set.
	 */
	@Override
	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getId());
		builder.append(getThreadId());
		builder.append(getForumId());
		builder.append(getDate());
		builder.append(getLastEdited());
		builder.append(getPoster());
		builder.append(getSubject());
		builder.append(getContent());
		builder.append(getDeleted());
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
		IAllianceForumPost that = (IAllianceForumPost) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getId(), that.getId());
		builder.append(this.getThreadId(), that.getThreadId());
		builder.append(this.getForumId(), that.getForumId());
		builder.append(this.getDate(), that.getDate());
		builder.append(this.getLastEdited(), that.getLastEdited());
		builder.append(this.getPoster(), that.getPoster());
		builder.append(this.getSubject(), that.getSubject());
		builder.append(this.getContent(), that.getContent());
		builder.append(this.getDeleted(), that.getDeleted());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getId());
		builder.append(getThreadId());
		builder.append(getForumId());
		builder.append(getDate());
		builder.append(getLastEdited());
		builder.append(getPoster());
		builder.append(getSubject());
		builder.append(getContent());
		builder.append(getDeleted());
		return builder.toString();
	}

	@Override
	public int compareTo(IAllianceForumPost that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getId(), that.getId());
		builder.append(this.getThreadId(), that.getThreadId());
		builder.append(this.getForumId(), that.getForumId());
		builder.append(this.getDate(), that.getDate());
		builder.append(this.getLastEdited(), that.getLastEdited());
		builder.append(this.getPoster(), that.getPoster());
		builder.append(this.getSubject(), that.getSubject());
		builder.append(this.getContent(), that.getContent());
		builder.append(this.getDeleted(), that.getDeleted());
		return builder.toComparison();
	}
}
