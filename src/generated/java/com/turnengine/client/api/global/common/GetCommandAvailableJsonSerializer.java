package com.turnengine.client.api.global.common;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.StringSerializer;

public class GetCommandAvailableJsonSerializer implements IJsonSerializer<IGetCommandAvailable> {

	private String name;

	public GetCommandAvailableJsonSerializer() {
		this("GetCommandAvailable");
	}

	public GetCommandAvailableJsonSerializer(String name) {
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
	public IGetCommandAvailable readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IGetCommandAvailable object) {
		writer.openObject();
		writer.writeObject(object.getName(), new StringSerializer());
		writer.closeObject();
	}
}
