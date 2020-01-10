package com.turnengine.client.api.local.mobile;

import com.turnengine.client.api.local.player.IPlayerInfo;
import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class MobileInfo implements IMobileInfo {

	/** The id field. */
	private int id = 0;
	/** The name field. */
	private String name = null;
	/** The player field. */
	private IPlayerInfo player = null;

	/**
	 * The empty constructor.
	 */
	public MobileInfo() {
	}

	/**
	 * The fields constructor.
	 */
	public MobileInfo(int id, String name, IPlayerInfo player) {
		setId(id);
		setName(name);
		setPlayer(player);
	}

	/**
	 * The clone constructor.
	 */
	public MobileInfo(IMobileInfo clone) {
		setId(clone.getId());
		setName(clone.getName());
		setPlayer(clone.getPlayer());
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

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getId());
		builder.append(getName());
		builder.append(getPlayer());
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
		IMobileInfo that = (IMobileInfo) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getId(), that.getId());
		builder.append(this.getName(), that.getName());
		builder.append(this.getPlayer(), that.getPlayer());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getId());
		builder.append(getName());
		builder.append(getPlayer());
		return builder.toString();
	}

	@Override
	public int compareTo(IMobileInfo that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getId(), that.getId());
		builder.append(this.getName(), that.getName());
		builder.append(this.getPlayer(), that.getPlayer());
		return builder.toComparison();
	}
}
