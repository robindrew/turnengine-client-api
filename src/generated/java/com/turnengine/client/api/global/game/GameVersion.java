package com.turnengine.client.api.global.game;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class GameVersion implements IGameVersion {

	/** The id field. */
	private int id = 0;
	/** The name field. */
	private String name = null;
	/** The gameId field. */
	private int gameId = 0;

	/**
	 * The empty constructor.
	 */
	public GameVersion() {
	}

	/**
	 * The fields constructor.
	 */
	public GameVersion(int id, String name, int gameId) {
		setId(id);
		setName(name);
		setGameId(gameId);
	}

	/**
	 * The clone constructor.
	 */
	public GameVersion(IGameVersion clone) {
		setId(clone.getId());
		setName(clone.getName());
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
	 * Getter for the id field.
	 * @return the value of the id field.
	 */
	@Override
	public int getId() {
		return id;
	}

	/**
	 * Getter for the name field.
	 * @return the value of the name field.
	 */
	@Override
	public String getName() {
		return name;
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
	 * Setter for the id field.
	 * @param id the id value to set.
	 */
	@Override
	public void setId(int id) {
		if (id < -1) {
			throw new IllegalArgumentException("id too small, minimum of -1, value: '" + id + "'");
		}
		this.id = id;
	}

	/**
	 * Setter for the name field.
	 * @param name the name value to set.
	 */
	@Override
	public void setName(String name) {
		if (name == null) {
			throw new NullPointerException("name");
		}
		if (name.length() < 4) {
			throw new IllegalArgumentException("name too short, minimum of 4 characters, value: '" + name + "'");
		}
		if (name.length() > 40) {
			throw new IllegalArgumentException("name too long, maximum of 40 characters, value: '" + name + "'");
		}
		this.name = name;
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
		builder.append(getId());
		builder.append(getName());
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
		IGameVersion that = (IGameVersion) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getId(), that.getId());
		builder.append(this.getName(), that.getName());
		builder.append(this.getGameId(), that.getGameId());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getId());
		builder.append(getName());
		builder.append(getGameId());
		return builder.toString();
	}

	@Override
	public int compareTo(IGameVersion that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getId(), that.getId());
		builder.append(this.getName(), that.getName());
		builder.append(this.getGameId(), that.getGameId());
		return builder.toComparison();
	}
}
