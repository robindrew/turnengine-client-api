package com.turnengine.client.api.global.admin;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.StringSerializer;

public class GetAdminHostAddressJsonSerializer implements IJsonSerializer<IGetAdminHostAddress> {

	private String name;

	public GetAdminHostAddressJsonSerializer() {
		this("GetAdminHostAddress");
	}

	public GetAdminHostAddressJsonSerializer(String name) {
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
	public IGetAdminHostAddress readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IGetAdminHostAddress object) {
		writer.openObject();
		writer.writeObject(object.getCode(), new StringSerializer());
		writer.closeObject();
	}
}
