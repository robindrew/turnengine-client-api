package com.turnengine.client.api.global.common;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import java.io.IOException;

public class GetSystemStatusReturnTypeDataSerializer extends ObjectSerializer<IGetSystemStatus> {

	public GetSystemStatusReturnTypeDataSerializer() {
		super(false);
	}

	public GetSystemStatusReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetSystemStatus readValue(IDataReader reader) throws IOException {
		return new GetSystemStatus();
	}

	@Override
	public void writeValue(IDataWriter writer, IGetSystemStatus object) throws IOException {
	}
}
