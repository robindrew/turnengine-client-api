package com.turnengine.client.api.global.game;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import com.robindrew.codegenerator.api.serializer.data.serializer.lang.StringSerializer;
import java.io.IOException;

public class GetGameHostByNameReturnTypeDataSerializer extends ObjectSerializer<IGetGameHostByName> {

	public GetGameHostByNameReturnTypeDataSerializer() {
		super(false);
	}

	public GetGameHostByNameReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetGameHostByName readValue(IDataReader reader) throws IOException {
		String param1 = reader.readObject(new StringSerializer(false));
		int param2 = reader.readInt();
		return new GetGameHostByName(param1, param2);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetGameHostByName object) throws IOException {
		writer.writeObject(object.getName(), new StringSerializer(false));
		writer.writeInt(object.getPort());
	}
}
