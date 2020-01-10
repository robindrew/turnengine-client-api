package com.turnengine.client.api.local.location;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class GetLocationSetupInfoReturnTypeJsonSerializer implements IJsonSerializer<ILocationSetupInfo> {

	private String name;

	public GetLocationSetupInfoReturnTypeJsonSerializer() {
		this("GetLocationSetupInfoReturnType");
	}

	public GetLocationSetupInfoReturnTypeJsonSerializer(String name) {
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
		return new LocationSetupInfoJsonSerializer().readObject(reader);
	}

	@Override
	public void writeObject(IJsonWriter writer, ILocationSetupInfo object) {
		new LocationSetupInfoJsonSerializer().writeObject(writer, object);
	}
}
