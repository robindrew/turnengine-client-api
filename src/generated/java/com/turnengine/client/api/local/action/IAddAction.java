package com.turnengine.client.api.local.action;

import com.robindrew.codegenerator.api.executable.bean.IExecutableBean;
import com.turnengine.client.api.common.command.ILocalLoggedInBean;
import com.turnengine.client.api.local.setup.ISetupBean;

public interface IAddAction extends IExecutableBean<IAction>, ILocalLoggedInBean<IAction>, ISetupBean<IAction>, Comparable<IAddAction> {

	int SERIALIZATION_ID = 5001;

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
	 * Getter for the turns field.
	 * @return the value of the turns field.
	 */
	int getTurns();

	/**
	 * Getter for the limit field.
	 * @return the value of the limit field.
	 */
	int getLimit();

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
	 * Setter for the turns field.
	 * @param turns the turns value to set.
	 */
	void setTurns(int turns);

	/**
	 * Setter for the limit field.
	 * @param limit the limit value to set.
	 */
	void setLimit(int limit);
}
