package com.turnengine.client.api.local.setup;

import com.robindrew.codegenerator.api.executable.bean.IExecutableBean;
import com.turnengine.client.api.common.command.ILocalLoggedInBean;

public interface ISetSetupBeanListFile extends IExecutableBean<Boolean>, ILocalLoggedInBean<Boolean>, Comparable<ISetSetupBeanListFile> {

	int SERIALIZATION_ID = 3402;

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
	 * Getter for the filename field.
	 * @return the value of the filename field.
	 */
	String getFilename();

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
	 * Setter for the filename field.
	 * @param filename the filename value to set.
	 */
	void setFilename(String filename);
}
