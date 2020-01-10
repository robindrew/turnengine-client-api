package com.turnengine.client.api.local.location;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import java.io.IOException;

public class GetLocationsEnabledReturnTypeDataSerializer extends ObjectSerializer<IGetLocationsEnabled> {

	public GetLocationsEnabledReturnTypeDataSerializer() {
		super(false);
	}

	public GetLocationsEnabledReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetLocationsEnabled readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		return new GetLocationsEnabled(param1, param2);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetLocationsEnabled object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
	}
}
