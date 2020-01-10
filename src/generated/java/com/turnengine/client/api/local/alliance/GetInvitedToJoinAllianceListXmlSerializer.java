package com.turnengine.client.api.local.alliance;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class GetInvitedToJoinAllianceListXmlSerializer implements IXmlSerializer<IGetInvitedToJoinAllianceList> {

	private String name;

	public GetInvitedToJoinAllianceListXmlSerializer() {
		this("GetInvitedToJoinAllianceList");
	}

	public GetInvitedToJoinAllianceListXmlSerializer(String name) {
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
	public IGetInvitedToJoinAllianceList readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		int param2 = reader.readInt("instanceId");
		reader.endElement(getName());

		// Create the bean
		return new GetInvitedToJoinAllianceList(param1, param2);
	}

	@Override
	public void writeObject(IXmlWriter writer, IGetInvitedToJoinAllianceList object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.writeInt("instanceId", object.getInstanceId());
		writer.endElement(getName());
	}
}
