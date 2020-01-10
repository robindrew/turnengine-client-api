package com.turnengine.client.api.global.common;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class GetSystemStatusReturnTypeJsonSerializer implements IJsonSerializer<ISystemStatus> {

	private String name;

	public GetSystemStatusReturnTypeJsonSerializer() {
		this("GetSystemStatusReturnType");
	}

	public GetSystemStatusReturnTypeJsonSerializer(String name) {
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
	public ISystemStatus readObject(IJsonReader reader) {
		return new SystemStatusJsonSerializer().readObject(reader);
	}

	@Override
	public void writeObject(IJsonWriter writer, ISystemStatus object) {
		new SystemStatusJsonSerializer().writeObject(writer, object);
	}
}
