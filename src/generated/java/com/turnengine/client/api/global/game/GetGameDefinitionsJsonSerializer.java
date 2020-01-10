package com.turnengine.client.api.global.game;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class GetGameDefinitionsJsonSerializer implements IJsonSerializer<IGetGameDefinitions> {

	private String name;

	public GetGameDefinitionsJsonSerializer() {
		this("GetGameDefinitions");
	}

	public GetGameDefinitionsJsonSerializer(String name) {
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
	public IGetGameDefinitions readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IGetGameDefinitions object) {
		writer.openObject();
		writer.closeObject();
	}
}
