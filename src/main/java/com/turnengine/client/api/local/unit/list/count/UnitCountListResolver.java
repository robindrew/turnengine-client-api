package com.turnengine.client.api.local.unit.list.count;

import static com.robindrew.common.dependency.DependencyFactory.getDependency;

import java.util.ArrayList;
import java.util.List;

import com.turnengine.client.api.local.unit.IUnit;
import com.turnengine.client.api.local.unit.IUnitCache;
import com.turnengine.client.api.local.unit.IUnitCount;
import com.turnengine.client.api.local.unit.IUnitNameCount;
import com.turnengine.client.api.local.unit.UnitCount;

public class UnitCountListResolver implements IUnitCountListResolver {

	private final IUnitCache cache;

	public UnitCountListResolver(IUnitCache cache) {
		this.cache = cache;
	}

	public UnitCountListResolver() {
		this(getDependency(IUnitCache.class));
	}

	@Override
	public List<IUnitCount> resolve(List<IUnitNameCount> list) {
		List<IUnitCount> unitList = new ArrayList<IUnitCount>(list.size());
		for (IUnitNameCount count : list) {
			unitList.add(resolve(count));
		}
		return unitList;
	}

	private IUnitCount resolve(IUnitNameCount count) {
		IUnit unit = cache.getByName(count.getName());
		return new UnitCount(unit.getId(), count.getAmount());
	}

}
