package com.turnengine.client.api.global.error;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import java.io.IOException;

public class GetCommandStackTraceListReturnTypeDataSerializer extends ObjectSerializer<IGetCommandStackTraceList> {

	public GetCommandStackTraceListReturnTypeDataSerializer() {
		super(false);
	}

	public GetCommandStackTraceListReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetCommandStackTraceList readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		long param2 = reader.readLong();
		long param3 = reader.readLong();
		return new GetCommandStackTraceList(param1, param2, param3);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetCommandStackTraceList object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeLong(object.getFrom());
		writer.writeLong(object.getTo());
	}
}
