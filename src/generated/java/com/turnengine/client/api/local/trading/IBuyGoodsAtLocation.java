package com.turnengine.client.api.local.trading;

import com.robindrew.codegenerator.api.executable.bean.IExecutableBean;
import com.turnengine.client.api.common.command.ILocalLoggedInBean;

public interface IBuyGoodsAtLocation extends IExecutableBean<ITrade>, ILocalLoggedInBean<ITrade>, Comparable<IBuyGoodsAtLocation> {

	int SERIALIZATION_ID = 3702;

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
	 * Getter for the goodsId field.
	 * @return the value of the goodsId field.
	 */
	int getGoodsId();

	/**
	 * Getter for the goodsAmount field.
	 * @return the value of the goodsAmount field.
	 */
	long getGoodsAmount();

	/**
	 * Getter for the currencyId field.
	 * @return the value of the currencyId field.
	 */
	int getCurrencyId();

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
	 * Setter for the goodsId field.
	 * @param goodsId the goodsId value to set.
	 */
	void setGoodsId(int goodsId);

	/**
	 * Setter for the goodsAmount field.
	 * @param goodsAmount the goodsAmount value to set.
	 */
	void setGoodsAmount(long goodsAmount);

	/**
	 * Setter for the currencyId field.
	 * @param currencyId the currencyId value to set.
	 */
	void setCurrencyId(int currencyId);
}
