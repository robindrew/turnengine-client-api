package com.turnengine.client.api.global.common;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class GetServiceStatusJsonSerializer implements IJsonSerializer<IGetServiceStatus> {

	private String name;

	public GetServiceStatusJsonSerializer() {
		this("GetServiceStatus");
	}

	public GetServiceStatusJsonSerializer(String name) {
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
	public IGetServiceStatus readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IGetServiceStatus object) {
		writer.openObject();
		writer.closeObject();
	}
}
