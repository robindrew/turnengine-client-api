package com.turnengine.client.api.global.game;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
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
