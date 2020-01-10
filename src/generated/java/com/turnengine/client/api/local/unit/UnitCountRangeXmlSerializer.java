package com.turnengine.client.api.local.unit;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class UnitCountRangeXmlSerializer implements IXmlSerializer<IUnitCountRange> {

	private String name;

	public UnitCountRangeXmlSerializer() {
		this("UnitCountRange");
	}

	public UnitCountRangeXmlSerializer(String name) {
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
	public IUnitCountRange readObject(IXmlReader reader) {
		reader.startElement(getName());
		int param1 = reader.readInt("id");
		long param2 = reader.readLong("minAmount");
		long param3 = reader.readLong("maxAmount");
		reader.endElement(getName());

		// Create the bean
		return new UnitCountRange(param1, param2, param3);
	}

	@Override
	public void writeObject(IXmlWriter writer, IUnitCountRange object) {
		writer.startElement(getName());
		writer.writeInt("id", object.getId());
		writer.writeLong("minAmount", object.getMinAmount());
		writer.writeLong("maxAmount", object.getMaxAmount());
		writer.endElement(getName());
	}
}
