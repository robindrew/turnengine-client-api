package com.turnengine.client.api.global.forum;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.EnumSerializer;

public class SetThreadFlagXmlSerializer implements IXmlSerializer<ISetThreadFlag> {

	private String name;

	public SetThreadFlagXmlSerializer() {
		this("SetThreadFlag");
	}

	public SetThreadFlagXmlSerializer(String name) {
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
	public ISetThreadFlag readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		int param2 = reader.readInt("threadId");
		ForumFlag param3 = reader.readObject(new EnumSerializer<ForumFlag>(ForumFlag.class, "flag"));
		boolean param4 = reader.readBoolean("set");
		reader.endElement(getName());

		// Create the bean
		return new SetThreadFlag(param1, param2, param3, param4);
	}

	@Override
	public void writeObject(IXmlWriter writer, ISetThreadFlag object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.writeInt("threadId", object.getThreadId());
		writer.writeObject(object.getFlag(), new EnumSerializer<ForumFlag>(ForumFlag.class, "flag"));
		writer.writeBoolean("set", object.getSet());
		writer.endElement(getName());
	}
}
