package com.turnengine.client.api.global.game;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class GetGameInstanceByIdReturnTypeJsonSerializer implements IJsonSerializer<IGameInstance> {

	private String name;

	public GetGameInstanceByIdReturnTypeJsonSerializer() {
		this("GetGameInstanceByIdReturnType");
	}

	public GetGameInstanceByIdReturnTypeJsonSerializer(String name) {
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
	public IGameInstance readObject(IJsonReader reader) {
		return new GameInstanceJsonSerializer().readObject(reader);
	}

	@Override
	public void writeObject(IJsonWriter writer, IGameInstance object) {
		new GameInstanceJsonSerializer().writeObject(writer, object);
	}
}
