package com.turnengine.client.api.local.game;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class GetGameUnitsReturnTypeJsonSerializer implements IJsonSerializer<IGameUnits> {

	private String name;

	public GetGameUnitsReturnTypeJsonSerializer() {
		this("GetGameUnitsReturnType");
	}

	public GetGameUnitsReturnTypeJsonSerializer(String name) {
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
	public IGameUnits readObject(IJsonReader reader) {
		return new GameUnitsJsonSerializer().readObject(reader);
	}

	@Override
	public void writeObject(IJsonWriter writer, IGameUnits object) {
		new GameUnitsJsonSerializer().writeObject(writer, object);
	}
}
