package com.turnengine.client.api.local.player;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class GetPlayerReturnTypeJsonSerializer implements IJsonSerializer<IPlayer> {

	private String name;

	public GetPlayerReturnTypeJsonSerializer() {
		this("GetPlayerReturnType");
	}

	public GetPlayerReturnTypeJsonSerializer(String name) {
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
	public IPlayer readObject(IJsonReader reader) {
		return new PlayerJsonSerializer().readObject(reader);
	}

	@Override
	public void writeObject(IJsonWriter writer, IPlayer object) {
		new PlayerJsonSerializer().writeObject(writer, object);
	}
}
