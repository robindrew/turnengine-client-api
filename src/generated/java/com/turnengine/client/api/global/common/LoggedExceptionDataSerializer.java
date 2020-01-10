package com.turnengine.client.api.global.common;

import com.robindrew.codegenerator.api.serializer.data.IDataReader;
import com.robindrew.codegenerator.api.serializer.data.IDataWriter;
import com.robindrew.codegenerator.api.serializer.data.serializer.ObjectSerializer;
import com.robindrew.codegenerator.api.serializer.data.serializer.lang.StringSerializer;
import java.io.IOException;

public class LoggedExceptionDataSerializer extends ObjectSerializer<ILoggedException> {

	public LoggedExceptionDataSerializer() {
		super(false);
	}

	public LoggedExceptionDataSerializer(boolean nullable) {
		super(nullable);
	}

	@Override
	public ILoggedException readValue(IDataReader reader) throws IOException {
		long param1 = reader.readLong();
		String param2 = reader.readObject(new StringSerializer(false));
		String param3 = reader.readObject(new StringSerializer(false));
		String param4 = reader.readObject(new StringSerializer(false));
		String param5 = reader.readObject(new StringSerializer(false));
		return new LoggedException(param1, param2, param3, param4, param5);
	}

	@Override
	public void writeValue(IDataWriter writer, ILoggedException object) throws IOException {
		writer.writeLong(object.getTimestamp());
		writer.writeObject(object.getLevel(), new StringSerializer(false));
		writer.writeObject(object.getClassName(), new StringSerializer(false));
		writer.writeObject(object.getMessage(), new StringSerializer(false));
		writer.writeObject(object.getTrace(), new StringSerializer(false));
	}
}
