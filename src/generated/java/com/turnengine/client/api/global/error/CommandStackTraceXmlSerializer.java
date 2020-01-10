package com.turnengine.client.api.global.error;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.StringSerializer;

public class CommandStackTraceXmlSerializer implements IXmlSerializer<ICommandStackTrace> {

	private String name;

	public CommandStackTraceXmlSerializer() {
		this("CommandStackTrace");
	}

	public CommandStackTraceXmlSerializer(String name) {
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
	public ICommandStackTrace readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("id");
		long param2 = reader.readLong("timestamp");
		String param3 = reader.readObject(new StringSerializer("command"));
		String param4 = reader.readObject(new StringSerializer("trace"));
		reader.endElement(getName());

		// Create the bean
		return new CommandStackTrace(param1, param2, param3, param4);
	}

	@Override
	public void writeObject(IXmlWriter writer, ICommandStackTrace object) {
		writer.startElement(getName());
		writer.writeLong("id", object.getId());
		writer.writeLong("timestamp", object.getTimestamp());
		writer.writeObject(object.getCommand(), new StringSerializer("command"));
		writer.writeObject(object.getTrace(), new StringSerializer("trace"));
		writer.endElement(getName());
	}
}
