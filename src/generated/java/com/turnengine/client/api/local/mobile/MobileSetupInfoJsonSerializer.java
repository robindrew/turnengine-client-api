package com.turnengine.client.api.local.mobile;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class MobileSetupInfoJsonSerializer implements IJsonSerializer<IMobileSetupInfo> {

	private String name;

	public MobileSetupInfoJsonSerializer() {
		this("MobileSetupInfo");
	}

	public MobileSetupInfoJsonSerializer(String name) {
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
	public IMobileSetupInfo readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IMobileSetupInfo object) {
		writer.openObject();
		writer.writeInt(object.getCount());
		writer.writeBoolean(object.getEnabled());
		writer.closeObject();
	}
}
