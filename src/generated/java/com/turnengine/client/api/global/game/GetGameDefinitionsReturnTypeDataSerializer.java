package com.turnengine.client.api.global.game;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import java.io.IOException;

public class GetGameDefinitionsReturnTypeDataSerializer extends ObjectSerializer<IGetGameDefinitions> {

	public GetGameDefinitionsReturnTypeDataSerializer() {
		super(false);
	}

	public GetGameDefinitionsReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetGameDefinitions readValue(IDataReader reader) throws IOException {
		return new GetGameDefinitions();
	}

	@Override
	public void writeValue(IDataWriter writer, IGetGameDefinitions object) throws IOException {
	}
}
