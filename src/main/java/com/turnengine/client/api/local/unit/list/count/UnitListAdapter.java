package com.turnengine.client.api.local.unit.list.count;

import java.util.ArrayList;
import java.util.List;

import com.turnengine.client.api.local.unit.IUnit;
import com.turnengine.client.api.local.unit.IUnitCache;
import com.turnengine.client.api.local.unit.IUnitCount;
import com.turnengine.client.api.local.unit.IUnitIdContainer;
import com.turnengine.client.api.local.unit.UnitCount;
import com.turnengine.client.api.local.unit.UnitNode;
import com.turnengine.client.api.local.unit.UnitType;
import com.turnengine.client.api.local.unit.list.ChildUnit;
import com.turnengine.client.api.local.unit.list.ChildlessParentUnit;
import com.turnengine.client.api.local.unit.list.IChildUnit;
import com.turnengine.client.api.local.unit.list.IParentUnit;
import com.turnengine.client.api.local.unit.list.IUnitList;
import com.turnengine.client.api.local.unit.list.SingleParentUnit;
import com.turnengine.client.api.local.unit.list.UnitList;

public class UnitListAdapter implements IUnitListAdaptor {

	private final IUnitCache unitCache;

	public UnitListAdapter(IUnitCache unitCache) {
		if (unitCache == null) {
			throw new NullPointerException("unitCache");
		}
		this.unitCache = unitCache;
	}

	@Override
	public IUnitList adapt(List<IUnitCount> countList, UnitType type) {
		IUnitList list = new UnitList(type);
		IParentUnit parent = null;
		for (IUnitCount count : countList) {
			int unitId = count.getId();
			long amount = count.getAmount();
			IUnit unit = unitCache.getById(unitId);

			// Parent Unit
			if (unit.getNode().equals(UnitNode.PARENT)) {
				if (amount <= 0) {
					throw new IllegalStateException("parent: " + unit + ", amount=" + count.getAmount() + " in " + countList);
				}

				// Single Parent
				if (amount == 1) {
					parent = new SingleParentUnit(unit);
					list.addParent(parent);
				}

				// Childless Parent
				else {
					parent = new ChildlessParentUnit(unit, amount);
					list.addParent(parent);
					parent = null;
				}
			}

			// Child Unit
			else {
				if (parent == null) {
					throw new IllegalStateException("child unit without any parents in " + countList);
				}
				IChildUnit child = new ChildUnit(unitId, count.getAmount());
				parent.addChild(child);
			}
		}
		return list;
	}

	@Override
	public List<IUnitCount> adapt(IUnitList list) {
		return adapt(list, null);
	}

	@Override
	public List<IUnitCount> adapt(IUnitList list, UnitType type) {
		List<IUnitCount> countList = new ArrayList<IUnitCount>();
		for (IParentUnit parent : list.getParents()) {
			checkType(parent, type);
			if (parent.getAmount() == 0) {
				continue;
			}
			IUnitCount count = new UnitCount(parent.getUnitId(), parent.getAmount());
			countList.add(count);

			// Single parent
			if (parent.hasChildren()) {
				for (IChildUnit child : parent.getChildren()) {
					checkType(child, type);
					countList.add(new UnitCount(child.getUnitId(), child.getAmount()));
				}
			}
		}

		return countList;
	}

	private void checkType(IUnitIdContainer unitId, UnitType type) {
		if (type != null) {
			IUnit unit = unitCache.getById(unitId.getUnitId());
			if (!unit.getType().equals(type)) {
				throw new IllegalArgumentException("Expected: " + type + ", for unit " + unit);
			}
		}
	}
}
