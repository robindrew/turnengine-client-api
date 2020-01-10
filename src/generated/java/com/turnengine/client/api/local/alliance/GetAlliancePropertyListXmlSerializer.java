package com.turnengine.client.api.local.alliance;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class GetAlliancePropertyListXmlSerializer implements IXmlSerializer<IGetAlliancePropertyList> {

	private String name;

	public GetAlliancePropertyListXmlSerializer() {
		this("GetAlliancePropertyList");
	}

	public GetAlliancePropertyListXmlSerializer(String name) {
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
	public IGetAlliancePropertyList readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		int param2 = reader.readInt("instanceId");
		int param3 = reader.readInt("allianceId");
		reader.endElement(getName());

		// Create the bean
		return new GetAlliancePropertyList(param1, param2, param3);
	}

	@Override
	public void writeObject(IXmlWriter writer, IGetAlliancePropertyList object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.writeInt("instanceId", object.getInstanceId());
		writer.writeInt("allianceId", object.getAllianceId());
		writer.endElement(getName());
	}
}
