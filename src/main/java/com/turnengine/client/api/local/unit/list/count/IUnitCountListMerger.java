package com.turnengine.client.api.local.unit.list.count;

import java.util.List;

import com.turnengine.client.api.local.unit.IUnitCount;

public interface IUnitCountListMerger {

	/**
	 * Returns a count list with all counts of each unit merged into a single entry.
	 */
	List<IUnitCount> merge(List<IUnitCount> list, boolean sort);

}
