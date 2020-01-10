package com.turnengine.client.api.local.upkeep;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class UpkeepJsonSerializer implements IJsonSerializer<IUpkeep> {

	private String name;

	public UpkeepJsonSerializer() {
		this("Upkeep");
	}

	public UpkeepJsonSerializer(String name) {
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
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IUpkeep object) {
		writer.openObject();
		writer.writeInt(object.getId());
		writer.writeLong(object.getLimit());
		writer.closeObject();
	}
}
