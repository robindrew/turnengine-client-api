package com.turnengine.client.api.local.group;

import java.util.List;

import com.turnengine.client.api.local.faction.IFaction;
import com.turnengine.client.api.local.identity.INamedIdentityCache;

public interface IGroupCache extends INamedIdentityCache<IGroup> {

	List<IGroup> getByFactionId(int factionId);

	List<IGroup> getByParentId(int groupId);

	List<IGroup> getByFaction(IFaction faction);

	List<IGroup> getByParent(IGroup group);

}
