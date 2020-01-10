package com.turnengine.client.api.local.setup;

import com.turnengine.client.api.local.storage.StorageType;
import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class SetupSetStorageGroup implements ISetupSetStorageGroup {

	/** The parentName field. */
	private String parentName = null;
	/** The groupName field. */
	private String groupName = null;
	/** The capacity field. */
	private long capacity = 0l;
	/** The type field. */
	private StorageType type = null;

	/**
	 * The empty constructor.
	 */
	public SetupSetStorageGroup() {
	}

	/**
	 * The fields constructor.
	 */
	public SetupSetStorageGroup(String parentName, String groupName, long capacity, StorageType type) {
		setParentName(parentName);
		setGroupName(groupName);
		setCapacity(capacity);
		setType(type);
	}

	/**
	 * The clone constructor.
	 */
	public SetupSetStorageGroup(ISetupSetStorageGroup clone) {
		setParentName(clone.getParentName());
		setGroupName(clone.getGroupName());
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
		builder.append(getParentName());
		builder.append(getGroupName());
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
		ISetupSetStorageGroup that = (ISetupSetStorageGroup) object;
		EqualsBuilder builder = new EqualsBuilder();
		builder.append(this.getParentName(), that.getParentName());
		builder.append(this.getGroupName(), that.getGroupName());
		builder.append(this.getCapacity(), that.getCapacity());
		builder.append(this.getType(), that.getType());
		return builder.isEquals();
	}

	@Override
	public String toString() {
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE);
		builder.append(getParentName());
		builder.append(getGroupName());
		builder.append(getCapacity());
		builder.append(getType());
		return builder.toString();
	}

	@Override
	public int compareTo(ISetupSetStorageGroup that) {
		CompareToBuilder builder = new CompareToBuilder();
		builder.append(this.getParentName(), that.getParentName());
		builder.append(this.getGroupName(), that.getGroupName());
		builder.append(this.getCapacity(), that.getCapacity());
		builder.append(this.getType(), that.getType());
		return builder.toComparison();
	}
}
