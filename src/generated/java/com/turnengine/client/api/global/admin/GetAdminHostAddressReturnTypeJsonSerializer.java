package com.turnengine.client.api.global.admin;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class GetAdminHostAddressReturnTypeJsonSerializer implements IJsonSerializer<IAdminHostAddress> {

	private String name;

	public GetAdminHostAddressReturnTypeJsonSerializer() {
		this("GetAdminHostAddressReturnType");
	}

	public GetAdminHostAddressReturnTypeJsonSerializer(String name) {
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
	public IAdminHostAddress readObject(IJsonReader reader) {
		return new AdminHostAddressJsonSerializer().readObject(reader);
	}

	@Override
	public void writeObject(IJsonWriter writer, IAdminHostAddress object) {
		new AdminHostAddressJsonSerializer().writeObject(writer, object);
	}
}
