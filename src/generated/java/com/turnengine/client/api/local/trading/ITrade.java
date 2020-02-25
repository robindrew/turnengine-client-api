package com.turnengine.client.api.local.trading;

import com.robindrew.codegenerator.api.bean.IBean;

public interface ITrade extends IBean, Comparable<ITrade> {

	int SERIALIZATION_ID = 3705;

	/**
	 * Returns the serialization id.
	 * @return the serialization id.
	 */
	int getSerializationId();

	/**
	 * Getter for the type field.
	 * @return the value of the type field.
	 */
	TradingType getType();

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
	 * Getter for the currencyAmount field.
	 * @return the value of the currencyAmount field.
	 */
	long getCurrencyAmount();

	/**
	 * Setter for the type field.
	 * @param type the type value to set.
	 */
	void setType(TradingType type);

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

	/**
	 * Setter for the currencyAmount field.
	 * @param currencyAmount the currencyAmount value to set.
	 */
	void setCurrencyAmount(long currencyAmount);
}
