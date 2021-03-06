package com.turnengine.client.api.local.unit;

import com.robindrew.codegenerator.api.executable.bean.IExecutableBean;
import com.turnengine.client.api.common.command.ILocalLoggedInBean;
import java.util.List;

public interface IGetUnitsByFactionName extends IExecutableBean<List<IUnit>>, ILocalLoggedInBean<List<IUnit>>, Comparable<IGetUnitsByFactionName> {

	int SERIALIZATION_ID = 3906;

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
}
