package com.turnengine.client.api.global.common;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class ProcessInfo implements IProcessInfo {

	/** The id field. */
	private int id = 0;
	/** The name field. */
	private String name = null;
	/** The project field. */
	private IProjectInfo project = null;
	/** The service field. */
	private IServiceInfo service = null;
	/** The release field. */
	private IReleaseInfo release = null;
	/** The port field. */
	private int port = 0;

	/**
	 * The empty constructor.
	 */
	public ProcessInfo() {
	}

	/**
	 * The fields constructor.
	 */
	public ProcessInfo(int id, String name, IProjectInfo project, IServiceInfo service, IReleaseInfo release, int port) {
		setId(id);
		setName(name);
		setProject(project);
		setService(service);
		setRelease(release);
		setPort(port);
	}

	/**
	 * The clone constructor.
	 */
	public ProcessInfo(IProcessInfo clone) {
		setId(clone.getId());
		setName(clone.getName());
		setProject(clone.getProject());
		setService(clone.getService());
		setRelease(clone.getRelease());
		setPort(clone.getPort());
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
	 * Getter for the project field.
	 * @return the value of the project field.
	 */
	@Override
	public IProjectInfo getProject() {
		return project;
	}

	/**
	 * Getter for the service field.
	 * @return the value of the service field.
	 */
	@Override
	public IServiceInfo getService() {
		return service;
	}

	/**
	 * Getter for the release field.
	 * @return the value of the release field.
	 */
	@Override
	public IReleaseInfo getRelease() {
		return release;
	}

	/**
	 * Getter for the port field.
	 * @return the value of the port field.
	 */
	@Override
	public int getPort() {
		return port;
	}

	/**
	 * Setter for the id field.
	 * @param id the id value to set.
	 */
	@Override
	public void setId(int id) {
		this.id = id;
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

	/**
	 * Setter for the service field.
	 * @param service the service value to set.
	 */
	@Override
	public void setService(IServiceInfo service) {
		this.service = service;
	}

	/**
	 * Setter for the release field.
	 * @param release the release value to set.
	 */
	@Override
	public void setRelease(IReleaseInfo release) {
		this.release = release;
	}

	/**
	 * Setter for the port field.
	 * @param port the port value to set.
	 */
	@Override
	public void setPort(int port) {
		this.port = port;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getId());
		builder.append(getName());
		builder.append(getProject());
		builder.append(getService());
		builder.append(getRelease());
		builder.append(getPort());
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
		IProcessInfo that = (IProcessInfo) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getId(), that.getId());
		builder.append(this.getName(), that.getName());
		builder.append(this.getProject(), that.getProject());
		builder.append(this.getService(), that.getService());
		builder.append(this.getRelease(), that.getRelease());
		builder.append(this.getPort(), that.getPort());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getId());
		builder.append(getName());
		builder.append(getProject());
		builder.append(getService());
		builder.append(getRelease());
		builder.append(getPort());
		return builder.toString();
	}

	@Override
	public int compareTo(IProcessInfo that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getId(), that.getId());
		builder.append(this.getName(), that.getName());
		builder.append(this.getProject(), that.getProject());
		builder.append(this.getService(), that.getService());
		builder.append(this.getRelease(), that.getRelease());
		builder.append(this.getPort(), that.getPort());
		return builder.toComparison();
	}
}
