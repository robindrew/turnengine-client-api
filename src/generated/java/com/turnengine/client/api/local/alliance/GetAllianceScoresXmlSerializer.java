package com.turnengine.client.api.local.alliance;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class GetAllianceScoresXmlSerializer implements IXmlSerializer<IGetAllianceScores> {

	private String name;

	public GetAllianceScoresXmlSerializer() {
		this("GetAllianceScores");
	}

	public GetAllianceScoresXmlSerializer(String name) {
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
	public IGetAllianceScores readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		int param2 = reader.readInt("instanceId");
		int param3 = reader.readInt("allianceId");
		int param4 = reader.readInt("groupId");
		int param5 = reader.readInt("maxSize");
		int param6 = reader.readInt("minTurn");
		int param7 = reader.readInt("maxTurn");
		reader.endElement(getName());

		// Create the bean
		return new GetAllianceScores(param1, param2, param3, param4, param5, param6, param7);
	}

	@Override
	public void writeObject(IXmlWriter writer, IGetAllianceScores object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.writeInt("instanceId", object.getInstanceId());
		writer.writeInt("allianceId", object.getAllianceId());
		writer.writeInt("groupId", object.getGroupId());
		writer.writeInt("maxSize", object.getMaxSize());
		writer.writeInt("minTurn", object.getMinTurn());
		writer.writeInt("maxTurn", object.getMaxTurn());
		writer.endElement(getName());
	}
}
