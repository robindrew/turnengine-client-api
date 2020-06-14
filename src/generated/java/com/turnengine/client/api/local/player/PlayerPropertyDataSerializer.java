package com.turnengine.client.api.local.player;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import com.robindrew.common.io.data.serializer.lang.StringSerializer;
import java.io.IOException;

public class PlayerPropertyDataSerializer extends ObjectSerializer<IPlayerProperty> {

	public PlayerPropertyDataSerializer() {
		super(false);
	}

	public PlayerPropertyDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IPlayerProperty readValue(IDataReader reader) throws IOException {
		int param1 = reader.readInt();
		String param2 = reader.readObject(new StringSerializer(false));
		String param3 = reader.readObject(new StringSerializer(false));
		return new PlayerProperty(param1, param2, param3);
	}

	@Override
	public void writeValue(IDataWriter writer, IPlayerProperty object) throws IOException {
		writer.writeInt(object.getPlayerId());
		writer.writeObject(object.getKey(), new StringSerializer(false));
		writer.writeObject(object.getValue(), new StringSerializer(false));
	}
}
