package com.turnengine.client.api.local.score;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;
import com.robindrew.codegenerator.api.serializer.json.serializer.lang.StringSerializer;

public class SetScoreUpdaterGroupJsonSerializer implements IJsonSerializer<ISetScoreUpdaterGroup> {

	private String name;

	public SetScoreUpdaterGroupJsonSerializer() {
		this("SetScoreUpdaterGroup");
	}

	public SetScoreUpdaterGroupJsonSerializer(String name) {
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
	public ISetScoreUpdaterGroup readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, ISetScoreUpdaterGroup object) {
		writer.openObject();
		writer.writeLong(object.getLoginId());
		writer.writeInt(object.getInstanceId());
		writer.writeObject(object.getGroup(), new StringSerializer());
		writer.closeObject();
	}
}
