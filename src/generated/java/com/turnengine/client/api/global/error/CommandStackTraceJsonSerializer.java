package com.turnengine.client.api.global.error;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.StringSerializer;

public class CommandStackTraceJsonSerializer implements IJsonSerializer<ICommandStackTrace> {

	private String name;

	public CommandStackTraceJsonSerializer() {
		this("CommandStackTrace");
	}

	public CommandStackTraceJsonSerializer(String name) {
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
	public ICommandStackTrace readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, ICommandStackTrace object) {
		writer.openObject();
		writer.writeLong(object.getId());
		writer.writeLong(object.getTimestamp());
		writer.writeObject(object.getCommand(), new StringSerializer());
		writer.writeObject(object.getTrace(), new StringSerializer());
		writer.closeObject();
	}
}
