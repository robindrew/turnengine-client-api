package com.turnengine.client.api.local.faction;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.turnengine.client.api.local.identity.NamedIdentityCache;

public class FactionCache extends NamedIdentityCache<IFaction> implements IFactionCache {

	public FactionCache() {
	}

	public FactionCache(Collection<IFaction> factions) {
		addAll(factions);
	}

	@Override
	public List<IFaction> getByUnited(FactionUnited factioned) {
		List<IFaction> set = new ArrayList<IFaction>();
		for (IFaction faction : this) {
			if (faction.getUnited().equals(factioned)) {
				set.add(faction);
			}
		}
		return set;
	}

}
