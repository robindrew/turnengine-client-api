package com.turnengine.client.api.local.trading;

import com.robindrew.codegenerator.api.executable.executor.IBeanExecutorSet;
import com.turnengine.client.api.common.command.ILocalBeanExecutorSet;
import java.util.List;

public interface ILocalTradingExecutorSet extends IBeanExecutorSet, ILocalBeanExecutorSet {

	List<IPrice> getGoodsPriceListAtLocation(long loginId, int instanceId, int locationId);

	ITrade buyGoodsAtLocation(long loginId, int instanceId, int locationId, int goodsId, long goodsAmount, int currencyId);

	ITrade sellGoodsAtLocation(long loginId, int instanceId, int locationId, int goodsId, long goodsAmount, int currencyId);

	Boolean setTradeAtLocationPlugin(long loginId, int instanceId, String name, String plugin);
}
