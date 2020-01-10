package com.turnengine.client.api.local.unit.list.count;

import java.util.List;

import com.turnengine.client.api.local.unit.IUnitCount;
import com.turnengine.client.api.local.unit.UnitType;

public interface IUnitCountListSplitter {

	/**
	 * Returns a list of all units of the same type from the given list.
	 */
	List<IUnitCount> splitList(List<IUnitCount> list, UnitType type);

}
