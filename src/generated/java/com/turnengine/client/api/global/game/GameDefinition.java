package com.turnengine.client.api.global.game;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class GameDefinition implements IGameDefinition {

	/** The game field. */
	private IGame game = null;
	/** The version field. */
	private IGameVersion version = null;
	/** The instance field. */
	private IGameInstance instance = null;
	/** The host field. */
	private IGameHost host = null;

	/**
	 * The empty constructor.
	 */
	public GameDefinition() {
	}

	/**
	 * The fields constructor.
	 */
	public GameDefinition(IGame game, IGameVersion version, IGameInstance instance, IGameHost host) {
		setGame(game);
		setVersion(version);
		setInstance(instance);
		setHost(host);
	}

	/**
	 * The clone constructor.
	 */
	public GameDefinition(IGameDefinition clone) {
		setGame(clone.getGame());
		setVersion(clone.getVersion());
		setInstance(clone.getInstance());
		setHost(clone.getHost());
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
	 * Getter for the game field.
	 * @return the value of the game field.
	 */
	@Override
	public IGame getGame() {
		return game;
	}

	/**
	 * Getter for the version field.
	 * @return the value of the version field.
	 */
	@Override
	public IGameVersion getVersion() {
		return version;
	}

	/**
	 * Getter for the instance field.
	 * @return the value of the instance field.
	 */
	@Override
	public IGameInstance getInstance() {
		return instance;
	}

	/**
	 * Getter for the host field.
	 * @return the value of the host field.
	 */
	@Override
	public IGameHost getHost() {
		return host;
	}

	/**
	 * Setter for the game field.
	 * @param game the game value to set.
	 */
	@Override
	public void setGame(IGame game) {
		this.game = game;
	}

	/**
	 * Setter for the version field.
	 * @param version the version value to set.
	 */
	@Override
	public void setVersion(IGameVersion version) {
		this.version = version;
	}

	/**
	 * Setter for the instance field.
	 * @param instance the instance value to set.
	 */
	@Override
	public void setInstance(IGameInstance instance) {
		this.instance = instance;
	}

	/**
	 * Setter for the host field.
	 * @param host the host value to set.
	 */
	@Override
	public void setHost(IGameHost host) {
		this.host = host;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getGame());
		builder.append(getVersion());
		builder.append(getInstance());
		builder.append(getHost());
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
		IGameDefinition that = (IGameDefinition) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getGame(), that.getGame());
		builder.append(this.getVersion(), that.getVersion());
		builder.append(this.getInstance(), that.getInstance());
		builder.append(this.getHost(), that.getHost());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getGame());
		builder.append(getVersion());
		builder.append(getInstance());
		builder.append(getHost());
		return builder.toString();
	}

	@Override
	public int compareTo(IGameDefinition that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getGame(), that.getGame());
		builder.append(this.getVersion(), that.getVersion());
		builder.append(this.getInstance(), that.getInstance());
		builder.append(this.getHost(), that.getHost());
		return builder.toComparison();
	}
}
