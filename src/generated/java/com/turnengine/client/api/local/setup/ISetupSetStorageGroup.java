package com.turnengine.client.api.local.setup;

import com.robindrew.codegenerator.api.bean.IBean;
import com.turnengine.client.api.local.storage.StorageType;

public interface ISetupSetStorageGroup extends IBean, Comparable<ISetupSetStorageGroup> {

	int SERIALIZATION_ID = 6309;

	/**
	 * Returns the serialization id.
	 * @return the serialization id.
	 */
	int getSerializationId();

	/**
	 * Getter for the parentName field.
	 * @return the value of the parentName field.
	 */
	String getParentName();

	/**
	 * Getter for the groupName field.
	 * @return the value of the groupName field.
	 */
	String getGroupName();

	/**
	 * Getter for the capacity field.
	 * @return the value of the capacity field.
	 */
	long getCapacity();

	/**
	 * Getter for the type field.
	 * @return the value of the type field.
	 */
	StorageType getType();

	/**
	 * Setter for the parentName field.
	 * @param parentName the parentName value to set.
	 */
	void setParentName(String parentName);

	/**
	 * Setter for the groupName field.
	 * @param groupName the groupName value to set.
	 */
	void setGroupName(String groupName);

	/**
	 * Setter for the capacity field.
	 * @param capacity the capacity value to set.
	 */
	void setCapacity(long capacity);

	/**
	 * Setter for the type field.
	 * @param type the type value to set.
	 */
	void setType(StorageType type);
}
