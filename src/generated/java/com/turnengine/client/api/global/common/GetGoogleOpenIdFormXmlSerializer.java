package com.turnengine.client.api.global.common;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class GetGoogleOpenIdFormXmlSerializer implements IXmlSerializer<IGetGoogleOpenIdForm> {

	private String name;

	public GetGoogleOpenIdFormXmlSerializer() {
		this("GetGoogleOpenIdForm");
	}

	public GetGoogleOpenIdFormXmlSerializer(String name) {
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
	public IGetGoogleOpenIdForm readObject(IXmlReader reader) {
		reader.startElement(getName());
		reader.endElement(getName());

		// Create the bean
		return new GetGoogleOpenIdForm();
	}

	@Override
	public void writeObject(IXmlWriter writer, IGetGoogleOpenIdForm object) {
		writer.startElement(getName());
		writer.endElement(getName());
	}
}
