package com.turnengine.client.api.global.game;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import com.robindrew.common.io.data.serializer.lang.StringSerializer;
import java.io.IOException;

public class GetGameDefinitionByHostPortReturnTypeDataSerializer extends ObjectSerializer<IGetGameDefinitionByHostPort> {

	public GetGameDefinitionByHostPortReturnTypeDataSerializer() {
		super(false);
	}

	public GetGameDefinitionByHostPortReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetGameDefinitionByHostPort readValue(IDataReader reader) throws IOException {
		String param1 = reader.readObject(new StringSerializer(false));
		int param2 = reader.readInt();
		return new GetGameDefinitionByHostPort(param1, param2);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetGameDefinitionByHostPort object) throws IOException {
		writer.writeObject(object.getName(), new StringSerializer(false));
		writer.writeInt(object.getPort());
	}
}
