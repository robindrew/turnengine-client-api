package com.turnengine.client.api.global.common;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class GetServiceStatusXmlSerializer implements IXmlSerializer<IGetServiceStatus> {

	private String name;

	public GetServiceStatusXmlSerializer() {
		this("GetServiceStatus");
	}

	public GetServiceStatusXmlSerializer(String name) {
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
	public IGetServiceStatus readObject(IXmlReader reader) {
		reader.startElement(getName());
		reader.endElement(getName());

		// Create the bean
		return new GetServiceStatus();
	}

	@Override
	public void writeObject(IXmlWriter writer, IGetServiceStatus object) {
		writer.startElement(getName());
		writer.endElement(getName());
	}
}
