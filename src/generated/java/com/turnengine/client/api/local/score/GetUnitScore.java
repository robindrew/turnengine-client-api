package com.turnengine.client.api.local.score;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class GetUnitScore implements IGetUnitScore {

	/** The loginId field. */
	private long loginId = 0l;
	/** The instanceId field. */
	private int instanceId = 0;
	/** The groupId field. */
	private int groupId = 0;
	/** The unitId field. */
	private int unitId = 0;

	/**
	 * The empty constructor.
	 */
	public GetUnitScore() {
	}

	/**
	 * The fields constructor.
	 */
	public GetUnitScore(long loginId, int instanceId, int groupId, int unitId) {
		setLoginId(loginId);
		setInstanceId(instanceId);
		setGroupId(groupId);
		setUnitId(unitId);
	}

	/**
	 * The clone constructor.
	 */
	public GetUnitScore(IGetUnitScore clone) {
		setLoginId(clone.getLoginId());
		setInstanceId(clone.getInstanceId());
		setGroupId(clone.getGroupId());
		setUnitId(clone.getUnitId());
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
	 * Getter for the groupId field.
	 * @return the value of the groupId field.
	 */
	@Override
	public int getGroupId() {
		return groupId;
	}

	/**
	 * Getter for the unitId field.
	 * @return the value of the unitId field.
	 */
	@Override
	public int getUnitId() {
		return unitId;
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
	 * Setter for the groupId field.
	 * @param groupId the groupId value to set.
	 */
	@Override
	public void setGroupId(int groupId) {
		if (groupId < -1) {
			throw new IllegalArgumentException("groupId too small, minimum of -1, value: '" + groupId + "'");
		}
		this.groupId = groupId;
	}

	/**
	 * Setter for the unitId field.
	 * @param unitId the unitId value to set.
	 */
	@Override
	public void setUnitId(int unitId) {
		if (unitId < -1) {
			throw new IllegalArgumentException("unitId too small, minimum of -1, value: '" + unitId + "'");
		}
		this.unitId = unitId;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getLoginId());
		builder.append(getInstanceId());
		builder.append(getGroupId());
		builder.append(getUnitId());
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
		IGetUnitScore that = (IGetUnitScore) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getLoginId(), that.getLoginId());
		builder.append(this.getInstanceId(), that.getInstanceId());
		builder.append(this.getGroupId(), that.getGroupId());
		builder.append(this.getUnitId(), that.getUnitId());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getLoginId());
		builder.append(getInstanceId());
		builder.append(getGroupId());
		builder.append(getUnitId());
		return builder.toString();
	}

	@Override
	public int compareTo(IGetUnitScore that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getLoginId(), that.getLoginId());
		builder.append(this.getInstanceId(), that.getInstanceId());
		builder.append(this.getGroupId(), that.getGroupId());
		builder.append(this.getUnitId(), that.getUnitId());
		return builder.toComparison();
	}
}
