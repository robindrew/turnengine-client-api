package com.turnengine.client.api.global.user;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class GetUserByIdJsonSerializer implements IJsonSerializer<IGetUserById> {

	private String name;

	public GetUserByIdJsonSerializer() {
		this("GetUserById");
	}

	public GetUserByIdJsonSerializer(String name) {
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
	public IGetUserById readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IGetUserById object) {
		writer.openObject();
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getId());
		writer.closeObject();
	}
}
