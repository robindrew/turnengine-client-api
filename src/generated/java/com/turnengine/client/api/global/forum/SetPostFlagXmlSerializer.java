package com.turnengine.client.api.global.forum;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.EnumSerializer;

public class SetPostFlagXmlSerializer implements IXmlSerializer<ISetPostFlag> {

	private String name;

	public SetPostFlagXmlSerializer() {
		this("SetPostFlag");
	}

	public SetPostFlagXmlSerializer(String name) {
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
	public ISetPostFlag readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		int param2 = reader.readInt("postId");
		ForumFlag param3 = reader.readObject(new EnumSerializer<ForumFlag>(ForumFlag.class, "flag"));
		boolean param4 = reader.readBoolean("set");
		reader.endElement(getName());

		// Create the bean
		return new SetPostFlag(param1, param2, param3, param4);
	}

	@Override
	public void writeObject(IXmlWriter writer, ISetPostFlag object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.writeInt("postId", object.getPostId());
		writer.writeObject(object.getFlag(), new EnumSerializer<ForumFlag>(ForumFlag.class, "flag"));
		writer.writeBoolean("set", object.getSet());
		writer.endElement(getName());
	}
}
