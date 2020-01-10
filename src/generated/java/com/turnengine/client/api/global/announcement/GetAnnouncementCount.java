package com.turnengine.client.api.global.announcement;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class GetAnnouncementCount implements IGetAnnouncementCount {

	/** The gameId field. */
	private int gameId = 0;

	/**
	 * The empty constructor.
	 */
	public GetAnnouncementCount() {
	}

	/**
	 * The fields constructor.
	 */
	public GetAnnouncementCount(int gameId) {
		setGameId(gameId);
	}

	/**
	 * The clone constructor.
	 */
	public GetAnnouncementCount(IGetAnnouncementCount clone) {
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
	 * Getter for the gameId field.
	 * @return the value of the gameId field.
	 */
	@Override
	public int getGameId() {
		return gameId;
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
		IGetAnnouncementCount that = (IGetAnnouncementCount) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getGameId(), that.getGameId());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getGameId());
		return builder.toString();
	}

	@Override
	public int compareTo(IGetAnnouncementCount that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getGameId(), that.getGameId());
		return builder.toComparison();
	}
}
