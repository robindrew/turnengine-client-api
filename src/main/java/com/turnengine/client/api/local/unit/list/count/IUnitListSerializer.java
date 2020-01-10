package com.turnengine.client.api.local.unit.list.count;

import com.turnengine.client.api.local.unit.UnitType;
import com.turnengine.client.api.local.unit.list.IUnitList;

public interface IUnitListSerializer {

	/**
	 * Adapts binary data to a unit list.
	 */
	IUnitList deserialize(byte[] data, UnitType type);

	/**
	 * Adapts a unit list to binary data.
	 */
	byte[] serialize(IUnitList list);

}
