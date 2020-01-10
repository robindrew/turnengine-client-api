package com.turnengine.client.api.local.mobile;

import com.turnengine.client.api.local.location.ILocationInfo;
import com.turnengine.client.api.local.player.IPlayerInfo;
import com.turnengine.client.api.local.unit.IUnitCount;
import java.util.List;
import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Mobile implements IMobile {

	/** The id field. */
	private int id = 0;
	/** The name field. */
	private String name = null;
	/** The player field. */
	private IPlayerInfo player = null;
	/** The origin field. */
	private ILocationInfo origin = null;
	/** The destination field. */
	private ILocationInfo destination = null;
	/** The moveTurns field. */
	private int moveTurns = 0;
	/** The waitTurns field. */
	private int waitTurns = 0;
	/** The unitList field. */
	private List<IUnitCount> unitList = null;

	/**
	 * The empty constructor.
	 */
	public Mobile() {
	}

	/**
	 * The fields constructor.
	 */
	public Mobile(int id, String name, IPlayerInfo player, ILocationInfo origin, ILocationInfo destination, int moveTurns, int waitTurns, List<IUnitCount> unitList) {
		setId(id);
		setName(name);
		setPlayer(player);
		setOrigin(origin);
		setDestination(destination);
		setMoveTurns(moveTurns);
		setWaitTurns(waitTurns);
		setUnitList(unitList);
	}

	/**
	 * The clone constructor.
	 */
	public Mobile(IMobile clone) {
		setId(clone.getId());
		setName(clone.getName());
		setPlayer(clone.getPlayer());
		setOrigin(clone.getOrigin());
		setDestination(clone.getDestination());
		setMoveTurns(clone.getMoveTurns());
		setWaitTurns(clone.getWaitTurns());
		setUnitList(clone.getUnitList());
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
	 * Getter for the player field.
	 * @return the value of the player field.
	 */
	@Override
	public IPlayerInfo getPlayer() {
		return player;
	}

	/**
	 * Getter for the origin field.
	 * @return the value of the origin field.
	 */
	@Override
	public ILocationInfo getOrigin() {
		return origin;
	}

	/**
	 * Getter for the destination field.
	 * @return the value of the destination field.
	 */
	@Override
	public ILocationInfo getDestination() {
		return destination;
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
	 * Getter for the unitList field.
	 * @return the value of the unitList field.
	 */
	@Override
	public List<IUnitCount> getUnitList() {
		return unitList;
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
	 * Setter for the player field.
	 * @param player the player value to set.
	 */
	@Override
	public void setPlayer(IPlayerInfo player) {
		this.player = player;
	}

	/**
	 * Setter for the origin field.
	 * @param origin the origin value to set.
	 */
	@Override
	public void setOrigin(ILocationInfo origin) {
		this.origin = origin;
	}

	/**
	 * Setter for the destination field.
	 * @param destination the destination value to set.
	 */
	@Override
	public void setDestination(ILocationInfo destination) {
		this.destination = destination;
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

	/**
	 * Setter for the unitList field.
	 * @param unitList the unitList value to set.
	 */
	@Override
	public void setUnitList(List<IUnitCount> unitList) {
		this.unitList = unitList;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getId());
		builder.append(getName());
		builder.append(getPlayer());
		builder.append(getOrigin());
		builder.append(getDestination());
		builder.append(getMoveTurns());
		builder.append(getWaitTurns());
		builder.append(getUnitList());
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
		IMobile that = (IMobile) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getId(), that.getId());
		builder.append(this.getName(), that.getName());
		builder.append(this.getPlayer(), that.getPlayer());
		builder.append(this.getOrigin(), that.getOrigin());
		builder.append(this.getDestination(), that.getDestination());
		builder.append(this.getMoveTurns(), that.getMoveTurns());
		builder.append(this.getWaitTurns(), that.getWaitTurns());
		builder.append(this.getUnitList(), that.getUnitList());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getId());
		builder.append(getName());
		builder.append(getPlayer());
		builder.append(getOrigin());
		builder.append(getDestination());
		builder.append(getMoveTurns());
		builder.append(getWaitTurns());
		builder.append(getUnitList());
		return builder.toString();
	}

	@Override
	public int compareTo(IMobile that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getId(), that.getId());
		builder.append(this.getName(), that.getName());
		builder.append(this.getPlayer(), that.getPlayer());
		builder.append(this.getOrigin(), that.getOrigin());
		builder.append(this.getDestination(), that.getDestination());
		builder.append(this.getMoveTurns(), that.getMoveTurns());
		builder.append(this.getWaitTurns(), that.getWaitTurns());
		builder.append(this.getUnitList(), that.getUnitList());
		return builder.toComparison();
	}
}
