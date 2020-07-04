package com.turnengine.client.api.local.unit.list.count;

import java.io.IOException;
import java.util.List;

import com.robindrew.common.io.data.ByteArrayDataWriter;
import com.robindrew.common.util.Java;
import com.turnengine.client.api.local.unit.IUnitCount;
import com.turnengine.client.api.local.unit.UnitCountDataSerializer;

public class UnitCountListSerializer implements IUnitCountListSerializer {

	@Override
	public byte[] serialize(List<IUnitCount> list) {
		try {
			try (ByteArrayDataWriter writer = new ByteArrayDataWriter()) {
				writer.writeObjectCollection(list, false, false, new UnitCountDataSerializer());
				return writer.toByteArray();
			}
		} catch (IOException e) {
			throw Java.propagate(e);
		}
	}

	@Override
	public List<IUnitCount> deserialize(byte[] data) {
		throw new UnsupportedOperationException();
	}

}
