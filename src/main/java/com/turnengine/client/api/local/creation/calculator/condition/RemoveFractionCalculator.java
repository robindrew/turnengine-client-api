package com.turnengine.client.api.local.creation.calculator.condition;

import com.turnengine.client.api.local.creation.ICreationCondition;
import com.turnengine.client.api.local.creation.data.ICreationData;
import com.turnengine.client.api.local.staticcache.IStaticCacheSet;
import com.turnengine.client.api.local.unit.IUnit;
import com.turnengine.client.api.local.unit.list.IUnitList;
import com.turnengine.client.api.local.unit.list.count.IUnitCountList;
import com.turnengine.client.api.local.unit.list.set.IUnitListSet;

public class RemoveFractionCalculator extends ConditionCalculator {

	public RemoveFractionCalculator(IStaticCacheSet set) {
		super(set);
	}

	@Override
	public long apply(ICreationCondition condition, ICreationData data, boolean optional, long apply) {
		IUnitListSet listSet = data.getUnitListSet().getListSet();

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
		long amountToRemove = ((amount1 * amount2) / divisor) * apply;
		if (amountToRemove == 0) {
			if (optional) {
				return 0;
			}
			throw new IllegalArgumentException("amount to remove is zero");
		}

		// Optional? (best effort - do as much as possible)
		if (optional) {
			long amountCanRemove = getStorage().getAmountCanRemove(list1, unit1.getId());
			if (amountCanRemove == 0) {
				return 0;
			}
			if (amountToRemove > amountCanRemove) {
				amountToRemove = amountCanRemove;
			}
		}

		getStorage().removeAmount(list1, unit1.getId(), amountToRemove);
		return apply;
	}

	@Override
	public long count(ICreationCondition condition, ICreationData data, boolean optional) {
		if (optional) {
			return Long.MAX_VALUE;
		}

		IUnitListSet listSet = data.getUnitListSet().getListSet();

		IUnit unit1 = getUnit(condition.getConditionId1());
		IUnitList list1 = listSet.getUnitList(unit1.getType());
		long amount1 = condition.getConditionAmount1();
		long amountCanRemove = getStorage().getAmountCanRemove(list1, unit1.getId());
		if (amountCanRemove == 0) {
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
		long amountToRemove = ((amount1 * amount2) / divisor);
		if (amountToRemove == 0) {
			return 0;
		}
		return amountCanRemove / amountToRemove;
	}

	@Override
	public void getOutput(ICreationCondition condition, ICreationData data, long amountToApply, IUnitCountList output) {
		IUnitListSet listSet = data.getUnitListSet().getListSet();

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
		long amountToRemove = ((amount1 * amount2) / divisor) * amountToApply;
		output.add(unit1, -amountToRemove);
	}

	@Override
	public long undo(ICreationCondition condition, ICreationData data, boolean optional, long amountToUndo) {
		optional = true;
		AddFractionCalculator calculator = new AddFractionCalculator(getCacheSet());
		return calculator.apply(condition, data, optional, amountToUndo);
	}

}
