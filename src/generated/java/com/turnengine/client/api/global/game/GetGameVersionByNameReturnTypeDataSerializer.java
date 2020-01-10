package com.turnengine.client.api.global.game;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import com.robindrew.codegenerator.api.serializer.data.serializer.lang.StringSerializer;
import java.io.IOException;

public class GetGameVersionByNameReturnTypeDataSerializer extends ObjectSerializer<IGetGameVersionByName> {

	public GetGameVersionByNameReturnTypeDataSerializer() {
		super(false);
	}

	public GetGameVersionByNameReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetGameVersionByName readValue(IDataReader reader) throws IOException {
		String param1 = reader.readObject(new StringSerializer(false));
		int param2 = reader.readInt();
		return new GetGameVersionByName(param1, param2);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetGameVersionByName object) throws IOException {
		writer.writeObject(object.getVersionName(), new StringSerializer(false));
		writer.writeInt(object.getGameId());
	}
}
