package com.turnengine.client.api.local.message;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class GetMessage implements IGetMessage {

	/** The loginId field. */
	private long loginId = 0l;
	/** The instanceId field. */
	private int instanceId = 0;
	/** The messageId field. */
	private int messageId = 0;

	/**
	 * The empty constructor.
	 */
	public GetMessage() {
	}

	/**
	 * The fields constructor.
	 */
	public GetMessage(long loginId, int instanceId, int messageId) {
		setLoginId(loginId);
		setInstanceId(instanceId);
		setMessageId(messageId);
	}

	/**
	 * The clone constructor.
	 */
	public GetMessage(IGetMessage clone) {
		setLoginId(clone.getLoginId());
		setInstanceId(clone.getInstanceId());
		setMessageId(clone.getMessageId());
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
	 * Getter for the instanceId field.
	 * @return the value of the instanceId field.
	 */
	@Override
	public int getInstanceId() {
		return instanceId;
	}

	/**
	 * Getter for the messageId field.
	 * @return the value of the messageId field.
	 */
	@Override
	public int getMessageId() {
		return messageId;
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
	 * Setter for the instanceId field.
	 * @param instanceId the instanceId value to set.
	 */
	@Override
	public void setInstanceId(int instanceId) {
		if (instanceId < -1) {
			throw new IllegalArgumentException("instanceId too small, minimum of -1, value: '" + instanceId + "'");
		}
		this.instanceId = instanceId;
	}

	/**
	 * Setter for the messageId field.
	 * @param messageId the messageId value to set.
	 */
	@Override
	public void setMessageId(int messageId) {
		if (messageId < -1) {
			throw new IllegalArgumentException("messageId too small, minimum of -1, value: '" + messageId + "'");
		}
		this.messageId = messageId;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getLoginId());
		builder.append(getInstanceId());
		builder.append(getMessageId());
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
		IGetMessage that = (IGetMessage) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getLoginId(), that.getLoginId());
		builder.append(this.getInstanceId(), that.getInstanceId());
		builder.append(this.getMessageId(), that.getMessageId());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getLoginId());
		builder.append(getInstanceId());
		builder.append(getMessageId());
		return builder.toString();
	}

	@Override
	public int compareTo(IGetMessage that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getLoginId(), that.getLoginId());
		builder.append(this.getInstanceId(), that.getInstanceId());
		builder.append(this.getMessageId(), that.getMessageId());
		return builder.toComparison();
	}
}
