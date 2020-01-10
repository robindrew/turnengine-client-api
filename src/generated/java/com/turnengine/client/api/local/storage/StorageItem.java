package com.turnengine.client.api.local.storage;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class StorageItem implements IStorageItem {

	/** The parent field. */
	private int parent = 0;
	/** The group field. */
	private int group = 0;
	/** The child field. */
	private int child = 0;
	/** The size field. */
	private long size = 0l;
	/** The limit field. */
	private long limit = 0l;

	/**
	 * The empty constructor.
	 */
	public StorageItem() {
	}

	/**
	 * The fields constructor.
	 */
	public StorageItem(int parent, int group, int child, long size, long limit) {
		setParent(parent);
		setGroup(group);
		setChild(child);
		setSize(size);
		setLimit(limit);
	}

	/**
	 * The clone constructor.
	 */
	public StorageItem(IStorageItem clone) {
		setParent(clone.getParent());
		setGroup(clone.getGroup());
		setChild(clone.getChild());
		setSize(clone.getSize());
		setLimit(clone.getLimit());
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
	 * Getter for the child field.
	 * @return the value of the child field.
	 */
	@Override
	public int getChild() {
		return child;
	}

	/**
	 * Getter for the size field.
	 * @return the value of the size field.
	 */
	@Override
	public long getSize() {
		return size;
	}

	/**
	 * Getter for the limit field.
	 * @return the value of the limit field.
	 */
	@Override
	public long getLimit() {
		return limit;
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
	 * Setter for the child field.
	 * @param child the child value to set.
	 */
	@Override
	public void setChild(int child) {
		if (child < -1) {
			throw new IllegalArgumentException("child too small, minimum of -1, value: '" + child + "'");
		}
		this.child = child;
	}

	/**
	 * Setter for the size field.
	 * @param size the size value to set.
	 */
	@Override
	public void setSize(long size) {
		if (size < 0) {
			throw new IllegalArgumentException("size too small, minimum of 0, value: '" + size + "'");
		}
		this.size = size;
	}

	/**
	 * Setter for the limit field.
	 * @param limit the limit value to set.
	 */
	@Override
	public void setLimit(long limit) {
		if (limit < 0) {
			throw new IllegalArgumentException("limit too small, minimum of 0, value: '" + limit + "'");
		}
		this.limit = limit;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getParent());
		builder.append(getGroup());
		builder.append(getChild());
		builder.append(getSize());
		builder.append(getLimit());
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
		IStorageItem that = (IStorageItem) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getParent(), that.getParent());
		builder.append(this.getGroup(), that.getGroup());
		builder.append(this.getChild(), that.getChild());
		builder.append(this.getSize(), that.getSize());
		builder.append(this.getLimit(), that.getLimit());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getParent());
		builder.append(getGroup());
		builder.append(getChild());
		builder.append(getSize());
		builder.append(getLimit());
		return builder.toString();
	}

	@Override
	public int compareTo(IStorageItem that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getParent(), that.getParent());
		builder.append(this.getGroup(), that.getGroup());
		builder.append(this.getChild(), that.getChild());
		builder.append(this.getSize(), that.getSize());
		builder.append(this.getLimit(), that.getLimit());
		return builder.toComparison();
	}
}
