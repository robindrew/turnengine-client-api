package com.turnengine.client.api.local.group;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.StringSerializer;

public class GroupXmlSerializer implements IXmlSerializer<IGroup> {

	private String name;

	public GroupXmlSerializer() {
		this("Group");
	}

	public GroupXmlSerializer(String name) {
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
	public IGroup readObject(IXmlReader reader) {
		reader.startElement(getName());
		int param1 = reader.readInt("id");
		String param2 = reader.readObject(new StringSerializer("name"));
		int param3 = reader.readInt("factionId");
		int param4 = reader.readInt("parentId");
		reader.endElement(getName());

		// Create the bean
		return new Group(param1, param2, param3, param4);
	}

	@Override
	public void writeObject(IXmlWriter writer, IGroup object) {
		writer.startElement(getName());
		writer.writeInt("id", object.getId());
		writer.writeObject(object.getName(), new StringSerializer("name"));
		writer.writeInt("factionId", object.getFactionId());
		writer.writeInt("parentId", object.getParentId());
		writer.endElement(getName());
	}
}
