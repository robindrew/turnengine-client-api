package com.turnengine.client.api.local.setup;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.StringSerializer;

public class SetupAddActionJsonSerializer implements IJsonSerializer<ISetupAddAction> {

	private String name;

	public SetupAddActionJsonSerializer() {
		this("SetupAddAction");
	}

	public SetupAddActionJsonSerializer(String name) {
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
	public ISetupAddAction readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, ISetupAddAction object) {
		writer.openObject();
		writer.writeObject(object.getName(), new StringSerializer());
		writer.writeInt(object.getTurns());
		writer.writeInt(object.getLimit());
		writer.closeObject();
	}
}
