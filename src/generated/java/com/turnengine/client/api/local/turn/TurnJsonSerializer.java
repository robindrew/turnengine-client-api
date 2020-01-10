package com.turnengine.client.api.local.turn;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class TurnJsonSerializer implements IJsonSerializer<ITurn> {

	private String name;

	public TurnJsonSerializer() {
		this("Turn");
	}

	public TurnJsonSerializer(String name) {
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
	public ITurn readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, ITurn object) {
		writer.openObject();
		writer.writeInt(object.getNumber());
		writer.writeLong(object.getTimestamp());
		writer.writeLong(object.getDuration());
		writer.closeObject();
	}
}
