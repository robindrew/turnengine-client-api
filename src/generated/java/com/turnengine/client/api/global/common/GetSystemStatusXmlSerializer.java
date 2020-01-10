package com.turnengine.client.api.global.common;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class GetSystemStatusXmlSerializer implements IXmlSerializer<IGetSystemStatus> {

	private String name;

	public GetSystemStatusXmlSerializer() {
		this("GetSystemStatus");
	}

	public GetSystemStatusXmlSerializer(String name) {
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
	public IGetSystemStatus readObject(IXmlReader reader) {
		reader.startElement(getName());
		reader.endElement(getName());

		// Create the bean
		return new GetSystemStatus();
	}

	@Override
	public void writeObject(IXmlWriter writer, IGetSystemStatus object) {
		writer.startElement(getName());
		writer.endElement(getName());
	}
}
