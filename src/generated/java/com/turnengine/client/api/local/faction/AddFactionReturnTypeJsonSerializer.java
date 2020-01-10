package com.turnengine.client.api.local.faction;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class AddFactionReturnTypeJsonSerializer implements IJsonSerializer<IFaction> {

	private String name;

	public AddFactionReturnTypeJsonSerializer() {
		this("AddFactionReturnType");
	}

	public AddFactionReturnTypeJsonSerializer(String name) {
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
	public IFaction readObject(IJsonReader reader) {
		return new FactionJsonSerializer().readObject(reader);
	}

	@Override
	public void writeObject(IJsonWriter writer, IFaction object) {
		new FactionJsonSerializer().writeObject(writer, object);
	}
}
