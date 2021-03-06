package com.turnengine.client.api.global.game;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class GetGameHostByIdJsonSerializer implements IJsonSerializer<IGetGameHostById> {

	private String name;

	public GetGameHostByIdJsonSerializer() {
		this("GetGameHostById");
	}

	public GetGameHostByIdJsonSerializer(String name) {
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
	public IGetGameHostById readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IGetGameHostById object) {
		writer.openObject();
		writer.writeInt(object.getId());
		writer.closeObject();
	}
}
