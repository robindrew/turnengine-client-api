package com.turnengine.client.api.global.translation;

import com.robindrew.codegenerator.api.serializer.xml.IXmlReader;
import com.robindrew.codegenerator.api.serializer.xml.IXmlSerializer;
import com.robindrew.codegenerator.api.serializer.xml.IXmlWriter;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.EnumSerializer;
import com.robindrew.codegenerator.api.serializer.xml.serializer.lang.StringSerializer;
import com.robindrew.common.locale.LanguageCountry;

public class SetTranslationXmlSerializer implements IXmlSerializer<ISetTranslation> {

	private String name;

	public SetTranslationXmlSerializer() {
		this("SetTranslation");
	}

	public SetTranslationXmlSerializer(String name) {
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
	public ISetTranslation readObject(IXmlReader reader) {
		reader.startElement(getName());
		long param1 = reader.readLong("loginId");
		int param2 = reader.readInt("id");
		LanguageCountry param3 = reader.readObject(new EnumSerializer<LanguageCountry>(LanguageCountry.class, "language"));
		String param4 = reader.readObject(new StringSerializer("translation"));
		reader.endElement(getName());

		// Create the bean
		return new SetTranslation(param1, param2, param3, param4);
	}

	@Override
	public void writeObject(IXmlWriter writer, ISetTranslation object) {
		writer.startElement(getName());
		writer.writeLong("loginId", object.getLoginId());
		writer.writeInt("id", object.getId());
		writer.writeObject(object.getLanguage(), new EnumSerializer<LanguageCountry>(LanguageCountry.class, "language"));
		writer.writeObject(object.getTranslation(), new StringSerializer("translation"));
		writer.endElement(getName());
	}
}
