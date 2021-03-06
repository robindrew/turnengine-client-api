package com.turnengine.client.api.global.game;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class GetGameInstanceById implements IGetGameInstanceById {

	/** The instanceId field. */
	private int instanceId = 0;

	/**
	 * The empty constructor.
	 */
	public GetGameInstanceById() {
	}

	/**
	 * The fields constructor.
	 */
	public GetGameInstanceById(int instanceId) {
		setInstanceId(instanceId);
	}

	/**
	 * The clone constructor.
	 */
	public GetGameInstanceById(IGetGameInstanceById clone) {
		setInstanceId(clone.getInstanceId());
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
	 * Getter for the instanceId field.
	 * @return the value of the instanceId field.
	 */
	@Override
	public int getInstanceId() {
		return instanceId;
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

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getInstanceId());
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
		IGetGameInstanceById that = (IGetGameInstanceById) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getInstanceId(), that.getInstanceId());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getInstanceId());
		return builder.toString();
	}

	@Override
	public int compareTo(IGetGameInstanceById that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getInstanceId(), that.getInstanceId());
		return builder.toComparison();
	}
}
