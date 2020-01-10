package com.turnengine.client.api.local.player;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.collection.ListSerializer;
import java.util.List;

public class GetPlayerPropertyListReturnTypeJsonSerializer implements IJsonSerializer<List<IPlayerProperty>> {

	private String name;

	public GetPlayerPropertyListReturnTypeJsonSerializer() {
		this("GetPlayerPropertyListReturnType");
	}

	public GetPlayerPropertyListReturnTypeJsonSerializer(String name) {
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
	public List<IPlayerProperty> readObject(IJsonReader reader) {
		return new ListSerializer<IPlayerProperty>(new PlayerPropertyJsonSerializer()).readObject(reader);
	}

	@Override
	public void writeObject(IJsonWriter writer, List<IPlayerProperty> object) {
		new ListSerializer<IPlayerProperty>(new PlayerPropertyJsonSerializer()).writeObject(writer, object);
	}
}
