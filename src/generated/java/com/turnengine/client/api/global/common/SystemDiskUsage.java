package com.turnengine.client.api.global.common;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class SystemDiskUsage implements ISystemDiskUsage {

	/** The name field. */
	private String name = null;
	/** The used field. */
	private long used = 0l;
	/** The free field. */
	private long free = 0l;

	/**
	 * The empty constructor.
	 */
	public SystemDiskUsage() {
	}

	/**
	 * The fields constructor.
	 */
	public SystemDiskUsage(String name, long used, long free) {
		setName(name);
		setUsed(used);
		setFree(free);
	}

	/**
	 * The clone constructor.
	 */
	public SystemDiskUsage(ISystemDiskUsage clone) {
		setName(clone.getName());
		setUsed(clone.getUsed());
		setFree(clone.getFree());
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
	 * Getter for the used field.
	 * @return the value of the used field.
	 */
	@Override
	public long getUsed() {
		return used;
	}

	/**
	 * Getter for the free field.
	 * @return the value of the free field.
	 */
	@Override
	public long getFree() {
		return free;
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
	 * Setter for the used field.
	 * @param used the used value to set.
	 */
	@Override
	public void setUsed(long used) {
		this.used = used;
	}

	/**
	 * Setter for the free field.
	 * @param free the free value to set.
	 */
	@Override
	public void setFree(long free) {
		this.free = free;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getName());
		builder.append(getUsed());
		builder.append(getFree());
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
		ISystemDiskUsage that = (ISystemDiskUsage) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getName(), that.getName());
		builder.append(this.getUsed(), that.getUsed());
		builder.append(this.getFree(), that.getFree());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getName());
		builder.append(getUsed());
		builder.append(getFree());
		return builder.toString();
	}

	@Override
	public int compareTo(ISystemDiskUsage that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getName(), that.getName());
		builder.append(this.getUsed(), that.getUsed());
		builder.append(this.getFree(), that.getFree());
		return builder.toComparison();
	}
}
