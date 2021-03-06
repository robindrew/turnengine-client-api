package com.turnengine.client.api.local.alliance;

import com.robindrew.codegenerator.api.executable.bean.IExecutableBean;
import com.turnengine.client.api.common.command.ILocalLoggedInBean;

public interface IInviteToJoinAllianceByName extends IExecutableBean<Boolean>, ILocalLoggedInBean<Boolean>, Comparable<IInviteToJoinAllianceByName> {

	int SERIALIZATION_ID = 2120;

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
	 * Getter for the playerName field.
	 * @return the value of the playerName field.
	 */
	String getPlayerName();

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
	 * Setter for the playerName field.
	 * @param playerName the playerName value to set.
	 */
	void setPlayerName(String playerName);
}
