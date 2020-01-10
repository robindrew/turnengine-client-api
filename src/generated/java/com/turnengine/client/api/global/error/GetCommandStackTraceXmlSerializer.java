package com.turnengine.client.api.global.error;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class GetCommandStackTraceXmlSerializer implements IXmlSerializer<IGetCommandStackTrace> {

	private String name;

	public GetCommandStackTraceXmlSerializer() {
		this("GetCommandStackTrace");
	}

	public GetCommandStackTraceXmlSerializer(String name) {
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
	public IGetCommandStackTrace readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		long param2 = reader.readLong("id");
		reader.endElement(getName());

		// Create the bean
		return new GetCommandStackTrace(param1, param2);
	}

	@Override
	public void writeObject(IXmlWriter writer, IGetCommandStackTrace object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.writeLong("id", object.getId());
		writer.endElement(getName());
	}
}
