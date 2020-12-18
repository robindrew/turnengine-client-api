package com.turnengine.client.api.global.game;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class GetGameDefinitionByHostPortReturnTypeJsonSerializer implements IJsonSerializer<IGameDefinition> {

	private String name;

	public GetGameDefinitionByHostPortReturnTypeJsonSerializer() {
		this("GetGameDefinitionByHostPortReturnType");
	}

	public GetGameDefinitionByHostPortReturnTypeJsonSerializer(String name) {
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
	public IGameDefinition readObject(IJsonReader reader) {
		return new GameDefinitionJsonSerializer().readObject(reader);
	}

	@Override
	public void writeObject(IJsonWriter writer, IGameDefinition object) {
		new GameDefinitionJsonSerializer().writeObject(writer, object);
	}
}
