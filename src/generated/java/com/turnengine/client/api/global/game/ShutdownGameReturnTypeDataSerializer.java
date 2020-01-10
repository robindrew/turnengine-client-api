package com.turnengine.client.api.global.game;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import java.io.IOException;

public class ShutdownGameReturnTypeDataSerializer extends ObjectSerializer<IShutdownGame> {

	public ShutdownGameReturnTypeDataSerializer() {
		super(false);
	}

	public ShutdownGameReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IShutdownGame readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		return new ShutdownGame(param1, param2);
	}

	@Override
	public void writeValue(IDataWriter writer, IShutdownGame object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
	}
}
