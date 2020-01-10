package com.turnengine.client.api.local.player;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class GetPlayerSetupInfoReturnTypeJsonSerializer implements IJsonSerializer<IPlayerSetupInfo> {

	private String name;

	public GetPlayerSetupInfoReturnTypeJsonSerializer() {
		this("GetPlayerSetupInfoReturnType");
	}

	public GetPlayerSetupInfoReturnTypeJsonSerializer(String name) {
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
	public IPlayerSetupInfo readObject(IJsonReader reader) {
		return new PlayerSetupInfoJsonSerializer().readObject(reader);
	}

	@Override
	public void writeObject(IJsonWriter writer, IPlayerSetupInfo object) {
		new PlayerSetupInfoJsonSerializer().writeObject(writer, object);
	}
}
