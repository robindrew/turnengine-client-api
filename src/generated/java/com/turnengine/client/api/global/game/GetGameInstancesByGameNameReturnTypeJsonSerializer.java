package com.turnengine.client.api.global.game;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.collection.ListSerializer;
import java.util.List;

public class GetGameInstancesByGameNameReturnTypeJsonSerializer implements IJsonSerializer<List<IGameInstance>> {

	private String name;

	public GetGameInstancesByGameNameReturnTypeJsonSerializer() {
		this("GetGameInstancesByGameNameReturnType");
	}

	public GetGameInstancesByGameNameReturnTypeJsonSerializer(String name) {
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
	public List<IGameInstance> readObject(IJsonReader reader) {
		return new ListSerializer<IGameInstance>(new GameInstanceJsonSerializer()).readObject(reader);
	}

	@Override
	public void writeObject(IJsonWriter writer, List<IGameInstance> object) {
		new ListSerializer<IGameInstance>(new GameInstanceJsonSerializer()).writeObject(writer, object);
	}
}
