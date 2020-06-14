package com.turnengine.client.api.local.action;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import java.io.IOException;

public class ClearActionsQueuedAtLocationReturnTypeDataSerializer extends ObjectSerializer<IClearActionsQueuedAtLocation> {

	public ClearActionsQueuedAtLocationReturnTypeDataSerializer() {
		super(false);
	}

	public ClearActionsQueuedAtLocationReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IClearActionsQueuedAtLocation readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		int param3 = reader.readInt();
		int param4 = reader.readInt();
		return new ClearActionsQueuedAtLocation(param1, param2, param3, param4);
	}

	@Override
	public void writeValue(IDataWriter writer, IClearActionsQueuedAtLocation object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeInt(object.getLocationId());
		writer.writeInt(object.getGroupId());
	}
}
