package com.turnengine.client.api.local.upkeep;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.StringSerializer;

public class AddUpkeepXmlSerializer implements IXmlSerializer<IAddUpkeep> {

	private String name;

	public AddUpkeepXmlSerializer() {
		this("AddUpkeep");
	}

	public AddUpkeepXmlSerializer(String name) {
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
	public IAddUpkeep readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		int param2 = reader.readInt("instanceId");
		String param3 = reader.readObject(new StringSerializer("name"));
		long param4 = reader.readLong("limit");
		reader.endElement(getName());

		// Create the bean
		return new AddUpkeep(param1, param2, param3, param4);
	}

	@Override
	public void writeObject(IXmlWriter writer, IAddUpkeep object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.writeInt("instanceId", object.getInstanceId());
		writer.writeObject(object.getName(), new StringSerializer("name"));
		writer.writeLong("limit", object.getLimit());
		writer.endElement(getName());
	}
}
