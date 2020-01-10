package com.turnengine.client.api.local.score;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class UnitScoreXmlSerializer implements IXmlSerializer<IUnitScore> {

	private String name;

	public UnitScoreXmlSerializer() {
		this("UnitScore");
	}

	public UnitScoreXmlSerializer(String name) {
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
	public IUnitScore readObject(IXmlReader reader) {
		reader.startElement(getName());
		int param1 = reader.readInt("groupId");
		int param2 = reader.readInt("unitId");
		long param3 = reader.readLong("score");
		reader.endElement(getName());

		// Create the bean
		return new UnitScore(param1, param2, param3);
	}

	@Override
	public void writeObject(IXmlWriter writer, IUnitScore object) {
		writer.startElement(getName());
		writer.writeInt("groupId", object.getGroupId());
		writer.writeInt("unitId", object.getUnitId());
		writer.writeLong("score", object.getScore());
		writer.endElement(getName());
	}
}
