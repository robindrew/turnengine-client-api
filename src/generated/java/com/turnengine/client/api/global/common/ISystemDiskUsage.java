package com.turnengine.client.api.global.common;

import com.robindrew.codegenerator.api.bean.IBean;

public interface ISystemDiskUsage extends IBean, Comparable<ISystemDiskUsage> {

	int SERIALIZATION_ID = 1216;

	/**
	 * Returns the serialization id.
	 * @return the serialization id.
	 */
	int getSerializationId();

	/**
	 * Getter for the name field.
	 * @return the value of the name field.
	 */
	String getName();

	/**
	 * Getter for the used field.
	 * @return the value of the used field.
	 */
	long getUsed();

	/**
	 * Getter for the free field.
	 * @return the value of the free field.
	 */
	long getFree();

	/**
	 * Setter for the name field.
	 * @param name the name value to set.
	 */
	void setName(String name);

	/**
	 * Setter for the used field.
	 * @param used the used value to set.
	 */
	void setUsed(long used);

	/**
	 * Setter for the free field.
	 * @param free the free value to set.
	 */
	void setFree(long free);
}
