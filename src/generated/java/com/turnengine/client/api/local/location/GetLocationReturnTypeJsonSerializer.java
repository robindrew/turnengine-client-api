package com.turnengine.client.api.local.location;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class GetLocationReturnTypeJsonSerializer implements IJsonSerializer<ILocation> {

	private String name;

	public GetLocationReturnTypeJsonSerializer() {
		this("GetLocationReturnType");
	}

	public GetLocationReturnTypeJsonSerializer(String name) {
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
	public ILocation readObject(IJsonReader reader) {
		return new LocationJsonSerializer().readObject(reader);
	}

	@Override
	public void writeObject(IJsonWriter writer, ILocation object) {
		new LocationJsonSerializer().writeObject(writer, object);
	}
}
