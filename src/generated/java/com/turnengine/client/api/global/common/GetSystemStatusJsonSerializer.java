package com.turnengine.client.api.global.common;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class GetSystemStatusJsonSerializer implements IJsonSerializer<IGetSystemStatus> {

	private String name;

	public GetSystemStatusJsonSerializer() {
		this("GetSystemStatus");
	}

	public GetSystemStatusJsonSerializer(String name) {
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
	public IGetSystemStatus readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IGetSystemStatus object) {
		writer.openObject();
		writer.closeObject();
	}
}
