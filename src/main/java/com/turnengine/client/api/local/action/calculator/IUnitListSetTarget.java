package com.turnengine.client.api.local.action.calculator;

import com.turnengine.client.api.local.unit.UnitType;
import com.turnengine.client.api.local.unit.list.set.IUnitListSet;

public interface IUnitListSetTarget {

	int getId();

	UnitType getType();

	IUnitListSet getListSet();

}
