package com.turnengine.client.api.local.action;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class ActionXmlSerializer implements IXmlSerializer<IAction> {

	private String name;

	public ActionXmlSerializer() {
		this("Action");
	}

	public ActionXmlSerializer(String name) {
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
	public IAction readObject(IXmlReader reader) {
		reader.startElement(getName());
		int param1 = reader.readInt("id");
		int param2 = reader.readInt("turns");
		int param3 = reader.readInt("limit");
		reader.endElement(getName());

		// Create the bean
		return new Action(param1, param2, param3);
	}

	@Override
	public void writeObject(IXmlWriter writer, IAction object) {
		writer.startElement(getName());
		writer.writeInt("id", object.getId());
		writer.writeInt("turns", object.getTurns());
		writer.writeInt("limit", object.getLimit());
		writer.endElement(getName());
	}
}
