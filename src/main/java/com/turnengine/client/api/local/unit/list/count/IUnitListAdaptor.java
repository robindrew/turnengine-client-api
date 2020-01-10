package com.turnengine.client.api.local.unit.list.count;

import java.util.List;

import com.turnengine.client.api.local.unit.IUnitCount;
import com.turnengine.client.api.local.unit.UnitType;
import com.turnengine.client.api.local.unit.list.IUnitList;

public interface IUnitListAdaptor {

	/**
	 * Adapts units of a given type from the count list to a unit list.
	 */
	IUnitList adapt(List<IUnitCount> countList, UnitType type);

	/**
	 * Adapts units from the unit list to a count list.
	 */
	List<IUnitCount> adapt(IUnitList list);

}
