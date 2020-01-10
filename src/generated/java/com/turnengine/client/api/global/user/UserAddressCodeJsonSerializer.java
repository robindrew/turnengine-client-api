package com.turnengine.client.api.global.user;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.StringSerializer;
import com.turnengine.client.api.global.admin.AdminHostAddressJsonSerializer;
import com.turnengine.client.api.global.admin.IAdminHostAddress;

public class UserAddressCodeJsonSerializer implements IJsonSerializer<IUserAddressCode> {

	private String name;

	public UserAddressCodeJsonSerializer() {
		this("UserAddressCode");
	}

	public UserAddressCodeJsonSerializer(String name) {
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
	public IUserAddressCode readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IUserAddressCode object) {
		writer.openObject();
		writer.writeInt(object.getUserId());
		writer.writeObject(object.getCode(), new StringSerializer());
		writer.writeLong(object.getTimestamp());
		writer.writeObject(object.getDetail(), new AdminHostAddressJsonSerializer());
		writer.closeObject();
	}
}
