package com.turnengine.client.api.global.common;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class ReleaseInfo implements IReleaseInfo {

	/** The number field. */
	private int number = 0;
	/** The project field. */
	private IProjectInfo project = null;

	/**
	 * The empty constructor.
	 */
	public ReleaseInfo() {
	}

	/**
	 * The fields constructor.
	 */
	public ReleaseInfo(int number, IProjectInfo project) {
		setNumber(number);
		setProject(project);
	}

	/**
	 * The clone constructor.
	 */
	public ReleaseInfo(IReleaseInfo clone) {
		setNumber(clone.getNumber());
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
	 * Getter for the number field.
	 * @return the value of the number field.
	 */
	@Override
	public int getNumber() {
		return number;
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
	 * Setter for the number field.
	 * @param number the number value to set.
	 */
	@Override
	public void setNumber(int number) {
		this.number = number;
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
		builder.append(getNumber());
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
		IReleaseInfo that = (IReleaseInfo) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getNumber(), that.getNumber());
		builder.append(this.getProject(), that.getProject());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getNumber());
		builder.append(getProject());
		return builder.toString();
	}

	@Override
	public int compareTo(IReleaseInfo that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getNumber(), that.getNumber());
		builder.append(this.getProject(), that.getProject());
		return builder.toComparison();
	}
}
