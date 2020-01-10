package com.turnengine.client.api.local.mobile;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class GetMobileReturnTypeJsonSerializer implements IJsonSerializer<IMobile> {

	private String name;

	public GetMobileReturnTypeJsonSerializer() {
		this("GetMobileReturnType");
	}

	public GetMobileReturnTypeJsonSerializer(String name) {
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
	public IMobile readObject(IJsonReader reader) {
		return new MobileJsonSerializer().readObject(reader);
	}

	@Override
	public void writeObject(IJsonWriter writer, IMobile object) {
		new MobileJsonSerializer().writeObject(writer, object);
	}
}
