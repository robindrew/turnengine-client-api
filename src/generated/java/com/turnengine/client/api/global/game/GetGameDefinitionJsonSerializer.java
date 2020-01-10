package com.turnengine.client.api.global.game;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class GetGameDefinitionJsonSerializer implements IJsonSerializer<IGetGameDefinition> {

	private String name;

	public GetGameDefinitionJsonSerializer() {
		this("GetGameDefinition");
	}

	public GetGameDefinitionJsonSerializer(String name) {
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
	public IGetGameDefinition readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IGetGameDefinition object) {
		writer.openObject();
		writer.writeInt(object.getInstanceId());
		writer.closeObject();
	}
}
