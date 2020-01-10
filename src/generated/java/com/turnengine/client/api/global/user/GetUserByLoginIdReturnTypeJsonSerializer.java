package com.turnengine.client.api.global.user;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class GetUserByLoginIdReturnTypeJsonSerializer implements IJsonSerializer<IUser> {

	private String name;

	public GetUserByLoginIdReturnTypeJsonSerializer() {
		this("GetUserByLoginIdReturnType");
	}

	public GetUserByLoginIdReturnTypeJsonSerializer(String name) {
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
	public IUser readObject(IJsonReader reader) {
		return new UserJsonSerializer().readObject(reader);
	}

	@Override
	public void writeObject(IJsonWriter writer, IUser object) {
		new UserJsonSerializer().writeObject(writer, object);
	}
}
