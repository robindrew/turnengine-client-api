package com.turnengine.client.api.local.turn;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import java.io.IOException;

public class ExecuteTurnsReturnTypeDataSerializer extends ObjectSerializer<IExecuteTurns> {

	public ExecuteTurnsReturnTypeDataSerializer() {
		super(false);
	}

	public ExecuteTurnsReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IExecuteTurns readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		int param3 = reader.readInt();
		return new ExecuteTurns(param1, param2, param3);
	}

	@Override
	public void writeValue(IDataWriter writer, IExecuteTurns object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeInt(object.getTurns());
	}
}
