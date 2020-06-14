package com.turnengine.client.api.local.game;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import java.io.IOException;

public class StartupGameReturnTypeDataSerializer extends ObjectSerializer<IStartupGame> {

	public StartupGameReturnTypeDataSerializer() {
		super(false);
	}

	public StartupGameReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IStartupGame readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		return new StartupGame(param1, param2);
	}

	@Override
	public void writeValue(IDataWriter writer, IStartupGame object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
	}
}
