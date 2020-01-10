package com.turnengine.client.api.local.player;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class GetUserAdminInfoByPlayer implements IGetUserAdminInfoByPlayer {

	/** The loginId field. */
	private long loginId = 0l;
	/** The instanceId field. */
	private int instanceId = 0;
	/** The playerId field. */
	private int playerId = 0;

	/**
	 * The empty constructor.
	 */
	public GetUserAdminInfoByPlayer() {
	}

	/**
	 * The fields constructor.
	 */
	public GetUserAdminInfoByPlayer(long loginId, int instanceId, int playerId) {
		setLoginId(loginId);
		setInstanceId(instanceId);
		setPlayerId(playerId);
	}

	/**
	 * The clone constructor.
	 */
	public GetUserAdminInfoByPlayer(IGetUserAdminInfoByPlayer clone) {
		setLoginId(clone.getLoginId());
		setInstanceId(clone.getInstanceId());
		setPlayerId(clone.getPlayerId());
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
	 * Getter for the playerId field.
	 * @return the value of the playerId field.
	 */
	@Override
	public int getPlayerId() {
		return playerId;
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
	 * Setter for the playerId field.
	 * @param playerId the playerId value to set.
	 */
	@Override
	public void setPlayerId(int playerId) {
		if (playerId < -1) {
			throw new IllegalArgumentException("playerId too small, minimum of -1, value: '" + playerId + "'");
		}
		this.playerId = playerId;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getLoginId());
		builder.append(getInstanceId());
		builder.append(getPlayerId());
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
		IGetUserAdminInfoByPlayer that = (IGetUserAdminInfoByPlayer) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getLoginId(), that.getLoginId());
		builder.append(this.getInstanceId(), that.getInstanceId());
		builder.append(this.getPlayerId(), that.getPlayerId());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getLoginId());
		builder.append(getInstanceId());
		builder.append(getPlayerId());
		return builder.toString();
	}

	@Override
	public int compareTo(IGetUserAdminInfoByPlayer that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getLoginId(), that.getLoginId());
		builder.append(this.getInstanceId(), that.getInstanceId());
		builder.append(this.getPlayerId(), that.getPlayerId());
		return builder.toComparison();
	}
}
