package com.turnengine.client.api.global.game;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import com.robindrew.common.io.data.serializer.lang.StringSerializer;
import java.io.IOException;

public class GameDataSerializer extends ObjectSerializer<IGame> {

	public GameDataSerializer() {
		super(false);
	}

	public GameDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGame readValue(IDataReader reader) throws IOException {
		int param1 = reader.readInt();
		String param2 = reader.readObject(new StringSerializer(false));
		return new Game(param1, param2);
	}

	@Override
	public void writeValue(IDataWriter writer, IGame object) throws IOException {
		writer.writeInt(object.getId());
		writer.writeObject(object.getName(), new StringSerializer(false));
	}
}
