package com.turnengine.client.api.global.common;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class StopService implements IStopService {

	/** The project field. */
	private String project = null;
	/** The release field. */
	private int release = 0;
	/** The service field. */
	private String service = null;

	/**
	 * The empty constructor.
	 */
	public StopService() {
	}

	/**
	 * The fields constructor.
	 */
	public StopService(String project, int release, String service) {
		setProject(project);
		setRelease(release);
		setService(service);
	}

	/**
	 * The clone constructor.
	 */
	public StopService(IStopService clone) {
		setProject(clone.getProject());
		setRelease(clone.getRelease());
		setService(clone.getService());
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
	 * Getter for the release field.
	 * @return the value of the release field.
	 */
	@Override
	public int getRelease() {
		return release;
	}

	/**
	 * Getter for the service field.
	 * @return the value of the service field.
	 */
	@Override
	public String getService() {
		return service;
	}

	/**
	 * Setter for the project field.
	 * @param project the project value to set.
	 */
	@Override
	public void setProject(String project) {
		this.project = project;
	}

	/**
	 * Setter for the release field.
	 * @param release the release value to set.
	 */
	@Override
	public void setRelease(int release) {
		this.release = release;
	}

	/**
	 * Setter for the service field.
	 * @param service the service value to set.
	 */
	@Override
	public void setService(String service) {
		this.service = service;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getProject());
		builder.append(getRelease());
		builder.append(getService());
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
		IStopService that = (IStopService) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getProject(), that.getProject());
		builder.append(this.getRelease(), that.getRelease());
		builder.append(this.getService(), that.getService());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getProject());
		builder.append(getRelease());
		builder.append(getService());
		return builder.toString();
	}

	@Override
	public int compareTo(IStopService that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getProject(), that.getProject());
		builder.append(this.getRelease(), that.getRelease());
		builder.append(this.getService(), that.getService());
		return builder.toComparison();
	}
}
