package com.turnengine.client.api.local.location;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.collection.ListSerializer;
import java.util.List;

public class GetLocationPropertyListReturnTypeJsonSerializer implements IJsonSerializer<List<ILocationProperty>> {

	private String name;

	public GetLocationPropertyListReturnTypeJsonSerializer() {
		this("GetLocationPropertyListReturnType");
	}

	public GetLocationPropertyListReturnTypeJsonSerializer(String name) {
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
	public List<ILocationProperty> readObject(IJsonReader reader) {
		return new ListSerializer<ILocationProperty>(new LocationPropertyJsonSerializer()).readObject(reader);
	}

	@Override
	public void writeObject(IJsonWriter writer, List<ILocationProperty> object) {
		new ListSerializer<ILocationProperty>(new LocationPropertyJsonSerializer()).writeObject(writer, object);
	}
}
