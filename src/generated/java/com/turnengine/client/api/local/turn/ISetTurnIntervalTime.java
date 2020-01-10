package com.turnengine.client.api.local.turn;

import com.robindrew.codegenerator.api.executable.bean.IExecutableBean;
import com.turnengine.client.api.common.command.ILocalLoggedInBean;
import com.turnengine.client.api.local.setup.ISetupBean;
import java.util.concurrent.TimeUnit;

public interface ISetTurnIntervalTime extends IExecutableBean<Long>, ILocalLoggedInBean<Long>, ISetupBean<Long>, Comparable<ISetTurnIntervalTime> {

	int SERIALIZATION_ID = 6713;

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
	 * Getter for the interval field.
	 * @return the value of the interval field.
	 */
	long getInterval();

	/**
	 * Getter for the unit field.
	 * @return the value of the unit field.
	 */
	TimeUnit getUnit();

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
	 * Setter for the interval field.
	 * @param interval the interval value to set.
	 */
	void setInterval(long interval);

	/**
	 * Setter for the unit field.
	 * @param unit the unit value to set.
	 */
	void setUnit(TimeUnit unit);
}
