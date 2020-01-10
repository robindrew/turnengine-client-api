package com.turnengine.client.api.global.common;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class ServiceInfo implements IServiceInfo {

	/** The name field. */
	private String name = null;
	/** The project field. */
	private IProjectInfo project = null;

	/**
	 * The empty constructor.
	 */
	public ServiceInfo() {
	}

	/**
	 * The fields constructor.
	 */
	public ServiceInfo(String name, IProjectInfo project) {
		setName(name);
		setProject(project);
	}

	/**
	 * The clone constructor.
	 */
	public ServiceInfo(IServiceInfo clone) {
		setName(clone.getName());
		setProject(clone.getProject());
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
	 * Getter for the project field.
	 * @return the value of the project field.
	 */
	@Override
	public IProjectInfo getProject() {
		return project;
	}

	/**
	 * Setter for the name field.
	 * @param name the name value to set.
	 */
	@Override
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Setter for the project field.
	 * @param project the project value to set.
	 */
	@Override
	public void setProject(IProjectInfo project) {
		this.project = project;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getName());
		builder.append(getProject());
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
		IServiceInfo that = (IServiceInfo) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getName(), that.getName());
		builder.append(this.getProject(), that.getProject());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getName());
		builder.append(getProject());
		return builder.toString();
	}

	@Override
	public int compareTo(IServiceInfo that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getName(), that.getName());
		builder.append(this.getProject(), that.getProject());
		return builder.toComparison();
	}
}
