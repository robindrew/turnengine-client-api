package com.turnengine.client.api.local.storage;

import com.robindrew.codegenerator.api.bean.IBean;

public interface IStorageGroup extends IBean, Comparable<IStorageGroup> {

	int SERIALIZATION_ID = 3605;

	/**
	 * Returns the serialization id.
	 * @return the serialization id.
	 */
	int getSerializationId();

	/**
	 * Getter for the parent field.
	 * @return the value of the parent field.
	 */
	int getParent();

	/**
	 * Getter for the group field.
	 * @return the value of the group field.
	 */
	int getGroup();

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
	 * Setter for the parent field.
	 * @param parent the parent value to set.
	 */
	void setParent(int parent);

	/**
	 * Setter for the group field.
	 * @param group the group value to set.
	 */
	void setGroup(int group);

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
