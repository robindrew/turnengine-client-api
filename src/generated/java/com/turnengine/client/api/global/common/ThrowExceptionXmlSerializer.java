package com.turnengine.client.api.global.common;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class ThrowExceptionXmlSerializer implements IXmlSerializer<IThrowException> {

	private String name;

	public ThrowExceptionXmlSerializer() {
		this("ThrowException");
	}

	public ThrowExceptionXmlSerializer(String name) {
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
	public IThrowException readObject(IXmlReader reader) {
		reader.startElement(getName());
		reader.endElement(getName());

		// Create the bean
		return new ThrowException();
	}

	@Override
	public void writeObject(IXmlWriter writer, IThrowException object) {
		writer.startElement(getName());
		writer.endElement(getName());
	}
}
