package com.turnengine.client.api.serializer.xml;

import com.robindrew.codegenerator.api.error.ErrorCodeAttributes;
import com.robindrew.codegenerator.api.error.IErrorCodeAttributes;
import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class ErrorCodeAttributesXmlSerializer implements IXmlSerializer<IErrorCodeAttributes> {

	@Override
	public IErrorCodeAttributes readObject(IXmlReader reader) {
		IErrorCodeAttributes attributes = new ErrorCodeAttributes();
		reader.startElement("Attributes");
		int size = reader.readIntAttribute("size");
		for (int i = 0; i < size; i++) {
			reader.startElement("Entry");
			String key = reader.readAttribute("key");
			String value = reader.readAttribute("value");
			attributes.set(key, value);
			reader.endElement("Entry");
		}
		reader.endElement("Attributes");
		return attributes;
	}

	@Override
	public void writeObject(IXmlWriter writer, IErrorCodeAttributes attributes) {
		writer.startElement("Attributes");
		writer.writeAttribute("size", attributes.size());
		for (String key : attributes.keySet()) {
			String value = attributes.getValue(key);
			writer.startElement("Entry");
			writer.writeAttribute("key", key);
			writer.writeAttribute("value", value);
			writer.endElement("Entry");
		}
		writer.endElement("Attributes");
	}

}
