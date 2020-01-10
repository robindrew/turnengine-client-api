package com.turnengine.client.api.local.unit.list.count;

import java.util.List;

import com.turnengine.client.api.local.unit.IUnitCount;

public interface IUnitCountListSerializer {

	/**
	 * Adapts a count list to binary data.
	 */
	byte[] serialize(List<IUnitCount> list);

	/**
	 * Adapts binary data to a count list.
	 */
	List<IUnitCount> deserialize(byte[] data);

}
