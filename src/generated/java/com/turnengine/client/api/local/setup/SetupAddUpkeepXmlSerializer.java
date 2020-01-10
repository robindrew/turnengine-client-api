package com.turnengine.client.api.local.setup;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.StringSerializer;

public class SetupAddUpkeepXmlSerializer implements IXmlSerializer<ISetupAddUpkeep> {

	private String name;

	public SetupAddUpkeepXmlSerializer() {
		this("SetupAddUpkeep");
	}

	public SetupAddUpkeepXmlSerializer(String name) {
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
	public ISetupAddUpkeep readObject(IXmlReader reader) {
		reader.startElement(getName());
		String param1 = reader.readObject(new StringSerializer("name"));
		long param2 = reader.readLong("limit");
		reader.endElement(getName());

		// Create the bean
		return new SetupAddUpkeep(param1, param2);
	}

	@Override
	public void writeObject(IXmlWriter writer, ISetupAddUpkeep object) {
		writer.startElement(getName());
		writer.writeObject(object.getName(), new StringSerializer("name"));
		writer.writeLong("limit", object.getLimit());
		writer.endElement(getName());
	}
}
