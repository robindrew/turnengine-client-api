package com.turnengine.client.api.global.error;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class CommandStackTrace implements ICommandStackTrace {

	/** The id field. */
	private long id = 0l;
	/** The timestamp field. */
	private long timestamp = 0l;
	/** The command field. */
	private String command = null;
	/** The trace field. */
	private String trace = null;

	/**
	 * The empty constructor.
	 */
	public CommandStackTrace() {
	}

	/**
	 * The fields constructor.
	 */
	public CommandStackTrace(long id, long timestamp, String command, String trace) {
		setId(id);
		setTimestamp(timestamp);
		setCommand(command);
		setTrace(trace);
	}

	/**
	 * The clone constructor.
	 */
	public CommandStackTrace(ICommandStackTrace clone) {
		setId(clone.getId());
		setTimestamp(clone.getTimestamp());
		setCommand(clone.getCommand());
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
	 * Getter for the id field.
	 * @return the value of the id field.
	 */
	@Override
	public long getId() {
		return id;
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
	 * Getter for the command field.
	 * @return the value of the command field.
	 */
	@Override
	public String getCommand() {
		return command;
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
	 * Setter for the id field.
	 * @param id the id value to set.
	 */
	@Override
	public void setId(long id) {
		if (id < 0) {
			throw new IllegalArgumentException("id too small, minimum of 0, value: '" + id + "'");
		}
		this.id = id;
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
	 * Setter for the command field.
	 * @param command the command value to set.
	 */
	@Override
	public void setCommand(String command) {
		if (command == null) {
			throw new NullPointerException("command");
		}
		if (command.length() < 1) {
			throw new IllegalArgumentException("command too short, minimum of 1 characters, value: '" + command + "'");
		}
		if (command.length() > 80000) {
			throw new IllegalArgumentException("command too long, maximum of 80000 characters, value: '" + command + "'");
		}
		this.command = command;
	}

	/**
	 * Setter for the trace field.
	 * @param trace the trace value to set.
	 */
	@Override
	public void setTrace(String trace) {
		if (trace == null) {
			throw new NullPointerException("trace");
		}
		if (trace.length() < 1) {
			throw new IllegalArgumentException("trace too short, minimum of 1 characters, value: '" + trace + "'");
		}
		if (trace.length() > 80000) {
			throw new IllegalArgumentException("trace too long, maximum of 80000 characters, value: '" + trace + "'");
		}
		this.trace = trace;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getId());
		builder.append(getTimestamp());
		builder.append(getCommand());
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
		ICommandStackTrace that = (ICommandStackTrace) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getId(), that.getId());
		builder.append(this.getTimestamp(), that.getTimestamp());
		builder.append(this.getCommand(), that.getCommand());
		builder.append(this.getTrace(), that.getTrace());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getId());
		builder.append(getTimestamp());
		builder.append(getCommand());
		builder.append(getTrace());
		return builder.toString();
	}

	@Override
	public int compareTo(ICommandStackTrace that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getId(), that.getId());
		builder.append(this.getTimestamp(), that.getTimestamp());
		builder.append(this.getCommand(), that.getCommand());
		builder.append(this.getTrace(), that.getTrace());
		return builder.toComparison();
	}
}
