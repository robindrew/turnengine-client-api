package com.turnengine.client.api.local.upkeep.data;

import com.turnengine.client.api.local.creation.data.ICreationData;
import com.turnengine.client.api.local.creation.data.ICreationUnitListSet;
import com.turnengine.client.api.local.unit.list.IUnitList;
import com.turnengine.client.api.local.upkeep.IUpkeepDefinition;

public interface IUpkeepData {

	int getPlayerId();

	IUnitList getUpkeepUnitList();

	ICreationUnitListSet getUnitListSet();

	ICreationData toCreation(IUpkeepDefinition upkeep, long amount);

	boolean isTurnUpdating();
}
