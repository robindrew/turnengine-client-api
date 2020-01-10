package com.turnengine.client.api.global.game;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import com.robindrew.codegenerator.api.serializer.data.serializer.lang.StringSerializer;
import java.io.IOException;

public class GetGameByNameReturnTypeDataSerializer extends ObjectSerializer<IGetGameByName> {

	public GetGameByNameReturnTypeDataSerializer() {
		super(false);
	}

	public GetGameByNameReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetGameByName readValue(IDataReader reader) throws IOException {
		String param1 = reader.readObject(new StringSerializer(false));
		return new GetGameByName(param1);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetGameByName object) throws IOException {
		writer.writeObject(object.getGameName(), new StringSerializer(false));
	}
}
