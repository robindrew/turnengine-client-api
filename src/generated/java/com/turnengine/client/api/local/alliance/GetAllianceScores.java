package com.turnengine.client.api.local.alliance;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class GetAllianceScores implements IGetAllianceScores {

	/** The loginId field. */
	private long loginId = 0l;
	/** The instanceId field. */
	private int instanceId = 0;
	/** The allianceId field. */
	private int allianceId = 0;
	/** The groupId field. */
	private int groupId = 0;
	/** The maxSize field. */
	private int maxSize = 0;
	/** The minTurn field. */
	private int minTurn = 0;
	/** The maxTurn field. */
	private int maxTurn = 0;

	/**
	 * The empty constructor.
	 */
	public GetAllianceScores() {
	}

	/**
	 * The fields constructor.
	 */
	public GetAllianceScores(long loginId, int instanceId, int allianceId, int groupId, int maxSize, int minTurn, int maxTurn) {
		setLoginId(loginId);
		setInstanceId(instanceId);
		setAllianceId(allianceId);
		setGroupId(groupId);
		setMaxSize(maxSize);
		setMinTurn(minTurn);
		setMaxTurn(maxTurn);
	}

	/**
	 * The clone constructor.
	 */
	public GetAllianceScores(IGetAllianceScores clone) {
		setLoginId(clone.getLoginId());
		setInstanceId(clone.getInstanceId());
		setAllianceId(clone.getAllianceId());
		setGroupId(clone.getGroupId());
		setMaxSize(clone.getMaxSize());
		setMinTurn(clone.getMinTurn());
		setMaxTurn(clone.getMaxTurn());
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
	 * Getter for the allianceId field.
	 * @return the value of the allianceId field.
	 */
	@Override
	public int getAllianceId() {
		return allianceId;
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
	 * Getter for the maxSize field.
	 * @return the value of the maxSize field.
	 */
	@Override
	public int getMaxSize() {
		return maxSize;
	}

	/**
	 * Getter for the minTurn field.
	 * @return the value of the minTurn field.
	 */
	@Override
	public int getMinTurn() {
		return minTurn;
	}

	/**
	 * Getter for the maxTurn field.
	 * @return the value of the maxTurn field.
	 */
	@Override
	public int getMaxTurn() {
		return maxTurn;
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
	 * Setter for the allianceId field.
	 * @param allianceId the allianceId value to set.
	 */
	@Override
	public void setAllianceId(int allianceId) {
		if (allianceId < -1) {
			throw new IllegalArgumentException("allianceId too small, minimum of -1, value: '" + allianceId + "'");
		}
		this.allianceId = allianceId;
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
	 * Setter for the maxSize field.
	 * @param maxSize the maxSize value to set.
	 */
	@Override
	public void setMaxSize(int maxSize) {
		this.maxSize = maxSize;
	}

	/**
	 * Setter for the minTurn field.
	 * @param minTurn the minTurn value to set.
	 */
	@Override
	public void setMinTurn(int minTurn) {
		if (minTurn < -1) {
			throw new IllegalArgumentException("minTurn too small, minimum of -1, value: '" + minTurn + "'");
		}
		this.minTurn = minTurn;
	}

	/**
	 * Setter for the maxTurn field.
	 * @param maxTurn the maxTurn value to set.
	 */
	@Override
	public void setMaxTurn(int maxTurn) {
		if (maxTurn < -1) {
			throw new IllegalArgumentException("maxTurn too small, minimum of -1, value: '" + maxTurn + "'");
		}
		this.maxTurn = maxTurn;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getLoginId());
		builder.append(getInstanceId());
		builder.append(getAllianceId());
		builder.append(getGroupId());
		builder.append(getMaxSize());
		builder.append(getMinTurn());
		builder.append(getMaxTurn());
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
		IGetAllianceScores that = (IGetAllianceScores) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getLoginId(), that.getLoginId());
		builder.append(this.getInstanceId(), that.getInstanceId());
		builder.append(this.getAllianceId(), that.getAllianceId());
		builder.append(this.getGroupId(), that.getGroupId());
		builder.append(this.getMaxSize(), that.getMaxSize());
		builder.append(this.getMinTurn(), that.getMinTurn());
		builder.append(this.getMaxTurn(), that.getMaxTurn());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getLoginId());
		builder.append(getInstanceId());
		builder.append(getAllianceId());
		builder.append(getGroupId());
		builder.append(getMaxSize());
		builder.append(getMinTurn());
		builder.append(getMaxTurn());
		return builder.toString();
	}

	@Override
	public int compareTo(IGetAllianceScores that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getLoginId(), that.getLoginId());
		builder.append(this.getInstanceId(), that.getInstanceId());
		builder.append(this.getAllianceId(), that.getAllianceId());
		builder.append(this.getGroupId(), that.getGroupId());
		builder.append(this.getMaxSize(), that.getMaxSize());
		builder.append(this.getMinTurn(), that.getMinTurn());
		builder.append(this.getMaxTurn(), that.getMaxTurn());
		return builder.toComparison();
	}
}
