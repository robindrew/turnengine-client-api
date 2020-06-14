package com.turnengine.client.api.global.game;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import com.robindrew.common.io.data.serializer.lang.StringSerializer;
import java.io.IOException;

public class NewGameHostReturnTypeDataSerializer extends ObjectSerializer<INewGameHost> {

	public NewGameHostReturnTypeDataSerializer() {
		super(false);
	}

	public NewGameHostReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public INewGameHost readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		String param2 = reader.readObject(new StringSerializer(false));
		int param3 = reader.readInt();
		return new NewGameHost(param1, param2, param3);
	}

	@Override
	public void writeValue(IDataWriter writer, INewGameHost object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeObject(object.getName(), new StringSerializer(false));
		writer.writeInt(object.getPort());
	}
}
