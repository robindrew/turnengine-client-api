package com.turnengine.client.api.local.score;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class UnitScoreJsonSerializer implements IJsonSerializer<IUnitScore> {

	private String name;

	public UnitScoreJsonSerializer() {
		this("UnitScore");
	}

	public UnitScoreJsonSerializer(String name) {
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
	public IUnitScore readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IUnitScore object) {
		writer.openObject();
		writer.writeInt(object.getGroupId());
		writer.writeInt(object.getUnitId());
		writer.writeLong(object.getScore());
		writer.closeObject();
	}
}
