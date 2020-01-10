package com.turnengine.client.api.global.error;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import com.robindrew.codegenerator.api.serializer.data.serializer.lang.StringSerializer;
import java.io.IOException;

public class CommandStackTraceDataSerializer extends ObjectSerializer<ICommandStackTrace> {

	public CommandStackTraceDataSerializer() {
		super(false);
	}

	public CommandStackTraceDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public ICommandStackTrace readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		long param2 = reader.readLong();
		String param3 = reader.readObject(new StringSerializer(false));
		String param4 = reader.readObject(new StringSerializer(false));
		return new CommandStackTrace(param1, param2, param3, param4);
	}

	@Override
	public void writeValue(IDataWriter writer, ICommandStackTrace object) throws IOException {
		writer.writeLong(object.getId());
		writer.writeLong(object.getTimestamp());
		writer.writeObject(object.getCommand(), new StringSerializer(false));
		writer.writeObject(object.getTrace(), new StringSerializer(false));
	}
}
