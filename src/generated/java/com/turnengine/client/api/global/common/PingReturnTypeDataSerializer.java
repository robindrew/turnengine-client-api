package com.turnengine.client.api.global.common;

import com.robindrew.common.io.data.IDataReader;
import com.robindrew.common.io.data.IDataWriter;
import com.robindrew.common.io.data.serializer.ObjectSerializer;
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
