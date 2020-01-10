package com.turnengine.client.api.global.user;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class GetUserNamesJsonSerializer implements IJsonSerializer<IGetUserNames> {

	private String name;

	public GetUserNamesJsonSerializer() {
		this("GetUserNames");
	}

	public GetUserNamesJsonSerializer(String name) {
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
	public IGetUserNames readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IGetUserNames object) {
		writer.openObject();
		writer.writeLong(object.getLoginId());
		writer.closeObject();
	}
}
