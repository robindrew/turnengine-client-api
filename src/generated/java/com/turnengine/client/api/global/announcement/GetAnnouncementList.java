package com.turnengine.client.api.global.announcement;

import com.turnengine.client.api.global.game.GameLevel;
import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class GetAnnouncementList implements IGetAnnouncementList {

	/** The gameLevelId field. */
	private int gameLevelId = 0;
	/** The gameLevel field. */
	private GameLevel gameLevel = null;

	/**
	 * The empty constructor.
	 */
	public GetAnnouncementList() {
	}

	/**
	 * The fields constructor.
	 */
	public GetAnnouncementList(int gameLevelId, GameLevel gameLevel) {
		setGameLevelId(gameLevelId);
		setGameLevel(gameLevel);
	}

	/**
	 * The clone constructor.
	 */
	public GetAnnouncementList(IGetAnnouncementList clone) {
		setGameLevelId(clone.getGameLevelId());
		setGameLevel(clone.getGameLevel());
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
	 * Getter for the gameLevelId field.
	 * @return the value of the gameLevelId field.
	 */
	@Override
	public int getGameLevelId() {
		return gameLevelId;
	}

	/**
	 * Getter for the gameLevel field.
	 * @return the value of the gameLevel field.
	 */
	@Override
	public GameLevel getGameLevel() {
		return gameLevel;
	}

	/**
	 * Setter for the gameLevelId field.
	 * @param gameLevelId the gameLevelId value to set.
	 */
	@Override
	public void setGameLevelId(int gameLevelId) {
		if (gameLevelId < 0) {
			throw new IllegalArgumentException("gameLevelId too small, minimum of 0, value: '" + gameLevelId + "'");
		}
		this.gameLevelId = gameLevelId;
	}

	/**
	 * Setter for the gameLevel field.
	 * @param gameLevel the gameLevel value to set.
	 */
	@Override
	public void setGameLevel(GameLevel gameLevel) {
		this.gameLevel = gameLevel;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getGameLevelId());
		builder.append(getGameLevel());
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
		IGetAnnouncementList that = (IGetAnnouncementList) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getGameLevelId(), that.getGameLevelId());
		builder.append(this.getGameLevel(), that.getGameLevel());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getGameLevelId());
		builder.append(getGameLevel());
		return builder.toString();
	}

	@Override
	public int compareTo(IGetAnnouncementList that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getGameLevelId(), that.getGameLevelId());
		builder.append(this.getGameLevel(), that.getGameLevel());
		return builder.toComparison();
	}
}
