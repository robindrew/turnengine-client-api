package com.turnengine.client.api.local.mobile;

import com.robindrew.codegenerator.api.executable.bean.IExecutableBean;
import com.turnengine.client.api.common.command.ILocalLoggedInBean;
import com.turnengine.client.api.local.unit.IUnitCount;
import java.util.List;

public interface ITransferUnitsBetweenMobiles extends IExecutableBean<Boolean>, ILocalLoggedInBean<Boolean>, Comparable<ITransferUnitsBetweenMobiles> {

	int SERIALIZATION_ID = 3011;

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
	 * Getter for the fromMobileId field.
	 * @return the value of the fromMobileId field.
	 */
	int getFromMobileId();

	/**
	 * Getter for the toMobileId field.
	 * @return the value of the toMobileId field.
	 */
	int getToMobileId();

	/**
	 * Getter for the unitList field.
	 * @return the value of the unitList field.
	 */
	List<IUnitCount> getUnitList();

	/**
	 * Getter for the addToQueue field.
	 * @return the value of the addToQueue field.
	 */
	boolean getAddToQueue();

	/**
	 * Getter for the repeat field.
	 * @return the value of the repeat field.
	 */
	boolean getRepeat();

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
	 * Setter for the fromMobileId field.
	 * @param fromMobileId the fromMobileId value to set.
	 */
	void setFromMobileId(int fromMobileId);

	/**
	 * Setter for the toMobileId field.
	 * @param toMobileId the toMobileId value to set.
	 */
	void setToMobileId(int toMobileId);

	/**
	 * Setter for the unitList field.
	 * @param unitList the unitList value to set.
	 */
	void setUnitList(List<IUnitCount> unitList);

	/**
	 * Setter for the addToQueue field.
	 * @param addToQueue the addToQueue value to set.
	 */
	void setAddToQueue(boolean addToQueue);

	/**
	 * Setter for the repeat field.
	 * @param repeat the repeat value to set.
	 */
	void setRepeat(boolean repeat);
}
