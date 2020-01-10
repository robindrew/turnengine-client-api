package com.turnengine.client.api.local.score;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.StringSerializer;

public class SetUnitScoreJsonSerializer implements IJsonSerializer<ISetUnitScore> {

	private String name;

	public SetUnitScoreJsonSerializer() {
		this("SetUnitScore");
	}

	public SetUnitScoreJsonSerializer(String name) {
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
	public ISetUnitScore readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, ISetUnitScore object) {
		writer.openObject();
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeObject(object.getGroup(), new StringSerializer());
		writer.writeObject(object.getUnit(), new StringSerializer());
		writer.writeLong(object.getScore());
		writer.closeObject();
	}
}
