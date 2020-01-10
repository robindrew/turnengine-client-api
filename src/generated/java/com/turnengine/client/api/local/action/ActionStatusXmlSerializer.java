package com.turnengine.client.api.local.action;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.StringSerializer;

public class ActionStatusXmlSerializer implements IXmlSerializer<IActionStatus> {

	private String name;

	public ActionStatusXmlSerializer() {
		this("ActionStatus");
	}

	public ActionStatusXmlSerializer(String name) {
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
	public IActionStatus readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("amount");
		String param2 = reader.readObject(new StringSerializer("format"));
		String param3 = reader.readObject(new StringSerializer("content"));
		reader.endElement(getName());

		// Create the bean
		return new ActionStatus(param1, param2, param3);
	}

	@Override
	public void writeObject(IXmlWriter writer, IActionStatus object) {
		writer.startElement(getName());
		writer.writeLong("amount", object.getAmount());
		writer.writeObject(object.getFormat(), new StringSerializer("format"));
		writer.writeObject(object.getContent(), new StringSerializer("content"));
		writer.endElement(getName());
	}
}
