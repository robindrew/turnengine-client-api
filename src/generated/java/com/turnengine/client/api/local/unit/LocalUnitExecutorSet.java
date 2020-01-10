package com.turnengine.client.api.local.unit;

import com.robindrew.codegenerator.api.executable.executor.IBeanExecutorLocator;
import java.util.List;

public class LocalUnitExecutorSet implements ILocalUnitExecutorSet {

	private final IBeanExecutorLocator locator;

	public LocalUnitExecutorSet(IBeanExecutorLocator locator) {
		if (locator == null) {
			throw new NullPointerException("locator");
		}
		this.locator = locator;
	}

	/**
	 * Getter for the locator field.
	 * @return the value of the locator field.
	 */
	public IBeanExecutorLocator getLocator() {
		return locator;
	}

	@Override
	public IUnit addUnit(long loginId, int instanceId, String name, UnitNode node, UnitType type, UnitMove move, String groupName, String factionName) {
		AddUnit bean = new AddUnit(loginId, instanceId, name, node, type, move, groupName, factionName);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public IUnit getUnitById(long loginId, int instanceId, int id) {
		GetUnitById bean = new GetUnitById(loginId, instanceId, id);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public IUnit getUnitByName(long loginId, int instanceId, String name) {
		GetUnitByName bean = new GetUnitByName(loginId, instanceId, name);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public List<IUnit> getUnits(long loginId, int instanceId) {
		GetUnits bean = new GetUnits(loginId, instanceId);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public List<IUnit> getUnitsByFactionId(long loginId, int instanceId, int id) {
		GetUnitsByFactionId bean = new GetUnitsByFactionId(loginId, instanceId, id);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public List<IUnit> getUnitsByFactionName(long loginId, int instanceId, String name) {
		GetUnitsByFactionName bean = new GetUnitsByFactionName(loginId, instanceId, name);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public List<IUnit> getUnitsByGroupId(long loginId, int instanceId, int id) {
		GetUnitsByGroupId bean = new GetUnitsByGroupId(loginId, instanceId, id);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public List<IUnit> getUnitsByGroupName(long loginId, int instanceId, String name) {
		GetUnitsByGroupName bean = new GetUnitsByGroupName(loginId, instanceId, name);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public List<IUnitCount> getAllUnitsAtPlayer(long loginId, int instanceId) {
		GetAllUnitsAtPlayer bean = new GetAllUnitsAtPlayer(loginId, instanceId);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public List<IUnitCount> getUnitsAtPlayer(long loginId, int instanceId, int groupId) {
		GetUnitsAtPlayer bean = new GetUnitsAtPlayer(loginId, instanceId, groupId);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}
}
