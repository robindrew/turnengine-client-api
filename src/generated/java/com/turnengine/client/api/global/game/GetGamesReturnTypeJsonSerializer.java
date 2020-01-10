package com.turnengine.client.api.global.game;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.collection.ListSerializer;
import java.util.List;

public class GetGamesReturnTypeJsonSerializer implements IJsonSerializer<List<IGame>> {

	private String name;

	public GetGamesReturnTypeJsonSerializer() {
		this("GetGamesReturnType");
	}

	public GetGamesReturnTypeJsonSerializer(String name) {
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
	public List<IGame> readObject(IJsonReader reader) {
		return new ListSerializer<IGame>(new GameJsonSerializer()).readObject(reader);
	}

	@Override
	public void writeObject(IJsonWriter writer, List<IGame> object) {
		new ListSerializer<IGame>(new GameJsonSerializer()).writeObject(writer, object);
	}
}
