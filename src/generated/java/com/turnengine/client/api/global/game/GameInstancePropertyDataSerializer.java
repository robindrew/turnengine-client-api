package com.turnengine.client.api.global.game;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import com.robindrew.common.io.data.serializer.lang.StringSerializer;
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
