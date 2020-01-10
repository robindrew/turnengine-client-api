package com.turnengine.client.api.local.creation.calculator.condition;

import com.turnengine.client.api.local.creation.ICreationCondition;
import com.turnengine.client.api.local.creation.data.ICreationData;
import com.turnengine.client.api.local.staticcache.IStaticCacheSet;
import com.turnengine.client.api.local.unit.IUnit;
import com.turnengine.client.api.local.unit.list.IUnitList;
import com.turnengine.client.api.local.unit.list.count.IUnitCountList;
import com.turnengine.client.api.local.unit.list.set.IUnitListSet;

public class RemoveCalculator extends ConditionCalculator {

	public RemoveCalculator(IStaticCacheSet set) {
		super(set);
	}

	@Override
	public long apply(ICreationCondition condition, ICreationData data, boolean optional, long apply) {
		IUnitListSet listSet = data.getUnitListSet().getListSet();

		IUnit unit = getUnit(condition.getConditionId1());
		IUnitList list = listSet.getUnitList(unit.getType());
		long amount = condition.getConditionAmount1();
		long amountToRemove = apply * amount;

		// Optional? (best effort - do as much as possible)
		if (optional) {
			long amountCanRemove = getStorage().getAmountCanRemove(list, unit.getId());
			if (amountCanRemove == 0) {
				return 0;
			}
			if (amountToRemove > amountCanRemove) {
				amountToRemove = amountCanRemove;
			}
		}

		getStorage().removeAmount(list, unit.getId(), amountToRemove);
		return apply;
	}

	@Override
	public long count(ICreationCondition condition, ICreationData data, boolean optional) {
		if (optional) {
			return Long.MAX_VALUE;
		}

		IUnitListSet listSet = data.getUnitListSet().getListSet();

		IUnit unit = getUnit(condition.getConditionId1());
		IUnitList list = listSet.getUnitList(unit.getType());
		long amount = condition.getConditionAmount1();
		return getStorage().getAmountCanRemove(list, unit.getId()) / amount;
	}

	@Override
	public void getOutput(ICreationCondition condition, ICreationData data, long amountToApply, IUnitCountList output) {
		output.add(condition.getConditionId1(), -(amountToApply * condition.getConditionAmount1()));
	}

	@Override
	public long undo(ICreationCondition condition, ICreationData data, boolean optional, long amountToUndo) {
		optional = true;
		AddCalculator calculator = new AddCalculator(getCacheSet());
		return calculator.apply(condition, data, optional, amountToUndo);
	}

}
