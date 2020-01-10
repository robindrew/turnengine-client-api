package com.turnengine.client.api.local.unit.list.count;

import static com.robindrew.common.dependency.DependencyFactory.getDependency;

import java.util.ArrayList;
import java.util.List;

import com.turnengine.client.api.local.unit.IUnit;
import com.turnengine.client.api.local.unit.IUnitCache;
import com.turnengine.client.api.local.unit.IUnitCount;
import com.turnengine.client.api.local.unit.UnitType;

public class UnitCountListSplitter implements IUnitCountListSplitter {

	private final IUnitCache cache;

	public UnitCountListSplitter(IUnitCache cache) {
		if (cache == null) {
			throw new NullPointerException("cache");
		}
		this.cache = cache;
	}

	public UnitCountListSplitter() {
		this(getDependency(IUnitCache.class));
	}

	@Override
	public List<IUnitCount> splitList(List<IUnitCount> list, UnitType type) {
		List<IUnitCount> typeList = new ArrayList<IUnitCount>();
		for (IUnitCount count : list) {
			IUnit unit = cache.getById(count.getId());
			if (unit.getType().equals(type)) {
				typeList.add(count);
			}
		}
		return typeList;
	}

}
