package com.turnengine.client.api.local.action;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import java.io.IOException;

public class StartActionAtPlayerReturnTypeDataSerializer extends ObjectSerializer<IStartActionAtPlayer> {

	public StartActionAtPlayerReturnTypeDataSerializer() {
		super(false);
	}

	public StartActionAtPlayerReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IStartActionAtPlayer readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		int param3 = reader.readInt();
		long param4 = reader.readLong();
		boolean param5 = reader.readBoolean();
		return new StartActionAtPlayer(param1, param2, param3, param4, param5);
	}

	@Override
	public void writeValue(IDataWriter writer, IStartActionAtPlayer object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeInt(object.getActionId());
		writer.writeLong(object.getAmount());
		writer.writeBoolean(object.getAddToQueue());
	}
}
