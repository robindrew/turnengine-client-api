package com.turnengine.client.api.serializer.xml;

import com.robindrew.codegenerator.api.error.IErrorCode;
import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.turnengine.client.api.error.ErrorCodeRegistry;

public class ErrorCodeXmlSerializer implements IXmlSerializer<IErrorCode> {

	private final ErrorCodeRegistry registry = new ErrorCodeRegistry();

	@Override
	public IErrorCode readObject(IXmlReader reader) {
		reader.startElement("ErrorCode");
		String name = reader.readAttribute("name");
		reader.endElement("ErrorCode");
		return registry.get(name);
	}

	@Override
	public void writeObject(IXmlWriter writer, IErrorCode code) {
		writer.startElement("ErrorCode");
		writer.writeAttribute("name", code.name());
		writer.endElement("ErrorCode");
	}

}
