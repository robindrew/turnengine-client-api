package com.turnengine.client.api.global.game;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.StringSerializer;

public class GameInstanceJsonSerializer implements IJsonSerializer<IGameInstance> {

	private String name;

	public GameInstanceJsonSerializer() {
		this("GameInstance");
	}

	public GameInstanceJsonSerializer(String name) {
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
	public IGameInstance readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IGameInstance object) {
		writer.openObject();
		writer.writeInt(object.getId());
		writer.writeObject(object.getName(), new StringSerializer());
		writer.writeInt(object.getGameId());
		writer.writeInt(object.getVersionId());
		writer.writeInt(object.getHostId());
		writer.closeObject();
	}
}
