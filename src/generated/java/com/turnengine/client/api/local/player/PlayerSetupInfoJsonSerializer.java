package com.turnengine.client.api.local.player;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class PlayerSetupInfoJsonSerializer implements IJsonSerializer<IPlayerSetupInfo> {

	private String name;

	public PlayerSetupInfoJsonSerializer() {
		this("PlayerSetupInfo");
	}

	public PlayerSetupInfoJsonSerializer(String name) {
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
	public IPlayerSetupInfo readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IPlayerSetupInfo object) {
		writer.openObject();
		writer.writeInt(object.getCount());
		writer.writeInt(object.getLimit());
		writer.writeBoolean(object.getSignupsEnabled());
		writer.closeObject();
	}
}
