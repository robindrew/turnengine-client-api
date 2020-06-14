package com.turnengine.client.api.global.game;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import com.robindrew.common.io.data.serializer.lang.StringSerializer;
import java.io.IOException;

public class NewGameVersionReturnTypeDataSerializer extends ObjectSerializer<INewGameVersion> {

	public NewGameVersionReturnTypeDataSerializer() {
		super(false);
	}

	public NewGameVersionReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public INewGameVersion readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		String param2 = reader.readObject(new StringSerializer(false));
		String param3 = reader.readObject(new StringSerializer(false));
		return new NewGameVersion(param1, param2, param3);
	}

	@Override
	public void writeValue(IDataWriter writer, INewGameVersion object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeObject(object.getGameName(), new StringSerializer(false));
		writer.writeObject(object.getVersionName(), new StringSerializer(false));
	}
}
