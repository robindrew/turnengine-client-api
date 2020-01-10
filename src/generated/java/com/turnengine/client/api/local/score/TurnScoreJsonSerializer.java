package com.turnengine.client.api.local.score;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class TurnScoreJsonSerializer implements IJsonSerializer<ITurnScore> {

	private String name;

	public TurnScoreJsonSerializer() {
		this("TurnScore");
	}

	public TurnScoreJsonSerializer(String name) {
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
	public ITurnScore readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, ITurnScore object) {
		writer.openObject();
		writer.writeInt(object.getTurn());
		writer.writeLong(object.getScore());
		writer.closeObject();
	}
}
