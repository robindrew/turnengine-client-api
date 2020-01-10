package com.turnengine.client.api.local.setup;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.StringSerializer;

public class SetupAddParentGroupXmlSerializer implements IXmlSerializer<ISetupAddParentGroup> {

	private String name;

	public SetupAddParentGroupXmlSerializer() {
		this("SetupAddParentGroup");
	}

	public SetupAddParentGroupXmlSerializer(String name) {
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
	public ISetupAddParentGroup readObject(IXmlReader reader) {
		reader.startElement(getName());
		String param1 = reader.readObject(new StringSerializer("name"));
		String param2 = reader.readObject(new StringSerializer("factionName"));
		reader.endElement(getName());

		// Create the bean
		return new SetupAddParentGroup(param1, param2);
	}

	@Override
	public void writeObject(IXmlWriter writer, ISetupAddParentGroup object) {
		writer.startElement(getName());
		writer.writeObject(object.getName(), new StringSerializer("name"));
		writer.writeObject(object.getFactionName(), new StringSerializer("factionName"));
		writer.endElement(getName());
	}
}
