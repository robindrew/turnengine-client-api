package com.turnengine.client.api.local.action;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import java.io.IOException;

public class ClearActionQueuedAtPlayerReturnTypeDataSerializer extends ObjectSerializer<IClearActionQueuedAtPlayer> {

	public ClearActionQueuedAtPlayerReturnTypeDataSerializer() {
		super(false);
	}

	public ClearActionQueuedAtPlayerReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IClearActionQueuedAtPlayer readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		int param3 = reader.readInt();
		return new ClearActionQueuedAtPlayer(param1, param2, param3);
	}

	@Override
	public void writeValue(IDataWriter writer, IClearActionQueuedAtPlayer object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeInt(object.getIndex());
	}
}
