package com.turnengine.client.api.local.turn;

import java.util.concurrent.TimeUnit;
import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class SetTurnIntervalTime implements ISetTurnIntervalTime {

	/** The loginId field. */
	private long loginId = 0l;
	/** The instanceId field. */
	private int instanceId = 0;
	/** The interval field. */
	private long interval = 0l;
	/** The unit field. */
	private TimeUnit unit = null;

	/**
	 * The empty constructor.
	 */
	public SetTurnIntervalTime() {
	}

	/**
	 * The fields constructor.
	 */
	public SetTurnIntervalTime(long loginId, int instanceId, long interval, TimeUnit unit) {
		setLoginId(loginId);
		setInstanceId(instanceId);
		setInterval(interval);
		setUnit(unit);
	}

	/**
	 * The clone constructor.
	 */
	public SetTurnIntervalTime(ISetTurnIntervalTime clone) {
		setLoginId(clone.getLoginId());
		setInstanceId(clone.getInstanceId());
		setInterval(clone.getInterval());
		setUnit(clone.getUnit());
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
	 * Getter for the interval field.
	 * @return the value of the interval field.
	 */
	@Override
	public long getInterval() {
		return interval;
	}

	/**
	 * Getter for the unit field.
	 * @return the value of the unit field.
	 */
	@Override
	public TimeUnit getUnit() {
		return unit;
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
	 * Setter for the unit field.
	 * @param unit the unit value to set.
	 */
	@Override
	public void setUnit(TimeUnit unit) {
		this.unit = unit;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getLoginId());
		builder.append(getInstanceId());
		builder.append(getInterval());
		builder.append(getUnit());
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
		ISetTurnIntervalTime that = (ISetTurnIntervalTime) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getLoginId(), that.getLoginId());
		builder.append(this.getInstanceId(), that.getInstanceId());
		builder.append(this.getInterval(), that.getInterval());
		builder.append(this.getUnit(), that.getUnit());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getLoginId());
		builder.append(getInstanceId());
		builder.append(getInterval());
		builder.append(getUnit());
		return builder.toString();
	}

	@Override
	public int compareTo(ISetTurnIntervalTime that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getLoginId(), that.getLoginId());
		builder.append(this.getInstanceId(), that.getInstanceId());
		builder.append(this.getInterval(), that.getInterval());
		builder.append(this.getUnit(), that.getUnit());
		return builder.toComparison();
	}
}
