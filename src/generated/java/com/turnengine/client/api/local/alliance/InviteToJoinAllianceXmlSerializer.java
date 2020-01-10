package com.turnengine.client.api.local.alliance;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class InviteToJoinAllianceXmlSerializer implements IXmlSerializer<IInviteToJoinAlliance> {

	private String name;

	public InviteToJoinAllianceXmlSerializer() {
		this("InviteToJoinAlliance");
	}

	public InviteToJoinAllianceXmlSerializer(String name) {
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
	public IInviteToJoinAlliance readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		int param2 = reader.readInt("instanceId");
		int param3 = reader.readInt("playerId");
		reader.endElement(getName());

		// Create the bean
		return new InviteToJoinAlliance(param1, param2, param3);
	}

	@Override
	public void writeObject(IXmlWriter writer, IInviteToJoinAlliance object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.writeInt("instanceId", object.getInstanceId());
		writer.writeInt("playerId", object.getPlayerId());
		writer.endElement(getName());
	}
}
