package com.turnengine.client.api.local.player;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.StringSerializer;

public class PlayerCreationDataJsonSerializer implements IJsonSerializer<IPlayerCreationData> {

	private String name;

	public PlayerCreationDataJsonSerializer() {
		this("PlayerCreationData");
	}

	public PlayerCreationDataJsonSerializer(String name) {
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
	public IPlayerCreationData readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IPlayerCreationData object) {
		writer.openObject();
		writer.writeInt(object.getId());
		writer.writeObject(object.getName(), new StringSerializer());
		writer.writeInt(object.getUserId());
		writer.writeInt(object.getFactionId());
		writer.writeInt(object.getAllianceId());
		writer.closeObject();
	}
}
