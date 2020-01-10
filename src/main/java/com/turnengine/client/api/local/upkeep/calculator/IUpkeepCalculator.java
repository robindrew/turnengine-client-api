package com.turnengine.client.api.local.upkeep.calculator;

import com.turnengine.client.api.local.calculator.ICalculator;
import com.turnengine.client.api.local.unit.list.count.IUnitCountList;
import com.turnengine.client.api.local.upkeep.data.IUpkeepData;

public interface IUpkeepCalculator extends ICalculator {

	void applyUpkeep(IUpkeepData set);

	IUnitCountList getOutput(IUpkeepData set, boolean allowNegativeAmounts);

	IUnitCountList getOutput(IUpkeepData set);

}
