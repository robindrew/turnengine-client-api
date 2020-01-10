package com.turnengine.client.api.local.upkeep;

import com.robindrew.codegenerator.api.executable.executor.IBeanExecutorLocator;
import com.turnengine.client.api.local.creation.CreationConditionType;
import com.turnengine.client.api.local.unit.IUnitCount;
import java.util.List;

public class LocalUpkeepExecutorSet implements ILocalUpkeepExecutorSet {

	private final IBeanExecutorLocator locator;

	public LocalUpkeepExecutorSet(IBeanExecutorLocator locator) {
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
	public IUpkeep addUpkeep(long loginId, int instanceId, String name, long limit) {
		AddUpkeep bean = new AddUpkeep(loginId, instanceId, name, limit);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public IUpkeepCondition addUpkeepCondition(long loginId, int instanceId, String name, CreationConditionType condition, String conditionName1, long conditionAmount1, String conditionName2, long conditionAmount2, String conditionName3, long conditionAmount3, boolean optional) {
		AddUpkeepCondition bean = new AddUpkeepCondition(loginId, instanceId, name, condition, conditionName1, conditionAmount1, conditionName2, conditionAmount2, conditionName3, conditionAmount3, optional);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public List<IUpkeep> getUpkeepList(long loginId, int instanceId) {
		GetUpkeepList bean = new GetUpkeepList(loginId, instanceId);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public List<IUpkeepCondition> getUpkeepConditionList(long loginId, int instanceId) {
		GetUpkeepConditionList bean = new GetUpkeepConditionList(loginId, instanceId);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}

	@Override
	public List<IUnitCount> getUpkeepAtLocation(long loginId, int instanceId, int locationId) {
		GetUpkeepAtLocation bean = new GetUpkeepAtLocation(loginId, instanceId, locationId);
		return getLocator().locateExecutor(bean).executeBean(bean);
	}
}
