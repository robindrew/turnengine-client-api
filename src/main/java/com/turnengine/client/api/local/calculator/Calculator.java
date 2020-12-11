package com.turnengine.client.api.local.calculator;

import com.robindrew.common.util.Check;
import com.turnengine.client.api.local.staticcache.IStaticCacheSet;

public class Calculator implements ICalculator {

	private final IStaticCacheSet cacheSet;

	public Calculator(IStaticCacheSet set) {
		this.cacheSet = Check.notNull("set", set);
	}

	@Override
	public IStaticCacheSet getCacheSet() {
		return cacheSet;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName();
	}

}
