package com.turnengine.client.api.local.location;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.array.IntArraySerializer;

public class GetCoordinatesReturnTypeJsonSerializer implements IJsonSerializer<int[]> {

	private String name;

	public GetCoordinatesReturnTypeJsonSerializer() {
		this("GetCoordinatesReturnType");
	}

	public GetCoordinatesReturnTypeJsonSerializer(String name) {
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
	public int[] readObject(IJsonReader reader) {
		return new IntArraySerializer().readObject(reader);
	}

	@Override
	public void writeObject(IJsonWriter writer, int[] object) {
		new IntArraySerializer().writeObject(writer, object);
	}
}
