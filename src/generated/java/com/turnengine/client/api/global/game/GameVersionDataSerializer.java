package com.turnengine.client.api.global.game;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import com.robindrew.codegenerator.api.serializer.data.serializer.lang.StringSerializer;
import java.io.IOException;

public class GameVersionDataSerializer extends ObjectSerializer<IGameVersion> {

	public GameVersionDataSerializer() {
		super(false);
	}

	public GameVersionDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGameVersion readValue(IDataReader reader) throws IOException {
		int param1 = reader.readInt();
		String param2 = reader.readObject(new StringSerializer(false));
		int param3 = reader.readInt();
		return new GameVersion(param1, param2, param3);
	}

	@Override
	public void writeValue(IDataWriter writer, IGameVersion object) throws IOException {
		writer.writeInt(object.getId());
		writer.writeObject(object.getName(), new StringSerializer(false));
		writer.writeInt(object.getGameId());
	}
}
