package com.turnengine.client.api.local.alliance;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.StringSerializer;

public class InviteToJoinAllianceByNameXmlSerializer implements IXmlSerializer<IInviteToJoinAllianceByName> {

	private String name;

	public InviteToJoinAllianceByNameXmlSerializer() {
		this("InviteToJoinAllianceByName");
	}

	public InviteToJoinAllianceByNameXmlSerializer(String name) {
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
	public IInviteToJoinAllianceByName readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		int param2 = reader.readInt("instanceId");
		String param3 = reader.readObject(new StringSerializer("playerName"));
		reader.endElement(getName());

		// Create the bean
		return new InviteToJoinAllianceByName(param1, param2, param3);
	}

	@Override
	public void writeObject(IXmlWriter writer, IInviteToJoinAllianceByName object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.writeInt("instanceId", object.getInstanceId());
		writer.writeObject(object.getPlayerName(), new StringSerializer("playerName"));
		writer.endElement(getName());
	}
}
