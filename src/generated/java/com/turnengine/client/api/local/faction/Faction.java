package com.turnengine.client.api.local.faction;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Faction implements IFaction {

	/** The id field. */
	private int id = 0;
	/** The name field. */
	private String name = null;
	/** The password field. */
	private String password = null;
	/** The united field. */
	private FactionUnited united = null;
	/** The playerLimit field. */
	private int playerLimit = 0;

	/**
	 * The empty constructor.
	 */
	public Faction() {
	}

	/**
	 * The fields constructor.
	 */
	public Faction(int id, String name, String password, FactionUnited united, int playerLimit) {
		setId(id);
		setName(name);
		setPassword(password);
		setUnited(united);
		setPlayerLimit(playerLimit);
	}

	/**
	 * The clone constructor.
	 */
	public Faction(IFaction clone) {
		setId(clone.getId());
		setName(clone.getName());
		setPassword(clone.getPassword());
		setUnited(clone.getUnited());
		setPlayerLimit(clone.getPlayerLimit());
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
	 * Getter for the password field.
	 * @return the value of the password field.
	 */
	@Override
	public String getPassword() {
		return password;
	}

	/**
	 * Getter for the united field.
	 * @return the value of the united field.
	 */
	@Override
	public FactionUnited getUnited() {
		return united;
	}

	/**
	 * Getter for the playerLimit field.
	 * @return the value of the playerLimit field.
	 */
	@Override
	public int getPlayerLimit() {
		return playerLimit;
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
		if (name.length() > 200) {
			throw new IllegalArgumentException("name too long, maximum of 200 characters, value: '" + name + "'");
		}
		this.name = name;
	}

	/**
	 * Setter for the password field.
	 * @param password the password value to set.
	 */
	@Override
	public void setPassword(String password) {
		if (password == null) {
			throw new NullPointerException("password");
		}
		if (password.length() < 0) {
			throw new IllegalArgumentException("password too short, minimum of 0 characters, value: '" + password + "'");
		}
		if (password.length() > 200) {
			throw new IllegalArgumentException("password too long, maximum of 200 characters, value: '" + password + "'");
		}
		this.password = password;
	}

	/**
	 * Setter for the united field.
	 * @param united the united value to set.
	 */
	@Override
	public void setUnited(FactionUnited united) {
		this.united = united;
	}

	/**
	 * Setter for the playerLimit field.
	 * @param playerLimit the playerLimit value to set.
	 */
	@Override
	public void setPlayerLimit(int playerLimit) {
		if (playerLimit < 0) {
			throw new IllegalArgumentException("playerLimit too small, minimum of 0, value: '" + playerLimit + "'");
		}
		this.playerLimit = playerLimit;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getId());
		builder.append(getName());
		builder.append(getPassword());
		builder.append(getUnited());
		builder.append(getPlayerLimit());
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
		IFaction that = (IFaction) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getId(), that.getId());
		builder.append(this.getName(), that.getName());
		builder.append(this.getPassword(), that.getPassword());
		builder.append(this.getUnited(), that.getUnited());
		builder.append(this.getPlayerLimit(), that.getPlayerLimit());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getId());
		builder.append(getName());
		builder.append(getPassword());
		builder.append(getUnited());
		builder.append(getPlayerLimit());
		return builder.toString();
	}

	@Override
	public int compareTo(IFaction that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getId(), that.getId());
		builder.append(this.getName(), that.getName());
		builder.append(this.getPassword(), that.getPassword());
		builder.append(this.getUnited(), that.getUnited());
		builder.append(this.getPlayerLimit(), that.getPlayerLimit());
		return builder.toComparison();
	}
}
