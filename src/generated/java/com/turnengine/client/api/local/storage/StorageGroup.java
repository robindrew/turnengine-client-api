package com.turnengine.client.api.local.storage;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class StorageGroup implements IStorageGroup {

	/** The parent field. */
	private int parent = 0;
	/** The group field. */
	private int group = 0;
	/** The capacity field. */
	private long capacity = 0l;
	/** The type field. */
	private StorageType type = null;

	/**
	 * The empty constructor.
	 */
	public StorageGroup() {
	}

	/**
	 * The fields constructor.
	 */
	public StorageGroup(int parent, int group, long capacity, StorageType type) {
		setParent(parent);
		setGroup(group);
		setCapacity(capacity);
		setType(type);
	}

	/**
	 * The clone constructor.
	 */
	public StorageGroup(IStorageGroup clone) {
		setParent(clone.getParent());
		setGroup(clone.getGroup());
		setCapacity(clone.getCapacity());
		setType(clone.getType());
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
	 * Getter for the parent field.
	 * @return the value of the parent field.
	 */
	@Override
	public int getParent() {
		return parent;
	}

	/**
	 * Getter for the group field.
	 * @return the value of the group field.
	 */
	@Override
	public int getGroup() {
		return group;
	}

	/**
	 * Getter for the capacity field.
	 * @return the value of the capacity field.
	 */
	@Override
	public long getCapacity() {
		return capacity;
	}

	/**
	 * Getter for the type field.
	 * @return the value of the type field.
	 */
	@Override
	public StorageType getType() {
		return type;
	}

	/**
	 * Setter for the parent field.
	 * @param parent the parent value to set.
	 */
	@Override
	public void setParent(int parent) {
		if (parent < -1) {
			throw new IllegalArgumentException("parent too small, minimum of -1, value: '" + parent + "'");
		}
		this.parent = parent;
	}

	/**
	 * Setter for the group field.
	 * @param group the group value to set.
	 */
	@Override
	public void setGroup(int group) {
		if (group < -1) {
			throw new IllegalArgumentException("group too small, minimum of -1, value: '" + group + "'");
		}
		this.group = group;
	}

	/**
	 * Setter for the capacity field.
	 * @param capacity the capacity value to set.
	 */
	@Override
	public void setCapacity(long capacity) {
		if (capacity < 0) {
			throw new IllegalArgumentException("capacity too small, minimum of 0, value: '" + capacity + "'");
		}
		this.capacity = capacity;
	}

	/**
	 * Setter for the type field.
	 * @param type the type value to set.
	 */
	@Override
	public void setType(StorageType type) {
		this.type = type;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getParent());
		builder.append(getGroup());
		builder.append(getCapacity());
		builder.append(getType());
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
		IStorageGroup that = (IStorageGroup) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getParent(), that.getParent());
		builder.append(this.getGroup(), that.getGroup());
		builder.append(this.getCapacity(), that.getCapacity());
		builder.append(this.getType(), that.getType());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getParent());
		builder.append(getGroup());
		builder.append(getCapacity());
		builder.append(getType());
		return builder.toString();
	}

	@Override
	public int compareTo(IStorageGroup that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getParent(), that.getParent());
		builder.append(this.getGroup(), that.getGroup());
		builder.append(this.getCapacity(), that.getCapacity());
		builder.append(this.getType(), that.getType());
		return builder.toComparison();
	}
}
