package com.turnengine.client.api.local.unit.list.count;

import java.util.List;

import com.turnengine.client.api.local.unit.IUnitCount;
import com.turnengine.client.api.local.unit.UnitType;
import com.turnengine.client.api.local.unit.list.IUnitList;

public interface IUnitListRepairer {

	/**
	 * Returns a valid unit list from a possibly invalid list.
	 */
	IUnitList repairList(IUnitList list);

	/**
	 * Returns a valid unit list from an arbitrary count list.
	 */
	IUnitList repairList(IUnitCountList list, UnitType type);

	/**
	 * Returns a valid unit list from an arbitrary count list.
	 */
	IUnitList repairList(List<IUnitCount> list, UnitType type);

}
