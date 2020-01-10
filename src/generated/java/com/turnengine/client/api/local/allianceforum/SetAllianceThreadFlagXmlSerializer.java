package com.turnengine.client.api.local.allianceforum;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.EnumSerializer;
import com.turnengine.client.api.global.forum.ForumFlag;

public class SetAllianceThreadFlagXmlSerializer implements IXmlSerializer<ISetAllianceThreadFlag> {

	private String name;

	public SetAllianceThreadFlagXmlSerializer() {
		this("SetAllianceThreadFlag");
	}

	public SetAllianceThreadFlagXmlSerializer(String name) {
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
	public ISetAllianceThreadFlag readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		int param2 = reader.readInt("instanceId");
		int param3 = reader.readInt("threadId");
		ForumFlag param4 = reader.readObject(new EnumSerializer<ForumFlag>(ForumFlag.class, "flag"));
		boolean param5 = reader.readBoolean("set");
		reader.endElement(getName());

		// Create the bean
		return new SetAllianceThreadFlag(param1, param2, param3, param4, param5);
	}

	@Override
	public void writeObject(IXmlWriter writer, ISetAllianceThreadFlag object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.writeInt("instanceId", object.getInstanceId());
		writer.writeInt("threadId", object.getThreadId());
		writer.writeObject(object.getFlag(), new EnumSerializer<ForumFlag>(ForumFlag.class, "flag"));
		writer.writeBoolean("set", object.getSet());
		writer.endElement(getName());
	}
}
