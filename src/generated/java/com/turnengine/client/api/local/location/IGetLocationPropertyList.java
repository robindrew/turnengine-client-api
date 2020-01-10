package com.turnengine.client.api.local.location;

import com.robindrew.codegenerator.api.executable.bean.IExecutableBean;
import com.turnengine.client.api.common.command.ILocalLoggedInBean;
import java.util.List;

public interface IGetLocationPropertyList extends IExecutableBean<List<ILocationProperty>>, ILocalLoggedInBean<List<ILocationProperty>>, Comparable<IGetLocationPropertyList> {

	int SERIALIZATION_ID = 5723;

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
	 * Getter for the playerId field.
	 * @return the value of the playerId field.
	 */
	int getPlayerId();

	/**
	 * Getter for the locationId field.
	 * @return the value of the locationId field.
	 */
	int getLocationId();

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
	 * Setter for the playerId field.
	 * @param playerId the playerId value to set.
	 */
	void setPlayerId(int playerId);

	/**
	 * Setter for the locationId field.
	 * @param locationId the locationId value to set.
	 */
	void setLocationId(int locationId);
}
