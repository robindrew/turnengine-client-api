package com.turnengine.client.api.local.setup;

import com.robindrew.codegenerator.api.executable.bean.IExecutableBean;
import com.turnengine.client.api.common.command.ILocalLoggedInBean;

public interface ISetSetupBeanListDirectory extends IExecutableBean<Boolean>, ILocalLoggedInBean<Boolean>, Comparable<ISetSetupBeanListDirectory> {

	int SERIALIZATION_ID = 3405;

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
	 * Getter for the directory field.
	 * @return the value of the directory field.
	 */
	String getDirectory();

	/**
	 * Getter for the filenames field.
	 * @return the value of the filenames field.
	 */
	String getFilenames();

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
	 * Setter for the directory field.
	 * @param directory the directory value to set.
	 */
	void setDirectory(String directory);

	/**
	 * Setter for the filenames field.
	 * @param filenames the filenames value to set.
	 */
	void setFilenames(String filenames);
}
