package com.turnengine.client.api.local.location;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class SetLocationSignupsEnabledJsonSerializer implements IJsonSerializer<ISetLocationSignupsEnabled> {

	private String name;

	public SetLocationSignupsEnabledJsonSerializer() {
		this("SetLocationSignupsEnabled");
	}

	public SetLocationSignupsEnabledJsonSerializer(String name) {
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
	public ISetLocationSignupsEnabled readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, ISetLocationSignupsEnabled object) {
		writer.openObject();
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeBoolean(object.getEnabled());
		writer.closeObject();
	}
}
