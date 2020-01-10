package com.turnengine.client.api.local.trading;

import com.robindrew.codegenerator.api.executable.executor.IBeanExecutorLocator;
import java.util.List;

public class LocalTradingExecutorSet implements ILocalTradingExecutorSet {

	private final IBeanExecutorLocator locator;

	public LocalTradingExecutorSet(IBeanExecutorLocator locator) {
		if (locator == null) {
			throw new NullPointerException("locator");
		}
		this.locator = locator;
	}

	/**
	 * Getter for the locator field.
	 * @return the value of the locator field.
	 */
	public IBeanExecutorLocator getLocator() {
		return locator;
	}

	@Override
	public List<IPrice> getGoodsPriceListAtLocation(long loginId, int instanceId, int locationId) {
		GetGoodsPriceListAtLocation bean = new GetGoodsPriceListAtLocation(loginId, instanceId, locationId);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public ITrade buyGoodsAtLocation(long loginId, int instanceId, int locationId, int goodsId, long goodsAmount, int currencyId) {
		BuyGoodsAtLocation bean = new BuyGoodsAtLocation(loginId, instanceId, locationId, goodsId, goodsAmount, currencyId);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public ITrade sellGoodsAtLocation(long loginId, int instanceId, int locationId, int goodsId, long goodsAmount, int currencyId) {
		SellGoodsAtLocation bean = new SellGoodsAtLocation(loginId, instanceId, locationId, goodsId, goodsAmount, currencyId);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public Boolean setTradeAtLocationPlugin(long loginId, int instanceId, String name, String plugin) {
		SetTradeAtLocationPlugin bean = new SetTradeAtLocationPlugin(loginId, instanceId, name, plugin);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}
}
