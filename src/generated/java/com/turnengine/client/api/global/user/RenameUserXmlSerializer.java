package com.turnengine.client.api.global.user;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.StringSerializer;

public class RenameUserXmlSerializer implements IXmlSerializer<IRenameUser> {

	private String name;

	public RenameUserXmlSerializer() {
		this("RenameUser");
	}

	public RenameUserXmlSerializer(String name) {
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
	public IRenameUser readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		String param2 = reader.readObject(new StringSerializer("from"));
		String param3 = reader.readObject(new StringSerializer("to"));
		reader.endElement(getName());

		// Create the bean
		return new RenameUser(param1, param2, param3);
	}

	@Override
	public void writeObject(IXmlWriter writer, IRenameUser object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.writeObject(object.getFrom(), new StringSerializer("from"));
		writer.writeObject(object.getTo(), new StringSerializer("to"));
		writer.endElement(getName());
	}
}
