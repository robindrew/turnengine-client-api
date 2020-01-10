package com.turnengine.client.api.local.alliance;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class SetAllianceInviteLimitXmlSerializer implements IXmlSerializer<ISetAllianceInviteLimit> {

	private String name;

	public SetAllianceInviteLimitXmlSerializer() {
		this("SetAllianceInviteLimit");
	}

	public SetAllianceInviteLimitXmlSerializer(String name) {
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
	public ISetAllianceInviteLimit readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		int param2 = reader.readInt("instanceId");
		int param3 = reader.readInt("limit");
		reader.endElement(getName());

		// Create the bean
		return new SetAllianceInviteLimit(param1, param2, param3);
	}

	@Override
	public void writeObject(IXmlWriter writer, ISetAllianceInviteLimit object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.writeInt("instanceId", object.getInstanceId());
		writer.writeInt("limit", object.getLimit());
		writer.endElement(getName());
	}
}
