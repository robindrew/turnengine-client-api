package com.turnengine.client.api.local.unit.list;

import java.util.List;

import com.turnengine.client.api.local.unit.IUnit;
import com.turnengine.client.api.local.unit.UnitType;

/**
 * The I Unit List.
 */
public interface IUnitList extends Iterable<IParentUnit> {

	UnitType getUnitType();

	boolean isEmpty();

	void clear();

	int parents();

	void addParent(IParentUnit parent);

	IParentUnit getParentAtIndex(int index);

	boolean containsParent(int unitId);

	boolean containsParent(IUnit unit);

	boolean containsChild(int unitId);

	boolean containsChild(IUnit unit);

	boolean contains(IUnit unit);

	void addParentAmount(int unitId, long amount);

	void addParentAmount(IUnit unit, long amount);

	void removeParentAtIndex(int index);

	long getParentAmount(int unitId);

	long getParentAmount(IUnit unit);

	long getChildAmount(int unitId);

	long getChildAmount(IUnit unit);

	long getAmount(IUnit unit);

	List<IParentUnit> getParents();

	void addAll(IUnitList list);

	void addAll(List<IParentUnit> list);

}
