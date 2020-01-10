package com.turnengine.client.api.local.unit.list.count;

import java.util.List;

import com.turnengine.client.api.local.unit.IUnitCount;
import com.turnengine.client.api.local.unit.UnitType;

public interface IUnitCountListRepairer {

	List<IUnitCount> repair(List<IUnitCount> list, UnitType type);

	void verify(List<IUnitCount> list);

}
