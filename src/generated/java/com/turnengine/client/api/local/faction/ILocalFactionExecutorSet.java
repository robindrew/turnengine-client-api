package com.turnengine.client.api.local.faction;

import com.robindrew.codegenerator.api.executable.executor.IBeanExecutorSet;
import com.turnengine.client.api.common.command.ILocalBeanExecutorSet;
import java.util.List;

public interface ILocalFactionExecutorSet extends IBeanExecutorSet, ILocalBeanExecutorSet {

	IFaction addFaction(long loginId, int instanceId, String name, String password, FactionUnited united, int playerLimit);

	IFaction getFactionById(long loginId, int instanceId, int id);

	IFaction getFactionByName(long loginId, int instanceId, String name);

	List<IFaction> getFactions(long loginId, int instanceId);
}
