package com.turnengine.client.api.local.location;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class LocationSetupInfoJsonSerializer implements IJsonSerializer<ILocationSetupInfo> {

	private String name;

	public LocationSetupInfoJsonSerializer() {
		this("LocationSetupInfo");
	}

	public LocationSetupInfoJsonSerializer(String name) {
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
	public ILocationSetupInfo readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, ILocationSetupInfo object) {
		writer.openObject();
		writer.writeInt(object.getCount());
		writer.writeBoolean(object.getEnabled());
		writer.writeBoolean(object.getSignupsEnabled());
		writer.closeObject();
	}
}
