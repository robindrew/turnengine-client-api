package com.turnengine.client.api.global.game;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class GameInstance implements IGameInstance {

	/** The id field. */
	private int id = 0;
	/** The name field. */
	private String name = null;
	/** The gameId field. */
	private int gameId = 0;
	/** The versionId field. */
	private int versionId = 0;
	/** The hostId field. */
	private int hostId = 0;

	/**
	 * The empty constructor.
	 */
	public GameInstance() {
	}

	/**
	 * The fields constructor.
	 */
	public GameInstance(int id, String name, int gameId, int versionId, int hostId) {
		setId(id);
		setName(name);
		setGameId(gameId);
		setVersionId(versionId);
		setHostId(hostId);
	}

	/**
	 * The clone constructor.
	 */
	public GameInstance(IGameInstance clone) {
		setId(clone.getId());
		setName(clone.getName());
		setGameId(clone.getGameId());
		setVersionId(clone.getVersionId());
		setHostId(clone.getHostId());
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
	 * Getter for the versionId field.
	 * @return the value of the versionId field.
	 */
	@Override
	public int getVersionId() {
		return versionId;
	}

	/**
	 * Getter for the hostId field.
	 * @return the value of the hostId field.
	 */
	@Override
	public int getHostId() {
		return hostId;
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

	/**
	 * Setter for the versionId field.
	 * @param versionId the versionId value to set.
	 */
	@Override
	public void setVersionId(int versionId) {
		if (versionId < -1) {
			throw new IllegalArgumentException("versionId too small, minimum of -1, value: '" + versionId + "'");
		}
		this.versionId = versionId;
	}

	/**
	 * Setter for the hostId field.
	 * @param hostId the hostId value to set.
	 */
	@Override
	public void setHostId(int hostId) {
		if (hostId < -1) {
			throw new IllegalArgumentException("hostId too small, minimum of -1, value: '" + hostId + "'");
		}
		this.hostId = hostId;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getId());
		builder.append(getName());
		builder.append(getGameId());
		builder.append(getVersionId());
		builder.append(getHostId());
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
		IGameInstance that = (IGameInstance) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getId(), that.getId());
		builder.append(this.getName(), that.getName());
		builder.append(this.getGameId(), that.getGameId());
		builder.append(this.getVersionId(), that.getVersionId());
		builder.append(this.getHostId(), that.getHostId());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getId());
		builder.append(getName());
		builder.append(getGameId());
		builder.append(getVersionId());
		builder.append(getHostId());
		return builder.toString();
	}

	@Override
	public int compareTo(IGameInstance that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getId(), that.getId());
		builder.append(this.getName(), that.getName());
		builder.append(this.getGameId(), that.getGameId());
		builder.append(this.getVersionId(), that.getVersionId());
		builder.append(this.getHostId(), that.getHostId());
		return builder.toComparison();
	}
}
