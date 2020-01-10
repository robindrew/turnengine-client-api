package com.turnengine.client.api.local.upkeep;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class AddUpkeepReturnTypeJsonSerializer implements IJsonSerializer<IUpkeep> {

	private String name;

	public AddUpkeepReturnTypeJsonSerializer() {
		this("AddUpkeepReturnType");
	}

	public AddUpkeepReturnTypeJsonSerializer(String name) {
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
	public IUpkeep readObject(IJsonReader reader) {
		return new UpkeepJsonSerializer().readObject(reader);
	}

	@Override
	public void writeObject(IJsonWriter writer, IUpkeep object) {
		new UpkeepJsonSerializer().writeObject(writer, object);
	}
}
