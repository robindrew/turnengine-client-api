package com.turnengine.client.api.local.creation.calculator.condition;

import com.turnengine.client.api.local.calculator.ICalculator;
import com.turnengine.client.api.local.creation.ICreationCondition;
import com.turnengine.client.api.local.creation.data.ICreationData;
import com.turnengine.client.api.local.unit.list.count.IUnitCountList;

public interface IConditionCalculator extends ICalculator {

	long count(ICreationCondition condition, ICreationData data, boolean optional);

	long apply(ICreationCondition condition, ICreationData data, boolean optional, long amountToApply);

	long undo(ICreationCondition condition, ICreationData data, boolean optional, long amountToUndo);

	void getOutput(ICreationCondition condition, ICreationData data, long amountToApply, IUnitCountList output);

}
