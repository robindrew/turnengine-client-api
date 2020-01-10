package com.turnengine.client.api.local.score;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class GroupScoreXmlSerializer implements IXmlSerializer<IGroupScore> {

	private String name;

	public GroupScoreXmlSerializer() {
		this("GroupScore");
	}

	public GroupScoreXmlSerializer(String name) {
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
	public IGroupScore readObject(IXmlReader reader) {
		reader.startElement(getName());
		int param1 = reader.readInt("groupId");
		long param2 = reader.readLong("score");
		reader.endElement(getName());

		// Create the bean
		return new GroupScore(param1, param2);
	}

	@Override
	public void writeObject(IXmlWriter writer, IGroupScore object) {
		writer.startElement(getName());
		writer.writeInt("groupId", object.getGroupId());
		writer.writeLong("score", object.getScore());
		writer.endElement(getName());
	}
}
