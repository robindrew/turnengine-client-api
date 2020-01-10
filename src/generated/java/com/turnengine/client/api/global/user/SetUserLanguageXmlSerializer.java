package com.turnengine.client.api.global.user;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.EnumSerializer;
import com.robindrew.common.locale.LanguageCountry;

public class SetUserLanguageXmlSerializer implements IXmlSerializer<ISetUserLanguage> {

	private String name;

	public SetUserLanguageXmlSerializer() {
		this("SetUserLanguage");
	}

	public SetUserLanguageXmlSerializer(String name) {
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
	public ISetUserLanguage readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		LanguageCountry param2 = reader.readObject(new EnumSerializer<LanguageCountry>(LanguageCountry.class, "language"));
		reader.endElement(getName());

		// Create the bean
		return new SetUserLanguage(param1, param2);
	}

	@Override
	public void writeObject(IXmlWriter writer, ISetUserLanguage object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.writeObject(object.getLanguage(), new EnumSerializer<LanguageCountry>(LanguageCountry.class, "language"));
		writer.endElement(getName());
	}
}
