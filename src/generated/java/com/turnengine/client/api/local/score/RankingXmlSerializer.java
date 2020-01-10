package com.turnengine.client.api.local.score;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class RankingXmlSerializer implements IXmlSerializer<IRanking> {

	private String name;

	public RankingXmlSerializer() {
		this("Ranking");
	}

	public RankingXmlSerializer(String name) {
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
	public IRanking readObject(IXmlReader reader) {
		reader.startElement(getName());
		int param1 = reader.readInt("id");
		int param2 = reader.readInt("rank");
		long param3 = reader.readLong("score");
		reader.endElement(getName());

		// Create the bean
		return new Ranking(param1, param2, param3);
	}

	@Override
	public void writeObject(IXmlWriter writer, IRanking object) {
		writer.startElement(getName());
		writer.writeInt("id", object.getId());
		writer.writeInt("rank", object.getRank());
		writer.writeLong("score", object.getScore());
		writer.endElement(getName());
	}
}
