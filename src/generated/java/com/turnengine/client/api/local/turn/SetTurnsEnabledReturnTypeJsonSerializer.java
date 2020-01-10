package com.turnengine.client.api.local.turn;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.EnumSerializer;

public class SetTurnsEnabledReturnTypeJsonSerializer implements IJsonSerializer<TurnsEnabled> {

	private String name;

	public SetTurnsEnabledReturnTypeJsonSerializer() {
		this("SetTurnsEnabledReturnType");
	}

	public SetTurnsEnabledReturnTypeJsonSerializer(String name) {
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
	public TurnsEnabled readObject(IJsonReader reader) {
		return new EnumSerializer<TurnsEnabled>(TurnsEnabled.class).readObject(reader);
	}

	@Override
	public void writeObject(IJsonWriter writer, TurnsEnabled object) {
		new EnumSerializer<TurnsEnabled>(TurnsEnabled.class).writeObject(writer, object);
	}
}
