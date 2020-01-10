package com.turnengine.client.api.global.game;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class GetGameInstancesByGameName implements IGetGameInstancesByGameName {

	/** The gameName field. */
	private String gameName = null;

	/**
	 * The empty constructor.
	 */
	public GetGameInstancesByGameName() {
	}

	/**
	 * The fields constructor.
	 */
	public GetGameInstancesByGameName(String gameName) {
		setGameName(gameName);
	}

	/**
	 * The clone constructor.
	 */
	public GetGameInstancesByGameName(IGetGameInstancesByGameName clone) {
		setGameName(clone.getGameName());
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
	 * Getter for the gameName field.
	 * @return the value of the gameName field.
	 */
	@Override
	public String getGameName() {
		return gameName;
	}

	/**
	 * Setter for the gameName field.
	 * @param gameName the gameName value to set.
	 */
	@Override
	public void setGameName(String gameName) {
		if (gameName == null) {
			throw new NullPointerException("gameName");
		}
		if (gameName.length() < 4) {
			throw new IllegalArgumentException("gameName too short, minimum of 4 characters, value: '" + gameName + "'");
		}
		if (gameName.length() > 40) {
			throw new IllegalArgumentException("gameName too long, maximum of 40 characters, value: '" + gameName + "'");
		}
		this.gameName = gameName;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getGameName());
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
		IGetGameInstancesByGameName that = (IGetGameInstancesByGameName) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getGameName(), that.getGameName());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getGameName());
		return builder.toString();
	}

	@Override
	public int compareTo(IGetGameInstancesByGameName that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getGameName(), that.getGameName());
		return builder.toComparison();
	}
}
