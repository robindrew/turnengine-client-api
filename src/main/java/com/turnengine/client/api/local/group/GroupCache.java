package com.turnengine.client.api.local.group;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.turnengine.client.api.local.faction.IFaction;
import com.turnengine.client.api.local.identity.NamedIdentityCache;

public class GroupCache extends NamedIdentityCache<IGroup> implements IGroupCache {

	public GroupCache() {
		super("Group");
	}

	public GroupCache(Collection<? extends IGroup> groups) {
		super("Group", groups);
	}

	@Override
	public List<IGroup> getByFactionId(int factionId) {
		List<IGroup> set = new ArrayList<IGroup>();
		for (IGroup group : this) {
			if (group.getFactionId() == factionId) {
				set.add(group);
			}
		}
		return set;
	}

	@Override
	public List<IGroup> getByParentId(int groupId) {
		List<IGroup> set = new ArrayList<IGroup>();
		for (IGroup group : this) {
			if (group.getParentId() == groupId) {
				set.add(group);
			}
		}
		return set;
	}

	@Override
	public List<IGroup> getByFaction(IFaction faction) {
		return getByFactionId(faction.getId());
	}

	@Override
	public List<IGroup> getByParent(IGroup group) {
		return getByParentId(group.getId());
	}
}
