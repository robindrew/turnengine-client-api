package com.turnengine.client.api.global.game;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
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
