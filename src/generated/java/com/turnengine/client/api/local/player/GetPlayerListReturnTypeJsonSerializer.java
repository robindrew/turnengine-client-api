package com.turnengine.client.api.local.player;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.collection.ListSerializer;
import java.util.List;

public class GetPlayerListReturnTypeJsonSerializer implements IJsonSerializer<List<IPlayer>> {

	private String name;

	public GetPlayerListReturnTypeJsonSerializer() {
		this("GetPlayerListReturnType");
	}

	public GetPlayerListReturnTypeJsonSerializer(String name) {
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
	public List<IPlayer> readObject(IJsonReader reader) {
		return new ListSerializer<IPlayer>(new PlayerJsonSerializer()).readObject(reader);
	}

	@Override
	public void writeObject(IJsonWriter writer, List<IPlayer> object) {
		new ListSerializer<IPlayer>(new PlayerJsonSerializer()).writeObject(writer, object);
	}
}
