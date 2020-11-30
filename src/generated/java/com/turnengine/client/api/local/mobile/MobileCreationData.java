package com.turnengine.client.api.local.mobile;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class MobileCreationData implements IMobileCreationData {

	/** The id field. */
	private int id = 0;
	/** The name field. */
	private String name = null;
	/** The playerId field. */
	private int playerId = 0;
	/** The originId field. */
	private int originId = 0;
	/** The destinationId field. */
	private int destinationId = 0;
	/** The moveTurns field. */
	private int moveTurns = 0;
	/** The waitTurns field. */
	private int waitTurns = 0;

	/**
	 * The empty constructor.
	 */
	public MobileCreationData() {
	}

	/**
	 * The fields constructor.
	 */
	public MobileCreationData(int id, String name, int playerId, int originId, int destinationId, int moveTurns, int waitTurns) {
		setId(id);
		setName(name);
		setPlayerId(playerId);
		setOriginId(originId);
		setDestinationId(destinationId);
		setMoveTurns(moveTurns);
		setWaitTurns(waitTurns);
	}

	/**
	 * The clone constructor.
	 */
	public MobileCreationData(IMobileCreationData clone) {
		setId(clone.getId());
		setName(clone.getName());
		setPlayerId(clone.getPlayerId());
		setOriginId(clone.getOriginId());
		setDestinationId(clone.getDestinationId());
		setMoveTurns(clone.getMoveTurns());
		setWaitTurns(clone.getWaitTurns());
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
	 * Getter for the playerId field.
	 * @return the value of the playerId field.
	 */
	@Override
	public int getPlayerId() {
		return playerId;
	}

	/**
	 * Getter for the originId field.
	 * @return the value of the originId field.
	 */
	@Override
	public int getOriginId() {
		return originId;
	}

	/**
	 * Getter for the destinationId field.
	 * @return the value of the destinationId field.
	 */
	@Override
	public int getDestinationId() {
		return destinationId;
	}

	/**
	 * Getter for the moveTurns field.
	 * @return the value of the moveTurns field.
	 */
	@Override
	public int getMoveTurns() {
		return moveTurns;
	}

	/**
	 * Getter for the waitTurns field.
	 * @return the value of the waitTurns field.
	 */
	@Override
	public int getWaitTurns() {
		return waitTurns;
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
		if (name.length() < 1) {
			throw new IllegalArgumentException("name too short, minimum of 1 characters, value: '" + name + "'");
		}
		if (name.length() > 25) {
			throw new IllegalArgumentException("name too long, maximum of 25 characters, value: '" + name + "'");
		}
		this.name = name;
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

	/**
	 * Setter for the originId field.
	 * @param originId the originId value to set.
	 */
	@Override
	public void setOriginId(int originId) {
		if (originId < -1) {
			throw new IllegalArgumentException("originId too small, minimum of -1, value: '" + originId + "'");
		}
		this.originId = originId;
	}

	/**
	 * Setter for the destinationId field.
	 * @param destinationId the destinationId value to set.
	 */
	@Override
	public void setDestinationId(int destinationId) {
		if (destinationId < -1) {
			throw new IllegalArgumentException("destinationId too small, minimum of -1, value: '" + destinationId + "'");
		}
		this.destinationId = destinationId;
	}

	/**
	 * Setter for the moveTurns field.
	 * @param moveTurns the moveTurns value to set.
	 */
	@Override
	public void setMoveTurns(int moveTurns) {
		if (moveTurns < -1) {
			throw new IllegalArgumentException("moveTurns too small, minimum of -1, value: '" + moveTurns + "'");
		}
		this.moveTurns = moveTurns;
	}

	/**
	 * Setter for the waitTurns field.
	 * @param waitTurns the waitTurns value to set.
	 */
	@Override
	public void setWaitTurns(int waitTurns) {
		if (waitTurns < -1) {
			throw new IllegalArgumentException("waitTurns too small, minimum of -1, value: '" + waitTurns + "'");
		}
		this.waitTurns = waitTurns;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getId());
		builder.append(getName());
		builder.append(getPlayerId());
		builder.append(getOriginId());
		builder.append(getDestinationId());
		builder.append(getMoveTurns());
		builder.append(getWaitTurns());
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
		IMobileCreationData that = (IMobileCreationData) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getId(), that.getId());
		builder.append(this.getName(), that.getName());
		builder.append(this.getPlayerId(), that.getPlayerId());
		builder.append(this.getOriginId(), that.getOriginId());
		builder.append(this.getDestinationId(), that.getDestinationId());
		builder.append(this.getMoveTurns(), that.getMoveTurns());
		builder.append(this.getWaitTurns(), that.getWaitTurns());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getId());
		builder.append(getName());
		builder.append(getPlayerId());
		builder.append(getOriginId());
		builder.append(getDestinationId());
		builder.append(getMoveTurns());
		builder.append(getWaitTurns());
		return builder.toString();
	}

	@Override
	public int compareTo(IMobileCreationData that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getId(), that.getId());
		builder.append(this.getName(), that.getName());
		builder.append(this.getPlayerId(), that.getPlayerId());
		builder.append(this.getOriginId(), that.getOriginId());
		builder.append(this.getDestinationId(), that.getDestinationId());
		builder.append(this.getMoveTurns(), that.getMoveTurns());
		builder.append(this.getWaitTurns(), that.getWaitTurns());
		return builder.toComparison();
	}
}
