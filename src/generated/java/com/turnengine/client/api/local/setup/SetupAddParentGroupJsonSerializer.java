package com.turnengine.client.api.local.setup;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.StringSerializer;

public class SetupAddParentGroupJsonSerializer implements IJsonSerializer<ISetupAddParentGroup> {

	private String name;

	public SetupAddParentGroupJsonSerializer() {
		this("SetupAddParentGroup");
	}

	public SetupAddParentGroupJsonSerializer(String name) {
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
	public ISetupAddParentGroup readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, ISetupAddParentGroup object) {
		writer.openObject();
		writer.writeObject(object.getName(), new StringSerializer());
		writer.writeObject(object.getFactionName(), new StringSerializer());
		writer.closeObject();
	}
}
