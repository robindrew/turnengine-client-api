package com.turnengine.client.api.local.player;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import com.robindrew.common.io.data.serializer.lang.StringSerializer;
import java.io.IOException;

public class PlayerCreationDataDataSerializer extends ObjectSerializer<IPlayerCreationData> {

	public PlayerCreationDataDataSerializer() {
		super(false);
	}

	public PlayerCreationDataDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IPlayerCreationData readValue(IDataReader reader) throws IOException {
		int param1 = reader.readInt();
		String param2 = reader.readObject(new StringSerializer(false));
		int param3 = reader.readInt();
		int param4 = reader.readInt();
		int param5 = reader.readInt();
		return new PlayerCreationData(param1, param2, param3, param4, param5);
	}

	@Override
	public void writeValue(IDataWriter writer, IPlayerCreationData object) throws IOException {
		writer.writeInt(object.getId());
		writer.writeObject(object.getName(), new StringSerializer(false));
		writer.writeInt(object.getUserId());
		writer.writeInt(object.getFactionId());
		writer.writeInt(object.getAllianceId());
	}
}
