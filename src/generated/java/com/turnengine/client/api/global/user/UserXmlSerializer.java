package com.turnengine.client.api.global.user;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.EnumSerializer;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.StringSerializer;
import com.robindrew.common.locale.LanguageCountry;

public class UserXmlSerializer implements IXmlSerializer<IUser> {

	private String name;

	public UserXmlSerializer() {
		this("User");
	}

	public UserXmlSerializer(String name) {
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
	public IUser readObject(IXmlReader reader) {
		reader.startElement(getName());
		int param1 = reader.readInt("id");
		String param2 = reader.readObject(new StringSerializer("name"));
		String param3 = reader.readObject(new StringSerializer("email"));
		LanguageCountry param4 = reader.readObject(new EnumSerializer<LanguageCountry>(LanguageCountry.class, "language"));
		reader.endElement(getName());

		// Create the bean
		return new User(param1, param2, param3, param4);
	}

	@Override
	public void writeObject(IXmlWriter writer, IUser object) {
		writer.startElement(getName());
		writer.writeInt("id", object.getId());
		writer.writeObject(object.getName(), new StringSerializer("name"));
		writer.writeObject(object.getEmail(), new StringSerializer("email"));
		writer.writeObject(object.getLanguage(), new EnumSerializer<LanguageCountry>(LanguageCountry.class, "language"));
		writer.endElement(getName());
	}
}
