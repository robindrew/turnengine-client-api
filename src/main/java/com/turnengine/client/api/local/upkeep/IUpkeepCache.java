package com.turnengine.client.api.local.upkeep;

import java.util.Collection;
import java.util.List;

import com.turnengine.client.api.local.staticcache.IStaticCache;
import com.turnengine.client.api.local.unit.IUnit;

public interface IUpkeepCache extends IStaticCache<IUpkeep> {

	void addUpkeeps(Collection<IUpkeep> upkeeps);

	void addUpkeep(IUpkeep upkeep);

	void addConditions(Collection<IUpkeepCondition> conditions);

	void addCondition(IUpkeepCondition condition);

	List<IUpkeepCondition> getConditions();

	List<IUpkeepDefinition> getDefinitions();

	boolean hasDefinition(IUnit unit);

	boolean hasDefinition(int unitId);

	boolean hasDefinition(IUpkeep upkeep);

	IUpkeepDefinition getDefinition(IUnit unit);

	IUpkeepDefinition getDefinition(int unitId);

	IUpkeepDefinition getDefinition(IUpkeep upkeep);

	IUpkeep getUpkeep(IUnit unit);

	IUpkeep getUpkeep(int unitId);

}
