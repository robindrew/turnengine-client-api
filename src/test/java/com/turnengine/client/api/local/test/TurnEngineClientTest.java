package com.turnengine.client.api.local.test;

import static com.robindrew.common.dependency.DependencyFactory.setDependency;

import com.turnengine.client.api.local.action.calculator.ActionCalculator;
import com.turnengine.client.api.local.action.calculator.IActionCalculator;
import com.turnengine.client.api.local.action.plugin.ActionPluginManager;
import com.turnengine.client.api.local.action.plugin.IActionPluginManager;
import com.turnengine.client.api.local.cache.CacheSetManager;
import com.turnengine.client.api.local.storage.calculator.IStorageCalculator;
import com.turnengine.client.api.local.storage.calculator.StorageCalculator;
import com.turnengine.client.api.local.storage2.calculator.IStorageCalculator2;
import com.turnengine.client.api.local.storage2.calculator.StorageCalculator2;
import com.turnengine.client.api.local.upkeep.calculator.IUpkeepCalculator;
import com.turnengine.client.api.local.upkeep.calculator.UpkeepCalculator;

public class TurnEngineClientTest extends CacheSetManager {

	private final IStorageCalculator storageCalculator;
	private final IStorageCalculator2 storageCalculator2;
	private final IUpkeepCalculator upkeepCalculator;
	private final IActionPluginManager actionPluginManager;
	private final IActionCalculator actionCalculator;

	public TurnEngineClientTest() {
		storageCalculator = new StorageCalculator(getCacheSet());
		storageCalculator2 = new StorageCalculator2(getCacheSet());
		upkeepCalculator = new UpkeepCalculator(getCacheSet());
		actionPluginManager = new ActionPluginManager();
		actionCalculator = new ActionCalculator(getCacheSet(), actionPluginManager);
	}

	@Override
	public void setDependencies() {
		super.setDependencies();

		setDependency(IStorageCalculator.class, storageCalculator);
		setDependency(IUpkeepCalculator.class, upkeepCalculator);
		setDependency(IActionPluginManager.class, actionPluginManager);
		setDependency(IActionCalculator.class, actionCalculator);
	}

	public IStorageCalculator getStorageCalculator() {
		return storageCalculator;
	}

	public IStorageCalculator2 getStorageCalculator2() {
		return storageCalculator2;
	}

	public IUpkeepCalculator getUpkeepCalculator() {
		return upkeepCalculator;
	}

	public IActionPluginManager getActionPluginManager() {
		return actionPluginManager;
	}

	public IActionCalculator getActionCalculator() {
		return actionCalculator;
	}
}
