package com.turnengine.client.api.local.storage;

import com.robindrew.codegenerator.api.bean.IBean;

public interface IStorageItem extends IBean, Comparable<IStorageItem> {

	int SERIALIZATION_ID = 6506;

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
	 * Getter for the child field.
	 * @return the value of the child field.
	 */
	int getChild();

	/**
	 * Getter for the size field.
	 * @return the value of the size field.
	 */
	long getSize();

	/**
	 * Getter for the limit field.
	 * @return the value of the limit field.
	 */
	long getLimit();

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
	 * Setter for the child field.
	 * @param child the child value to set.
	 */
	void setChild(int child);

	/**
	 * Setter for the size field.
	 * @param size the size value to set.
	 */
	void setSize(long size);

	/**
	 * Setter for the limit field.
	 * @param limit the limit value to set.
	 */
	void setLimit(long limit);
}
