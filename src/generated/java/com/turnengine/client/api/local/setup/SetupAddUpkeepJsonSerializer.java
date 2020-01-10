package com.turnengine.client.api.local.setup;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.StringSerializer;

public class SetupAddUpkeepJsonSerializer implements IJsonSerializer<ISetupAddUpkeep> {

	private String name;

	public SetupAddUpkeepJsonSerializer() {
		this("SetupAddUpkeep");
	}

	public SetupAddUpkeepJsonSerializer(String name) {
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
	public ISetupAddUpkeep readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, ISetupAddUpkeep object) {
		writer.openObject();
		writer.writeObject(object.getName(), new StringSerializer());
		writer.writeLong(object.getLimit());
		writer.closeObject();
	}
}
