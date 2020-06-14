package com.turnengine.client.api.global.game;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
import java.io.IOException;

public class GetGameVersionsReturnTypeDataSerializer extends ObjectSerializer<IGetGameVersions> {

	public GetGameVersionsReturnTypeDataSerializer() {
		super(false);
	}

	public GetGameVersionsReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetGameVersions readValue(IDataReader reader) throws IOException {
		return new GetGameVersions();
	}

	@Override
	public void writeValue(IDataWriter writer, IGetGameVersions object) throws IOException {
	}
}
