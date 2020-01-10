package com.turnengine.client.api.local.error;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import com.robindrew.codegenerator.api.serializer.data.serializer.lang.StringSerializer;
import java.io.IOException;

public class GetLocalTraceReturnTypeDataSerializer extends ObjectSerializer<IGetLocalTrace> {

	public GetLocalTraceReturnTypeDataSerializer() {
		super(false);
	}

	public GetLocalTraceReturnTypeDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public IGetLocalTrace readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		int param2 = reader.readInt();
		String param3 = reader.readObject(new StringSerializer(false));
		return new GetLocalTrace(param1, param2, param3);
	}

	@Override
	public void writeValue(IDataWriter writer, IGetLocalTrace object) throws IOException {
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeObject(object.getId(), new StringSerializer(false));
	}
}
