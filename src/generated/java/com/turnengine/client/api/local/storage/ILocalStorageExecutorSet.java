package com.turnengine.client.api.local.storage;

import com.robindrew.codegenerator.api.executable.executor.IBeanExecutorSet;
import com.turnengine.client.api.common.command.ILocalBeanExecutorSet;
import java.util.List;

public interface ILocalStorageExecutorSet extends IBeanExecutorSet, ILocalBeanExecutorSet {

	Boolean setStorageGroup(long loginId, int instanceId, String parentName, String groupName, long capacity, StorageType type);

	Boolean setStorageItem(long loginId, int instanceId, String parentName, String groupName, String childName, long size, long limit);

	List<IStorageGroup> getStorageGroups(long loginId, int instanceId);

	List<IStorageItem> getStorageItems(long loginId, int instanceId);
}
