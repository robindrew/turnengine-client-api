package com.turnengine.client.api.local.location;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import java.io.IOException;

public class GenerateLocationsReturnTypeDataSerializer extends ObjectSerializer<IGenerateLocations> {

	public GenerateLocationsReturnTypeDataSerializer() {
		super(false);
	}

	public GenerateLocationsReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGenerateLocations readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		return new GenerateLocations(param1, param2);
	}

	@Override
	public void writeValue(IDataWriter writer, IGenerateLocations object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
	}
}
