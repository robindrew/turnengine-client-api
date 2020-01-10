package com.turnengine.client.api.local.group;

import com.robindrew.codegenerator.api.executable.executor.IBeanExecutorSet;
import com.turnengine.client.api.common.command.ILocalBeanExecutorSet;
import java.util.List;

public interface ILocalGroupExecutorSet extends IBeanExecutorSet, ILocalBeanExecutorSet {

	IGroup addParentGroup(long loginId, int instanceId, String name, String factionName);

	IGroup addChildGroup(long loginId, int instanceId, String name, String parentName, String factionName);

	IGroup getGroupById(long loginId, int instanceId, int id);

	IGroup getGroupByName(long loginId, int instanceId, String name);

	List<IGroup> getGroups(long loginId, int instanceId);

	List<IGroup> getGroupListByFactionName(long loginId, int instanceId, String name);
}
