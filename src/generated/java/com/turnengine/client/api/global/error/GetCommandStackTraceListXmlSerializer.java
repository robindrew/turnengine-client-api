package com.turnengine.client.api.global.error;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class GetCommandStackTraceListXmlSerializer implements IXmlSerializer<IGetCommandStackTraceList> {

	private String name;

	public GetCommandStackTraceListXmlSerializer() {
		this("GetCommandStackTraceList");
	}

	public GetCommandStackTraceListXmlSerializer(String name) {
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
	public IGetCommandStackTraceList readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		long param2 = reader.readLong("from");
		long param3 = reader.readLong("to");
		reader.endElement(getName());

		// Create the bean
		return new GetCommandStackTraceList(param1, param2, param3);
	}

	@Override
	public void writeObject(IXmlWriter writer, IGetCommandStackTraceList object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.writeLong("from", object.getFrom());
		writer.writeLong("to", object.getTo());
		writer.endElement(getName());
	}
}
