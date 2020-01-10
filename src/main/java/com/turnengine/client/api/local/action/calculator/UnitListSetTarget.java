package com.turnengine.client.api.local.action.calculator;

import com.turnengine.client.api.local.unit.UnitType;
import com.turnengine.client.api.local.unit.list.set.IUnitListSet;

public class UnitListSetTarget implements IUnitListSetTarget {

	private final int id;
	private final IUnitListSet listSet;

	public UnitListSetTarget(int id, IUnitListSet listSet) {
		if (id < -1) {
			throw new IllegalArgumentException("id=" + id);
		}
		if (listSet == null) {
			throw new IllegalArgumentException("listSet");
		}
		this.id = id;
		this.listSet = listSet;
	}

	@Override
	public int getId() {
		return id;
	}

	@Override
	public IUnitListSet getListSet() {
		return listSet;
	}

	@Override
	public UnitType getType() {
		return listSet.getUnitType();
	}

}
