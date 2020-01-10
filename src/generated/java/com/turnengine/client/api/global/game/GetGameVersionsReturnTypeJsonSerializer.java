package com.turnengine.client.api.global.game;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.collection.ListSerializer;
import java.util.List;

public class GetGameVersionsReturnTypeJsonSerializer implements IJsonSerializer<List<IGameVersion>> {

	private String name;

	public GetGameVersionsReturnTypeJsonSerializer() {
		this("GetGameVersionsReturnType");
	}

	public GetGameVersionsReturnTypeJsonSerializer(String name) {
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
	public List<IGameVersion> readObject(IJsonReader reader) {
		return new ListSerializer<IGameVersion>(new GameVersionJsonSerializer()).readObject(reader);
	}

	@Override
	public void writeObject(IJsonWriter writer, List<IGameVersion> object) {
		new ListSerializer<IGameVersion>(new GameVersionJsonSerializer()).writeObject(writer, object);
	}
}
