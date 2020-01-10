package com.turnengine.client.api.global.common;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class GetServiceStatusReturnTypeJsonSerializer implements IJsonSerializer<IServiceStatus> {

	private String name;

	public GetServiceStatusReturnTypeJsonSerializer() {
		this("GetServiceStatusReturnType");
	}

	public GetServiceStatusReturnTypeJsonSerializer(String name) {
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
	public IServiceStatus readObject(IJsonReader reader) {
		return new ServiceStatusJsonSerializer().readObject(reader);
	}

	@Override
	public void writeObject(IJsonWriter writer, IServiceStatus object) {
		new ServiceStatusJsonSerializer().writeObject(writer, object);
	}
}
