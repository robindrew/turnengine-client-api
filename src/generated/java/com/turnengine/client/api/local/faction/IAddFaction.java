package com.turnengine.client.api.local.faction;

import com.robindrew.codegenerator.api.executable.bean.IExecutableBean;
import com.turnengine.client.api.common.command.ILocalLoggedInBean;
import com.turnengine.client.api.local.setup.ISetupBean;

public interface IAddFaction extends IExecutableBean<IFaction>, ILocalLoggedInBean<IFaction>, ISetupBean<IFaction>, Comparable<IAddFaction> {

	int SERIALIZATION_ID = 2501;

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
	 * Getter for the password field.
	 * @return the value of the password field.
	 */
	String getPassword();

	/**
	 * Getter for the united field.
	 * @return the value of the united field.
	 */
	FactionUnited getUnited();

	/**
	 * Getter for the playerLimit field.
	 * @return the value of the playerLimit field.
	 */
	int getPlayerLimit();

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
	 * Setter for the password field.
	 * @param password the password value to set.
	 */
	void setPassword(String password);

	/**
	 * Setter for the united field.
	 * @param united the united value to set.
	 */
	void setUnited(FactionUnited united);

	/**
	 * Setter for the playerLimit field.
	 * @param playerLimit the playerLimit value to set.
	 */
	void setPlayerLimit(int playerLimit);
}
