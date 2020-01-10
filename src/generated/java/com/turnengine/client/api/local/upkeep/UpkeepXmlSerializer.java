package com.turnengine.client.api.local.upkeep;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class UpkeepXmlSerializer implements IXmlSerializer<IUpkeep> {

	private String name;

	public UpkeepXmlSerializer() {
		this("Upkeep");
	}

	public UpkeepXmlSerializer(String name) {
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
	public IUpkeep readObject(IXmlReader reader) {
		reader.startElement(getName());
		int param1 = reader.readInt("id");
		long param2 = reader.readLong("limit");
		reader.endElement(getName());

		// Create the bean
		return new Upkeep(param1, param2);
	}

	@Override
	public void writeObject(IXmlWriter writer, IUpkeep object) {
		writer.startElement(getName());
		writer.writeInt("id", object.getId());
		writer.writeLong("limit", object.getLimit());
		writer.endElement(getName());
	}
}
