package com.turnengine.client.api.local.allianceforum;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.EnumSerializer;
import com.turnengine.client.api.global.forum.ForumFlag;

public class SetAlliancePostFlagXmlSerializer implements IXmlSerializer<ISetAlliancePostFlag> {

	private String name;

	public SetAlliancePostFlagXmlSerializer() {
		this("SetAlliancePostFlag");
	}

	public SetAlliancePostFlagXmlSerializer(String name) {
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
	public ISetAlliancePostFlag readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		int param2 = reader.readInt("instanceId");
		int param3 = reader.readInt("postId");
		ForumFlag param4 = reader.readObject(new EnumSerializer<ForumFlag>(ForumFlag.class, "flag"));
		boolean param5 = reader.readBoolean("set");
		reader.endElement(getName());

		// Create the bean
		return new SetAlliancePostFlag(param1, param2, param3, param4, param5);
	}

	@Override
	public void writeObject(IXmlWriter writer, ISetAlliancePostFlag object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.writeInt("instanceId", object.getInstanceId());
		writer.writeInt("postId", object.getPostId());
		writer.writeObject(object.getFlag(), new EnumSerializer<ForumFlag>(ForumFlag.class, "flag"));
		writer.writeBoolean("set", object.getSet());
		writer.endElement(getName());
	}
}
