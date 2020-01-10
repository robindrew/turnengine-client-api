package com.turnengine.client.api.local.score;

import com.robindrew.codegenerator.api.serializer.json.IJsonReader;
import com.robindrew.codegenerator.api.serializer.json.IJsonSerializer;
import com.robindrew.codegenerator.api.serializer.json.IJsonWriter;

public class GroupScoreJsonSerializer implements IJsonSerializer<IGroupScore> {

	private String name;

	public GroupScoreJsonSerializer() {
		this("GroupScore");
	}

	public GroupScoreJsonSerializer(String name) {
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
	public IGroupScore readObject(IJsonReader reader) {
		throw new UnsupportedOperationException("readObject");
	}

	@Override
	public void writeObject(IJsonWriter writer, IGroupScore object) {
		writer.openObject();
		writer.writeInt(object.getGroupId());
		writer.writeLong(object.getScore());
		writer.closeObject();
	}
}
