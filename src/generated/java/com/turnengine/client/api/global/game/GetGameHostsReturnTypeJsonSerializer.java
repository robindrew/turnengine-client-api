package com.turnengine.client.api.global.game;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.collection.ListSerializer;
import java.util.List;

public class GetGameHostsReturnTypeJsonSerializer implements IJsonSerializer<List<IGameHost>> {

	private String name;

	public GetGameHostsReturnTypeJsonSerializer() {
		this("GetGameHostsReturnType");
	}

	public GetGameHostsReturnTypeJsonSerializer(String name) {
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
	public List<IGameHost> readObject(IJsonReader reader) {
		return new ListSerializer<IGameHost>(new GameHostJsonSerializer()).readObject(reader);
	}

	@Override
	public void writeObject(IJsonWriter writer, List<IGameHost> object) {
		new ListSerializer<IGameHost>(new GameHostJsonSerializer()).writeObject(writer, object);
	}
}
