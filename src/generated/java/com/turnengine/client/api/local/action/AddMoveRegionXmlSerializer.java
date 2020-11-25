package com.turnengine.client.api.local.action;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.StringSerializer;

public class AddMoveRegionXmlSerializer implements IXmlSerializer<IAddMoveRegion> {

	private String name;

	public AddMoveRegionXmlSerializer() {
		this("AddMoveRegion");
	}

	public AddMoveRegionXmlSerializer(String name) {
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
	public IAddMoveRegion readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		int param2 = reader.readInt("instanceId");
		String param3 = reader.readObject(new StringSerializer("name"));
		int param4 = reader.readInt("from");
		int param5 = reader.readInt("to");
		reader.endElement(getName());

		// Create the bean
		return new AddMoveRegion(param1, param2, param3, param4, param5);
	}

	@Override
	public void writeObject(IXmlWriter writer, IAddMoveRegion object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.writeInt("instanceId", object.getInstanceId());
		writer.writeObject(object.getName(), new StringSerializer("name"));
		writer.writeInt("from", object.getFrom());
		writer.writeInt("to", object.getTo());
		writer.endElement(getName());
	}
}
