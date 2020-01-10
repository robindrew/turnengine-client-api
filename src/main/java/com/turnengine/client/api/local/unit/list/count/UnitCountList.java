package com.turnengine.client.api.local.unit.list.count;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.turnengine.client.api.local.unit.IUnit;
import com.turnengine.client.api.local.unit.IUnitCount;
import com.turnengine.client.api.local.unit.UnitCount;

public class UnitCountList implements IUnitCountList {

	private List<IUnitCount> list;

	public UnitCountList() {
		this.list = new ArrayList<IUnitCount>();
	}

	public UnitCountList(List<IUnitCount> list) {
		this.list = new ArrayList<IUnitCount>(list);
	}

	@Override
	public long getAmount(int unitId) {
		long amount = 0;
		for (IUnitCount count : list) {
			if (count.getId() == unitId) {
				amount += count.getAmount();
			}
		}
		return amount;
	}

	@Override
	public long getAmount(IUnit unit) {
		return getAmount(unit.getId());
	}

	@Override
	public boolean contains(IUnit unit) {
		return contains(unit.getId());
	}

	@Override
	public boolean contains(int unitId) {
		for (IUnitCount count : list) {
			if (count.getId() == unitId) {
				return true;
			}
		}
		return false;
	}

	@Override
	public void add(IUnitCount count) {
		add(count.getId(), count.getAmount());
	}

	@Override
	public void add(IUnit unit, long amount) {
		add(unit.getId(), amount);
	}

	@Override
	public void merge(boolean sort) {
		IUnitCountListMerger merger = new UnitCountListMerger();
		list = merger.merge(list, sort);
	}

	@Override
	public long remove(IUnit unit, long amount) {
		return remove(unit.getId(), amount);
	}

	@Override
	public long remove(IUnitCount count) {
		return remove(count.getId(), count.getAmount());
	}

	@Override
	public void add(int unitId, long amount) {
		if (amount == 0) {
			return;
		}
		for (IUnitCount count : list) {
			if (count.getId() == unitId) {
				count.setAmount(count.getAmount() + amount);
				return;
			}
		}
		list.add(new UnitCount(unitId, amount));
	}

	@Override
	public long remove(int unitId, long amount) {
		if (amount < 0) {
			throw new IllegalArgumentException("amount=" + amount);
		}
		if (amount == 0) {
			return 0;
		}
		Iterator<IUnitCount> iterator = list.iterator();
		while (iterator.hasNext() && amount > 0) {
			IUnitCount count = iterator.next();
			if (count.getId() == unitId) {
				if (count.getAmount() > amount) {
					count.setAmount(count.getAmount() - amount);
					return 0;
				} else {
					amount -= count.getAmount();
					iterator.remove();
				}
			}
		}
		return amount;
	}

	@Override
	public void addAll(List<IUnitCount> list) {
		for (IUnitCount count : list) {
			add(count);
		}
	}

	@Override
	public boolean removeAll(List<IUnitCount> list) {
		boolean success = true;
		for (IUnitCount count : list) {
			if (remove(count) != 0) {
				success = false;
			}
		}
		return success;
	}

	@Override
	public List<IUnitCount> toList() {
		return new ArrayList<IUnitCount>(list);
	}

	@Override
	public Iterator<IUnitCount> iterator() {
		return toList().iterator();
	}

	@Override
	public boolean isEmpty() {
		return list.isEmpty();
	}

	@Override
	public String toString() {
		return list.toString();
	}

}
