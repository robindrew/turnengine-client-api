package com.turnengine.client.api.local.unit;

import java.util.List;

import com.turnengine.client.api.local.faction.IFaction;
import com.turnengine.client.api.local.group.IGroup;
import com.turnengine.client.api.local.identity.INamedIdentityCache;

public interface IUnitCache extends INamedIdentityCache<IUnit> {

	List<IUnit> getByFactionId(int factionId);

	List<IUnit> getByFaction(IFaction faction);

	List<IUnit> getByGroupId(int groupId);

	List<IUnit> getByGroup(IGroup group);

	List<IUnit> getByType(UnitType type);

	List<IUnit> getByMove(UnitMove move);

	List<IUnit> getByNode(UnitNode node);

}
