package com.turnengine.client.api.global.game;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class NewGameVersionReturnTypeJsonSerializer implements IJsonSerializer<IGameVersion> {

	private String name;

	public NewGameVersionReturnTypeJsonSerializer() {
		this("NewGameVersionReturnType");
	}

	public NewGameVersionReturnTypeJsonSerializer(String name) {
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
	public IGameVersion readObject(IJsonReader reader) {
		return new GameVersionJsonSerializer().readObject(reader);
	}

	@Override
	public void writeObject(IJsonWriter writer, IGameVersion object) {
		new GameVersionJsonSerializer().writeObject(writer, object);
	}
}
