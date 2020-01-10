package com.turnengine.client.api.local.upkeep;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import java.io.IOException;

public class UpkeepDataSerializer extends ObjectSerializer<IUpkeep> {

	public UpkeepDataSerializer() {
		super(false);
	}

	public UpkeepDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IUpkeep readValue(IDataReader reader) throws IOException {
		int param1 = reader.readInt();
		long param2 = reader.readLong();
		return new Upkeep(param1, param2);
	}

	@Override
	public void writeValue(IDataWriter writer, IUpkeep object) throws IOException {
		writer.writeInt(object.getId());
		writer.writeLong(object.getLimit());
	}
}
