package com.turnengine.client.api.global.user;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.StringSerializer;

public class GetUserByNameJsonSerializer implements IJsonSerializer<IGetUserByName> {

	private String name;

	public GetUserByNameJsonSerializer() {
		this("GetUserByName");
	}

	public GetUserByNameJsonSerializer(String name) {
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
	public IGetUserByName readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IGetUserByName object) {
		writer.openObject();
		writer.writeLong(object.getLoginId());
		writer.writeObject(object.getName(), new StringSerializer());
		writer.closeObject();
	}
}
