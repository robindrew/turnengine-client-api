package com.turnengine.client.api.local.unit.list.count;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.robindrew.common.io.data.ByteArrayDataReader;
import com.robindrew.common.io.data.ByteArrayDataWriter;
import com.robindrew.common.util.Java;
import com.turnengine.client.api.local.unit.IUnitCount;
import com.turnengine.client.api.local.unit.UnitCountDataSerializer;

public class UnitCountListSerializer implements IUnitCountListSerializer {

	@Override
	public byte[] serialize(List<IUnitCount> list) {
		try (ByteArrayDataWriter writer = new ByteArrayDataWriter()) {
			writer.writeObjectCollection(list, false, false, new UnitCountDataSerializer());
			return writer.toByteArray();
		} catch (IOException e) {
			throw Java.propagate(e);
		}
	}

	@Override
	public List<IUnitCount> deserialize(byte[] data) {
		try (ByteArrayDataReader reader = new ByteArrayDataReader(data)) {
			List<IUnitCount> list = new ArrayList<>();
			return reader.readObjectCollection(list, false, false, new UnitCountDataSerializer());
		} catch (IOException e) {
			throw Java.propagate(e);
		}
	}

}
