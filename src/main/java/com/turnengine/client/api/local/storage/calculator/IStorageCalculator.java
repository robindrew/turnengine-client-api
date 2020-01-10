package com.turnengine.client.api.local.storage.calculator;

import java.util.List;

import com.turnengine.client.api.local.calculator.ICalculator;
import com.turnengine.client.api.local.storage.IStorageDefinition;
import com.turnengine.client.api.local.storage.StorageType;
import com.turnengine.client.api.local.unit.IUnit;
import com.turnengine.client.api.local.unit.IUnitCount;
import com.turnengine.client.api.local.unit.list.IParentUnit;
import com.turnengine.client.api.local.unit.list.IUnitList;

/**
 * Calculates the amount of any unit that can be added/removed from a unit list.
 * <ul>
 * <li>Takes into account storage, and parent/child relationships.
 * </ul>
 */
public interface IStorageCalculator extends ICalculator {

	boolean isValid(IUnitList list);

	long getCapacityUsed(IParentUnit parent, IStorageDefinition storage);

	long getCapacityFree(IParentUnit parent, IStorageDefinition storage);

	long getAmountCanAdd(IUnitList list, int unitId, StorageType type);

	long getAmountCanAdd(IUnitList list, IUnit unit, StorageType type);

	void addAmount(IUnitList list, int unitId, long amount, StorageType type);

	void addAmount(IUnitList list, IUnit unit, long amount, StorageType type);

	long getAmountCanRemove(IUnitList list, int unitId);

	long getAmountCanRemove(IUnitList list, IUnit unit);

	void removeAmount(IUnitList list, int unitId, long amount);

	void removeAmount(IUnitList list, IUnit unit, long amount);

	void removeAll(IUnitList list, int unitId);

	void removeAll(IUnitList list, IUnit unit);

	long getAmount(IUnitList list, int unitId);

	long getAmount(IUnitList list, IUnit unit);

	boolean contains(IUnitList list, int unitId);

	boolean contains(IUnitList list, IUnit unit);

	boolean contains(IUnitList list, IUnit unit, long amount);

	boolean contains(IUnitList list, int unitId, long amount);

	boolean contains(IUnitList list, IUnitCount count);

	boolean contains(IUnitList list, List<IUnitCount> countList);

}
