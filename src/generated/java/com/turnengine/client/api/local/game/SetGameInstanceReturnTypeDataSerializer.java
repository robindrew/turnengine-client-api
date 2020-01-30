package com.turnengine.client.api.local.game;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import java.io.IOException;

public class SetGameInstanceReturnTypeDataSerializer extends ObjectSerializer<ISetGameInstance> {

	public SetGameInstanceReturnTypeDataSerializer() {
		super(false);
	}

	public SetGameInstanceReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public ISetGameInstance readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		return new SetGameInstance(param1, param2);
	}

	@Override
	public void writeValue(IDataWriter writer, ISetGameInstance object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
	}
}
