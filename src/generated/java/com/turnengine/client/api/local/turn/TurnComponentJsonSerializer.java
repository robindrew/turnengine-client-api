package com.turnengine.client.api.local.turn;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.StringSerializer;

public class TurnComponentJsonSerializer implements IJsonSerializer<ITurnComponent> {

	private String name;

	public TurnComponentJsonSerializer() {
		this("TurnComponent");
	}

	public TurnComponentJsonSerializer(String name) {
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
	public ITurnComponent readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, ITurnComponent object) {
		writer.openObject();
		writer.writeObject(object.getName(), new StringSerializer());
		writer.writeLong(object.getDuration());
		writer.closeObject();
	}
}
