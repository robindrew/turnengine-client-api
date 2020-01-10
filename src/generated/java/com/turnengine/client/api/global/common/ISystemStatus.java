package com.turnengine.client.api.global.common;

import com.robindrew.codegenerator.api.bean.IBean;
import java.util.List;

public interface ISystemStatus extends IBean, Comparable<ISystemStatus> {

	int SERIALIZATION_ID = 1214;

	/**
	 * Returns the serialization id.
	 * @return the serialization id.
	 */
	int getSerializationId();

	/**
	 * Getter for the load field.
	 * @return the value of the load field.
	 */
	List<ISystemLoadAverage> getLoad();

	/**
	 * Getter for the disk field.
	 * @return the value of the disk field.
	 */
	List<ISystemDiskUsage> getDisk();

	/**
	 * Setter for the load field.
	 * @param load the load value to set.
	 */
	void setLoad(List<ISystemLoadAverage> load);

	/**
	 * Setter for the disk field.
	 * @param disk the disk value to set.
	 */
	void setDisk(List<ISystemDiskUsage> disk);
}
