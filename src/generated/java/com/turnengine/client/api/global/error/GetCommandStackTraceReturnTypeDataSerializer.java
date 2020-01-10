package com.turnengine.client.api.global.error;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import java.io.IOException;

public class GetCommandStackTraceReturnTypeDataSerializer extends ObjectSerializer<IGetCommandStackTrace> {

	public GetCommandStackTraceReturnTypeDataSerializer() {
		super(false);
	}

	public GetCommandStackTraceReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetCommandStackTrace readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		long param2 = reader.readLong();
		return new GetCommandStackTrace(param1, param2);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetCommandStackTrace object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeLong(object.getId());
	}
}
