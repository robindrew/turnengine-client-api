package com.turnengine.client.api.global.game;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.StringSerializer;

public class GetGameHostByNameJsonSerializer implements IJsonSerializer<IGetGameHostByName> {

	private String name;

	public GetGameHostByNameJsonSerializer() {
		this("GetGameHostByName");
	}

	public GetGameHostByNameJsonSerializer(String name) {
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
	public IGetGameHostByName readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IGetGameHostByName object) {
		writer.openObject();
		writer.writeObject(object.getName(), new StringSerializer());
		writer.writeInt(object.getPort());
		writer.closeObject();
	}
}
