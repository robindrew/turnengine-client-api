package com.turnengine.client.api.global.game;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.StringSerializer;

public class GetGameDefinitionsByGameNameJsonSerializer implements IJsonSerializer<IGetGameDefinitionsByGameName> {

	private String name;

	public GetGameDefinitionsByGameNameJsonSerializer() {
		this("GetGameDefinitionsByGameName");
	}

	public GetGameDefinitionsByGameNameJsonSerializer(String name) {
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
	public IGetGameDefinitionsByGameName readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IGetGameDefinitionsByGameName object) {
		writer.openObject();
		writer.writeObject(object.getGameName(), new StringSerializer());
		writer.closeObject();
	}
}
