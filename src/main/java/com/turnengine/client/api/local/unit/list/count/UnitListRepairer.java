package com.turnengine.client.api.local.unit.list.count;

import static com.turnengine.client.api.local.unit.UnitNode.CHILD;
import static com.turnengine.client.api.local.unit.UnitNode.PARENT;

import java.util.List;

import com.turnengine.client.api.local.storage.StorageType;
import com.turnengine.client.api.local.storage.calculator.IStorageCalculator;
import com.turnengine.client.api.local.unit.IUnit;
import com.turnengine.client.api.local.unit.IUnitCache;
import com.turnengine.client.api.local.unit.IUnitCount;
import com.turnengine.client.api.local.unit.UnitType;
import com.turnengine.client.api.local.unit.list.IUnitList;
import com.turnengine.client.api.local.unit.list.UnitList;

public class UnitListRepairer implements IUnitListRepairer {

	private final IUnitCache units;
	private final IStorageCalculator storage;

	public UnitListRepairer(IUnitCache units, IStorageCalculator calculator) {
		this.units = units;
		this.storage = calculator;
	}

	@Override
	public IUnitList repairList(List<IUnitCount> list, UnitType unitType) {
		return repairList(new UnitCountList(list), unitType);
	}

	@Override
	public IUnitList repairList(IUnitList list) {
		IUnitListAdaptor adaptor = new UnitListAdapter(units);
		List<IUnitCount> countList = adaptor.adapt(list);
		return repairList(countList, list.getUnitType());
	}

	@Override
	public IUnitList repairList(IUnitCountList list, UnitType unitType) {
		IUnitList newList = new UnitList(unitType);

		// Allocate parents
		for (IUnitCount count : list) {
			IUnit unit = units.getById(count.getId());
			if (unit.getNode().equals(PARENT)) {
				newList.addParentAmount(unit, (int) count.getAmount());
				continue;
			}
		}

		// Allocate children
		for (IUnitCount count : list) {
			IUnit unit = units.getById(count.getId());
			if (unit.getNode().equals(CHILD)) {
				storage.addAmount(newList, unit, count.getAmount(), StorageType.ANY);
				continue;
			}
		}

		return newList;
	}

}
