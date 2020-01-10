package com.turnengine.client.api.local.creation.calculator;

import com.turnengine.client.api.local.calculator.ICalculator;
import com.turnengine.client.api.local.creation.CreationConditionType;
import com.turnengine.client.api.local.creation.calculator.condition.IConditionCalculator;
import com.turnengine.client.api.local.creation.data.ICreationData;

public interface ICreationCalculator extends ICalculator {

	IConditionCalculator getCalculator(CreationConditionType type);

	long countCreation(ICreationData data, long limit);

	void applyCreation(ICreationData data, long amount, boolean optional);

	void undoCreation(ICreationData data, long amount, boolean optional);

}
