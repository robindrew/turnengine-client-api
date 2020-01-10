package com.turnengine.client.api.local.action;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class ActionStatus implements IActionStatus {

	/** The amount field. */
	private long amount = 0l;
	/** The format field. */
	private String format = null;
	/** The content field. */
	private String content = null;

	/**
	 * The empty constructor.
	 */
	public ActionStatus() {
	}

	/**
	 * The fields constructor.
	 */
	public ActionStatus(long amount, String format, String content) {
		setAmount(amount);
		setFormat(format);
		setContent(content);
	}

	/**
	 * The clone constructor.
	 */
	public ActionStatus(IActionStatus clone) {
		setAmount(clone.getAmount());
		setFormat(clone.getFormat());
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
	 * Getter for the amount field.
	 * @return the value of the amount field.
	 */
	@Override
	public long getAmount() {
		return amount;
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
	 * Getter for the content field.
	 * @return the value of the content field.
	 */
	@Override
	public String getContent() {
		return content;
	}

	/**
	 * Setter for the amount field.
	 * @param amount the amount value to set.
	 */
	@Override
	public void setAmount(long amount) {
		if (amount < -1) {
			throw new IllegalArgumentException("amount too small, minimum of -1, value: '" + amount + "'");
		}
		this.amount = amount;
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
		builder.append(getAmount());
		builder.append(getFormat());
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
		IActionStatus that = (IActionStatus) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getAmount(), that.getAmount());
		builder.append(this.getFormat(), that.getFormat());
		builder.append(this.getContent(), that.getContent());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getAmount());
		builder.append(getFormat());
		builder.append(getContent());
		return builder.toString();
	}

	@Override
	public int compareTo(IActionStatus that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getAmount(), that.getAmount());
		builder.append(this.getFormat(), that.getFormat());
		builder.append(this.getContent(), that.getContent());
		return builder.toComparison();
	}
}
