package com.turnengine.client.api.local.location;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import java.io.IOException;

public class GetLocationSetupInfoReturnTypeDataSerializer extends ObjectSerializer<IGetLocationSetupInfo> {

	public GetLocationSetupInfoReturnTypeDataSerializer() {
		super(false);
	}

	public GetLocationSetupInfoReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetLocationSetupInfo readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		return new GetLocationSetupInfo(param1, param2);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetLocationSetupInfo object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
	}
}
