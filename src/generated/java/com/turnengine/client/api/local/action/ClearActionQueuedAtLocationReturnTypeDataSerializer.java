package com.turnengine.client.api.local.action;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import java.io.IOException;

public class ClearActionQueuedAtLocationReturnTypeDataSerializer extends ObjectSerializer<IClearActionQueuedAtLocation> {

	public ClearActionQueuedAtLocationReturnTypeDataSerializer() {
		super(false);
	}

	public ClearActionQueuedAtLocationReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IClearActionQueuedAtLocation readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		int param3 = reader.readInt();
		int param4 = reader.readInt();
		return new ClearActionQueuedAtLocation(param1, param2, param3, param4);
	}

	@Override
	public void writeValue(IDataWriter writer, IClearActionQueuedAtLocation object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeInt(object.getLocationId());
		writer.writeInt(object.getIndex());
	}
}
