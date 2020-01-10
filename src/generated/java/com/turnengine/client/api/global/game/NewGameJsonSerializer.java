package com.turnengine.client.api.global.game;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.StringSerializer;

public class NewGameJsonSerializer implements IJsonSerializer<INewGame> {

	private String name;

	public NewGameJsonSerializer() {
		this("NewGame");
	}

	public NewGameJsonSerializer(String name) {
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
	public INewGame readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, INewGame object) {
		writer.openObject();
		writer.writeLong(object.getLoginId());
		writer.writeObject(object.getName(), new StringSerializer());
		writer.closeObject();
	}
}
