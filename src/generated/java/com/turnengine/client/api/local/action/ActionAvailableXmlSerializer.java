package com.turnengine.client.api.local.action;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class ActionAvailableXmlSerializer implements IXmlSerializer<IActionAvailable> {

	private String name;

	public ActionAvailableXmlSerializer() {
		this("ActionAvailable");
	}

	public ActionAvailableXmlSerializer(String name) {
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
	public IActionAvailable readObject(IXmlReader reader) {
		reader.startElement(getName());
		int param1 = reader.readInt("actionId");
		long param2 = reader.readLong("amount");
		reader.endElement(getName());

		// Create the bean
		return new ActionAvailable(param1, param2);
	}

	@Override
	public void writeObject(IXmlWriter writer, IActionAvailable object) {
		writer.startElement(getName());
		writer.writeInt("actionId", object.getActionId());
		writer.writeLong("amount", object.getAmount());
		writer.endElement(getName());
	}
}
