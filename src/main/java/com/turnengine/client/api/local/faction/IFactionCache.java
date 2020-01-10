package com.turnengine.client.api.local.faction;

import java.util.List;

import com.turnengine.client.api.local.identity.INamedIdentityCache;

public interface IFactionCache extends INamedIdentityCache<IFaction> {

	List<IFaction> getByUnited(FactionUnited united);

}
