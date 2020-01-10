package com.turnengine.client.api.global.game;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import com.robindrew.codegenerator.api.serializer.data.serializer.lang.StringSerializer;
import java.io.IOException;

public class NewGameInstanceReturnTypeDataSerializer extends ObjectSerializer<INewGameInstance> {

	public NewGameInstanceReturnTypeDataSerializer() {
		super(false);
	}

	public NewGameInstanceReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public INewGameInstance readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		String param2 = reader.readObject(new StringSerializer(false));
		String param3 = reader.readObject(new StringSerializer(false));
		String param4 = reader.readObject(new StringSerializer(false));
		int param5 = reader.readInt();
		return new NewGameInstance(param1, param2, param3, param4, param5);
	}

	@Override
	public void writeValue(IDataWriter writer, INewGameInstance object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeObject(object.getGameName(), new StringSerializer(false));
		writer.writeObject(object.getVersionName(), new StringSerializer(false));
		writer.writeObject(object.getInstanceName(), new StringSerializer(false));
		writer.writeInt(object.getHostId());
	}
}
