package com.turnengine.client.api.global.game;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import com.robindrew.codegenerator.api.serializer.data.serializer.lang.StringSerializer;
import java.io.IOException;

public class GameInstanceDataSerializer extends ObjectSerializer<IGameInstance> {

	public GameInstanceDataSerializer() {
		super(false);
	}

	public GameInstanceDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGameInstance readValue(IDataReader reader) throws IOException {
		int param1 = reader.readInt();
		String param2 = reader.readObject(new StringSerializer(false));
		int param3 = reader.readInt();
		int param4 = reader.readInt();
		int param5 = reader.readInt();
		return new GameInstance(param1, param2, param3, param4, param5);
	}

	@Override
	public void writeValue(IDataWriter writer, IGameInstance object) throws IOException {
		writer.writeInt(object.getId());
		writer.writeObject(object.getName(), new StringSerializer(false));
		writer.writeInt(object.getGameId());
		writer.writeInt(object.getVersionId());
		writer.writeInt(object.getHostId());
	}
}
