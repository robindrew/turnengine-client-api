package com.turnengine.client.api.local.group;

import com.robindrew.codegenerator.api.executable.executor.IBeanExecutorLocator;
import java.util.List;

public class LocalGroupExecutorSet implements ILocalGroupExecutorSet {

	private final IBeanExecutorLocator locator;

	public LocalGroupExecutorSet(IBeanExecutorLocator locator) {
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
	public IGroup addParentGroup(long loginId, int instanceId, String name, String factionName) {
		AddParentGroup bean = new AddParentGroup(loginId, instanceId, name, factionName);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public IGroup addChildGroup(long loginId, int instanceId, String name, String parentName, String factionName) {
		AddChildGroup bean = new AddChildGroup(loginId, instanceId, name, parentName, factionName);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public IGroup getGroupById(long loginId, int instanceId, int id) {
		GetGroupById bean = new GetGroupById(loginId, instanceId, id);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public IGroup getGroupByName(long loginId, int instanceId, String name) {
		GetGroupByName bean = new GetGroupByName(loginId, instanceId, name);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public List<IGroup> getGroups(long loginId, int instanceId) {
		GetGroups bean = new GetGroups(loginId, instanceId);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public List<IGroup> getGroupListByFactionName(long loginId, int instanceId, String name) {
		GetGroupListByFactionName bean = new GetGroupListByFactionName(loginId, instanceId, name);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}
}
