package com.turnengine.client.api.local.alliance;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class GetAllianceListXmlSerializer implements IXmlSerializer<IGetAllianceList> {

	private String name;

	public GetAllianceListXmlSerializer() {
		this("GetAllianceList");
	}

	public GetAllianceListXmlSerializer(String name) {
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
	public IGetAllianceList readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		int param2 = reader.readInt("instanceId");
		reader.endElement(getName());

		// Create the bean
		return new GetAllianceList(param1, param2);
	}

	@Override
	public void writeObject(IXmlWriter writer, IGetAllianceList object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.writeInt("instanceId", object.getInstanceId());
		writer.endElement(getName());
	}
}
