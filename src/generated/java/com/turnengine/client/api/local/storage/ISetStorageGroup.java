package com.turnengine.client.api.local.storage;

import com.robindrew.codegenerator.api.executable.bean.IExecutableBean;
import com.turnengine.client.api.common.command.ILocalLoggedInBean;
import com.turnengine.client.api.local.setup.ISetupBean;

public interface ISetStorageGroup extends IExecutableBean<Boolean>, ILocalLoggedInBean<Boolean>, ISetupBean<Boolean>, Comparable<ISetStorageGroup> {

	int SERIALIZATION_ID = 3601;

	/**
	 * Returns the serialization id.
	 * @return the serialization id.
	 */
	int getSerializationId();

	/**
	 * Getter for the loginId field.
	 * @return the value of the loginId field.
	 */
	long getLoginId();

	/**
	 * Getter for the instanceId field.
	 * @return the value of the instanceId field.
	 */
	int getInstanceId();

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
	 * Setter for the loginId field.
	 * @param loginId the loginId value to set.
	 */
	void setLoginId(long loginId);

	/**
	 * Setter for the instanceId field.
	 * @param instanceId the instanceId value to set.
	 */
	void setInstanceId(int instanceId);

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
