package com.turnengine.client.api.global.game;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.StringSerializer;

public class NewGameVersionJsonSerializer implements IJsonSerializer<INewGameVersion> {

	private String name;

	public NewGameVersionJsonSerializer() {
		this("NewGameVersion");
	}

	public NewGameVersionJsonSerializer(String name) {
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
	public INewGameVersion readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, INewGameVersion object) {
		writer.openObject();
		writer.writeLong(object.getLoginId());
		writer.writeObject(object.getGameName(), new StringSerializer());
		writer.writeObject(object.getVersionName(), new StringSerializer());
		writer.closeObject();
	}
}
