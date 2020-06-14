package com.turnengine.client.api.local.action;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import java.io.IOException;

public class ListActionsExecutingAtPlayerReturnTypeDataSerializer extends ObjectSerializer<IListActionsExecutingAtPlayer> {

	public ListActionsExecutingAtPlayerReturnTypeDataSerializer() {
		super(false);
	}

	public ListActionsExecutingAtPlayerReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IListActionsExecutingAtPlayer readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		return new ListActionsExecutingAtPlayer(param1, param2);
	}

	@Override
	public void writeValue(IDataWriter writer, IListActionsExecutingAtPlayer object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
	}
}
