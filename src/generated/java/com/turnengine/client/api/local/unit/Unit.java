package com.turnengine.client.api.local.unit;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Unit implements IUnit {

	/** The id field. */
	private int id = 0;
	/** The name field. */
	private String name = null;
	/** The node field. */
	private UnitNode node = null;
	/** The type field. */
	private UnitType type = null;
	/** The move field. */
	private UnitMove move = null;
	/** The groupId field. */
	private int groupId = 0;
	/** The factionId field. */
	private int factionId = 0;

	/**
	 * The empty constructor.
	 */
	public Unit() {
	}

	/**
	 * The fields constructor.
	 */
	public Unit(int id, String name, UnitNode node, UnitType type, UnitMove move, int groupId, int factionId) {
		setId(id);
		setName(name);
		setNode(node);
		setType(type);
		setMove(move);
		setGroupId(groupId);
		setFactionId(factionId);
	}

	/**
	 * The clone constructor.
	 */
	public Unit(IUnit clone) {
		setId(clone.getId());
		setName(clone.getName());
		setNode(clone.getNode());
		setType(clone.getType());
		setMove(clone.getMove());
		setGroupId(clone.getGroupId());
		setFactionId(clone.getFactionId());
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
	 * Getter for the node field.
	 * @return the value of the node field.
	 */
	@Override
	public UnitNode getNode() {
		return node;
	}

	/**
	 * Getter for the type field.
	 * @return the value of the type field.
	 */
	@Override
	public UnitType getType() {
		return type;
	}

	/**
	 * Getter for the move field.
	 * @return the value of the move field.
	 */
	@Override
	public UnitMove getMove() {
		return move;
	}

	/**
	 * Getter for the groupId field.
	 * @return the value of the groupId field.
	 */
	@Override
	public int getGroupId() {
		return groupId;
	}

	/**
	 * Getter for the factionId field.
	 * @return the value of the factionId field.
	 */
	@Override
	public int getFactionId() {
		return factionId;
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
	 * Setter for the node field.
	 * @param node the node value to set.
	 */
	@Override
	public void setNode(UnitNode node) {
		this.node = node;
	}

	/**
	 * Setter for the type field.
	 * @param type the type value to set.
	 */
	@Override
	public void setType(UnitType type) {
		this.type = type;
	}

	/**
	 * Setter for the move field.
	 * @param move the move value to set.
	 */
	@Override
	public void setMove(UnitMove move) {
		this.move = move;
	}

	/**
	 * Setter for the groupId field.
	 * @param groupId the groupId value to set.
	 */
	@Override
	public void setGroupId(int groupId) {
		if (groupId < -1) {
			throw new IllegalArgumentException("groupId too small, minimum of -1, value: '" + groupId + "'");
		}
		this.groupId = groupId;
	}

	/**
	 * Setter for the factionId field.
	 * @param factionId the factionId value to set.
	 */
	@Override
	public void setFactionId(int factionId) {
		if (factionId < -1) {
			throw new IllegalArgumentException("factionId too small, minimum of -1, value: '" + factionId + "'");
		}
		this.factionId = factionId;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getId());
		builder.append(getName());
		builder.append(getNode());
		builder.append(getType());
		builder.append(getMove());
		builder.append(getGroupId());
		builder.append(getFactionId());
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
		IUnit that = (IUnit) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getId(), that.getId());
		builder.append(this.getName(), that.getName());
		builder.append(this.getNode(), that.getNode());
		builder.append(this.getType(), that.getType());
		builder.append(this.getMove(), that.getMove());
		builder.append(this.getGroupId(), that.getGroupId());
		builder.append(this.getFactionId(), that.getFactionId());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getId());
		builder.append(getName());
		builder.append(getNode());
		builder.append(getType());
		builder.append(getMove());
		builder.append(getGroupId());
		builder.append(getFactionId());
		return builder.toString();
	}

	@Override
	public int compareTo(IUnit that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getId(), that.getId());
		builder.append(this.getName(), that.getName());
		builder.append(this.getNode(), that.getNode());
		builder.append(this.getType(), that.getType());
		builder.append(this.getMove(), that.getMove());
		builder.append(this.getGroupId(), that.getGroupId());
		builder.append(this.getFactionId(), that.getFactionId());
		return builder.toComparison();
	}
}
