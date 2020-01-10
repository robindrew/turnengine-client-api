package com.turnengine.client.api.local.location;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class GetLocationId implements IGetLocationId {

	/** The loginId field. */
	private long loginId = 0l;
	/** The instanceId field. */
	private int instanceId = 0;
	/** The coordinates field. */
	private int[] coordinates = null;

	/**
	 * The empty constructor.
	 */
	public GetLocationId() {
	}

	/**
	 * The fields constructor.
	 */
	public GetLocationId(long loginId, int instanceId, int[] coordinates) {
		setLoginId(loginId);
		setInstanceId(instanceId);
		setCoordinates(coordinates);
	}

	/**
	 * The clone constructor.
	 */
	public GetLocationId(IGetLocationId clone) {
		setLoginId(clone.getLoginId());
		setInstanceId(clone.getInstanceId());
		setCoordinates(clone.getCoordinates());
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
	 * Getter for the coordinates field.
	 * @return the value of the coordinates field.
	 */
	@Override
	public int[] getCoordinates() {
		return coordinates;
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
	 * Setter for the coordinates field.
	 * @param coordinates the coordinates value to set.
	 */
	@Override
	public void setCoordinates(int[] coordinates) {
		if (coordinates == null) {
			throw new NullPointerException("coordinates");
		}
		this.coordinates = coordinates;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getLoginId());
		builder.append(getInstanceId());
		builder.append(getCoordinates());
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
		IGetLocationId that = (IGetLocationId) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getLoginId(), that.getLoginId());
		builder.append(this.getInstanceId(), that.getInstanceId());
		builder.append(this.getCoordinates(), that.getCoordinates());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getLoginId());
		builder.append(getInstanceId());
		builder.append(getCoordinates());
		return builder.toString();
	}

	@Override
	public int compareTo(IGetLocationId that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getLoginId(), that.getLoginId());
		builder.append(this.getInstanceId(), that.getInstanceId());
		builder.append(this.getCoordinates(), that.getCoordinates());
		return builder.toComparison();
	}
}
