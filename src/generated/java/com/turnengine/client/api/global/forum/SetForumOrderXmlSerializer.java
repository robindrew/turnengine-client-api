package com.turnengine.client.api.global.forum;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class SetForumOrderXmlSerializer implements IXmlSerializer<ISetForumOrder> {

	private String name;

	public SetForumOrderXmlSerializer() {
		this("SetForumOrder");
	}

	public SetForumOrderXmlSerializer(String name) {
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
	public ISetForumOrder readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		int param2 = reader.readInt("forumId");
		int param3 = reader.readInt("order");
		reader.endElement(getName());

		// Create the bean
		return new SetForumOrder(param1, param2, param3);
	}

	@Override
	public void writeObject(IXmlWriter writer, ISetForumOrder object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.writeInt("forumId", object.getForumId());
		writer.writeInt("order", object.getOrder());
		writer.endElement(getName());
	}
}
