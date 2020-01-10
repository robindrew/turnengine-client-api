package com.turnengine.client.api.local.property;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.StringSerializer;

public class GetLocalPropertyReturnTypeJsonSerializer implements IJsonSerializer<String> {

	private String name;

	public GetLocalPropertyReturnTypeJsonSerializer() {
		this("GetLocalPropertyReturnType");
	}

	public GetLocalPropertyReturnTypeJsonSerializer(String name) {
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
	public String readObject(IJsonReader reader) {
		return new StringSerializer().readObject(reader);
	}

	@Override
	public void writeObject(IJsonWriter writer, String object) {
		new StringSerializer().writeObject(writer, object);
	}
}
