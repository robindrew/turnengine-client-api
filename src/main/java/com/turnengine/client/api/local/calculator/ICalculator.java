package com.turnengine.client.api.local.calculator;

import com.turnengine.client.api.local.staticcache.IStaticCacheSet;
import com.turnengine.client.api.local.unit.IUnit;

public interface ICalculator {

	IStaticCacheSet getCacheSet();

	IUnit getUnit(int unitId);

}
