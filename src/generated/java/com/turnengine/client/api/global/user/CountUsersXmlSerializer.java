package com.turnengine.client.api.global.user;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;

public class CountUsersXmlSerializer implements IXmlSerializer<ICountUsers> {

	private String name;

	public CountUsersXmlSerializer() {
		this("CountUsers");
	}

	public CountUsersXmlSerializer(String name) {
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
	public ICountUsers readObject(IXmlReader reader) {
		reader.startElement(getName());
		reader.endElement(getName());

		// Create the bean
		return new CountUsers();
	}

	@Override
	public void writeObject(IXmlWriter writer, ICountUsers object) {
		writer.startElement(getName());
		writer.endElement(getName());
	}
}
