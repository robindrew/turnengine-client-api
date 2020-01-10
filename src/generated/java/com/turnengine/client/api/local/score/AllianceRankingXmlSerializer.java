package com.turnengine.client.api.local.score;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.turnengine.client.api.local.alliance.AllianceInfoXmlSerializer;
import com.turnengine.client.api.local.alliance.IAllianceInfo;

public class AllianceRankingXmlSerializer implements IXmlSerializer<IAllianceRanking> {

	private String name;

	public AllianceRankingXmlSerializer() {
		this("AllianceRanking");
	}

	public AllianceRankingXmlSerializer(String name) {
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
	public IAllianceRanking readObject(IXmlReader reader) {
		reader.startElement(getName());
		IAllianceInfo param1 = reader.readObject(new AllianceInfoXmlSerializer("alliance"));
		int param2 = reader.readInt("rank");
		long param3 = reader.readLong("score");
		reader.endElement(getName());

		// Create the bean
		return new AllianceRanking(param1, param2, param3);
	}

	@Override
	public void writeObject(IXmlWriter writer, IAllianceRanking object) {
		writer.startElement(getName());
		writer.writeObject(object.getAlliance(), new AllianceInfoXmlSerializer("alliance"));
		writer.writeInt("rank", object.getRank());
		writer.writeLong("score", object.getScore());
		writer.endElement(getName());
	}
}
