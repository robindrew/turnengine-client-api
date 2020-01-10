package com.turnengine.client.api.local.turn;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.EnumSerializer;

public class GetTurnUpdatingReturnTypeJsonSerializer implements IJsonSerializer<TurnUpdating> {

	private String name;

	public GetTurnUpdatingReturnTypeJsonSerializer() {
		this("GetTurnUpdatingReturnType");
	}

	public GetTurnUpdatingReturnTypeJsonSerializer(String name) {
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
	public TurnUpdating readObject(IJsonReader reader) {
		return new EnumSerializer<TurnUpdating>(TurnUpdating.class).readObject(reader);
	}

	@Override
	public void writeObject(IJsonWriter writer, TurnUpdating object) {
		new EnumSerializer<TurnUpdating>(TurnUpdating.class).writeObject(writer, object);
	}
}
