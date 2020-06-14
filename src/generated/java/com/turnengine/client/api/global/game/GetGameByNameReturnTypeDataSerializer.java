package com.turnengine.client.api.global.game;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import com.robindrew.common.io.data.serializer.lang.StringSerializer;
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
