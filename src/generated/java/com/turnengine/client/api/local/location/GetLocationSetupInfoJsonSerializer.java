package com.turnengine.client.api.local.location;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class GetLocationSetupInfoJsonSerializer implements IJsonSerializer<IGetLocationSetupInfo> {

	private String name;

	public GetLocationSetupInfoJsonSerializer() {
		this("GetLocationSetupInfo");
	}

	public GetLocationSetupInfoJsonSerializer(String name) {
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
	public IGetLocationSetupInfo readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IGetLocationSetupInfo object) {
		writer.openObject();
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.closeObject();
	}
}
