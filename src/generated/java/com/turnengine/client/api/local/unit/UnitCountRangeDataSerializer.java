package com.turnengine.client.api.local.unit;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import java.io.IOException;

public class UnitCountRangeDataSerializer extends ObjectSerializer<IUnitCountRange> {

	public UnitCountRangeDataSerializer() {
		super(false);
	}

	public UnitCountRangeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IUnitCountRange readValue(IDataReader reader) throws IOException {
		int param1 = reader.readInt();
		long param2 = reader.readLong();
		long param3 = reader.readLong();
		return new UnitCountRange(param1, param2, param3);
	}

	@Override
	public void writeValue(IDataWriter writer, IUnitCountRange object) throws IOException {
		writer.writeInt(object.getId());
		writer.writeLong(object.getMinAmount());
		writer.writeLong(object.getMaxAmount());
	}
}
