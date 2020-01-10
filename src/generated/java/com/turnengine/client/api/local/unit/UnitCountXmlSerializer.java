package com.turnengine.client.api.local.unit;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class UnitCountXmlSerializer implements IXmlSerializer<IUnitCount> {

	private String name;

	public UnitCountXmlSerializer() {
		this("UnitCount");
	}

	public UnitCountXmlSerializer(String name) {
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
	public IUnitCount readObject(IXmlReader reader) {
		reader.startElement(getName());
		int param1 = reader.readInt("id");
		long param2 = reader.readLong("amount");
		reader.endElement(getName());

		// Create the bean
		return new UnitCount(param1, param2);
	}

	@Override
	public void writeObject(IXmlWriter writer, IUnitCount object) {
		writer.startElement(getName());
		writer.writeInt("id", object.getId());
		writer.writeLong("amount", object.getAmount());
		writer.endElement(getName());
	}
}
