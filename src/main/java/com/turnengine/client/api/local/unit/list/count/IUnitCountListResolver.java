package com.turnengine.client.api.local.unit.list.count;

import java.util.List;

import com.turnengine.client.api.local.unit.IUnitCount;
import com.turnengine.client.api.local.unit.IUnitNameCount;

public interface IUnitCountListResolver {

	/**
	 * Returns a count list from a list of unit names.
	 */
	List<IUnitCount> resolve(List<IUnitNameCount> list);

}
