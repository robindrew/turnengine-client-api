package com.turnengine.client.api.local.location;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import java.io.IOException;

public class GetLocationGenerationPluginReturnTypeDataSerializer extends ObjectSerializer<IGetLocationGenerationPlugin> {

	public GetLocationGenerationPluginReturnTypeDataSerializer() {
		super(false);
	}

	public GetLocationGenerationPluginReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetLocationGenerationPlugin readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		return new GetLocationGenerationPlugin(param1, param2);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetLocationGenerationPlugin object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
	}
}
