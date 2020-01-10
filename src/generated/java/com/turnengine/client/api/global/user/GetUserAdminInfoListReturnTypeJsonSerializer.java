package com.turnengine.client.api.global.user;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.collection.ListSerializer;
import java.util.List;

public class GetUserAdminInfoListReturnTypeJsonSerializer implements IJsonSerializer<List<IUserAdminInfo>> {

	private String name;

	public GetUserAdminInfoListReturnTypeJsonSerializer() {
		this("GetUserAdminInfoListReturnType");
	}

	public GetUserAdminInfoListReturnTypeJsonSerializer(String name) {
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
	public List<IUserAdminInfo> readObject(IJsonReader reader) {
		return new ListSerializer<IUserAdminInfo>(new UserAdminInfoJsonSerializer()).readObject(reader);
	}

	@Override
	public void writeObject(IJsonWriter writer, List<IUserAdminInfo> object) {
		new ListSerializer<IUserAdminInfo>(new UserAdminInfoJsonSerializer()).writeObject(writer, object);
	}
}
