package com.turnengine.client.api.global.common;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.StringSerializer;

public class StopServiceJsonSerializer implements IJsonSerializer<IStopService> {

	private String name;

	public StopServiceJsonSerializer() {
		this("StopService");
	}

	public StopServiceJsonSerializer(String name) {
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
	public IStopService readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IStopService object) {
		writer.openObject();
		writer.writeObject(object.getProject(), new StringSerializer());
		writer.writeInt(object.getRelease());
		writer.writeObject(object.getService(), new StringSerializer());
		writer.closeObject();
	}
}
