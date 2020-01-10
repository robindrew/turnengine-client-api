package com.turnengine.client.api.global.user;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.StringSerializer;

public class LoginUserXmlSerializer implements IXmlSerializer<ILoginUser> {

	private String name;

	public LoginUserXmlSerializer() {
		this("LoginUser");
	}

	public LoginUserXmlSerializer(String name) {
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
	public ILoginUser readObject(IXmlReader reader) {
		reader.startElement(getName());
		String param1 = reader.readObject(new StringSerializer("nameOrEmail"));
		String param2 = reader.readObject(new StringSerializer("password"));
		String param3 = reader.readObject(new StringSerializer("address"));
		reader.endElement(getName());

		// Create the bean
		return new LoginUser(param1, param2, param3);
	}

	@Override
	public void writeObject(IXmlWriter writer, ILoginUser object) {
		writer.startElement(getName());
		writer.writeObject(object.getNameOrEmail(), new StringSerializer("nameOrEmail"));
		writer.writeObject(object.getPassword(), new StringSerializer("password"));
		writer.writeObject(object.getAddress(), new StringSerializer("address"));
		writer.endElement(getName());
	}
}
