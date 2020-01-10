package com.turnengine.client.api.local.location;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import java.io.IOException;

public class SetLocationsEnabledReturnTypeDataSerializer extends ObjectSerializer<ISetLocationsEnabled> {

	public SetLocationsEnabledReturnTypeDataSerializer() {
		super(false);
	}

	public SetLocationsEnabledReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public ISetLocationsEnabled readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		boolean param3 = reader.readBoolean();
		return new SetLocationsEnabled(param1, param2, param3);
	}

	@Override
	public void writeValue(IDataWriter writer, ISetLocationsEnabled object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeBoolean(object.getEnabled());
	}
}
