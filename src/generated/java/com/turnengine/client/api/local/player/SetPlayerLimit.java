package com.turnengine.client.api.local.player;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class SetPlayerLimit implements ISetPlayerLimit {

	/** The loginId field. */
	private long loginId = 0l;
	/** The instanceId field. */
	private int instanceId = 0;
	/** The limit field. */
	private int limit = 0;

	/**
	 * The empty constructor.
	 */
	public SetPlayerLimit() {
	}

	/**
	 * The fields constructor.
	 */
	public SetPlayerLimit(long loginId, int instanceId, int limit) {
		setLoginId(loginId);
		setInstanceId(instanceId);
		setLimit(limit);
	}

	/**
	 * The clone constructor.
	 */
	public SetPlayerLimit(ISetPlayerLimit clone) {
		setLoginId(clone.getLoginId());
		setInstanceId(clone.getInstanceId());
		setLimit(clone.getLimit());
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
	 * Getter for the limit field.
	 * @return the value of the limit field.
	 */
	@Override
	public int getLimit() {
		return limit;
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
	 * Setter for the limit field.
	 * @param limit the limit value to set.
	 */
	@Override
	public void setLimit(int limit) {
		if (limit < 0) {
			throw new IllegalArgumentException("limit too small, minimum of 0, value: '" + limit + "'");
		}
		this.limit = limit;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getLoginId());
		builder.append(getInstanceId());
		builder.append(getLimit());
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
		ISetPlayerLimit that = (ISetPlayerLimit) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getLoginId(), that.getLoginId());
		builder.append(this.getInstanceId(), that.getInstanceId());
		builder.append(this.getLimit(), that.getLimit());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getLoginId());
		builder.append(getInstanceId());
		builder.append(getLimit());
		return builder.toString();
	}

	@Override
	public int compareTo(ISetPlayerLimit that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getLoginId(), that.getLoginId());
		builder.append(this.getInstanceId(), that.getInstanceId());
		builder.append(this.getLimit(), that.getLimit());
		return builder.toComparison();
	}
}
