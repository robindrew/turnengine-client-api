package com.turnengine.client.api.local.error;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import com.robindrew.codegenerator.api.serializer.data.serializer.lang.StringSerializer;
import java.io.IOException;

public class LocalTraceDataSerializer extends ObjectSerializer<ILocalTrace> {

	public LocalTraceDataSerializer() {
		super(false);
	}

	public LocalTraceDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public ILocalTrace readValue(IDataReader reader) throws IOException {
		String param1 = reader.readObject(new StringSerializer(false));
		long param2 = reader.readLong();
		String param3 = reader.readObject(new StringSerializer(false));
		return new LocalTrace(param1, param2, param3);
	}

	@Override
	public void writeValue(IDataWriter writer, ILocalTrace object) throws IOException {
		writer.writeObject(object.getId(), new StringSerializer(false));
		writer.writeLong(object.getDatetime());
		writer.writeObject(object.getTrace(), new StringSerializer(false));
	}
}
