package com.turnengine.client.api.local.score;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class TurnScoreXmlSerializer implements IXmlSerializer<ITurnScore> {

	private String name;

	public TurnScoreXmlSerializer() {
		this("TurnScore");
	}

	public TurnScoreXmlSerializer(String name) {
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
	public ITurnScore readObject(IXmlReader reader) {
		reader.startElement(getName());
		int param1 = reader.readInt("turn");
		long param2 = reader.readLong("score");
		reader.endElement(getName());

		// Create the bean
		return new TurnScore(param1, param2);
	}

	@Override
	public void writeObject(IXmlWriter writer, ITurnScore object) {
		writer.startElement(getName());
		writer.writeInt("turn", object.getTurn());
		writer.writeLong("score", object.getScore());
		writer.endElement(getName());
	}
}
