package com.turnengine.client.api.local.alliance;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.StringSerializer;

public class RequestToJoinAllianceByNameXmlSerializer implements IXmlSerializer<IRequestToJoinAllianceByName> {

	private String name;

	public RequestToJoinAllianceByNameXmlSerializer() {
		this("RequestToJoinAllianceByName");
	}

	public RequestToJoinAllianceByNameXmlSerializer(String name) {
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
	public IRequestToJoinAllianceByName readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		int param2 = reader.readInt("instanceId");
		String param3 = reader.readObject(new StringSerializer("allianceName"));
		reader.endElement(getName());

		// Create the bean
		return new RequestToJoinAllianceByName(param1, param2, param3);
	}

	@Override
	public void writeObject(IXmlWriter writer, IRequestToJoinAllianceByName object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.writeInt("instanceId", object.getInstanceId());
		writer.writeObject(object.getAllianceName(), new StringSerializer("allianceName"));
		writer.endElement(getName());
	}
}
