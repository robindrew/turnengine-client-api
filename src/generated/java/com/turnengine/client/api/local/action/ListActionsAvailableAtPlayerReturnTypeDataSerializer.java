package com.turnengine.client.api.local.action;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import java.io.IOException;

public class ListActionsAvailableAtPlayerReturnTypeDataSerializer extends ObjectSerializer<IListActionsAvailableAtPlayer> {

	public ListActionsAvailableAtPlayerReturnTypeDataSerializer() {
		super(false);
	}

	public ListActionsAvailableAtPlayerReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IListActionsAvailableAtPlayer readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		return new ListActionsAvailableAtPlayer(param1, param2);
	}

	@Override
	public void writeValue(IDataWriter writer, IListActionsAvailableAtPlayer object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
	}
}
