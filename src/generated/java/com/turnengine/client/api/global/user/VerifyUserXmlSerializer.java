package com.turnengine.client.api.global.user;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.StringSerializer;

public class VerifyUserXmlSerializer implements IXmlSerializer<IVerifyUser> {

	private String name;

	public VerifyUserXmlSerializer() {
		this("VerifyUser");
	}

	public VerifyUserXmlSerializer(String name) {
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
	public IVerifyUser readObject(IXmlReader reader) {
		reader.startElement(getName());
		int param1 = reader.readInt("id");
		long param2 = reader.readLong("code");
		String param3 = reader.readObject(new StringSerializer("address"));
		reader.endElement(getName());

		// Create the bean
		return new VerifyUser(param1, param2, param3);
	}

	@Override
	public void writeObject(IXmlWriter writer, IVerifyUser object) {
		writer.startElement(getName());
		writer.writeInt("id", object.getId());
		writer.writeLong("code", object.getCode());
		writer.writeObject(object.getAddress(), new StringSerializer("address"));
		writer.endElement(getName());
	}
}
