package com.turnengine.client.api.global.common;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class GetGoogleOpenIdFormReturnTypeJsonSerializer implements IJsonSerializer<IOpenIdForm> {

	private String name;

	public GetGoogleOpenIdFormReturnTypeJsonSerializer() {
		this("GetGoogleOpenIdFormReturnType");
	}

	public GetGoogleOpenIdFormReturnTypeJsonSerializer(String name) {
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
	public IOpenIdForm readObject(IJsonReader reader) {
		return new OpenIdFormJsonSerializer().readObject(reader);
	}

	@Override
	public void writeObject(IJsonWriter writer, IOpenIdForm object) {
		new OpenIdFormJsonSerializer().writeObject(writer, object);
	}
}
