package com.turnengine.client.api.local.creation.calculator.condition;

import com.robindrew.common.lang.RandomElement;
import com.turnengine.client.api.local.creation.ICreationCondition;
import com.turnengine.client.api.local.creation.data.ICreationData;
import com.turnengine.client.api.local.staticcache.IStaticCacheSet;
import com.turnengine.client.api.local.storage.StorageType;
import com.turnengine.client.api.local.unit.IUnit;
import com.turnengine.client.api.local.unit.list.IUnitList;
import com.turnengine.client.api.local.unit.list.count.IUnitCountList;
import com.turnengine.client.api.local.unit.list.set.IUnitListSet;

public class AddRandomCalculator extends ConditionCalculator {

	public AddRandomCalculator(IStaticCacheSet set) {
		super(set);
	}

	@Override
	public long apply(ICreationCondition condition, ICreationData data, boolean optional, long apply) {
		StorageType type = getStorageType(data);
		IUnitListSet listSet = data.getUnitListSet().getListSet();

		IUnit unit = getUnit(condition.getConditionId1());
		IUnitList list = listSet.getUnitList(unit.getType());
		long minAmountToAdd = apply * getMinimumAmount(condition);
		long maxAmountToAdd = apply * getMaximumAmount(condition);

		// As the amount we add is random, we always have to take in to account storage
		long amountCanAdd = getStorage().getAmountCanAdd(list, unit.getId(), type);
		if (amountCanAdd == 0) {
			return 0;
		}

		// If not optional, we must be able to add minimum or this fails
		if (!optional && amountCanAdd < minAmountToAdd) {
			return 0;
		}

		long amountToAdd = new RandomElement().nextLong(maxAmountToAdd, maxAmountToAdd);
		if (amountToAdd > amountCanAdd) {
			amountToAdd = amountCanAdd;
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
		IUnitListSet listSet = data.getUnitListSet().getListSet();

		IUnit unit = getUnit(condition.getConditionId1());
		IUnitList list = listSet.getUnitList(unit.getType());

		// We count based on minimum to maximise the actual count
		long amount = getMinimumAmount(condition);
		return getStorage().getAmountCanAdd(list, unit.getId(), type) / amount;
	}

	private long getMinimumAmount(ICreationCondition condition) {
		return condition.getConditionAmount1();
	}

	private long getMaximumAmount(ICreationCondition condition) {
		return condition.getConditionAmount2();
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
