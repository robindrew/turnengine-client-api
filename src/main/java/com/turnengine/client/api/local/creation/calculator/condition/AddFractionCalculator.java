package com.turnengine.client.api.local.creation.calculator.condition;

import com.turnengine.client.api.local.creation.ICreationCondition;
import com.turnengine.client.api.local.creation.data.ICreationData;
import com.turnengine.client.api.local.staticcache.IStaticCacheSet;
import com.turnengine.client.api.local.storage.StorageType;
import com.turnengine.client.api.local.unit.IUnit;
import com.turnengine.client.api.local.unit.list.IUnitList;
import com.turnengine.client.api.local.unit.list.count.IUnitCountList;
import com.turnengine.client.api.local.unit.list.set.IUnitListSet;

public class AddFractionCalculator extends ConditionCalculator {

	public AddFractionCalculator(IStaticCacheSet set) {
		super(set);
	}

	@Override
	public long apply(ICreationCondition condition, ICreationData data, boolean optional, long apply) {
		StorageType type = getStorageType(data);
		IUnitListSet listSet = data.getData().getListSet();

		IUnit unit1 = getUnit(condition.getConditionId1());
		IUnitList list1 = listSet.getUnitList(unit1.getType());
		long amount1 = condition.getConditionAmount1();

		// Fraction
		IUnit unit2 = getUnit(condition.getConditionId2());
		IUnitList list2 = listSet.getUnitList(unit2.getType());
		long divisor = condition.getConditionAmount2();
		long amount2 = getStorage().getAmount(list2, unit2.getId());
		if (amount2 == 0) {
			if (optional) {
				return 0;
			}
			throw new IllegalArgumentException("unable to find any of " + unit2 + " in " + list2);
		}

		// Multiply out the fraction
		long amountToAdd = ((amount1 * amount2) / divisor) * apply;
		if (amountToAdd == 0) {
			if (optional) {
				return 0;
			}
			throw new IllegalArgumentException("amount to add is zero");
		}

		// Optional? (best effort - do as much as possible)
		if (optional) {
			long amountCanAdd = getStorage().getAmountCanAdd(list1, unit1.getId(), type);
			if (amountCanAdd == 0) {
				return 0;
			}
			if (amountToAdd > amountCanAdd) {
				amountToAdd = amountCanAdd;
			}
		}
		getStorage().addAmount(list1, unit1.getId(), amountToAdd, type);
		return apply;
	}

	@Override
	public long count(ICreationCondition condition, ICreationData data, boolean optional) {
		if (optional) {
			return Long.MAX_VALUE;
		}

		StorageType type = getStorageType(data);
		IUnitListSet listSet = data.getData().getListSet();

		IUnit unit1 = getUnit(condition.getConditionId1());
		IUnitList list1 = listSet.getUnitList(unit1.getType());
		long amount1 = condition.getConditionAmount1();
		long amountCanAdd = getStorage().getAmountCanAdd(list1, unit1.getId(), type);
		if (amountCanAdd == 0) {
			return 0;
		}

		// Fraction
		IUnit unit2 = getUnit(condition.getConditionId2());
		IUnitList list2 = listSet.getUnitList(unit2.getType());
		long divisor = condition.getConditionAmount2();
		long amount2 = getStorage().getAmount(list2, unit2.getId());
		if (amount2 == 0) {
			return 0;
		}

		// Multiply out the fraction
		long amountToAdd = ((amount1 * amount2) / divisor);
		return amountCanAdd / amountToAdd;
	}

	@Override
	public void getOutput(ICreationCondition condition, ICreationData data, long amountToApply, IUnitCountList output) {
		IUnitListSet listSet = data.getData().getListSet();

		IUnit unit1 = getUnit(condition.getConditionId1());
		// IUnitList list1 = listSet.getUnitList(unit1.getType());
		long amount1 = condition.getConditionAmount1();

		// Fraction
		IUnit unit2 = getUnit(condition.getConditionId2());
		IUnitList list2 = listSet.getUnitList(unit2.getType());
		long divisor = condition.getConditionAmount2();
		long amount2 = getStorage().getAmount(list2, unit2.getId());
		if (amount2 == 0) {
			return;
		}

		// Multiply out the fraction
		long amountToAdd = ((amount1 * amount2) / divisor) * amountToApply;
		output.add(unit1, amountToAdd);
	}

	@Override
	public long undo(ICreationCondition condition, ICreationData data, boolean optional, long amountToUndo) {
		optional = true;
		RemoveFractionCalculator calculator = new RemoveFractionCalculator(getCacheSet());
		return calculator.apply(condition, data, optional, amountToUndo);
	}

}
