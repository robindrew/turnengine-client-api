package com.turnengine.client.api.global.user;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.StringSerializer;

public class AdminSetUserPasswordXmlSerializer implements IXmlSerializer<IAdminSetUserPassword> {

	private String name;

	public AdminSetUserPasswordXmlSerializer() {
		this("AdminSetUserPassword");
	}

	public AdminSetUserPasswordXmlSerializer(String name) {
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
	public IAdminSetUserPassword readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		String param2 = reader.readObject(new StringSerializer("name"));
		String param3 = reader.readObject(new StringSerializer("password"));
		reader.endElement(getName());

		// Create the bean
		return new AdminSetUserPassword(param1, param2, param3);
	}

	@Override
	public void writeObject(IXmlWriter writer, IAdminSetUserPassword object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.writeObject(object.getName(), new StringSerializer("name"));
		writer.writeObject(object.getPassword(), new StringSerializer("password"));
		writer.endElement(getName());
	}
}
