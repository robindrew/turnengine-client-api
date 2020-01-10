package com.turnengine.client.api.local.alliance;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class AllianceSetupInfoXmlSerializer implements IXmlSerializer<IAllianceSetupInfo> {

	private String name;

	public AllianceSetupInfoXmlSerializer() {
		this("AllianceSetupInfo");
	}

	public AllianceSetupInfoXmlSerializer(String name) {
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
	public IAllianceSetupInfo readObject(IXmlReader reader) {
		reader.startElement(getName());
		int param1 = reader.readInt("count");
		boolean param2 = reader.readBoolean("enabled");
		int param3 = reader.readInt("memberLimit");
		int param4 = reader.readInt("inviteLimit");
		int param5 = reader.readInt("leaveTurns");
		reader.endElement(getName());

		// Create the bean
		return new AllianceSetupInfo(param1, param2, param3, param4, param5);
	}

	@Override
	public void writeObject(IXmlWriter writer, IAllianceSetupInfo object) {
		writer.startElement(getName());
		writer.writeInt("count", object.getCount());
		writer.writeBoolean("enabled", object.getEnabled());
		writer.writeInt("memberLimit", object.getMemberLimit());
		writer.writeInt("inviteLimit", object.getInviteLimit());
		writer.writeInt("leaveTurns", object.getLeaveTurns());
		writer.endElement(getName());
	}
}
