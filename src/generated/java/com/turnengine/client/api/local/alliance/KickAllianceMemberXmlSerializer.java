package com.turnengine.client.api.local.alliance;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class KickAllianceMemberXmlSerializer implements IXmlSerializer<IKickAllianceMember> {

	private String name;

	public KickAllianceMemberXmlSerializer() {
		this("KickAllianceMember");
	}

	public KickAllianceMemberXmlSerializer(String name) {
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
	public IKickAllianceMember readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		int param2 = reader.readInt("instanceId");
		int param3 = reader.readInt("playerId");
		reader.endElement(getName());

		// Create the bean
		return new KickAllianceMember(param1, param2, param3);
	}

	@Override
	public void writeObject(IXmlWriter writer, IKickAllianceMember object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.writeInt("instanceId", object.getInstanceId());
		writer.writeInt("playerId", object.getPlayerId());
		writer.endElement(getName());
	}
}
