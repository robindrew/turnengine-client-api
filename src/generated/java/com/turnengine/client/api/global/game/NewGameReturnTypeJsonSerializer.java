package com.turnengine.client.api.global.game;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class NewGameReturnTypeJsonSerializer implements IJsonSerializer<IGame> {

	private String name;

	public NewGameReturnTypeJsonSerializer() {
		this("NewGameReturnType");
	}

	public NewGameReturnTypeJsonSerializer(String name) {
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
	public IGame readObject(IJsonReader reader) {
		return new GameJsonSerializer().readObject(reader);
	}

	@Override
	public void writeObject(IJsonWriter writer, IGame object) {
		new GameJsonSerializer().writeObject(writer, object);
	}
}
