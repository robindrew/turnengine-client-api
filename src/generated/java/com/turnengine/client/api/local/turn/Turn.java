package com.turnengine.client.api.local.turn;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Turn implements ITurn {

	/** The number field. */
	private int number = 0;
	/** The timestamp field. */
	private long timestamp = 0l;
	/** The duration field. */
	private long duration = 0l;

	/**
	 * The empty constructor.
	 */
	public Turn() {
	}

	/**
	 * The fields constructor.
	 */
	public Turn(int number, long timestamp, long duration) {
		setNumber(number);
		setTimestamp(timestamp);
		setDuration(duration);
	}

	/**
	 * The clone constructor.
	 */
	public Turn(ITurn clone) {
		setNumber(clone.getNumber());
		setTimestamp(clone.getTimestamp());
		setDuration(clone.getDuration());
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
	 * Getter for the number field.
	 * @return the value of the number field.
	 */
	@Override
	public int getNumber() {
		return number;
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
	 * Getter for the duration field.
	 * @return the value of the duration field.
	 */
	@Override
	public long getDuration() {
		return duration;
	}

	/**
	 * Setter for the number field.
	 * @param number the number value to set.
	 */
	@Override
	public void setNumber(int number) {
		if (number < -1) {
			throw new IllegalArgumentException("number too small, minimum of -1, value: '" + number + "'");
		}
		this.number = number;
	}

	/**
	 * Setter for the timestamp field.
	 * @param timestamp the timestamp value to set.
	 */
	@Override
	public void setTimestamp(long timestamp) {
		if (timestamp < -1) {
			throw new IllegalArgumentException("timestamp too small, minimum of -1, value: '" + timestamp + "'");
		}
		this.timestamp = timestamp;
	}

	/**
	 * Setter for the duration field.
	 * @param duration the duration value to set.
	 */
	@Override
	public void setDuration(long duration) {
		if (duration < -1) {
			throw new IllegalArgumentException("duration too small, minimum of -1, value: '" + duration + "'");
		}
		this.duration = duration;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getNumber());
		builder.append(getTimestamp());
		builder.append(getDuration());
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
		ITurn that = (ITurn) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getNumber(), that.getNumber());
		builder.append(this.getTimestamp(), that.getTimestamp());
		builder.append(this.getDuration(), that.getDuration());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getNumber());
		builder.append(getTimestamp());
		builder.append(getDuration());
		return builder.toString();
	}

	@Override
	public int compareTo(ITurn that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getNumber(), that.getNumber());
		builder.append(this.getTimestamp(), that.getTimestamp());
		builder.append(this.getDuration(), that.getDuration());
		return builder.toComparison();
	}
}
