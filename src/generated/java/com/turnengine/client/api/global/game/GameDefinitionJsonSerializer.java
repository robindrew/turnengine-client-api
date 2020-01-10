package com.turnengine.client.api.global.game;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class GameDefinitionJsonSerializer implements IJsonSerializer<IGameDefinition> {

	private String name;

	public GameDefinitionJsonSerializer() {
		this("GameDefinition");
	}

	public GameDefinitionJsonSerializer(String name) {
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
	public IGameDefinition readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IGameDefinition object) {
		writer.openObject();
		writer.writeObject(object.getGame(), new GameJsonSerializer());
		writer.writeObject(object.getVersion(), new GameVersionJsonSerializer());
		writer.writeObject(object.getInstance(), new GameInstanceJsonSerializer());
		writer.writeObject(object.getHost(), new GameHostJsonSerializer());
		writer.closeObject();
	}
}
