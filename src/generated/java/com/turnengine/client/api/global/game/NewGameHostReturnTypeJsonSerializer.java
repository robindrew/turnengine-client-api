package com.turnengine.client.api.global.game;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class NewGameHostReturnTypeJsonSerializer implements IJsonSerializer<IGameHost> {

	private String name;

	public NewGameHostReturnTypeJsonSerializer() {
		this("NewGameHostReturnType");
	}

	public NewGameHostReturnTypeJsonSerializer(String name) {
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
