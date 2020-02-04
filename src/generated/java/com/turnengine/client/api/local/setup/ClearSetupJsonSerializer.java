package com.turnengine.client.api.local.setup;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class ClearSetupJsonSerializer implements IJsonSerializer<IClearSetup> {

	private String name;

	public ClearSetupJsonSerializer() {
		this("ClearSetup");
	}

	public ClearSetupJsonSerializer(String name) {
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
	public IClearSetup readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IClearSetup object) {
		writer.openObject();
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.closeObject();
	}
}
