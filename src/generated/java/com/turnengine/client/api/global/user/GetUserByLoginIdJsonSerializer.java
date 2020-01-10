package com.turnengine.client.api.global.user;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class GetUserByLoginIdJsonSerializer implements IJsonSerializer<IGetUserByLoginId> {

	private String name;

	public GetUserByLoginIdJsonSerializer() {
		this("GetUserByLoginId");
	}

	public GetUserByLoginIdJsonSerializer(String name) {
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
	public IGetUserByLoginId readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IGetUserByLoginId object) {
		writer.openObject();
		writer.writeLong(object.getLoginId());
		writer.writeLong(object.getId());
		writer.closeObject();
	}
}
