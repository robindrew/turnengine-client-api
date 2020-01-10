package com.turnengine.client.api.local.message;

import java.util.List;
import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class MessageList implements IMessageList {

	/** The messageList field. */
	private List<IMessage> messageList = null;
	/** The total field. */
	private int total = 0;

	/**
	 * The empty constructor.
	 */
	public MessageList() {
	}

	/**
	 * The fields constructor.
	 */
	public MessageList(List<IMessage> messageList, int total) {
		setMessageList(messageList);
		setTotal(total);
	}

	/**
	 * The clone constructor.
	 */
	public MessageList(IMessageList clone) {
		setMessageList(clone.getMessageList());
		setTotal(clone.getTotal());
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
	 * Getter for the messageList field.
	 * @return the value of the messageList field.
	 */
	@Override
	public List<IMessage> getMessageList() {
		return messageList;
	}

	/**
	 * Getter for the total field.
	 * @return the value of the total field.
	 */
	@Override
	public int getTotal() {
		return total;
	}

	/**
	 * Setter for the messageList field.
	 * @param messageList the messageList value to set.
	 */
	@Override
	public void setMessageList(List<IMessage> messageList) {
		this.messageList = messageList;
	}

	/**
	 * Setter for the total field.
	 * @param total the total value to set.
	 */
	@Override
	public void setTotal(int total) {
		if (total < 0) {
			throw new IllegalArgumentException("total too small, minimum of 0, value: '" + total + "'");
		}
		this.total = total;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getMessageList());
		builder.append(getTotal());
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
		IMessageList that = (IMessageList) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getMessageList(), that.getMessageList());
		builder.append(this.getTotal(), that.getTotal());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getMessageList());
		builder.append(getTotal());
		return builder.toString();
	}

	@Override
	public int compareTo(IMessageList that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getMessageList(), that.getMessageList());
		builder.append(this.getTotal(), that.getTotal());
		return builder.toComparison();
	}
}
