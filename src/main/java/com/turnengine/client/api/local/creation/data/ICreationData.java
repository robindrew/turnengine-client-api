package com.turnengine.client.api.local.creation.data;

import java.util.List;

import com.turnengine.client.api.local.creation.ICreationCondition;
import com.turnengine.client.api.local.unit.IUnit;

public interface ICreationData {

	int getPlayerId();

	int getId();

	IUnit getUnit();

	int getGroupId();

	long getAmount();

	int getTurns();

	ICreationTargetData getData();

	ICreationTargetData getSourceData();

	ICreationTargetData getTargetData();

	List<? extends ICreationCondition> getConditions();

	boolean isTurnUpdating();
}
