package com.turnengine.client.api.local.error;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.StringSerializer;

public class LocalTraceXmlSerializer implements IXmlSerializer<ILocalTrace> {

	private String name;

	public LocalTraceXmlSerializer() {
		this("LocalTrace");
	}

	public LocalTraceXmlSerializer(String name) {
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
	public ILocalTrace readObject(IXmlReader reader) {
		reader.startElement(getName());
		String param1 = reader.readObject(new StringSerializer("id"));
		long param2 = reader.readLong("datetime");
		String param3 = reader.readObject(new StringSerializer("trace"));
		reader.endElement(getName());

		// Create the bean
		return new LocalTrace(param1, param2, param3);
	}

	@Override
	public void writeObject(IXmlWriter writer, ILocalTrace object) {
		writer.startElement(getName());
		writer.writeObject(object.getId(), new StringSerializer("id"));
		writer.writeLong("datetime", object.getDatetime());
		writer.writeObject(object.getTrace(), new StringSerializer("trace"));
		writer.endElement(getName());
	}
}
