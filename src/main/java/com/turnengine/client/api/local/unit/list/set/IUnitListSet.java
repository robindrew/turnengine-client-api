package com.turnengine.client.api.local.unit.list.set;

import com.turnengine.client.api.local.unit.UnitType;
import com.turnengine.client.api.local.unit.list.IUnitList;

public interface IUnitListSet {

	UnitType getUnitType();

	IUnitList getGameUnitList();

	IUnitList getPlayerUnitList();

	IUnitList getLocationUnitList();

	IUnitList getMobileUnitList();

	IUnitList getUnitList(UnitType type);

}
