package com.turnengine.client.api.local.game;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class AddGameUnitsJsonSerializer implements IJsonSerializer<IAddGameUnits> {

	private String name;

	public AddGameUnitsJsonSerializer() {
		this("AddGameUnits");
	}

	public AddGameUnitsJsonSerializer(String name) {
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
	public IAddGameUnits readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IAddGameUnits object) {
		writer.openObject();
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeInt(object.getUnitId());
		writer.writeLong(object.getAmount());
		writer.closeObject();
	}
}
