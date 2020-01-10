package com.turnengine.client.api.local;

import com.robindrew.codegenerator.api.executable.executor.IBeanExecutorLocator;
import com.turnengine.client.api.local.action.ILocalActionExecutorSet;
import com.turnengine.client.api.local.action.LocalActionExecutorSet;
import com.turnengine.client.api.local.faction.ILocalFactionExecutorSet;
import com.turnengine.client.api.local.faction.LocalFactionExecutorSet;
import com.turnengine.client.api.local.group.ILocalGroupExecutorSet;
import com.turnengine.client.api.local.group.LocalGroupExecutorSet;
import com.turnengine.client.api.local.location.ILocalLocationExecutorSet;
import com.turnengine.client.api.local.location.LocalLocationExecutorSet;
import com.turnengine.client.api.local.message.ILocalMessageExecutorSet;
import com.turnengine.client.api.local.message.LocalMessageExecutorSet;
import com.turnengine.client.api.local.mobile.ILocalMobileExecutorSet;
import com.turnengine.client.api.local.mobile.LocalMobileExecutorSet;
import com.turnengine.client.api.local.property.ILocalPropertyExecutorSet;
import com.turnengine.client.api.local.property.LocalPropertyExecutorSet;
import com.turnengine.client.api.local.score.ILocalScoreExecutorSet;
import com.turnengine.client.api.local.score.LocalScoreExecutorSet;
import com.turnengine.client.api.local.setup.ILocalSetupExecutorSet;
import com.turnengine.client.api.local.setup.LocalSetupExecutorSet;
import com.turnengine.client.api.local.storage.ILocalStorageExecutorSet;
import com.turnengine.client.api.local.storage.LocalStorageExecutorSet;
import com.turnengine.client.api.local.trading.ILocalTradingExecutorSet;
import com.turnengine.client.api.local.trading.LocalTradingExecutorSet;
import com.turnengine.client.api.local.unit.ILocalUnitExecutorSet;
import com.turnengine.client.api.local.unit.LocalUnitExecutorSet;
import com.turnengine.client.api.local.upkeep.ILocalUpkeepExecutorSet;
import com.turnengine.client.api.local.upkeep.LocalUpkeepExecutorSet;

public class LocalBeanExecutorSetLookup implements ILocalBeanExecutorSetLookup {

	private final ILocalFactionExecutorSet faction;
	private final ILocalLocationExecutorSet location;
	private final ILocalMobileExecutorSet mobile;
	private final ILocalActionExecutorSet action;
	private final ILocalMessageExecutorSet message;
	private final ILocalGroupExecutorSet group;
	private final ILocalUnitExecutorSet unit;
	private final ILocalScoreExecutorSet score;
	private final ILocalStorageExecutorSet storage;
	private final ILocalUpkeepExecutorSet upkeep;
	private final ILocalPropertyExecutorSet property;
	private final ILocalSetupExecutorSet setup;
	private final ILocalTradingExecutorSet trading;

	public LocalBeanExecutorSetLookup(IBeanExecutorLocator locator) {
		this.faction = new LocalFactionExecutorSet(locator);
		this.location = new LocalLocationExecutorSet(locator);
		this.mobile = new LocalMobileExecutorSet(locator);
		this.action = new LocalActionExecutorSet(locator);
		this.message = new LocalMessageExecutorSet(locator);
		this.group = new LocalGroupExecutorSet(locator);
		this.unit = new LocalUnitExecutorSet(locator);
		this.score = new LocalScoreExecutorSet(locator);
		this.storage = new LocalStorageExecutorSet(locator);
		this.upkeep = new LocalUpkeepExecutorSet(locator);
		this.property = new LocalPropertyExecutorSet(locator);
		this.setup = new LocalSetupExecutorSet(locator);
		this.trading = new LocalTradingExecutorSet(locator);
	}

	@Override
	public ILocalFactionExecutorSet getFactionSet() {
		return faction;
	}

	@Override
	public ILocalLocationExecutorSet getLocationSet() {
		return location;
	}

	@Override
	public ILocalMobileExecutorSet getMobileSet() {
		return mobile;
	}

	@Override
	public ILocalActionExecutorSet getActionSet() {
		return action;
	}

	@Override
	public ILocalMessageExecutorSet getMessageSet() {
		return message;
	}

	@Override
	public ILocalGroupExecutorSet getGroupSet() {
		return group;
	}

	@Override
	public ILocalUnitExecutorSet getUnitSet() {
		return unit;
	}

	@Override
	public ILocalScoreExecutorSet getScoreSet() {
		return score;
	}

	@Override
	public ILocalStorageExecutorSet getStorageSet() {
		return storage;
	}

	@Override
	public ILocalUpkeepExecutorSet getUpkeepSet() {
		return upkeep;
	}

	@Override
	public ILocalPropertyExecutorSet getPropertySet() {
		return property;
	}

	@Override
	public ILocalSetupExecutorSet getSetupSet() {
		return setup;
	}

	@Override
	public ILocalTradingExecutorSet getTradingSet() {
		return trading;
	}

}
