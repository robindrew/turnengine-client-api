package com.turnengine.client.api.local.storage;

import com.robindrew.codegenerator.api.executable.bean.IExecutableBean;
import com.turnengine.client.api.common.command.ILocalLoggedInBean;
import com.turnengine.client.api.local.setup.ISetupBean;

public interface ISetStorageItem extends IExecutableBean<Boolean>, ILocalLoggedInBean<Boolean>, ISetupBean<Boolean>, Comparable<ISetStorageItem> {

	int SERIALIZATION_ID = 6502;

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
	 * Getter for the limit field.
	 * @return the value of the limit field.
	 */
	long getLimit();

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
	 * Setter for the childName field.
	 * @param childName the childName value to set.
	 */
	void setChildName(String childName);

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
