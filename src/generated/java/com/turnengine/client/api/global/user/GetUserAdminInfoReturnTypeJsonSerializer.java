package com.turnengine.client.api.global.user;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class GetUserAdminInfoReturnTypeJsonSerializer implements IJsonSerializer<IUserAdminInfo> {

	private String name;

	public GetUserAdminInfoReturnTypeJsonSerializer() {
		this("GetUserAdminInfoReturnType");
	}

	public GetUserAdminInfoReturnTypeJsonSerializer(String name) {
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
		return new UserAdminInfoJsonSerializer().readObject(reader);
	}

	@Override
	public void writeObject(IJsonWriter writer, IUserAdminInfo object) {
		new UserAdminInfoJsonSerializer().writeObject(writer, object);
	}
}
