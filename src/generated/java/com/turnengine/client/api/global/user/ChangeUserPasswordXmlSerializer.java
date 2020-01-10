package com.turnengine.client.api.global.user;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.StringSerializer;

public class ChangeUserPasswordXmlSerializer implements IXmlSerializer<IChangeUserPassword> {

	private String name;

	public ChangeUserPasswordXmlSerializer() {
		this("ChangeUserPassword");
	}

	public ChangeUserPasswordXmlSerializer(String name) {
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
	public IChangeUserPassword readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		String param2 = reader.readObject(new StringSerializer("oldPassword"));
		String param3 = reader.readObject(new StringSerializer("newPassword"));
		reader.endElement(getName());

		// Create the bean
		return new ChangeUserPassword(param1, param2, param3);
	}

	@Override
	public void writeObject(IXmlWriter writer, IChangeUserPassword object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.writeObject(object.getOldPassword(), new StringSerializer("oldPassword"));
		writer.writeObject(object.getNewPassword(), new StringSerializer("newPassword"));
		writer.endElement(getName());
	}
}
