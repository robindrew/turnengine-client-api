package com.turnengine.client.api.local.location;

import com.robindrew.codegenerator.api.executable.bean.IExecutableBean;
import com.turnengine.client.api.common.command.ILocalLoggedInBean;

public interface IAddUnitsAtLocation extends IExecutableBean<Boolean>, ILocalLoggedInBean<Boolean>, Comparable<IAddUnitsAtLocation> {

	int SERIALIZATION_ID = 2814;

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
	 * Getter for the locationId field.
	 * @return the value of the locationId field.
	 */
	int getLocationId();

	/**
	 * Getter for the unitId field.
	 * @return the value of the unitId field.
	 */
	int getUnitId();

	/**
	 * Getter for the amount field.
	 * @return the value of the amount field.
	 */
	long getAmount();

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
	 * Setter for the locationId field.
	 * @param locationId the locationId value to set.
	 */
	void setLocationId(int locationId);

	/**
	 * Setter for the unitId field.
	 * @param unitId the unitId value to set.
	 */
	void setUnitId(int unitId);

	/**
	 * Setter for the amount field.
	 * @param amount the amount value to set.
	 */
	void setAmount(long amount);
}
