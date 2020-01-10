package com.turnengine.client.api.global.game;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class GetGameVersionsJsonSerializer implements IJsonSerializer<IGetGameVersions> {

	private String name;

	public GetGameVersionsJsonSerializer() {
		this("GetGameVersions");
	}

	public GetGameVersionsJsonSerializer(String name) {
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
	public IGetGameVersions readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IGetGameVersions object) {
		writer.openObject();
		writer.closeObject();
	}
}
