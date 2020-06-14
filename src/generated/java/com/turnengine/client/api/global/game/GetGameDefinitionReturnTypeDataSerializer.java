package com.turnengine.client.api.global.game;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import java.io.IOException;

public class GetGameDefinitionReturnTypeDataSerializer extends ObjectSerializer<IGetGameDefinition> {

	public GetGameDefinitionReturnTypeDataSerializer() {
		super(false);
	}

	public GetGameDefinitionReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetGameDefinition readValue(IDataReader reader) throws IOException {
		int param1 = reader.readInt();
		return new GetGameDefinition(param1);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetGameDefinition object) throws IOException {
		writer.writeInt(object.getInstanceId());
	}
}
