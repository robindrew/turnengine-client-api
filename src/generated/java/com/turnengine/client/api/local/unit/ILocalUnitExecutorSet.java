package com.turnengine.client.api.local.unit;

import com.robindrew.codegenerator.api.executable.executor.IBeanExecutorSet;
import com.turnengine.client.api.common.command.ILocalBeanExecutorSet;
import java.util.List;

public interface ILocalUnitExecutorSet extends IBeanExecutorSet, ILocalBeanExecutorSet {

	IUnit addUnit(long loginId, int instanceId, String name, UnitNode node, UnitType type, UnitMove move, String groupName, String factionName);

	IUnit getUnitById(long loginId, int instanceId, int id);

	IUnit getUnitByName(long loginId, int instanceId, String name);

	List<IUnit> getUnits(long loginId, int instanceId);

	List<IUnit> getUnitsByFactionId(long loginId, int instanceId, int id);

	List<IUnit> getUnitsByFactionName(long loginId, int instanceId, String name);

	List<IUnit> getUnitsByGroupId(long loginId, int instanceId, int id);

	List<IUnit> getUnitsByGroupName(long loginId, int instanceId, String name);

	List<IUnitCount> getUnitsAtPlayer(long loginId, int instanceId);

	List<IUnitCount> getUnitsAtPlayerByGroupId(long loginId, int instanceId, int groupId);
}
