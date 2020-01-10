package com.turnengine.client.api.local.unit;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import com.robindrew.codegenerator.api.serializer.data.serializer.lang.StringSerializer;
import java.io.IOException;

public class UnitNameCountDataSerializer extends ObjectSerializer<IUnitNameCount> {

	public UnitNameCountDataSerializer() {
		super(false);
	}

	public UnitNameCountDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IUnitNameCount readValue(IDataReader reader) throws IOException {
		String param1 = reader.readObject(new StringSerializer(false));
		long param2 = reader.readLong();
		return new UnitNameCount(param1, param2);
	}

	@Override
	public void writeValue(IDataWriter writer, IUnitNameCount object) throws IOException {
		writer.writeObject(object.getName(), new StringSerializer(false));
		writer.writeLong(object.getAmount());
	}
}
