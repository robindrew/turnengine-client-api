package com.turnengine.client.api.global.user;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.collection.ListSerializer;
import java.util.List;

public class GetUserListReturnTypeJsonSerializer implements IJsonSerializer<List<IUser>> {

	private String name;

	public GetUserListReturnTypeJsonSerializer() {
		this("GetUserListReturnType");
	}

	public GetUserListReturnTypeJsonSerializer(String name) {
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
	public List<IUser> readObject(IJsonReader reader) {
		return new ListSerializer<IUser>(new UserJsonSerializer()).readObject(reader);
	}

	@Override
	public void writeObject(IJsonWriter writer, List<IUser> object) {
		new ListSerializer<IUser>(new UserJsonSerializer()).writeObject(writer, object);
	}
}
