package com.turnengine.client.api.local.player;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class GetPlayerInfoReturnTypeJsonSerializer implements IJsonSerializer<IPlayerInfo> {

	private String name;

	public GetPlayerInfoReturnTypeJsonSerializer() {
		this("GetPlayerInfoReturnType");
	}

	public GetPlayerInfoReturnTypeJsonSerializer(String name) {
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
	public IPlayerInfo readObject(IJsonReader reader) {
		return new PlayerInfoJsonSerializer().readObject(reader);
	}

	@Override
	public void writeObject(IJsonWriter writer, IPlayerInfo object) {
		new PlayerInfoJsonSerializer().writeObject(writer, object);
	}
}
