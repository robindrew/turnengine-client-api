package com.turnengine.client.api.local.location;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import java.io.IOException;

public class GetLocationCoordinatePluginReturnTypeDataSerializer extends ObjectSerializer<IGetLocationCoordinatePlugin> {

	public GetLocationCoordinatePluginReturnTypeDataSerializer() {
		super(false);
	}

	public GetLocationCoordinatePluginReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetLocationCoordinatePlugin readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		return new GetLocationCoordinatePlugin(param1, param2);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetLocationCoordinatePlugin object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
	}
}
