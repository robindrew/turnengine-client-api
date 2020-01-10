package com.turnengine.client.api.local.setup;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.StringSerializer;

public class SetupAddChildGroupJsonSerializer implements IJsonSerializer<ISetupAddChildGroup> {

	private String name;

	public SetupAddChildGroupJsonSerializer() {
		this("SetupAddChildGroup");
	}

	public SetupAddChildGroupJsonSerializer(String name) {
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
	public ISetupAddChildGroup readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, ISetupAddChildGroup object) {
		writer.openObject();
		writer.writeObject(object.getName(), new StringSerializer());
		writer.writeObject(object.getParentName(), new StringSerializer());
		writer.writeObject(object.getFactionName(), new StringSerializer());
		writer.closeObject();
	}
}
