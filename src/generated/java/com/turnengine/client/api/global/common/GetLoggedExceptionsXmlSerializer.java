package com.turnengine.client.api.global.common;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class GetLoggedExceptionsXmlSerializer implements IXmlSerializer<IGetLoggedExceptions> {

	private String name;

	public GetLoggedExceptionsXmlSerializer() {
		this("GetLoggedExceptions");
	}

	public GetLoggedExceptionsXmlSerializer(String name) {
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
	public IGetLoggedExceptions readObject(IXmlReader reader) {
		reader.startElement(getName());
		reader.endElement(getName());

		// Create the bean
		return new GetLoggedExceptions();
	}

	@Override
	public void writeObject(IXmlWriter writer, IGetLoggedExceptions object) {
		writer.startElement(getName());
		writer.endElement(getName());
	}
}
