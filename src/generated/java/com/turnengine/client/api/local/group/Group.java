package com.turnengine.client.api.local.group;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Group implements IGroup {

	/** The id field. */
	private int id = 0;
	/** The name field. */
	private String name = null;
	/** The factionId field. */
	private int factionId = 0;
	/** The parentId field. */
	private int parentId = 0;

	/**
	 * The empty constructor.
	 */
	public Group() {
	}

	/**
	 * The fields constructor.
	 */
	public Group(int id, String name, int factionId, int parentId) {
		setId(id);
		setName(name);
		setFactionId(factionId);
		setParentId(parentId);
	}

	/**
	 * The clone constructor.
	 */
	public Group(IGroup clone) {
		setId(clone.getId());
		setName(clone.getName());
		setFactionId(clone.getFactionId());
		setParentId(clone.getParentId());
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
	 * Getter for the factionId field.
	 * @return the value of the factionId field.
	 */
	@Override
	public int getFactionId() {
		return factionId;
	}

	/**
	 * Getter for the parentId field.
	 * @return the value of the parentId field.
	 */
	@Override
	public int getParentId() {
		return parentId;
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

	/**
	 * Setter for the parentId field.
	 * @param parentId the parentId value to set.
	 */
	@Override
	public void setParentId(int parentId) {
		if (parentId < -1) {
			throw new IllegalArgumentException("parentId too small, minimum of -1, value: '" + parentId + "'");
		}
		this.parentId = parentId;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getId());
		builder.append(getName());
		builder.append(getFactionId());
		builder.append(getParentId());
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
		IGroup that = (IGroup) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getId(), that.getId());
		builder.append(this.getName(), that.getName());
		builder.append(this.getFactionId(), that.getFactionId());
		builder.append(this.getParentId(), that.getParentId());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getId());
		builder.append(getName());
		builder.append(getFactionId());
		builder.append(getParentId());
		return builder.toString();
	}

	@Override
	public int compareTo(IGroup that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getId(), that.getId());
		builder.append(this.getName(), that.getName());
		builder.append(this.getFactionId(), that.getFactionId());
		builder.append(this.getParentId(), that.getParentId());
		return builder.toComparison();
	}
}
