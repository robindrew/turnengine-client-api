package com.turnengine.client.api.local.action;

import com.robindrew.codegenerator.api.executable.bean.IExecutableBean;
import com.turnengine.client.api.common.command.ILocalLoggedInBean;
import com.turnengine.client.api.local.setup.ISetupBean;

public interface IAddActionPlugin extends IExecutableBean<Boolean>, ILocalLoggedInBean<Boolean>, ISetupBean<Boolean>, Comparable<IAddActionPlugin> {

	int SERIALIZATION_ID = 2021;

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
	 * Getter for the name field.
	 * @return the value of the name field.
	 */
	String getName();

	/**
	 * Getter for the pluginName field.
	 * @return the value of the pluginName field.
	 */
	String getPluginName();

	/**
	 * Getter for the plugin field.
	 * @return the value of the plugin field.
	 */
	String getPlugin();

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
	 * Setter for the name field.
	 * @param name the name value to set.
	 */
	void setName(String name);

	/**
	 * Setter for the pluginName field.
	 * @param pluginName the pluginName value to set.
	 */
	void setPluginName(String pluginName);

	/**
	 * Setter for the plugin field.
	 * @param plugin the plugin value to set.
	 */
	void setPlugin(String plugin);
}
