package com.turnengine.client.api.local.score;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class GetUnitScoreXmlSerializer implements IXmlSerializer<IGetUnitScore> {

	private String name;

	public GetUnitScoreXmlSerializer() {
		this("GetUnitScore");
	}

	public GetUnitScoreXmlSerializer(String name) {
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
	public IGetUnitScore readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		int param2 = reader.readInt("instanceId");
		int param3 = reader.readInt("groupId");
		int param4 = reader.readInt("unitId");
		reader.endElement(getName());

		// Create the bean
		return new GetUnitScore(param1, param2, param3, param4);
	}

	@Override
	public void writeObject(IXmlWriter writer, IGetUnitScore object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.writeInt("instanceId", object.getInstanceId());
		writer.writeInt("groupId", object.getGroupId());
		writer.writeInt("unitId", object.getUnitId());
		writer.endElement(getName());
	}
}
