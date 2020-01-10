package com.turnengine.client.api.global.common;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class PingXmlSerializer implements IXmlSerializer<IPing> {

	private String name;

	public PingXmlSerializer() {
		this("Ping");
	}

	public PingXmlSerializer(String name) {
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
	public IPing readObject(IXmlReader reader) {
		reader.startElement(getName());
		reader.endElement(getName());

		// Create the bean
		return new Ping();
	}

	@Override
	public void writeObject(IXmlWriter writer, IPing object) {
		writer.startElement(getName());
		writer.endElement(getName());
	}
}
