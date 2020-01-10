package com.turnengine.client.api.global.common;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class LoggedException implements ILoggedException {

	/** The timestamp field. */
	private long timestamp = 0l;
	/** The level field. */
	private String level = null;
	/** The className field. */
	private String className = null;
	/** The message field. */
	private String message = null;
	/** The trace field. */
	private String trace = null;

	/**
	 * The empty constructor.
	 */
	public LoggedException() {
	}

	/**
	 * The fields constructor.
	 */
	public LoggedException(long timestamp, String level, String className, String message, String trace) {
		setTimestamp(timestamp);
		setLevel(level);
		setClassName(className);
		setMessage(message);
		setTrace(trace);
	}

	/**
	 * The clone constructor.
	 */
	public LoggedException(ILoggedException clone) {
		setTimestamp(clone.getTimestamp());
		setLevel(clone.getLevel());
		setClassName(clone.getClassName());
		setMessage(clone.getMessage());
		setTrace(clone.getTrace());
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
	 * Getter for the timestamp field.
	 * @return the value of the timestamp field.
	 */
	@Override
	public long getTimestamp() {
		return timestamp;
	}

	/**
	 * Getter for the level field.
	 * @return the value of the level field.
	 */
	@Override
	public String getLevel() {
		return level;
	}

	/**
	 * Getter for the className field.
	 * @return the value of the className field.
	 */
	@Override
	public String getClassName() {
		return className;
	}

	/**
	 * Getter for the message field.
	 * @return the value of the message field.
	 */
	@Override
	public String getMessage() {
		return message;
	}

	/**
	 * Getter for the trace field.
	 * @return the value of the trace field.
	 */
	@Override
	public String getTrace() {
		return trace;
	}

	/**
	 * Setter for the timestamp field.
	 * @param timestamp the timestamp value to set.
	 */
	@Override
	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}

	/**
	 * Setter for the level field.
	 * @param level the level value to set.
	 */
	@Override
	public void setLevel(String level) {
		this.level = level;
	}

	/**
	 * Setter for the className field.
	 * @param className the className value to set.
	 */
	@Override
	public void setClassName(String className) {
		this.className = className;
	}

	/**
	 * Setter for the message field.
	 * @param message the message value to set.
	 */
	@Override
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * Setter for the trace field.
	 * @param trace the trace value to set.
	 */
	@Override
	public void setTrace(String trace) {
		this.trace = trace;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getTimestamp());
		builder.append(getLevel());
		builder.append(getClassName());
		builder.append(getMessage());
		builder.append(getTrace());
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
		ILoggedException that = (ILoggedException) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getTimestamp(), that.getTimestamp());
		builder.append(this.getLevel(), that.getLevel());
		builder.append(this.getClassName(), that.getClassName());
		builder.append(this.getMessage(), that.getMessage());
		builder.append(this.getTrace(), that.getTrace());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getTimestamp());
		builder.append(getLevel());
		builder.append(getClassName());
		builder.append(getMessage());
		builder.append(getTrace());
		return builder.toString();
	}

	@Override
	public int compareTo(ILoggedException that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getTimestamp(), that.getTimestamp());
		builder.append(this.getLevel(), that.getLevel());
		builder.append(this.getClassName(), that.getClassName());
		builder.append(this.getMessage(), that.getMessage());
		builder.append(this.getTrace(), that.getTrace());
		return builder.toComparison();
	}
}
