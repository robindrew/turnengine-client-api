package com.turnengine.client.api.local.turn;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class TurnSummary implements ITurnSummary {

	/** The number field. */
	private int number = 0;
	/** The enabled field. */
	private boolean enabled = false;
	/** The updating field. */
	private TurnUpdating updating = null;
	/** The interval field. */
	private long interval = 0l;
	/** The timeToNextTurn field. */
	private long timeToNextTurn = 0l;
	/** The timeOfNextTurn field. */
	private long timeOfNextTurn = 0l;
	/** The currentTime field. */
	private long currentTime = 0l;
	/** The timeOfFirstTurn field. */
	private long timeOfFirstTurn = 0l;
	/** The timeToFirstTurn field. */
	private long timeToFirstTurn = 0l;

	/**
	 * The empty constructor.
	 */
	public TurnSummary() {
	}

	/**
	 * The fields constructor.
	 */
	public TurnSummary(int number, boolean enabled, TurnUpdating updating, long interval, long timeToNextTurn, long timeOfNextTurn, long currentTime, long timeOfFirstTurn, long timeToFirstTurn) {
		setNumber(number);
		setEnabled(enabled);
		setUpdating(updating);
		setInterval(interval);
		setTimeToNextTurn(timeToNextTurn);
		setTimeOfNextTurn(timeOfNextTurn);
		setCurrentTime(currentTime);
		setTimeOfFirstTurn(timeOfFirstTurn);
		setTimeToFirstTurn(timeToFirstTurn);
	}

	/**
	 * The clone constructor.
	 */
	public TurnSummary(ITurnSummary clone) {
		setNumber(clone.getNumber());
		setEnabled(clone.getEnabled());
		setUpdating(clone.getUpdating());
		setInterval(clone.getInterval());
		setTimeToNextTurn(clone.getTimeToNextTurn());
		setTimeOfNextTurn(clone.getTimeOfNextTurn());
		setCurrentTime(clone.getCurrentTime());
		setTimeOfFirstTurn(clone.getTimeOfFirstTurn());
		setTimeToFirstTurn(clone.getTimeToFirstTurn());
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
	 * Getter for the enabled field.
	 * @return the value of the enabled field.
	 */
	@Override
	public boolean getEnabled() {
		return enabled;
	}

	/**
	 * Getter for the updating field.
	 * @return the value of the updating field.
	 */
	@Override
	public TurnUpdating getUpdating() {
		return updating;
	}

	/**
	 * Getter for the interval field.
	 * @return the value of the interval field.
	 */
	@Override
	public long getInterval() {
		return interval;
	}

	/**
	 * Getter for the timeToNextTurn field.
	 * @return the value of the timeToNextTurn field.
	 */
	@Override
	public long getTimeToNextTurn() {
		return timeToNextTurn;
	}

	/**
	 * Getter for the timeOfNextTurn field.
	 * @return the value of the timeOfNextTurn field.
	 */
	@Override
	public long getTimeOfNextTurn() {
		return timeOfNextTurn;
	}

	/**
	 * Getter for the currentTime field.
	 * @return the value of the currentTime field.
	 */
	@Override
	public long getCurrentTime() {
		return currentTime;
	}

	/**
	 * Getter for the timeOfFirstTurn field.
	 * @return the value of the timeOfFirstTurn field.
	 */
	@Override
	public long getTimeOfFirstTurn() {
		return timeOfFirstTurn;
	}

	/**
	 * Getter for the timeToFirstTurn field.
	 * @return the value of the timeToFirstTurn field.
	 */
	@Override
	public long getTimeToFirstTurn() {
		return timeToFirstTurn;
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
	 * Setter for the enabled field.
	 * @param enabled the enabled value to set.
	 */
	@Override
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	/**
	 * Setter for the updating field.
	 * @param updating the updating value to set.
	 */
	@Override
	public void setUpdating(TurnUpdating updating) {
		this.updating = updating;
	}

	/**
	 * Setter for the interval field.
	 * @param interval the interval value to set.
	 */
	@Override
	public void setInterval(long interval) {
		if (interval < -1) {
			throw new IllegalArgumentException("interval too small, minimum of -1, value: '" + interval + "'");
		}
		this.interval = interval;
	}

	/**
	 * Setter for the timeToNextTurn field.
	 * @param timeToNextTurn the timeToNextTurn value to set.
	 */
	@Override
	public void setTimeToNextTurn(long timeToNextTurn) {
		if (timeToNextTurn < -1) {
			throw new IllegalArgumentException("timeToNextTurn too small, minimum of -1, value: '" + timeToNextTurn + "'");
		}
		this.timeToNextTurn = timeToNextTurn;
	}

	/**
	 * Setter for the timeOfNextTurn field.
	 * @param timeOfNextTurn the timeOfNextTurn value to set.
	 */
	@Override
	public void setTimeOfNextTurn(long timeOfNextTurn) {
		if (timeOfNextTurn < -1) {
			throw new IllegalArgumentException("timeOfNextTurn too small, minimum of -1, value: '" + timeOfNextTurn + "'");
		}
		this.timeOfNextTurn = timeOfNextTurn;
	}

	/**
	 * Setter for the currentTime field.
	 * @param currentTime the currentTime value to set.
	 */
	@Override
	public void setCurrentTime(long currentTime) {
		if (currentTime < -1) {
			throw new IllegalArgumentException("currentTime too small, minimum of -1, value: '" + currentTime + "'");
		}
		this.currentTime = currentTime;
	}

	/**
	 * Setter for the timeOfFirstTurn field.
	 * @param timeOfFirstTurn the timeOfFirstTurn value to set.
	 */
	@Override
	public void setTimeOfFirstTurn(long timeOfFirstTurn) {
		if (timeOfFirstTurn < -1) {
			throw new IllegalArgumentException("timeOfFirstTurn too small, minimum of -1, value: '" + timeOfFirstTurn + "'");
		}
		this.timeOfFirstTurn = timeOfFirstTurn;
	}

	/**
	 * Setter for the timeToFirstTurn field.
	 * @param timeToFirstTurn the timeToFirstTurn value to set.
	 */
	@Override
	public void setTimeToFirstTurn(long timeToFirstTurn) {
		if (timeToFirstTurn < -1) {
			throw new IllegalArgumentException("timeToFirstTurn too small, minimum of -1, value: '" + timeToFirstTurn + "'");
		}
		this.timeToFirstTurn = timeToFirstTurn;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getNumber());
		builder.append(getEnabled());
		builder.append(getUpdating());
		builder.append(getInterval());
		builder.append(getTimeToNextTurn());
		builder.append(getTimeOfNextTurn());
		builder.append(getCurrentTime());
		builder.append(getTimeOfFirstTurn());
		builder.append(getTimeToFirstTurn());
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
		ITurnSummary that = (ITurnSummary) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getNumber(), that.getNumber());
		builder.append(this.getEnabled(), that.getEnabled());
		builder.append(this.getUpdating(), that.getUpdating());
		builder.append(this.getInterval(), that.getInterval());
		builder.append(this.getTimeToNextTurn(), that.getTimeToNextTurn());
		builder.append(this.getTimeOfNextTurn(), that.getTimeOfNextTurn());
		builder.append(this.getCurrentTime(), that.getCurrentTime());
		builder.append(this.getTimeOfFirstTurn(), that.getTimeOfFirstTurn());
		builder.append(this.getTimeToFirstTurn(), that.getTimeToFirstTurn());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getNumber());
		builder.append(getEnabled());
		builder.append(getUpdating());
		builder.append(getInterval());
		builder.append(getTimeToNextTurn());
		builder.append(getTimeOfNextTurn());
		builder.append(getCurrentTime());
		builder.append(getTimeOfFirstTurn());
		builder.append(getTimeToFirstTurn());
		return builder.toString();
	}

	@Override
	public int compareTo(ITurnSummary that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getNumber(), that.getNumber());
		builder.append(this.getEnabled(), that.getEnabled());
		builder.append(this.getUpdating(), that.getUpdating());
		builder.append(this.getInterval(), that.getInterval());
		builder.append(this.getTimeToNextTurn(), that.getTimeToNextTurn());
		builder.append(this.getTimeOfNextTurn(), that.getTimeOfNextTurn());
		builder.append(this.getCurrentTime(), that.getCurrentTime());
		builder.append(this.getTimeOfFirstTurn(), that.getTimeOfFirstTurn());
		builder.append(this.getTimeToFirstTurn(), that.getTimeToFirstTurn());
		return builder.toComparison();
	}
}
