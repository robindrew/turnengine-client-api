package com.turnengine.client.api.global.game;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import com.robindrew.common.io.data.serializer.lang.StringSerializer;
import java.io.IOException;

public class NewGameReturnTypeDataSerializer extends ObjectSerializer<INewGame> {

	public NewGameReturnTypeDataSerializer() {
		super(false);
	}

	public NewGameReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public INewGame readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		String param2 = reader.readObject(new StringSerializer(false));
		return new NewGame(param1, param2);
	}

	@Override
	public void writeValue(IDataWriter writer, INewGame object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeObject(object.getName(), new StringSerializer(false));
	}
}
