package com.turnengine.client.api.global.game;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.collection.ListSerializer;
import java.util.List;

public class GetGameInstancePropertyListReturnTypeJsonSerializer implements IJsonSerializer<List<IGameInstanceProperty>> {

	private String name;

	public GetGameInstancePropertyListReturnTypeJsonSerializer() {
		this("GetGameInstancePropertyListReturnType");
	}

	public GetGameInstancePropertyListReturnTypeJsonSerializer(String name) {
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
	public List<IGameInstanceProperty> readObject(IJsonReader reader) {
		return new ListSerializer<IGameInstanceProperty>(new GameInstancePropertyJsonSerializer()).readObject(reader);
	}

	@Override
	public void writeObject(IJsonWriter writer, List<IGameInstanceProperty> object) {
		new ListSerializer<IGameInstanceProperty>(new GameInstancePropertyJsonSerializer()).writeObject(writer, object);
	}
}
