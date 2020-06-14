package com.turnengine.client.api.local.action;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import java.io.IOException;

public class CancelActionAtPlayerReturnTypeDataSerializer extends ObjectSerializer<ICancelActionAtPlayer> {

	public CancelActionAtPlayerReturnTypeDataSerializer() {
		super(false);
	}

	public CancelActionAtPlayerReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public ICancelActionAtPlayer readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		int param3 = reader.readInt();
		long param4 = reader.readLong();
		return new CancelActionAtPlayer(param1, param2, param3, param4);
	}

	@Override
	public void writeValue(IDataWriter writer, ICancelActionAtPlayer object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeInt(object.getActionId());
		writer.writeLong(object.getAmount());
	}
}
