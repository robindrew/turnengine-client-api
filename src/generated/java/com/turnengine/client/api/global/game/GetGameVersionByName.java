package com.turnengine.client.api.global.game;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class GetGameVersionByName implements IGetGameVersionByName {

	/** The versionName field. */
	private String versionName = null;
	/** The gameId field. */
	private int gameId = 0;

	/**
	 * The empty constructor.
	 */
	public GetGameVersionByName() {
	}

	/**
	 * The fields constructor.
	 */
	public GetGameVersionByName(String versionName, int gameId) {
		setVersionName(versionName);
		setGameId(gameId);
	}

	/**
	 * The clone constructor.
	 */
	public GetGameVersionByName(IGetGameVersionByName clone) {
		setVersionName(clone.getVersionName());
		setGameId(clone.getGameId());
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
	 * Getter for the versionName field.
	 * @return the value of the versionName field.
	 */
	@Override
	public String getVersionName() {
		return versionName;
	}

	/**
	 * Getter for the gameId field.
	 * @return the value of the gameId field.
	 */
	@Override
	public int getGameId() {
		return gameId;
	}

	/**
	 * Setter for the versionName field.
	 * @param versionName the versionName value to set.
	 */
	@Override
	public void setVersionName(String versionName) {
		if (versionName == null) {
			throw new NullPointerException("versionName");
		}
		if (versionName.length() < 4) {
			throw new IllegalArgumentException("versionName too short, minimum of 4 characters, value: '" + versionName + "'");
		}
		if (versionName.length() > 40) {
			throw new IllegalArgumentException("versionName too long, maximum of 40 characters, value: '" + versionName + "'");
		}
		this.versionName = versionName;
	}

	/**
	 * Setter for the gameId field.
	 * @param gameId the gameId value to set.
	 */
	@Override
	public void setGameId(int gameId) {
		if (gameId < -1) {
			throw new IllegalArgumentException("gameId too small, minimum of -1, value: '" + gameId + "'");
		}
		this.gameId = gameId;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getVersionName());
		builder.append(getGameId());
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
		IGetGameVersionByName that = (IGetGameVersionByName) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getVersionName(), that.getVersionName());
		builder.append(this.getGameId(), that.getGameId());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getVersionName());
		builder.append(getGameId());
		return builder.toString();
	}

	@Override
	public int compareTo(IGetGameVersionByName that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getVersionName(), that.getVersionName());
		builder.append(this.getGameId(), that.getGameId());
		return builder.toComparison();
	}
}
