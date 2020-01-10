package com.turnengine.client.api.global.game;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.collection.ListSerializer;
import java.util.List;

public class GetGameDefinitionsByGameNameReturnTypeJsonSerializer implements IJsonSerializer<List<IGameDefinition>> {

	private String name;

	public GetGameDefinitionsByGameNameReturnTypeJsonSerializer() {
		this("GetGameDefinitionsByGameNameReturnType");
	}

	public GetGameDefinitionsByGameNameReturnTypeJsonSerializer(String name) {
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
	public List<IGameDefinition> readObject(IJsonReader reader) {
		return new ListSerializer<IGameDefinition>(new GameDefinitionJsonSerializer()).readObject(reader);
	}

	@Override
	public void writeObject(IJsonWriter writer, List<IGameDefinition> object) {
		new ListSerializer<IGameDefinition>(new GameDefinitionJsonSerializer()).writeObject(writer, object);
	}
}
