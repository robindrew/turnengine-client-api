package com.turnengine.client.api.local.unit.list.count;

import java.util.List;

import com.turnengine.client.api.local.unit.IUnit;
import com.turnengine.client.api.local.unit.IUnitCount;

public interface IUnitCountList extends Iterable<IUnitCount> {

	long getAmount(int unitId);

	long getAmount(IUnit unit);

	boolean contains(IUnit unit);

	boolean contains(int unitId);

	void add(int unitId, long amount);

	void add(IUnit unit, long amount);

	void add(IUnitCount count);

	long remove(int unitId, long amount);

	long remove(IUnit unit, long amount);

	long remove(IUnitCount count);

	void merge(boolean sort);

	void addAll(List<IUnitCount> list);

	boolean removeAll(List<IUnitCount> list);

	List<IUnitCount> toList();

	boolean isEmpty();

}
