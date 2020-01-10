package com.turnengine.client.api.global.game;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class GetGameHostByNameReturnTypeJsonSerializer implements IJsonSerializer<IGameHost> {

	private String name;

	public GetGameHostByNameReturnTypeJsonSerializer() {
		this("GetGameHostByNameReturnType");
	}

	public GetGameHostByNameReturnTypeJsonSerializer(String name) {
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
	public IGameHost readObject(IJsonReader reader) {
		return new GameHostJsonSerializer().readObject(reader);
	}

	@Override
	public void writeObject(IJsonWriter writer, IGameHost object) {
		new GameHostJsonSerializer().writeObject(writer, object);
	}
}
