package com.turnengine.client.api.global.forum;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class EditPost implements IEditPost {

	/** The loginId field. */
	private long loginId = 0l;
	/** The postId field. */
	private int postId = 0;
	/** The subject field. */
	private String subject = null;
	/** The content field. */
	private String content = null;

	/**
	 * The empty constructor.
	 */
	public EditPost() {
	}

	/**
	 * The fields constructor.
	 */
	public EditPost(long loginId, int postId, String subject, String content) {
		setLoginId(loginId);
		setPostId(postId);
		setSubject(subject);
		setContent(content);
	}

	/**
	 * The clone constructor.
	 */
	public EditPost(IEditPost clone) {
		setLoginId(clone.getLoginId());
		setPostId(clone.getPostId());
		setSubject(clone.getSubject());
		setContent(clone.getContent());
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
	 * Getter for the loginId field.
	 * @return the value of the loginId field.
	 */
	@Override
	public long getLoginId() {
		return loginId;
	}

	/**
	 * Getter for the postId field.
	 * @return the value of the postId field.
	 */
	@Override
	public int getPostId() {
		return postId;
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
	 * Setter for the loginId field.
	 * @param loginId the loginId value to set.
	 */
	@Override
	public void setLoginId(long loginId) {
		this.loginId = loginId;
	}

	/**
	 * Setter for the postId field.
	 * @param postId the postId value to set.
	 */
	@Override
	public void setPostId(int postId) {
		if (postId < -1) {
			throw new IllegalArgumentException("postId too small, minimum of -1, value: '" + postId + "'");
		}
		this.postId = postId;
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

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getLoginId());
		builder.append(getPostId());
		builder.append(getSubject());
		builder.append(getContent());
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
		IEditPost that = (IEditPost) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getLoginId(), that.getLoginId());
		builder.append(this.getPostId(), that.getPostId());
		builder.append(this.getSubject(), that.getSubject());
		builder.append(this.getContent(), that.getContent());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getLoginId());
		builder.append(getPostId());
		builder.append(getSubject());
		builder.append(getContent());
		return builder.toString();
	}

	@Override
	public int compareTo(IEditPost that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getLoginId(), that.getLoginId());
		builder.append(this.getPostId(), that.getPostId());
		builder.append(this.getSubject(), that.getSubject());
		builder.append(this.getContent(), that.getContent());
		return builder.toComparison();
	}
}
