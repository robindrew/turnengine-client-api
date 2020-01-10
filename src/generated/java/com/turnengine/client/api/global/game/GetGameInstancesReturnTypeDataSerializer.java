package com.turnengine.client.api.global.game;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import java.io.IOException;

public class GetGameInstancesReturnTypeDataSerializer extends ObjectSerializer<IGetGameInstances> {

	public GetGameInstancesReturnTypeDataSerializer() {
		super(false);
	}

	public GetGameInstancesReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetGameInstances readValue(IDataReader reader) throws IOException {
		return new GetGameInstances();
	}

	@Override
	public void writeValue(IDataWriter writer, IGetGameInstances object) throws IOException {
	}
}
