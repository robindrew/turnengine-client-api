package com.turnengine.client.api.local.faction;

import com.robindrew.codegenerator.api.executable.executor.IBeanExecutorLocator;
import java.util.List;

public class LocalFactionExecutorSet implements ILocalFactionExecutorSet {

	private final IBeanExecutorLocator locator;

	public LocalFactionExecutorSet(IBeanExecutorLocator locator) {
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
	public IFaction addFaction(long loginId, int instanceId, String name, String password, FactionUnited united, int playerLimit) {
		AddFaction bean = new AddFaction(loginId, instanceId, name, password, united, playerLimit);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public IFaction getFactionById(long loginId, int instanceId, int id) {
		GetFactionById bean = new GetFactionById(loginId, instanceId, id);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public IFaction getFactionByName(long loginId, int instanceId, String name) {
		GetFactionByName bean = new GetFactionByName(loginId, instanceId, name);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public List<IFaction> getFactions(long loginId, int instanceId) {
		GetFactions bean = new GetFactions(loginId, instanceId);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}
}
