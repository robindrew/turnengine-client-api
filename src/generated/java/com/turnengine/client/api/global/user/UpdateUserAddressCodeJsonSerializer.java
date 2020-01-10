package com.turnengine.client.api.global.user;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.StringSerializer;

public class UpdateUserAddressCodeJsonSerializer implements IJsonSerializer<IUpdateUserAddressCode> {

	private String name;

	public UpdateUserAddressCodeJsonSerializer() {
		this("UpdateUserAddressCode");
	}

	public UpdateUserAddressCodeJsonSerializer(String name) {
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
	public IUpdateUserAddressCode readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IUpdateUserAddressCode object) {
		writer.openObject();
		writer.writeLong(object.getLoginId());
		writer.writeObject(object.getCode(), new StringSerializer());
		writer.closeObject();
	}
}
