package com.turnengine.client.api.local.setup;

import com.robindrew.codegenerator.api.bean.IBean;

public interface ISetupSetStorageItem extends IBean, Comparable<ISetupSetStorageItem> {

	int SERIALIZATION_ID = 6310;

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
	 * Getter for the childName field.
	 * @return the value of the childName field.
	 */
	String getChildName();

	/**
	 * Getter for the size field.
	 * @return the value of the size field.
	 */
	long getSize();

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
	 * Setter for the childName field.
	 * @param childName the childName value to set.
	 */
	void setChildName(String childName);

	/**
	 * Setter for the size field.
	 * @param size the size value to set.
	 */
	void setSize(long size);
}
