package com.turnengine.client.api.local.player;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.StringSerializer;

public class PlayerPropertyJsonSerializer implements IJsonSerializer<IPlayerProperty> {

	private String name;

	public PlayerPropertyJsonSerializer() {
		this("PlayerProperty");
	}

	public PlayerPropertyJsonSerializer(String name) {
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
	public IPlayerProperty readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IPlayerProperty object) {
		writer.openObject();
		writer.writeInt(object.getPlayerId());
		writer.writeObject(object.getKey(), new StringSerializer());
		writer.writeObject(object.getValue(), new StringSerializer());
		writer.closeObject();
	}
}
