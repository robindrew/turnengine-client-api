package com.turnengine.client.api.local.setup;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class SetupAddChildGroup implements ISetupAddChildGroup {

	/** The name field. */
	private String name = null;
	/** The parentName field. */
	private String parentName = null;
	/** The factionName field. */
	private String factionName = null;

	/**
	 * The empty constructor.
	 */
	public SetupAddChildGroup() {
	}

	/**
	 * The fields constructor.
	 */
	public SetupAddChildGroup(String name, String parentName, String factionName) {
		setName(name);
		setParentName(parentName);
		setFactionName(factionName);
	}

	/**
	 * The clone constructor.
	 */
	public SetupAddChildGroup(ISetupAddChildGroup clone) {
		setName(clone.getName());
		setParentName(clone.getParentName());
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
	 * Getter for the name field.
	 * @return the value of the name field.
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * Getter for the parentName field.
	 * @return the value of the parentName field.
	 */
	@Override
	public String getParentName() {
		return parentName;
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
	 * Setter for the parentName field.
	 * @param parentName the parentName value to set.
	 */
	@Override
	public void setParentName(String parentName) {
		if (parentName == null) {
			throw new NullPointerException("parentName");
		}
		if (parentName.length() < 1) {
			throw new IllegalArgumentException("parentName too short, minimum of 1 characters, value: '" + parentName + "'");
		}
		if (parentName.length() > 200) {
			throw new IllegalArgumentException("parentName too long, maximum of 200 characters, value: '" + parentName + "'");
		}
		this.parentName = parentName;
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
		builder.append(getName());
		builder.append(getParentName());
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
		ISetupAddChildGroup that = (ISetupAddChildGroup) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getName(), that.getName());
		builder.append(this.getParentName(), that.getParentName());
		builder.append(this.getFactionName(), that.getFactionName());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getName());
		builder.append(getParentName());
		builder.append(getFactionName());
		return builder.toString();
	}

	@Override
	public int compareTo(ISetupAddChildGroup that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getName(), that.getName());
		builder.append(this.getParentName(), that.getParentName());
		builder.append(this.getFactionName(), that.getFactionName());
		return builder.toComparison();
	}
}
