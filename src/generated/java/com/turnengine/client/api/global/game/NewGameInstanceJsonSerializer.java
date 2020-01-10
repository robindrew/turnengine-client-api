package com.turnengine.client.api.global.game;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.StringSerializer;

public class NewGameInstanceJsonSerializer implements IJsonSerializer<INewGameInstance> {

	private String name;

	public NewGameInstanceJsonSerializer() {
		this("NewGameInstance");
	}

	public NewGameInstanceJsonSerializer(String name) {
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
	public INewGameInstance readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, INewGameInstance object) {
		writer.openObject();
		writer.writeLong(object.getLoginId());
		writer.writeObject(object.getGameName(), new StringSerializer());
		writer.writeObject(object.getVersionName(), new StringSerializer());
		writer.writeObject(object.getInstanceName(), new StringSerializer());
		writer.writeInt(object.getHostId());
		writer.closeObject();
	}
}
