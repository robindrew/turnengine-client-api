package com.turnengine.client.api.local.mobile;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class GetMobileSetupInfoReturnTypeJsonSerializer implements IJsonSerializer<IMobileSetupInfo> {

	private String name;

	public GetMobileSetupInfoReturnTypeJsonSerializer() {
		this("GetMobileSetupInfoReturnType");
	}

	public GetMobileSetupInfoReturnTypeJsonSerializer(String name) {
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
		return new MobileSetupInfoJsonSerializer().readObject(reader);
	}

	@Override
	public void writeObject(IJsonWriter writer, IMobileSetupInfo object) {
		new MobileSetupInfoJsonSerializer().writeObject(writer, object);
	}
}
