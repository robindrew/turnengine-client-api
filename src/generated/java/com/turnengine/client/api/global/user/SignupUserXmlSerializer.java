package com.turnengine.client.api.global.user;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.EnumSerializer;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.StringSerializer;
import com.robindrew.common.locale.LanguageCountry;

public class SignupUserXmlSerializer implements IXmlSerializer<ISignupUser> {

	private String name;

	public SignupUserXmlSerializer() {
		this("SignupUser");
	}

	public SignupUserXmlSerializer(String name) {
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
	public ISignupUser readObject(IXmlReader reader) {
		reader.startElement(getName());
		String param1 = reader.readObject(new StringSerializer("name"));
		String param2 = reader.readObject(new StringSerializer("password"));
		String param3 = reader.readObject(new StringSerializer("email"));
		String param4 = reader.readObject(new StringSerializer("address"));
		LanguageCountry param5 = reader.readObject(new EnumSerializer<LanguageCountry>(LanguageCountry.class, "language"));
		reader.endElement(getName());

		// Create the bean
		return new SignupUser(param1, param2, param3, param4, param5);
	}

	@Override
	public void writeObject(IXmlWriter writer, ISignupUser object) {
		writer.startElement(getName());
		writer.writeObject(object.getName(), new StringSerializer("name"));
		writer.writeObject(object.getPassword(), new StringSerializer("password"));
		writer.writeObject(object.getEmail(), new StringSerializer("email"));
		writer.writeObject(object.getAddress(), new StringSerializer("address"));
		writer.writeObject(object.getLanguage(), new EnumSerializer<LanguageCountry>(LanguageCountry.class, "language"));
		writer.endElement(getName());
	}
}
