package com.turnengine.client.api.global.game;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import java.io.IOException;

public class GameDefinitionDataSerializer extends ObjectSerializer<IGameDefinition> {

	public GameDefinitionDataSerializer() {
		super(false);
	}

	public GameDefinitionDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGameDefinition readValue(IDataReader reader) throws IOException {
		IGame param1 = reader.readObject(new GameDataSerializer(false));
		IGameVersion param2 = reader.readObject(new GameVersionDataSerializer(false));
		IGameInstance param3 = reader.readObject(new GameInstanceDataSerializer(false));
		IGameHost param4 = reader.readObject(new GameHostDataSerializer(false));
		return new GameDefinition(param1, param2, param3, param4);
	}

	@Override
	public void writeValue(IDataWriter writer, IGameDefinition object) throws IOException {
		writer.writeObject(object.getGame(), new GameDataSerializer(false));
		writer.writeObject(object.getVersion(), new GameVersionDataSerializer(false));
		writer.writeObject(object.getInstance(), new GameInstanceDataSerializer(false));
		writer.writeObject(object.getHost(), new GameHostDataSerializer(false));
	}
}
