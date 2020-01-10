package com.turnengine.client.api.local.location;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class GetGridInfoList implements IGetGridInfoList {

	/** The loginId field. */
	private long loginId = 0l;
	/** The instanceId field. */
	private int instanceId = 0;
	/** The coordinates field. */
	private int[] coordinates = null;
	/** The depth field. */
	private int depth = 0;

	/**
	 * The empty constructor.
	 */
	public GetGridInfoList() {
	}

	/**
	 * The fields constructor.
	 */
	public GetGridInfoList(long loginId, int instanceId, int[] coordinates, int depth) {
		setLoginId(loginId);
		setInstanceId(instanceId);
		setCoordinates(coordinates);
		setDepth(depth);
	}

	/**
	 * The clone constructor.
	 */
	public GetGridInfoList(IGetGridInfoList clone) {
		setLoginId(clone.getLoginId());
		setInstanceId(clone.getInstanceId());
		setCoordinates(clone.getCoordinates());
		setDepth(clone.getDepth());
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
	 * Getter for the depth field.
	 * @return the value of the depth field.
	 */
	@Override
	public int getDepth() {
		return depth;
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

	/**
	 * Setter for the depth field.
	 * @param depth the depth value to set.
	 */
	@Override
	public void setDepth(int depth) {
		if (depth < 0) {
			throw new IllegalArgumentException("depth too small, minimum of 0, value: '" + depth + "'");
		}
		this.depth = depth;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getLoginId());
		builder.append(getInstanceId());
		builder.append(getCoordinates());
		builder.append(getDepth());
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
		IGetGridInfoList that = (IGetGridInfoList) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getLoginId(), that.getLoginId());
		builder.append(this.getInstanceId(), that.getInstanceId());
		builder.append(this.getCoordinates(), that.getCoordinates());
		builder.append(this.getDepth(), that.getDepth());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getLoginId());
		builder.append(getInstanceId());
		builder.append(getCoordinates());
		builder.append(getDepth());
		return builder.toString();
	}

	@Override
	public int compareTo(IGetGridInfoList that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getLoginId(), that.getLoginId());
		builder.append(this.getInstanceId(), that.getInstanceId());
		builder.append(this.getCoordinates(), that.getCoordinates());
		builder.append(this.getDepth(), that.getDepth());
		return builder.toComparison();
	}
}
