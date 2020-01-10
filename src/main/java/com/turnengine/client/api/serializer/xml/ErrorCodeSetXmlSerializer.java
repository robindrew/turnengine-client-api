package com.turnengine.client.api.serializer.xml;

import com.robindrew.codegenerator.api.error.ErrorCodeSet;
import com.robindrew.codegenerator.api.error.IErrorCode;
import com.robindrew.codegenerator.api.error.IErrorCodeAttributes;
import com.robindrew.codegenerator.api.error.IErrorCodeSet;
import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class ErrorCodeSetXmlSerializer implements IXmlSerializer<IErrorCodeSet> {

	private final ErrorCodeXmlSerializer codeSerializer = new ErrorCodeXmlSerializer();
	private final ErrorCodeAttributesXmlSerializer attributeSerializer = new ErrorCodeAttributesXmlSerializer();

	@Override
	public IErrorCodeSet readObject(IXmlReader reader) {
		reader.startElement("ErrorCodeSet");
		int size = reader.readIntAttribute("size");
		ErrorCodeSet set = new ErrorCodeSet();
		for (int i = 0; i < size; i++) {
			IErrorCodeAttributes attributes = set.add(codeSerializer.readObject(reader));
			attributes.setAll(attributeSerializer.readObject(reader));
		}
		reader.endElement("ErrorCodeSet");
		return set;
	}

	@Override
	public void writeObject(IXmlWriter writer, IErrorCodeSet set) {
		writer.startElement("ErrorCodeSet");
		writer.writeAttribute("size", set.size());
		for (IErrorCode code : set) {
			codeSerializer.writeObject(writer, code);
			attributeSerializer.writeObject(writer, set.get(code));
		}
		writer.endElement("ErrorCodeSet");
	}

}
