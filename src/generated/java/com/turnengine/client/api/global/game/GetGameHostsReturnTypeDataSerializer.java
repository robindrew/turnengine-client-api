package com.turnengine.client.api.global.game;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import java.io.IOException;

public class GetGameHostsReturnTypeDataSerializer extends ObjectSerializer<IGetGameHosts> {

	public GetGameHostsReturnTypeDataSerializer() {
		super(false);
	}

	public GetGameHostsReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetGameHosts readValue(IDataReader reader) throws IOException {
		return new GetGameHosts();
	}

	@Override
	public void writeValue(IDataWriter writer, IGetGameHosts object) throws IOException {
	}
}
