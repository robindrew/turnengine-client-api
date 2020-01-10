package com.turnengine.client.api.local.alliance;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class RequestToJoinAllianceXmlSerializer implements IXmlSerializer<IRequestToJoinAlliance> {

	private String name;

	public RequestToJoinAllianceXmlSerializer() {
		this("RequestToJoinAlliance");
	}

	public RequestToJoinAllianceXmlSerializer(String name) {
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
	public IRequestToJoinAlliance readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		int param2 = reader.readInt("instanceId");
		int param3 = reader.readInt("allianceId");
		reader.endElement(getName());

		// Create the bean
		return new RequestToJoinAlliance(param1, param2, param3);
	}

	@Override
	public void writeObject(IXmlWriter writer, IRequestToJoinAlliance object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.writeInt("instanceId", object.getInstanceId());
		writer.writeInt("allianceId", object.getAllianceId());
		writer.endElement(getName());
	}
}
