package com.turnengine.client.api.local.upkeep;

import com.robindrew.codegenerator.api.executable.executor.IBeanExecutorSet;
import com.turnengine.client.api.common.command.ILocalBeanExecutorSet;
import com.turnengine.client.api.local.creation.CreationConditionType;
import com.turnengine.client.api.local.unit.IUnitCount;
import java.util.List;

public interface ILocalUpkeepExecutorSet extends IBeanExecutorSet, ILocalBeanExecutorSet {

	IUpkeep addUpkeep(long loginId, int instanceId, String name, long limit);

	IUpkeepCondition addUpkeepCondition(long loginId, int instanceId, String name, CreationConditionType condition, String conditionName1, long conditionAmount1, String conditionName2, long conditionAmount2, String conditionName3, long conditionAmount3, boolean optional);

	List<IUpkeep> getUpkeepList(long loginId, int instanceId);

	List<IUpkeepCondition> getUpkeepConditionList(long loginId, int instanceId);

	List<IUnitCount> getUpkeepAtLocation(long loginId, int instanceId, int locationId);
}
