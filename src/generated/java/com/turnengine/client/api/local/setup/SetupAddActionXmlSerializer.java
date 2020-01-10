package com.turnengine.client.api.local.setup;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.StringSerializer;

public class SetupAddActionXmlSerializer implements IXmlSerializer<ISetupAddAction> {

	private String name;

	public SetupAddActionXmlSerializer() {
		this("SetupAddAction");
	}

	public SetupAddActionXmlSerializer(String name) {
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
	public ISetupAddAction readObject(IXmlReader reader) {
		reader.startElement(getName());
		String param1 = reader.readObject(new StringSerializer("name"));
		int param2 = reader.readInt("turns");
		int param3 = reader.readInt("limit");
		reader.endElement(getName());

		// Create the bean
		return new SetupAddAction(param1, param2, param3);
	}

	@Override
	public void writeObject(IXmlWriter writer, ISetupAddAction object) {
		writer.startElement(getName());
		writer.writeObject(object.getName(), new StringSerializer("name"));
		writer.writeInt("turns", object.getTurns());
		writer.writeInt("limit", object.getLimit());
		writer.endElement(getName());
	}
}
