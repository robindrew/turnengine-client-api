package com.turnengine.client.api.local.unit;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class AddUnit implements IAddUnit {

	/** The loginId field. */
	private long loginId = 0l;
	/** The instanceId field. */
	private int instanceId = 0;
	/** The name field. */
	private String name = null;
	/** The node field. */
	private UnitNode node = null;
	/** The type field. */
	private UnitType type = null;
	/** The move field. */
	private UnitMove move = null;
	/** The groupName field. */
	private String groupName = null;
	/** The factionName field. */
	private String factionName = null;

	/**
	 * The empty constructor.
	 */
	public AddUnit() {
	}

	/**
	 * The fields constructor.
	 */
	public AddUnit(long loginId, int instanceId, String name, UnitNode node, UnitType type, UnitMove move, String groupName, String factionName) {
		setLoginId(loginId);
		setInstanceId(instanceId);
		setName(name);
		setNode(node);
		setType(type);
		setMove(move);
		setGroupName(groupName);
		setFactionName(factionName);
	}

	/**
	 * The clone constructor.
	 */
	public AddUnit(IAddUnit clone) {
		setLoginId(clone.getLoginId());
		setInstanceId(clone.getInstanceId());
		setName(clone.getName());
		setNode(clone.getNode());
		setType(clone.getType());
		setMove(clone.getMove());
		setGroupName(clone.getGroupName());
		setFactionName(clone.getFactionName());
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
	 * Getter for the loginId field.
	 * @return the value of the loginId field.
	 */
	@Override
	public long getLoginId() {
		return loginId;
	}

	/**
	 * Getter for the instanceId field.
	 * @return the value of the instanceId field.
	 */
	@Override
	public int getInstanceId() {
		return instanceId;
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
	 * Getter for the groupName field.
	 * @return the value of the groupName field.
	 */
	@Override
	public String getGroupName() {
		return groupName;
	}

	/**
	 * Getter for the factionName field.
	 * @return the value of the factionName field.
	 */
	@Override
	public String getFactionName() {
		return factionName;
	}

	/**
	 * Setter for the loginId field.
	 * @param loginId the loginId value to set.
	 */
	@Override
	public void setLoginId(long loginId) {
		this.loginId = loginId;
	}

	/**
	 * Setter for the instanceId field.
	 * @param instanceId the instanceId value to set.
	 */
	@Override
	public void setInstanceId(int instanceId) {
		if (instanceId < -1) {
			throw new IllegalArgumentException("instanceId too small, minimum of -1, value: '" + instanceId + "'");
		}
		this.instanceId = instanceId;
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
	 * Setter for the groupName field.
	 * @param groupName the groupName value to set.
	 */
	@Override
	public void setGroupName(String groupName) {
		if (groupName == null) {
			throw new NullPointerException("groupName");
		}
		if (groupName.length() < 1) {
			throw new IllegalArgumentException("groupName too short, minimum of 1 characters, value: '" + groupName + "'");
		}
		if (groupName.length() > 200) {
			throw new IllegalArgumentException("groupName too long, maximum of 200 characters, value: '" + groupName + "'");
		}
		this.groupName = groupName;
	}

	/**
	 * Setter for the factionName field.
	 * @param factionName the factionName value to set.
	 */
	@Override
	public void setFactionName(String factionName) {
		if (factionName == null) {
			throw new NullPointerException("factionName");
		}
		if (factionName.length() < 1) {
			throw new IllegalArgumentException("factionName too short, minimum of 1 characters, value: '" + factionName + "'");
		}
		if (factionName.length() > 200) {
			throw new IllegalArgumentException("factionName too long, maximum of 200 characters, value: '" + factionName + "'");
		}
		this.factionName = factionName;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getLoginId());
		builder.append(getInstanceId());
		builder.append(getName());
		builder.append(getNode());
		builder.append(getType());
		builder.append(getMove());
		builder.append(getGroupName());
		builder.append(getFactionName());
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
		IAddUnit that = (IAddUnit) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getLoginId(), that.getLoginId());
		builder.append(this.getInstanceId(), that.getInstanceId());
		builder.append(this.getName(), that.getName());
		builder.append(this.getNode(), that.getNode());
		builder.append(this.getType(), that.getType());
		builder.append(this.getMove(), that.getMove());
		builder.append(this.getGroupName(), that.getGroupName());
		builder.append(this.getFactionName(), that.getFactionName());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getLoginId());
		builder.append(getInstanceId());
		builder.append(getName());
		builder.append(getNode());
		builder.append(getType());
		builder.append(getMove());
		builder.append(getGroupName());
		builder.append(getFactionName());
		return builder.toString();
	}

	@Override
	public int compareTo(IAddUnit that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getLoginId(), that.getLoginId());
		builder.append(this.getInstanceId(), that.getInstanceId());
		builder.append(this.getName(), that.getName());
		builder.append(this.getNode(), that.getNode());
		builder.append(this.getType(), that.getType());
		builder.append(this.getMove(), that.getMove());
		builder.append(this.getGroupName(), that.getGroupName());
		builder.append(this.getFactionName(), that.getFactionName());
		return builder.toComparison();
	}
}
