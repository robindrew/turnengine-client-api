package com.turnengine.client.api.local.group;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.StringSerializer;

public class AddChildGroupXmlSerializer implements IXmlSerializer<IAddChildGroup> {

	private String name;

	public AddChildGroupXmlSerializer() {
		this("AddChildGroup");
	}

	public AddChildGroupXmlSerializer(String name) {
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
	public IAddChildGroup readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		int param2 = reader.readInt("instanceId");
		String param3 = reader.readObject(new StringSerializer("name"));
		String param4 = reader.readObject(new StringSerializer("parentName"));
		String param5 = reader.readObject(new StringSerializer("factionName"));
		reader.endElement(getName());

		// Create the bean
		return new AddChildGroup(param1, param2, param3, param4, param5);
	}

	@Override
	public void writeObject(IXmlWriter writer, IAddChildGroup object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.writeInt("instanceId", object.getInstanceId());
		writer.writeObject(object.getName(), new StringSerializer("name"));
		writer.writeObject(object.getParentName(), new StringSerializer("parentName"));
		writer.writeObject(object.getFactionName(), new StringSerializer("factionName"));
		writer.endElement(getName());
	}
}
