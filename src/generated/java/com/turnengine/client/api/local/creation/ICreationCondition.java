package com.turnengine.client.api.local.creation;

public interface ICreationCondition {

	int getId();

	CreationConditionType getConditionType();

	int getConditionId1();

	long getConditionAmount1();

	int getConditionId2();

	long getConditionAmount2();

	int getConditionId3();

	long getConditionAmount3();

	boolean getOptional();
}
