package com.turnengine.client.api.local.unit.list.count;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.turnengine.client.api.local.unit.IUnitCount;
import com.turnengine.client.api.local.unit.UnitCount;

public class UnitCountListMerger implements IUnitCountListMerger {

	/**
	 * Merge the given count list such that only one entry exists per unit.
	 * @param list the list to merge.
	 * @param sort true to sort the merged list.
	 * @return the merged list.
	 */
	@Override
	public List<IUnitCount> merge(List<IUnitCount> list, boolean sort) {
		List<IUnitCount> mergedList = new ArrayList<IUnitCount>();
		Map<Integer, IUnitCount> idToCountMap = new HashMap<Integer, IUnitCount>();

		// Merge
		for (IUnitCount count : list) {
			IUnitCount value = idToCountMap.get(count.getId());
			if (value == null) {
				count = new UnitCount(count);
				idToCountMap.put(count.getId(), count);
				mergedList.add(count);
			} else {
				value.setAmount(value.getAmount() + count.getAmount());
			}
		}

		// Sort
		if (sort) {
			Collections.sort(mergedList);
		}

		return mergedList;
	}

}
