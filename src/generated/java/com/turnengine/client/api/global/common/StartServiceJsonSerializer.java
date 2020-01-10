package com.turnengine.client.api.global.common;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.StringSerializer;

public class StartServiceJsonSerializer implements IJsonSerializer<IStartService> {

	private String name;

	public StartServiceJsonSerializer() {
		this("StartService");
	}

	public StartServiceJsonSerializer(String name) {
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
	public IStartService readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IStartService object) {
		writer.openObject();
		writer.writeObject(object.getProject(), new StringSerializer());
		writer.writeInt(object.getRelease());
		writer.writeObject(object.getService(), new StringSerializer());
		writer.closeObject();
	}
}
