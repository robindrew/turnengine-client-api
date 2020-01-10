package com.turnengine.client.api.global.common;

import java.util.List;
import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class SystemStatus implements ISystemStatus {

	/** The load field. */
	private List<ISystemLoadAverage> load = null;
	/** The disk field. */
	private List<ISystemDiskUsage> disk = null;

	/**
	 * The empty constructor.
	 */
	public SystemStatus() {
	}

	/**
	 * The fields constructor.
	 */
	public SystemStatus(List<ISystemLoadAverage> load, List<ISystemDiskUsage> disk) {
		setLoad(load);
		setDisk(disk);
	}

	/**
	 * The clone constructor.
	 */
	public SystemStatus(ISystemStatus clone) {
		setLoad(clone.getLoad());
		setDisk(clone.getDisk());
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
	 * Getter for the load field.
	 * @return the value of the load field.
	 */
	@Override
	public List<ISystemLoadAverage> getLoad() {
		return load;
	}

	/**
	 * Getter for the disk field.
	 * @return the value of the disk field.
	 */
	@Override
	public List<ISystemDiskUsage> getDisk() {
		return disk;
	}

	/**
	 * Setter for the load field.
	 * @param load the load value to set.
	 */
	@Override
	public void setLoad(List<ISystemLoadAverage> load) {
		this.load = load;
	}

	/**
	 * Setter for the disk field.
	 * @param disk the disk value to set.
	 */
	@Override
	public void setDisk(List<ISystemDiskUsage> disk) {
		this.disk = disk;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getLoad());
		builder.append(getDisk());
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
		ISystemStatus that = (ISystemStatus) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getLoad(), that.getLoad());
		builder.append(this.getDisk(), that.getDisk());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getLoad());
		builder.append(getDisk());
		return builder.toString();
	}

	@Override
	public int compareTo(ISystemStatus that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getLoad(), that.getLoad());
		builder.append(this.getDisk(), that.getDisk());
		return builder.toComparison();
	}
}
