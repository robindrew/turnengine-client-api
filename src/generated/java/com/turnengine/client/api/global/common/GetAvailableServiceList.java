package com.turnengine.client.api.global.common;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class GetAvailableServiceList implements IGetAvailableServiceList {

	/** The project field. */
	private String project = null;

	/**
	 * The empty constructor.
	 */
	public GetAvailableServiceList() {
	}

	/**
	 * The fields constructor.
	 */
	public GetAvailableServiceList(String project) {
		setProject(project);
	}

	/**
	 * The clone constructor.
	 */
	public GetAvailableServiceList(IGetAvailableServiceList clone) {
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
	 * Getter for the project field.
	 * @return the value of the project field.
	 */
	@Override
	public String getProject() {
		return project;
	}

	/**
	 * Setter for the project field.
	 * @param project the project value to set.
	 */
	@Override
	public void setProject(String project) {
		this.project = project;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
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
		IGetAvailableServiceList that = (IGetAvailableServiceList) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getProject(), that.getProject());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getProject());
		return builder.toString();
	}

	@Override
	public int compareTo(IGetAvailableServiceList that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getProject(), that.getProject());
		return builder.toComparison();
	}
}
