package com.turnengine.client.api.local.mobile;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class SetMobilesEnabledJsonSerializer implements IJsonSerializer<ISetMobilesEnabled> {

	private String name;

	public SetMobilesEnabledJsonSerializer() {
		this("SetMobilesEnabled");
	}

	public SetMobilesEnabledJsonSerializer(String name) {
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
	public ISetMobilesEnabled readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, ISetMobilesEnabled object) {
		writer.openObject();
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeBoolean(object.getEnabled());
		writer.closeObject();
	}
}
