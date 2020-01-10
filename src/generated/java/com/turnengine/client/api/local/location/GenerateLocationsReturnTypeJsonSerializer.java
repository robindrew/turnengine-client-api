package com.turnengine.client.api.local.location;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.IntegerSerializer;

public class GenerateLocationsReturnTypeJsonSerializer implements IJsonSerializer<Integer> {

	private String name;

	public GenerateLocationsReturnTypeJsonSerializer() {
		this("GenerateLocationsReturnType");
	}

	public GenerateLocationsReturnTypeJsonSerializer(String name) {
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
	public Integer readObject(IJsonReader reader) {
		return new IntegerSerializer().readObject(reader);
	}

	@Override
	public void writeObject(IJsonWriter writer, Integer object) {
		new IntegerSerializer().writeObject(writer, object);
	}
}
