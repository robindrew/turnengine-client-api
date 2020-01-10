package com.turnengine.client.api.local.location;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.collection.ListSerializer;
import java.util.List;

public class GetLocationListReturnTypeJsonSerializer implements IJsonSerializer<List<ILocation>> {

	private String name;

	public GetLocationListReturnTypeJsonSerializer() {
		this("GetLocationListReturnType");
	}

	public GetLocationListReturnTypeJsonSerializer(String name) {
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
	public List<ILocation> readObject(IJsonReader reader) {
		return new ListSerializer<ILocation>(new LocationJsonSerializer()).readObject(reader);
	}

	@Override
	public void writeObject(IJsonWriter writer, List<ILocation> object) {
		new ListSerializer<ILocation>(new LocationJsonSerializer()).writeObject(writer, object);
	}
}
