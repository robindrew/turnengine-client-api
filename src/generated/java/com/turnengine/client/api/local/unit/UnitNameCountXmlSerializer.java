package com.turnengine.client.api.local.unit;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.StringSerializer;

public class UnitNameCountXmlSerializer implements IXmlSerializer<IUnitNameCount> {

	private String name;

	public UnitNameCountXmlSerializer() {
		this("UnitNameCount");
	}

	public UnitNameCountXmlSerializer(String name) {
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
	public IUnitNameCount readObject(IXmlReader reader) {
		reader.startElement(getName());
		String param1 = reader.readObject(new StringSerializer("name"));
		long param2 = reader.readLong("amount");
		reader.endElement(getName());

		// Create the bean
		return new UnitNameCount(param1, param2);
	}

	@Override
	public void writeObject(IXmlWriter writer, IUnitNameCount object) {
		writer.startElement(getName());
		writer.writeObject(object.getName(), new StringSerializer("name"));
		writer.writeLong("amount", object.getAmount());
		writer.endElement(getName());
	}
}
