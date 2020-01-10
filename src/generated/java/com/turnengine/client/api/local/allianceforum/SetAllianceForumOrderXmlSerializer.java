package com.turnengine.client.api.local.allianceforum;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class SetAllianceForumOrderXmlSerializer implements IXmlSerializer<ISetAllianceForumOrder> {

	private String name;

	public SetAllianceForumOrderXmlSerializer() {
		this("SetAllianceForumOrder");
	}

	public SetAllianceForumOrderXmlSerializer(String name) {
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
	public ISetAllianceForumOrder readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		int param2 = reader.readInt("instanceId");
		int param3 = reader.readInt("forumId");
		int param4 = reader.readInt("order");
		reader.endElement(getName());

		// Create the bean
		return new SetAllianceForumOrder(param1, param2, param3, param4);
	}

	@Override
	public void writeObject(IXmlWriter writer, ISetAllianceForumOrder object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.writeInt("instanceId", object.getInstanceId());
		writer.writeInt("forumId", object.getForumId());
		writer.writeInt("order", object.getOrder());
		writer.endElement(getName());
	}
}
