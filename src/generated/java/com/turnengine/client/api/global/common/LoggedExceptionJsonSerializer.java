package com.turnengine.client.api.global.common;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.StringSerializer;

public class LoggedExceptionJsonSerializer implements IJsonSerializer<ILoggedException> {

	private String name;

	public LoggedExceptionJsonSerializer() {
		this("LoggedException");
	}

	public LoggedExceptionJsonSerializer(String name) {
		this.name = name;
	}

	/**
	 * Getter for the name field.
	 * @return the value of the name field.
	 */
	public String getName() {
		return name;
	}

	@Override
	public ILoggedException readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, ILoggedException object) {
		writer.openObject();
		writer.writeLong(object.getTimestamp());
		writer.writeObject(object.getLevel(), new StringSerializer());
		writer.writeObject(object.getClassName(), new StringSerializer());
		writer.writeObject(object.getMessage(), new StringSerializer());
		writer.writeObject(object.getTrace(), new StringSerializer());
		writer.closeObject();
	}
}
