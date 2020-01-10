package com.turnengine.client.api.local.error;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import java.io.IOException;

public class GetLocalTraceListReturnTypeDataSerializer extends ObjectSerializer<IGetLocalTraceList> {

	public GetLocalTraceListReturnTypeDataSerializer() {
		super(false);
	}

	public GetLocalTraceListReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetLocalTraceList readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		long param3 = reader.readLong();
		long param4 = reader.readLong();
		return new GetLocalTraceList(param1, param2, param3, param4);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetLocalTraceList object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeLong(object.getFrom());
		writer.writeLong(object.getTo());
	}
}
