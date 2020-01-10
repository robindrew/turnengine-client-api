package com.turnengine.client.api.global.common;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class ProjectInfo implements IProjectInfo {

	/** The name field. */
	private String name = null;

	/**
	 * The empty constructor.
	 */
	public ProjectInfo() {
	}

	/**
	 * The fields constructor.
	 */
	public ProjectInfo(String name) {
		setName(name);
	}

	/**
	 * The clone constructor.
	 */
	public ProjectInfo(IProjectInfo clone) {
		setName(clone.getName());
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
	 * Setter for the name field.
	 * @param name the name value to set.
	 */
	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getName());
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
		IProjectInfo that = (IProjectInfo) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getName(), that.getName());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getName());
		return builder.toString();
	}

	@Override
	public int compareTo(IProjectInfo that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getName(), that.getName());
		return builder.toComparison();
	}
}
