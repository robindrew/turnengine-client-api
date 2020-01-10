package com.turnengine.client.api.local.turn;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class SetTurnInterval implements ISetTurnInterval {

	/** The loginId field. */
	private long loginId = 0l;
	/** The instanceId field. */
	private int instanceId = 0;
	/** The interval field. */
	private long interval = 0l;

	/**
	 * The empty constructor.
	 */
	public SetTurnInterval() {
	}

	/**
	 * The fields constructor.
	 */
	public SetTurnInterval(long loginId, int instanceId, long interval) {
		setLoginId(loginId);
		setInstanceId(instanceId);
		setInterval(interval);
	}

	/**
	 * The clone constructor.
	 */
	public SetTurnInterval(ISetTurnInterval clone) {
		setLoginId(clone.getLoginId());
		setInstanceId(clone.getInstanceId());
		setInterval(clone.getInterval());
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

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getLoginId());
		builder.append(getInstanceId());
		builder.append(getInterval());
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
		ISetTurnInterval that = (ISetTurnInterval) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getLoginId(), that.getLoginId());
		builder.append(this.getInstanceId(), that.getInstanceId());
		builder.append(this.getInterval(), that.getInterval());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getLoginId());
		builder.append(getInstanceId());
		builder.append(getInterval());
		return builder.toString();
	}

	@Override
	public int compareTo(ISetTurnInterval that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getLoginId(), that.getLoginId());
		builder.append(this.getInstanceId(), that.getInstanceId());
		builder.append(this.getInterval(), that.getInterval());
		return builder.toComparison();
	}
}
