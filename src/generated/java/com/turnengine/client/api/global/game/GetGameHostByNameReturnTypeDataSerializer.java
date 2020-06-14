package com.turnengine.client.api.global.game;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import com.robindrew.common.io.data.serializer.lang.StringSerializer;
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
