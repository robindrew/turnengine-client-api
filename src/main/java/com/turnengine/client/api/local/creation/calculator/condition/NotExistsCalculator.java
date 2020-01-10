package com.turnengine.client.api.local.creation.calculator.condition;

import com.turnengine.client.api.local.creation.ICreationCondition;
import com.turnengine.client.api.local.creation.data.ICreationData;
import com.turnengine.client.api.local.staticcache.IStaticCacheSet;
import com.turnengine.client.api.local.unit.IUnit;
import com.turnengine.client.api.local.unit.list.IUnitList;
import com.turnengine.client.api.local.unit.list.count.IUnitCountList;
import com.turnengine.client.api.local.unit.list.set.IUnitListSet;

public class NotExistsCalculator extends ConditionCalculator {

	public NotExistsCalculator(IStaticCacheSet set) {
		super(set);
	}

	@Override
	public long apply(ICreationCondition condition, ICreationData data, boolean optional, long apply) {
		// Nothing to do ...
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
		boolean exists = (list.getAmount(unit) < amount);
		return exists ? Long.MAX_VALUE : 0;
	}

	@Override
	public void getOutput(ICreationCondition condition, ICreationData data, long amountToApply, IUnitCountList output) {
		// Nothing to do ...
	}

	@Override
	public long undo(ICreationCondition condition, ICreationData action, boolean optional, long amountToUndo) {
		return amountToUndo;
	}

}
