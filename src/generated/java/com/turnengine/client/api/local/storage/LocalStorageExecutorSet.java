package com.turnengine.client.api.local.storage;

import com.robindrew.codegenerator.api.executable.executor.IBeanExecutorLocator;
import java.util.List;

public class LocalStorageExecutorSet implements ILocalStorageExecutorSet {

	private final IBeanExecutorLocator locator;

	public LocalStorageExecutorSet(IBeanExecutorLocator locator) {
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
	public Boolean setStorageGroup(long loginId, int instanceId, String parentName, String groupName, long capacity, StorageType type) {
		SetStorageGroup bean = new SetStorageGroup(loginId, instanceId, parentName, groupName, capacity, type);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public Boolean setStorageItem(long loginId, int instanceId, String parentName, String groupName, String childName, long size, long limit) {
		SetStorageItem bean = new SetStorageItem(loginId, instanceId, parentName, groupName, childName, size, limit);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public List<IStorageGroup> getStorageGroups(long loginId, int instanceId) {
		GetStorageGroups bean = new GetStorageGroups(loginId, instanceId);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public List<IStorageItem> getStorageItems(long loginId, int instanceId) {
		GetStorageItems bean = new GetStorageItems(loginId, instanceId);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}
}
