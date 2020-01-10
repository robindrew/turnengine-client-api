package com.turnengine.client.api.global.common;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import java.io.IOException;

public class PingReturnTypeDataSerializer extends ObjectSerializer<IPing> {

	public PingReturnTypeDataSerializer() {
		super(false);
	}

	public PingReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IPing readValue(IDataReader reader) throws IOException {
		return new Ping();
	}

	@Override
	public void writeValue(IDataWriter writer, IPing object) throws IOException {
	}
}
