package com.turnengine.client.api.global.game;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.StringSerializer;

public class GetGameDefinitionByHostPortJsonSerializer implements IJsonSerializer<IGetGameDefinitionByHostPort> {

	private String name;

	public GetGameDefinitionByHostPortJsonSerializer() {
		this("GetGameDefinitionByHostPort");
	}

	public GetGameDefinitionByHostPortJsonSerializer(String name) {
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
	public IGetGameDefinitionByHostPort readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IGetGameDefinitionByHostPort object) {
		writer.openObject();
		writer.writeObject(object.getName(), new StringSerializer());
		writer.writeInt(object.getPort());
		writer.closeObject();
	}
}
