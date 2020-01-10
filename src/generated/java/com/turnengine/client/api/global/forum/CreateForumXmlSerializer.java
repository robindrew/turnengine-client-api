package com.turnengine.client.api.global.forum;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.StringSerializer;

public class CreateForumXmlSerializer implements IXmlSerializer<ICreateForum> {

	private String name;

	public CreateForumXmlSerializer() {
		this("CreateForum");
	}

	public CreateForumXmlSerializer(String name) {
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
	public ICreateForum readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		String param2 = reader.readObject(new StringSerializer("name"));
		int param3 = reader.readInt("parent");
		reader.endElement(getName());

		// Create the bean
		return new CreateForum(param1, param2, param3);
	}

	@Override
	public void writeObject(IXmlWriter writer, ICreateForum object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.writeObject(object.getName(), new StringSerializer("name"));
		writer.writeInt("parent", object.getParent());
		writer.endElement(getName());
	}
}
