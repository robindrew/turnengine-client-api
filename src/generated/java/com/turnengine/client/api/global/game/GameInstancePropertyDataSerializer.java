package com.turnengine.client.api.global.game;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import com.robindrew.codegenerator.api.serializer.data.serializer.lang.StringSerializer;
import java.io.IOException;

public class GameInstancePropertyDataSerializer extends ObjectSerializer<IGameInstanceProperty> {

	public GameInstancePropertyDataSerializer() {
		super(false);
	}

	public GameInstancePropertyDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGameInstanceProperty readValue(IDataReader reader) throws IOException {
		int param1 = reader.readInt();
		String param2 = reader.readObject(new StringSerializer(false));
		String param3 = reader.readObject(new StringSerializer(false));
		return new GameInstanceProperty(param1, param2, param3);
	}

	@Override
	public void writeValue(IDataWriter writer, IGameInstanceProperty object) throws IOException {
		writer.writeInt(object.getInstanceId());
		writer.writeObject(object.getKey(), new StringSerializer(false));
		writer.writeObject(object.getValue(), new StringSerializer(false));
	}
}
