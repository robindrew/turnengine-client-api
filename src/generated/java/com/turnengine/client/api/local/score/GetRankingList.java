package com.turnengine.client.api.local.score;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class GetRankingList implements IGetRankingList {

	/** The loginId field. */
	private long loginId = 0l;
	/** The instanceId field. */
	private int instanceId = 0;
	/** The type field. */
	private RankingType type = null;
	/** The groupId field. */
	private int groupId = 0;

	/**
	 * The empty constructor.
	 */
	public GetRankingList() {
	}

	/**
	 * The fields constructor.
	 */
	public GetRankingList(long loginId, int instanceId, RankingType type, int groupId) {
		setLoginId(loginId);
		setInstanceId(instanceId);
		setType(type);
		setGroupId(groupId);
	}

	/**
	 * The clone constructor.
	 */
	public GetRankingList(IGetRankingList clone) {
		setLoginId(clone.getLoginId());
		setInstanceId(clone.getInstanceId());
		setType(clone.getType());
		setGroupId(clone.getGroupId());
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
	 * Getter for the type field.
	 * @return the value of the type field.
	 */
	@Override
	public RankingType getType() {
		return type;
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
	 * Setter for the type field.
	 * @param type the type value to set.
	 */
	@Override
	public void setType(RankingType type) {
		this.type = type;
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

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getLoginId());
		builder.append(getInstanceId());
		builder.append(getType());
		builder.append(getGroupId());
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
		IGetRankingList that = (IGetRankingList) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getLoginId(), that.getLoginId());
		builder.append(this.getInstanceId(), that.getInstanceId());
		builder.append(this.getType(), that.getType());
		builder.append(this.getGroupId(), that.getGroupId());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getLoginId());
		builder.append(getInstanceId());
		builder.append(getType());
		builder.append(getGroupId());
		return builder.toString();
	}

	@Override
	public int compareTo(IGetRankingList that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getLoginId(), that.getLoginId());
		builder.append(this.getInstanceId(), that.getInstanceId());
		builder.append(this.getType(), that.getType());
		builder.append(this.getGroupId(), that.getGroupId());
		return builder.toComparison();
	}
}
