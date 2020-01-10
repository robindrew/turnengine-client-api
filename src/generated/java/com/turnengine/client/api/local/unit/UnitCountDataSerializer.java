package com.turnengine.client.api.local.unit;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import java.io.IOException;

public class UnitCountDataSerializer extends ObjectSerializer<IUnitCount> {

	public UnitCountDataSerializer() {
		super(false);
	}

	public UnitCountDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IUnitCount readValue(IDataReader reader) throws IOException {
		int param1 = reader.readInt();
		long param2 = reader.readLong();
		return new UnitCount(param1, param2);
	}

	@Override
	public void writeValue(IDataWriter writer, IUnitCount object) throws IOException {
		writer.writeInt(object.getId());
		writer.writeLong(object.getAmount());
	}
}
