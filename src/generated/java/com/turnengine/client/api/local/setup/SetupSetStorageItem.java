package com.turnengine.client.api.local.setup;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class SetupSetStorageItem implements ISetupSetStorageItem {

	/** The parentName field. */
	private String parentName = null;
	/** The groupName field. */
	private String groupName = null;
	/** The childName field. */
	private String childName = null;
	/** The size field. */
	private long size = 0l;

	/**
	 * The empty constructor.
	 */
	public SetupSetStorageItem() {
	}

	/**
	 * The fields constructor.
	 */
	public SetupSetStorageItem(String parentName, String groupName, String childName, long size) {
		setParentName(parentName);
		setGroupName(groupName);
		setChildName(childName);
		setSize(size);
	}

	/**
	 * The clone constructor.
	 */
	public SetupSetStorageItem(ISetupSetStorageItem clone) {
		setParentName(clone.getParentName());
		setGroupName(clone.getGroupName());
		setChildName(clone.getChildName());
		setSize(clone.getSize());
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
	 * Getter for the parentName field.
	 * @return the value of the parentName field.
	 */
	@Override
	public String getParentName() {
		return parentName;
	}

	/**
	 * Getter for the groupName field.
	 * @return the value of the groupName field.
	 */
	@Override
	public String getGroupName() {
		return groupName;
	}

	/**
	 * Getter for the childName field.
	 * @return the value of the childName field.
	 */
	@Override
	public String getChildName() {
		return childName;
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
	 * Setter for the parentName field.
	 * @param parentName the parentName value to set.
	 */
	@Override
	public void setParentName(String parentName) {
		if (parentName == null) {
			throw new NullPointerException("parentName");
		}
		if (parentName.length() < 1) {
			throw new IllegalArgumentException("parentName too short, minimum of 1 characters, value: '" + parentName + "'");
		}
		if (parentName.length() > 200) {
			throw new IllegalArgumentException("parentName too long, maximum of 200 characters, value: '" + parentName + "'");
		}
		this.parentName = parentName;
	}

	/**
	 * Setter for the groupName field.
	 * @param groupName the groupName value to set.
	 */
	@Override
	public void setGroupName(String groupName) {
		if (groupName == null) {
			throw new NullPointerException("groupName");
		}
		if (groupName.length() < 1) {
			throw new IllegalArgumentException("groupName too short, minimum of 1 characters, value: '" + groupName + "'");
		}
		if (groupName.length() > 200) {
			throw new IllegalArgumentException("groupName too long, maximum of 200 characters, value: '" + groupName + "'");
		}
		this.groupName = groupName;
	}

	/**
	 * Setter for the childName field.
	 * @param childName the childName value to set.
	 */
	@Override
	public void setChildName(String childName) {
		if (childName == null) {
			throw new NullPointerException("childName");
		}
		if (childName.length() < 1) {
			throw new IllegalArgumentException("childName too short, minimum of 1 characters, value: '" + childName + "'");
		}
		if (childName.length() > 200) {
			throw new IllegalArgumentException("childName too long, maximum of 200 characters, value: '" + childName + "'");
		}
		this.childName = childName;
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

	@Override
	public int hashCode() {
		HashCodeBuilder builder = new HashCodeBuilder();
		builder.append(getParentName());
		builder.append(getGroupName());
		builder.append(getChildName());
		builder.append(getSize());
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
		ISetupSetStorageItem that = (ISetupSetStorageItem) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getParentName(), that.getParentName());
		builder.append(this.getGroupName(), that.getGroupName());
		builder.append(this.getChildName(), that.getChildName());
		builder.append(this.getSize(), that.getSize());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getParentName());
		builder.append(getGroupName());
		builder.append(getChildName());
		builder.append(getSize());
		return builder.toString();
	}

	@Override
	public int compareTo(ISetupSetStorageItem that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getParentName(), that.getParentName());
		builder.append(this.getGroupName(), that.getGroupName());
		builder.append(this.getChildName(), that.getChildName());
		builder.append(this.getSize(), that.getSize());
		return builder.toComparison();
	}
}
