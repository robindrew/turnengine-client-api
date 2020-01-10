package com.turnengine.client.api.local.creation.calculator.condition;

import com.turnengine.client.api.local.creation.ICreationCondition;
import com.turnengine.client.api.local.creation.data.ICreationData;
import com.turnengine.client.api.local.staticcache.IStaticCacheSet;
import com.turnengine.client.api.local.storage.StorageType;
import com.turnengine.client.api.local.unit.IUnit;
import com.turnengine.client.api.local.unit.list.IUnitList;
import com.turnengine.client.api.local.unit.list.count.IUnitCountList;
import com.turnengine.client.api.local.unit.list.set.IUnitListSet;

public class AddPercentCalculator extends ConditionCalculator {

	public AddPercentCalculator(IStaticCacheSet set) {
		super(set);
	}

	@Override
	public long apply(ICreationCondition condition, ICreationData data, boolean optional, long apply) {
		StorageType type = getStorageType(data);
		IUnitListSet listSet = data.getUnitListSet().getListSet();

		IUnit unit1 = getUnit(condition.getConditionId1());
		IUnitList list1 = listSet.getUnitList(unit1.getType());
		long amount1 = condition.getConditionAmount1();

		// Percent
		IUnit unit2 = getUnit(condition.getConditionId2());
		IUnitList list2 = listSet.getUnitList(unit2.getType());
		long percentIncrement = condition.getConditionAmount2();
		long percentAmount = getStorage().getAmount(list2, unit2.getId());
		if (percentAmount == 0 || percentAmount / percentIncrement == 0) {
			if (optional) {
				return 0;
			}
			throw new IllegalArgumentException("unable to find any of " + unit2 + " in " + list2);
		}
		percentAmount = (percentAmount / percentIncrement) * percentIncrement;

		// Fraction (optional)
		long fractionDivisor = 1;
		long fractionAmount = 1;
		if (condition.getConditionAmount3() > 0) {
			IUnit unit3 = getUnit(condition.getConditionId3());
			IUnitList list3 = listSet.getUnitList(unit3.getType());
			fractionDivisor = condition.getConditionAmount3();
			fractionAmount = getStorage().getAmount(list3, unit3.getId());
			if (fractionAmount == 0) {
				if (optional) {
					return 0;
				}
				throw new IllegalArgumentException("unable to find any of " + unit3 + " in " + list3);
			}
		}

		// Multiply out the fraction
		long amountToAdd = ((amount1 * fractionAmount) / fractionDivisor) * apply;
		if (amountToAdd == 0) {
			if (optional) {
				return 0;
			}
			throw new IllegalArgumentException("amount to add is zero");
		}

		// Apply the percentage
		amountToAdd = (amountToAdd * percentAmount) / 100;
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
		IUnitListSet listSet = data.getUnitListSet().getListSet();

		IUnit unit1 = getUnit(condition.getConditionId1());
		IUnitList list1 = listSet.getUnitList(unit1.getType());
		long amount1 = condition.getConditionAmount1();
		long amountCanAdd = getStorage().getAmountCanAdd(list1, unit1.getId(), type);
		if (amountCanAdd == 0) {
			return 0;
		}

		// Percent
		IUnit unit2 = getUnit(condition.getConditionId2());
		IUnitList list2 = listSet.getUnitList(unit2.getType());
		long percentIncrement = condition.getConditionAmount2();
		long percentAmount = getStorage().getAmount(list2, unit2.getId());
		if (percentAmount == 0 || percentAmount / percentIncrement == 0) {
			return 0;
		}
		percentAmount = (percentAmount / percentIncrement) * percentIncrement;

		// Fraction (optional)
		long fractionDivisor = 1;
		long fractionAmount = 1;
		if (condition.getConditionAmount3() > 0) {
			IUnit unit3 = getUnit(condition.getConditionId3());
			IUnitList list3 = listSet.getUnitList(unit3.getType());
			fractionDivisor = condition.getConditionAmount3();
			fractionAmount = getStorage().getAmount(list3, unit3.getId());
			if (fractionAmount == 0) {
				return 0;
			}
		}

		// Multiply out the fraction
		long amountToAdd = ((amount1 * fractionAmount) / fractionDivisor);
		if (amountToAdd == 0) {
			return 0;
		}

		// Apply the percentage
		amountToAdd = (amountToAdd * percentAmount) / 100;
		if (amountToAdd == 0) {
			return 0;
		}

		return amountCanAdd / amountToAdd;
	}

	@Override
	public void getOutput(ICreationCondition condition, ICreationData data, long amountToApply, IUnitCountList output) {
		IUnitListSet listSet = data.getUnitListSet().getListSet();

		IUnit unit1 = getUnit(condition.getConditionId1());
		// IUnitList list1 = listSet.getUnitList(unit1.getType());
		long amount1 = condition.getConditionAmount1();

		// Percent
		IUnit unit2 = getUnit(condition.getConditionId2());
		IUnitList list2 = listSet.getUnitList(unit2.getType());
		long percentIncrement = condition.getConditionAmount2();
		long percentAmount = getStorage().getAmount(list2, unit2.getId());
		if (percentAmount == 0 || percentAmount / percentIncrement == 0) {
			return;
		}
		percentAmount = (percentAmount / percentIncrement) * percentIncrement;

		// Fraction (optional)
		long fractionDivisor = 1;
		long fractionAmount = 1;
		if (condition.getConditionAmount3() > 0) {
			IUnit unit3 = getUnit(condition.getConditionId3());
			IUnitList list3 = listSet.getUnitList(unit3.getType());
			fractionDivisor = condition.getConditionAmount3();
			fractionAmount = getStorage().getAmount(list3, unit3.getId());
			if (fractionAmount == 0) {
				return;
			}
		}

		// Multiply out the fraction
		long amountToAdd = ((amount1 * fractionAmount) / fractionDivisor) * amountToApply;
		if (amountToAdd == 0) {
			return;
		}

		// Apply the percentage
		amountToAdd = (amountToAdd * percentAmount) / 100;
		if (amountToAdd == 0) {
			return;
		}

		// Output
		output.add(unit1, amountToAdd);
	}

	@Override
	public long undo(ICreationCondition condition, ICreationData action, boolean optional, long amountToUndo) {
		throw new UnsupportedOperationException();
	}

}
