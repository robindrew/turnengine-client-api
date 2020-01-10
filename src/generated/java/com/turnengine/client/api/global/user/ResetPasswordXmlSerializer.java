package com.turnengine.client.api.global.user;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.StringSerializer;

public class ResetPasswordXmlSerializer implements IXmlSerializer<IResetPassword> {

	private String name;

	public ResetPasswordXmlSerializer() {
		this("ResetPassword");
	}

	public ResetPasswordXmlSerializer(String name) {
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
	public IResetPassword readObject(IXmlReader reader) {
		reader.startElement(getName());
		String param1 = reader.readObject(new StringSerializer("email"));
		String param2 = reader.readObject(new StringSerializer("password"));
		long param3 = reader.readLong("code");
		reader.endElement(getName());

		// Create the bean
		return new ResetPassword(param1, param2, param3);
	}

	@Override
	public void writeObject(IXmlWriter writer, IResetPassword object) {
		writer.startElement(getName());
		writer.writeObject(object.getEmail(), new StringSerializer("email"));
		writer.writeObject(object.getPassword(), new StringSerializer("password"));
		writer.writeLong("code", object.getCode());
		writer.endElement(getName());
	}
}
