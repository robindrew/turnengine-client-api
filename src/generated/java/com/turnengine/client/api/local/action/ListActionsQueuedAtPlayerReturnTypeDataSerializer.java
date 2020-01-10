package com.turnengine.client.api.local.action;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import java.io.IOException;

public class ListActionsQueuedAtPlayerReturnTypeDataSerializer extends ObjectSerializer<IListActionsQueuedAtPlayer> {

	public ListActionsQueuedAtPlayerReturnTypeDataSerializer() {
		super(false);
	}

	public ListActionsQueuedAtPlayerReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IListActionsQueuedAtPlayer readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		return new ListActionsQueuedAtPlayer(param1, param2);
	}

	@Override
	public void writeValue(IDataWriter writer, IListActionsQueuedAtPlayer object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
	}
}
