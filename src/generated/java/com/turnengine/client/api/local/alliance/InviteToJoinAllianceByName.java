package com.turnengine.client.api.local.alliance;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class InviteToJoinAllianceByName implements IInviteToJoinAllianceByName {

	/** The loginId field. */
	private long loginId = 0l;
	/** The instanceId field. */
	private int instanceId = 0;
	/** The playerName field. */
	private String playerName = null;

	/**
	 * The empty constructor.
	 */
	public InviteToJoinAllianceByName() {
	}

	/**
	 * The fields constructor.
	 */
	public InviteToJoinAllianceByName(long loginId, int instanceId, String playerName) {
		setLoginId(loginId);
		setInstanceId(instanceId);
		setPlayerName(playerName);
	}

	/**
	 * The clone constructor.
	 */
	public InviteToJoinAllianceByName(IInviteToJoinAllianceByName clone) {
		setLoginId(clone.getLoginId());
		setInstanceId(clone.getInstanceId());
		setPlayerName(clone.getPlayerName());
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
	 * Getter for the playerName field.
	 * @return the value of the playerName field.
	 */
	@Override
	public String getPlayerName() {
		return playerName;
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
	 * Setter for the playerName field.
	 * @param playerName the playerName value to set.
	 */
	@Override
	public void setPlayerName(String playerName) {
		if (playerName == null) {
			throw new NullPointerException("playerName");
		}
		if (playerName.length() < 1) {
			throw new IllegalArgumentException("playerName too short, minimum of 1 characters, value: '" + playerName + "'");
		}
		if (playerName.length() > 30) {
			throw new IllegalArgumentException("playerName too long, maximum of 30 characters, value: '" + playerName + "'");
		}
		this.playerName = playerName;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getLoginId());
		builder.append(getInstanceId());
		builder.append(getPlayerName());
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
		IInviteToJoinAllianceByName that = (IInviteToJoinAllianceByName) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getLoginId(), that.getLoginId());
		builder.append(this.getInstanceId(), that.getInstanceId());
		builder.append(this.getPlayerName(), that.getPlayerName());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getLoginId());
		builder.append(getInstanceId());
		builder.append(getPlayerName());
		return builder.toString();
	}

	@Override
	public int compareTo(IInviteToJoinAllianceByName that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getLoginId(), that.getLoginId());
		builder.append(this.getInstanceId(), that.getInstanceId());
		builder.append(this.getPlayerName(), that.getPlayerName());
		return builder.toComparison();
	}
}
