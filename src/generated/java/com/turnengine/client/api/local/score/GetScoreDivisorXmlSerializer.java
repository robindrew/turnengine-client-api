package com.turnengine.client.api.local.score;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class GetScoreDivisorXmlSerializer implements IXmlSerializer<IGetScoreDivisor> {

	private String name;

	public GetScoreDivisorXmlSerializer() {
		this("GetScoreDivisor");
	}

	public GetScoreDivisorXmlSerializer(String name) {
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
	public IGetScoreDivisor readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		int param2 = reader.readInt("instanceId");
		int param3 = reader.readInt("groupId");
		reader.endElement(getName());

		// Create the bean
		return new GetScoreDivisor(param1, param2, param3);
	}

	@Override
	public void writeObject(IXmlWriter writer, IGetScoreDivisor object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.writeInt("instanceId", object.getInstanceId());
		writer.writeInt("groupId", object.getGroupId());
		writer.endElement(getName());
	}
}
