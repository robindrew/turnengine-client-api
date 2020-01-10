package com.turnengine.client.api.local.message;

import com.turnengine.client.api.local.player.IPlayerInfo;
import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Message implements IMessage {

	/** The id field. */
	private int id = 0;
	/** The sender field. */
	private IPlayerInfo sender = null;
	/** The recipient field. */
	private IPlayerInfo recipient = null;
	/** The subject field. */
	private String subject = null;
	/** The threadId field. */
	private int threadId = 0;
	/** The format field. */
	private String format = null;
	/** The count field. */
	private int count = 0;
	/** The timestamp field. */
	private long timestamp = 0l;
	/** The status field. */
	private MessageStatus status = null;
	/** The type field. */
	private MessageType type = null;
	/** The locationId field. */
	private int locationId = 0;
	/** The mobileId field. */
	private int mobileId = 0;
	/** The content field. */
	private String content = null;

	/**
	 * The empty constructor.
	 */
	public Message() {
	}

	/**
	 * The fields constructor.
	 */
	public Message(int id, IPlayerInfo sender, IPlayerInfo recipient, String subject, int threadId, String format, int count, long timestamp, MessageStatus status, MessageType type, int locationId, int mobileId, String content) {
		setId(id);
		setSender(sender);
		setRecipient(recipient);
		setSubject(subject);
		setThreadId(threadId);
		setFormat(format);
		setCount(count);
		setTimestamp(timestamp);
		setStatus(status);
		setType(type);
		setLocationId(locationId);
		setMobileId(mobileId);
		setContent(content);
	}

	/**
	 * The clone constructor.
	 */
	public Message(IMessage clone) {
		setId(clone.getId());
		setSender(clone.getSender());
		setRecipient(clone.getRecipient());
		setSubject(clone.getSubject());
		setThreadId(clone.getThreadId());
		setFormat(clone.getFormat());
		setCount(clone.getCount());
		setTimestamp(clone.getTimestamp());
		setStatus(clone.getStatus());
		setType(clone.getType());
		setLocationId(clone.getLocationId());
		setMobileId(clone.getMobileId());
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
	 * Getter for the id field.
	 * @return the value of the id field.
	 */
	@Override
	public int getId() {
		return id;
	}

	/**
	 * Getter for the sender field.
	 * @return the value of the sender field.
	 */
	@Override
	public IPlayerInfo getSender() {
		return sender;
	}

	/**
	 * Getter for the recipient field.
	 * @return the value of the recipient field.
	 */
	@Override
	public IPlayerInfo getRecipient() {
		return recipient;
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
	 * Getter for the threadId field.
	 * @return the value of the threadId field.
	 */
	@Override
	public int getThreadId() {
		return threadId;
	}

	/**
	 * Getter for the format field.
	 * @return the value of the format field.
	 */
	@Override
	public String getFormat() {
		return format;
	}

	/**
	 * Getter for the count field.
	 * @return the value of the count field.
	 */
	@Override
	public int getCount() {
		return count;
	}

	/**
	 * Getter for the timestamp field.
	 * @return the value of the timestamp field.
	 */
	@Override
	public long getTimestamp() {
		return timestamp;
	}

	/**
	 * Getter for the status field.
	 * @return the value of the status field.
	 */
	@Override
	public MessageStatus getStatus() {
		return status;
	}

	/**
	 * Getter for the type field.
	 * @return the value of the type field.
	 */
	@Override
	public MessageType getType() {
		return type;
	}

	/**
	 * Getter for the locationId field.
	 * @return the value of the locationId field.
	 */
	@Override
	public int getLocationId() {
		return locationId;
	}

	/**
	 * Getter for the mobileId field.
	 * @return the value of the mobileId field.
	 */
	@Override
	public int getMobileId() {
		return mobileId;
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
	 * Setter for the sender field.
	 * @param sender the sender value to set.
	 */
	@Override
	public void setSender(IPlayerInfo sender) {
		this.sender = sender;
	}

	/**
	 * Setter for the recipient field.
	 * @param recipient the recipient value to set.
	 */
	@Override
	public void setRecipient(IPlayerInfo recipient) {
		this.recipient = recipient;
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
	 * Setter for the format field.
	 * @param format the format value to set.
	 */
	@Override
	public void setFormat(String format) {
		if (format == null) {
			throw new NullPointerException("format");
		}
		if (format.length() < 0) {
			throw new IllegalArgumentException("format too short, minimum of 0 characters, value: '" + format + "'");
		}
		if (format.length() > 80) {
			throw new IllegalArgumentException("format too long, maximum of 80 characters, value: '" + format + "'");
		}
		this.format = format;
	}

	/**
	 * Setter for the count field.
	 * @param count the count value to set.
	 */
	@Override
	public void setCount(int count) {
		if (count < 0) {
			throw new IllegalArgumentException("count too small, minimum of 0, value: '" + count + "'");
		}
		this.count = count;
	}

	/**
	 * Setter for the timestamp field.
	 * @param timestamp the timestamp value to set.
	 */
	@Override
	public void setTimestamp(long timestamp) {
		if (timestamp < 0) {
			throw new IllegalArgumentException("timestamp too small, minimum of 0, value: '" + timestamp + "'");
		}
		this.timestamp = timestamp;
	}

	/**
	 * Setter for the status field.
	 * @param status the status value to set.
	 */
	@Override
	public void setStatus(MessageStatus status) {
		this.status = status;
	}

	/**
	 * Setter for the type field.
	 * @param type the type value to set.
	 */
	@Override
	public void setType(MessageType type) {
		this.type = type;
	}

	/**
	 * Setter for the locationId field.
	 * @param locationId the locationId value to set.
	 */
	@Override
	public void setLocationId(int locationId) {
		if (locationId < -1) {
			throw new IllegalArgumentException("locationId too small, minimum of -1, value: '" + locationId + "'");
		}
		this.locationId = locationId;
	}

	/**
	 * Setter for the mobileId field.
	 * @param mobileId the mobileId value to set.
	 */
	@Override
	public void setMobileId(int mobileId) {
		if (mobileId < -1) {
			throw new IllegalArgumentException("mobileId too small, minimum of -1, value: '" + mobileId + "'");
		}
		this.mobileId = mobileId;
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
		this.content = content;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getId());
		builder.append(getSender());
		builder.append(getRecipient());
		builder.append(getSubject());
		builder.append(getThreadId());
		builder.append(getFormat());
		builder.append(getCount());
		builder.append(getTimestamp());
		builder.append(getStatus());
		builder.append(getType());
		builder.append(getLocationId());
		builder.append(getMobileId());
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
		IMessage that = (IMessage) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getId(), that.getId());
		builder.append(this.getSender(), that.getSender());
		builder.append(this.getRecipient(), that.getRecipient());
		builder.append(this.getSubject(), that.getSubject());
		builder.append(this.getThreadId(), that.getThreadId());
		builder.append(this.getFormat(), that.getFormat());
		builder.append(this.getCount(), that.getCount());
		builder.append(this.getTimestamp(), that.getTimestamp());
		builder.append(this.getStatus(), that.getStatus());
		builder.append(this.getType(), that.getType());
		builder.append(this.getLocationId(), that.getLocationId());
		builder.append(this.getMobileId(), that.getMobileId());
		builder.append(this.getContent(), that.getContent());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getId());
		builder.append(getSender());
		builder.append(getRecipient());
		builder.append(getSubject());
		builder.append(getThreadId());
		builder.append(getFormat());
		builder.append(getCount());
		builder.append(getTimestamp());
		builder.append(getStatus());
		builder.append(getType());
		builder.append(getLocationId());
		builder.append(getMobileId());
		builder.append(getContent());
		return builder.toString();
	}

	@Override
	public int compareTo(IMessage that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getId(), that.getId());
		builder.append(this.getSender(), that.getSender());
		builder.append(this.getRecipient(), that.getRecipient());
		builder.append(this.getSubject(), that.getSubject());
		builder.append(this.getThreadId(), that.getThreadId());
		builder.append(this.getFormat(), that.getFormat());
		builder.append(this.getCount(), that.getCount());
		builder.append(this.getTimestamp(), that.getTimestamp());
		builder.append(this.getStatus(), that.getStatus());
		builder.append(this.getType(), that.getType());
		builder.append(this.getLocationId(), that.getLocationId());
		builder.append(this.getMobileId(), that.getMobileId());
		builder.append(this.getContent(), that.getContent());
		return builder.toComparison();
	}
}
