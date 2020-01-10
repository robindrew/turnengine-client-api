package com.turnengine.client.api.global.user;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.StringSerializer;

public class SetUserAddressJsonSerializer implements IJsonSerializer<ISetUserAddress> {

	private String name;

	public SetUserAddressJsonSerializer() {
		this("SetUserAddress");
	}

	public SetUserAddressJsonSerializer(String name) {
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
	public ISetUserAddress readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, ISetUserAddress object) {
		writer.openObject();
		writer.writeInt(object.getId());
		writer.writeObject(object.getAddress(), new StringSerializer());
		writer.closeObject();
	}
}
