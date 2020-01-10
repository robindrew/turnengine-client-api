package com.turnengine.client.api.local.turn;

import com.robindrew.codegenerator.api.executable.bean.IExecutableBean;
import com.turnengine.client.api.common.command.ILocalLoggedInBean;
import com.turnengine.client.api.local.setup.ISetupBean;

public interface ISetTurnsEnabled extends IExecutableBean<TurnsEnabled>, ILocalLoggedInBean<TurnsEnabled>, ISetupBean<TurnsEnabled>, Comparable<ISetTurnsEnabled> {

	int SERIALIZATION_ID = 6705;

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
	 * Getter for the updating field.
	 * @return the value of the updating field.
	 */
	TurnsEnabled getUpdating();

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
	 * Setter for the updating field.
	 * @param updating the updating value to set.
	 */
	void setUpdating(TurnsEnabled updating);
}
