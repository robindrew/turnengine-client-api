package com.turnengine.client.api.local.creation.calculator.condition;

import com.turnengine.client.api.local.creation.ICreationCondition;
import com.turnengine.client.api.local.creation.data.ICreationData;
import com.turnengine.client.api.local.staticcache.IStaticCacheSet;
import com.turnengine.client.api.local.storage.StorageType;
import com.turnengine.client.api.local.unit.IUnit;
import com.turnengine.client.api.local.unit.list.IUnitList;
import com.turnengine.client.api.local.unit.list.count.IUnitCountList;
import com.turnengine.client.api.local.unit.list.set.IUnitListSet;

public class AddCalculator extends ConditionCalculator {

	public AddCalculator(IStaticCacheSet set) {
		super(set);
	}

	@Override
	public long apply(ICreationCondition condition, ICreationData data, boolean optional, long apply) {
		StorageType type = getStorageType(data);
		IUnitListSet listSet = data.getData().getListSet();

		IUnit unit = getUnit(condition.getConditionId1());
		IUnitList list = listSet.getUnitList(unit.getType());
		long amount = condition.getConditionAmount1();
		long amountToAdd = apply * amount;

		// Optional? (best effort - do as much as possible)
		if (optional) {
			long amountCanAdd = getStorage().getAmountCanAdd(list, unit.getId(), type);
			if (amountCanAdd == 0) {
				return 0;
			}
			if (amountToAdd > amountCanAdd) {
				amountToAdd = amountCanAdd;
			}
		}

		getStorage().addAmount(list, unit.getId(), amountToAdd, type);
		return apply;
	}

	@Override
	public long count(ICreationCondition condition, ICreationData data, boolean optional) {
		if (optional) {
			return Long.MAX_VALUE;
		}

		StorageType type = getStorageType(data);
		IUnitListSet listSet = data.getData().getListSet();

		IUnit unit = getUnit(condition.getConditionId1());
		IUnitList list = listSet.getUnitList(unit.getType());
		long amount = condition.getConditionAmount1();
		return getStorage().getAmountCanAdd(list, unit.getId(), type) / amount;
	}

	@Override
	public void getOutput(ICreationCondition condition, ICreationData data, long amountToApply, IUnitCountList output) {
		output.add(condition.getConditionId1(), amountToApply * condition.getConditionAmount1());
	}

	@Override
	public long undo(ICreationCondition condition, ICreationData data, boolean optional, long amountToUndo) {
		optional = true;
		RemoveCalculator calculator = new RemoveCalculator(getCacheSet());
		return calculator.apply(condition, data, optional, amountToUndo);
	}

}
