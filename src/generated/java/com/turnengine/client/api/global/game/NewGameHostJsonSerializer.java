package com.turnengine.client.api.global.game;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.StringSerializer;

public class NewGameHostJsonSerializer implements IJsonSerializer<INewGameHost> {

	private String name;

	public NewGameHostJsonSerializer() {
		this("NewGameHost");
	}

	public NewGameHostJsonSerializer(String name) {
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
	public INewGameHost readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, INewGameHost object) {
		writer.openObject();
		writer.writeLong(object.getLoginId());
		writer.writeObject(object.getName(), new StringSerializer());
		writer.writeInt(object.getPort());
		writer.closeObject();
	}
}
