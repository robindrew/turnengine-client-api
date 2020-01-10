package com.turnengine.client.api.global.admin;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class SendEmail implements ISendEmail {

	/** The loginId field. */
	private long loginId = 0l;
	/** The sender field. */
	private String sender = null;
	/** The recipient field. */
	private String recipient = null;
	/** The subject field. */
	private String subject = null;
	/** The body field. */
	private String body = null;

	/**
	 * The empty constructor.
	 */
	public SendEmail() {
	}

	/**
	 * The fields constructor.
	 */
	public SendEmail(long loginId, String sender, String recipient, String subject, String body) {
		setLoginId(loginId);
		setSender(sender);
		setRecipient(recipient);
		setSubject(subject);
		setBody(body);
	}

	/**
	 * The clone constructor.
	 */
	public SendEmail(ISendEmail clone) {
		setLoginId(clone.getLoginId());
		setSender(clone.getSender());
		setRecipient(clone.getRecipient());
		setSubject(clone.getSubject());
		setBody(clone.getBody());
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
	 * Getter for the sender field.
	 * @return the value of the sender field.
	 */
	@Override
	public String getSender() {
		return sender;
	}

	/**
	 * Getter for the recipient field.
	 * @return the value of the recipient field.
	 */
	@Override
	public String getRecipient() {
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
	 * Getter for the body field.
	 * @return the value of the body field.
	 */
	@Override
	public String getBody() {
		return body;
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
	 * Setter for the sender field.
	 * @param sender the sender value to set.
	 */
	@Override
	public void setSender(String sender) {
		if (sender == null) {
			throw new NullPointerException("sender");
		}
		if (sender.length() < 4) {
			throw new IllegalArgumentException("sender too short, minimum of 4 characters, value: '" + sender + "'");
		}
		if (sender.length() > 120) {
			throw new IllegalArgumentException("sender too long, maximum of 120 characters, value: '" + sender + "'");
		}
		this.sender = sender;
	}

	/**
	 * Setter for the recipient field.
	 * @param recipient the recipient value to set.
	 */
	@Override
	public void setRecipient(String recipient) {
		if (recipient == null) {
			throw new NullPointerException("recipient");
		}
		if (recipient.length() < 4) {
			throw new IllegalArgumentException("recipient too short, minimum of 4 characters, value: '" + recipient + "'");
		}
		if (recipient.length() > 120) {
			throw new IllegalArgumentException("recipient too long, maximum of 120 characters, value: '" + recipient + "'");
		}
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
		if (subject.length() < 4) {
			throw new IllegalArgumentException("subject too short, minimum of 4 characters, value: '" + subject + "'");
		}
		if (subject.length() > 120) {
			throw new IllegalArgumentException("subject too long, maximum of 120 characters, value: '" + subject + "'");
		}
		this.subject = subject;
	}

	/**
	 * Setter for the body field.
	 * @param body the body value to set.
	 */
	@Override
	public void setBody(String body) {
		if (body == null) {
			throw new NullPointerException("body");
		}
		if (body.length() < 4) {
			throw new IllegalArgumentException("body too short, minimum of 4 characters, value: '" + body + "'");
		}
		if (body.length() > 60000) {
			throw new IllegalArgumentException("body too long, maximum of 60000 characters, value: '" + body + "'");
		}
		this.body = body;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getLoginId());
		builder.append(getSender());
		builder.append(getRecipient());
		builder.append(getSubject());
		builder.append(getBody());
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
		ISendEmail that = (ISendEmail) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getLoginId(), that.getLoginId());
		builder.append(this.getSender(), that.getSender());
		builder.append(this.getRecipient(), that.getRecipient());
		builder.append(this.getSubject(), that.getSubject());
		builder.append(this.getBody(), that.getBody());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getLoginId());
		builder.append(getSender());
		builder.append(getRecipient());
		builder.append(getSubject());
		builder.append(getBody());
		return builder.toString();
	}

	@Override
	public int compareTo(ISendEmail that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getLoginId(), that.getLoginId());
		builder.append(this.getSender(), that.getSender());
		builder.append(this.getRecipient(), that.getRecipient());
		builder.append(this.getSubject(), that.getSubject());
		builder.append(this.getBody(), that.getBody());
		return builder.toComparison();
	}
}
