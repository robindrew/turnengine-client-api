package com.turnengine.client.api.local.error;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.StringSerializer;

public class LocalTraceJsonSerializer implements IJsonSerializer<ILocalTrace> {

	private String name;

	public LocalTraceJsonSerializer() {
		this("LocalTrace");
	}

	public LocalTraceJsonSerializer(String name) {
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
	public ILocalTrace readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, ILocalTrace object) {
		writer.openObject();
		writer.writeObject(object.getId(), new StringSerializer());
		writer.writeLong(object.getDatetime());
		writer.writeObject(object.getTrace(), new StringSerializer());
		writer.closeObject();
	}
}
