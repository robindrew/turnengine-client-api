package com.turnengine.client.api.global.common;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.StringSerializer;

public class LoggedExceptionXmlSerializer implements IXmlSerializer<ILoggedException> {

	private String name;

	public LoggedExceptionXmlSerializer() {
		this("LoggedException");
	}

	public LoggedExceptionXmlSerializer(String name) {
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
	public ILoggedException readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("timestamp");
		String param2 = reader.readObject(new StringSerializer("level"));
		String param3 = reader.readObject(new StringSerializer("className"));
		String param4 = reader.readObject(new StringSerializer("message"));
		String param5 = reader.readObject(new StringSerializer("trace"));
		reader.endElement(getName());

		// Create the bean
		return new LoggedException(param1, param2, param3, param4, param5);
	}

	@Override
	public void writeObject(IXmlWriter writer, ILoggedException object) {
		writer.startElement(getName());
		writer.writeLong("timestamp", object.getTimestamp());
		writer.writeObject(object.getLevel(), new StringSerializer("level"));
		writer.writeObject(object.getClassName(), new StringSerializer("className"));
		writer.writeObject(object.getMessage(), new StringSerializer("message"));
		writer.writeObject(object.getTrace(), new StringSerializer("trace"));
		writer.endElement(getName());
	}
}
