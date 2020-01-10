package com.turnengine.client.api.local.upkeep;

import java.util.List;

public interface IUpkeepDefinition {

	IUpkeep getUpkeep();

	List<IUpkeepCondition> getConditions();

	void addCondition(IUpkeepCondition condition);

}
