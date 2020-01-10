package com.turnengine.client.api.global.user;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.collection.ListSerializer;
import java.util.List;

public class UserAdminInfoJsonSerializer implements IJsonSerializer<IUserAdminInfo> {

	private String name;

	public UserAdminInfoJsonSerializer() {
		this("UserAdminInfo");
	}

	public UserAdminInfoJsonSerializer(String name) {
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
	public IUserAdminInfo readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IUserAdminInfo object) {
		writer.openObject();
		writer.writeObject(object.getUser(), new UserJsonSerializer());
		writer.writeObject(object.getAddresses(), new ListSerializer<IUserAddressCode>(new UserAddressCodeJsonSerializer()));
		writer.closeObject();
	}
}
